/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

const gulp = require('gulp');
const path = require('path');

const ts = require('gulp-typescript');
const typescript = require('typescript');
const sourcemaps = require('gulp-sourcemaps');
const deletefile = require('gulp-delete-file');
const es = require('event-stream');
const nls = require('vscode-nls-dev');

const tsProject = ts.createProject('tsconfig.json', { typescript });

const inlineMap = true;
const inlineSource = false;
const outDest = 'out';
const distDest = 'dist';

const argv = require('yargs').argv;

// If all VS Code langaues are support you can use nls.coreLanguages
const languages = [{id: 'ru'}];

//---- internal

function compile(buildNls) {
	var r = tsProject.src()
		.pipe(sourcemaps.init())
		.pipe(tsProject());
	r.dts.pipe(gulp.dest(outDest));	//output d.ts
	r = r.js
		.pipe(buildNls ? nls.rewriteLocalizeCalls() : es.through())
		.pipe(buildNls ? nls.createAdditionalLanguageFiles(languages, 'i18n') : es.through());

	if (inlineMap && inlineSource) {
		r = r.pipe(sourcemaps.write());
	} else {
		r = r.pipe(sourcemaps.write("../out", {
			// no inlined source
			includeContent: inlineSource,
			// Return relative source map root directories per file.
			sourceRoot: "../src"
		}));
	}

	return r.pipe(gulp.dest(outDest));
}

gulp.task('clean', function() {
	return gulp.src(['out/**', 'package.nls.*.json', 'i18n-sample*.vsix'])
		.pipe(deletefile());
})

gulp.task('internal-compile', function() {
	return compile(false);
});

gulp.task('internal-nls-compile', function() {
	return compile(true);
});

gulp.task('add-i18n', function() {
	return gulp.src(['package.nls.json'])
		.pipe(nls.createAdditionalLanguageFiles(languages, 'i18n'))
		.pipe(gulp.dest('.'));
});

gulp.task('build', gulp.series('clean', 'internal-nls-compile', 'add-i18n', function(callback) {
	callback();
}));

gulp.task('default', gulp.series('build', function(callback) {
	callback();
}));

//******************************************************************/

let _rgxDefinitionMark = /^\s*\/\/\s*@RuleVersion\(\d*\)$/gm;
let _rgxDefinition = /^(\s*public)\s*([^(\s]*\s*\([^\)]*\)).*$/gm;
let _rgxCall = /^(\s*)(this[.][^\.\(]*\(\d*\))/gm;

function makeAsyncContent(content) {
	let lines = content.split(/[\r]?\n/);
	for(let i = 0; i < lines.length; ++i) {
		if (lines[i].match(_rgxDefinitionMark)) {
			if (i + 1 < lines.length) {
				let nextLine = lines[i + 1];
				let newNextLine = nextLine.replace(_rgxDefinition, '$1 async $2 {');
				lines[i + 1] = newNextLine;
				// find the same above
				let brIdx = nextLine.indexOf('(');
				if (brIdx !== -1) {
					let startStr = nextLine.substr(0, brIdx);
					let j = i - 1;
					while (j > 0) {
						let prevLine = lines[j];
						if (prevLine.startsWith(startStr)) {
							lines[j] = "";
						} else {
							break;
						}
						--j;
					}
				}
			}
		} else if (lines[i].match(_rgxCall)) {
			let line = lines[i];
			let newLine = line.replace(_rgxCall, '$1await $2');
			lines[i] = newLine;
		}
	}
	return lines.join('\n');
}

//------------------------------------------------------------------

function makeAsync() {

	if (argv.file === undefined) {
		console.error('no file specified');
		return;
	}

	let fileName = argv.file;

	return tsProject.src().pipe(
		es.through(
			function pass (file) {
				if (file.basename == fileName) {
					console.log('making async: ' + file.path);
					let newContent = makeAsyncContent(file.contents.toString('utf8'));
					file.contents = Buffer.from(newContent, 'utf8');
					this.queue(file);
				};
			})).pipe(gulp.dest("src"));
}

gulp.task('make-async', makeAsync);

//******************************************************************/
