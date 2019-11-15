/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

const gulp = require('gulp');
const path = require('path');

const ts = require('gulp-typescript');
const typescript = require('typescript');
const sourcemaps = require('gulp-sourcemaps');
const del = require('del');
const es = require('event-stream');
const vsce = require('vsce');
const nls = require('vscode-nls-dev');

const tsProject = ts.createProject('tsconfig.json', { typescript });

const inlineMap = true;
const inlineSource = false;
const outDest = 'out';
const distDest = 'dist';

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
	return del(['out/**', 'package.nls.*.json', 'i18n-sample*.vsix']);
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

let _rgxDefinitionMark = /^\s*\/\/\s*@RuleVersion\(\d*\)$/gm;
let _rgxDefinition = /^(\s*public)\s*([^(]*\s*\([^\)]*\)).*$/gm;
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

function makeAsync() {

// 	let tstStr = `
// 	return _localctx;
// }

// public logic_expression(): Logic_expressionContext;
// public logic_expression(_p: number): Logic_expressionContext;
// // @RuleVersion(0)
// public logic_expression(_p?: number): Logic_expressionContext {
// 	if (_p === undefined) {
// 		_p = 0;
// 	}

// 	let _parentctx: ParserRuleContext = this._ctx;
// 	let _parentState: number = this.state;
// 	let _localctx: Logic_expressionContext = new Logic_expressionContext(this._ctx, _parentState);
// 	let _prevctx: Logic_expressionContext = _localctx;
// 	let _startState: number = 848;
// 	this.enterRecursionRule(_localctx, 848, cobolParser.RULE_logic_expression, _p);
// 	try {
// 		let _alt: number;
// 		this.enterOuterAlt(_localctx, 1);
// 		{
// 		this.state = 5101;
// 		this._errHandler.sync(this);
// 		switch ( this.interpreter.adaptivePredict(this._input, 816, this._ctx) ) {
// 		case 1:
// 			{
// 			this.state = 5094;
// 			this.match(cobolParser.LPAREN_);
// 			this.state = 5095;
// 			this.logic_expression(0);
// 			this.state = 5096;
// 			this.match(cobolParser.RPAREN_);
// 			}
// `
// 	let tstConverted = makeAsyncContent(tstStr);

	return tsProject.src().pipe(
		es.through(
			function pass (file) {
				if (path.basename(file.path) == 'cobolParser.ts') {
					console.log('making async: ' + file.path);
					let newContent = makeAsyncContent(file.contents.toString('utf8'));
					file.contents = Buffer.from(newContent, 'utf8');
					this.queue(file);
				};
			})).pipe(gulp.dest("src"));
}

gulp.task('make-async', makeAsync);

if (process.argv > 2 && process.argv[2] == 'make-async') {
	makeAsync();
}

