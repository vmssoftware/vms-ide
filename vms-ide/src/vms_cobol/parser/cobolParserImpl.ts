import { cobolParser } from "./cobolParser";
import { testTokenInAreaB } from "../../common/parser/Helpers";
import { TaskDivider } from "../../common/task-divider";

export class cobolParserImpl extends cobolParser {
    public testCurrentWordInAreaB() {
        return testTokenInAreaB(this.inputStream.LT(1));
    }
}