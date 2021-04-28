import * as assert from "assert";

suite("LONG tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {

    });

    return;

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("long", async() => {

        console.log("start");

        let stop = false;
        let max = 1000000;

        let lognAsyncFnWithAwait = async () => {
            let count: number = 0;
            for(let i = 0; i < max && !stop; ++i) {
                await new Promise(resolve => {
                    setImmediate(() => {
                        resolve();
                    })
                })
                ++count;
            }
            return count;
        }

        let result = lognAsyncFnWithAwait();

        //stop = true;

        let counter = await result;

        console.log('stop');

    });

});
