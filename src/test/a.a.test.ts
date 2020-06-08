
import micromatch from 'micromatch'

// mm(list, patterns[, options]);

suite("MM tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
    });

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("MM 1", async() => {
        let options: micromatch.Options = {
            basename: false,
            dot: true,
            nocase: true,
            nodupes: true,
            unixify: false,
        };

        let list = [
            '.vscode/a.js',
            '.vscode/test/null/b.js',
            'any/.vscode/test/null/c.js',
            '.vscode/.test/null/d.js',
            '.vscode/test/.null/d.js',
            '.any/null/.vscode/test/d.js',
            'any/.null/.vscode/test/d.js'
        ];

        let pattern = [
            '**/.vscode/**'
        ];

        while(pattern.length > 0) {
            const testOne = micromatch(list, pattern, options);
            options.dot = true;
            const testTwo = micromatch(list, pattern, options);
            options.dot = false;
            const testThree = micromatch(list, pattern, options);

            pattern = [];

            console.log(testOne);
            console.log(testTwo);
            console.log(testThree);
        }
    })
});