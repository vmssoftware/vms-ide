import { ANTLRInputStream, CommonTokenStream, ConsoleErrorListener } from 'antlr4ts';
import { ParseTreeWalker } from 'antlr4ts/tree/ParseTreeWalker';
import { msgLexer } from '../msgLexer';
import { msgParser, MainRuleContext, TitleContext, TitleDescriptionContext } from '../msgParser';
import { msgListener } from '../msgListener';
import { ANTLRErrorListener } from 'antlr4ts/ANTLRErrorListener';
import { Recognizer } from 'antlr4ts/Recognizer';
import { RecognitionException } from 'antlr4ts/RecognitionException';

class TestMsgErrorListener implements ANTLRErrorListener<any> {
    public syntaxError<T>(
        recognizer: Recognizer<T, any>, 
        offendingSymbol: T, 
        line: number, 
        charPositionInLine: number, 
        msg: string, 
        e: RecognitionException | undefined): void 
    {
        console.log(`${msg}`);
    }
}

suite("Parser tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
    });

    test("Parser", async () => {

        // Create the lexer and parser
        let inputStream = new ANTLRInputStream(
`
.FACILITY VVS, 33
.SEVERITY error
SYNTAX "Invalid !OW syn!5ULtax in !6(ZI) !_keyword !AZ!@AS" /fao_count=1 /error
`
        );
        let lexer = new msgLexer(inputStream);
        let tokenStream = new CommonTokenStream(lexer);
        let parser = new msgParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TestMsgErrorListener());
        let tree = parser.mainRule();
        
        const listener: msgListener = {
            enterMainRule: (ctx: MainRuleContext) => { 
                console.log(`enterMainRule: ${ctx.start.charPositionInLine}`);
            },
            exitMainRule: (ctx: MainRuleContext) => { 
                console.log(`exitMainRule:`);
            },
            enterTitle: (ctx: TitleContext) => { 
                console.log(`enterTitle: ${ctx.start.charPositionInLine}`);
            },
            exitTitle: (ctx: TitleContext) => { 
                console.log(`exitTitle:`);
            },
        };
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        console.log('done');
    });

    return;

});
