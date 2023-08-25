import { cobolParser } from "../parser/cobolParser";
import { TaskDivider } from "../../common/task-divider";
import { TokenStream } from "antlr4ts";
import { testTokenInAreaB } from "../../common/parser/helpers";

export class cobolParserImpl extends cobolParser {

    private thisTask: number;

    constructor(input: TokenStream, private taskDivider?: TaskDivider<number>) {
        super(input);
        this.thisTask = taskDivider ? taskDivider.asyncValue : 0;
    }

    async cobol_source() {
        return super.cobol_source();
    }

    async exitRule() {
        if (this.thisTask != (this.taskDivider ? await this.taskDivider.testValue() : 0)) {
            throw "task has been re-entered";
        }
        return super.exitRule();
    }
    
    public testCurrentWordInAreaB() {
        return testTokenInAreaB(this.inputStream.LT(1));
    }
}