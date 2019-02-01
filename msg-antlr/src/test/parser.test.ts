import { ANTLRInputStream, CommonTokenStream } from 'antlr4ts';
import { ParseTreeWalker } from 'antlr4ts/tree/ParseTreeWalker';
import { msgLexer } from '../msgLexer';
import { msgParser, MainRuleContext, TitleContext, TitleNameContext, TitleDescriptionContext } from '../msgParser';
import { msgListener } from '../msgListener';

suite("Parser tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
    });

    test("Parser", async () => {

        // Create the lexer and parser
        let inputStream = new ANTLRInputStream(
`
.TITLE  SV$_test Warn & errors.

.title _in09 Do it, please? 

`
        );
        let lexer = new msgLexer(inputStream);
        let tokenStream = new CommonTokenStream(lexer);
        let parser = new msgParser(tokenStream);
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
            enterTitleName: (ctx: TitleNameContext) => { 
                console.log(`enterTitleName: ${ctx.start.charPositionInLine} ${ctx.text}`);
            },
            exitTitleName: (ctx: TitleNameContext) => { 
                console.log(`exitTitleName:`);
            },
            enterTitleDescription: (ctx: TitleDescriptionContext) => { 
                console.log(`enterTitleDescription: ${ctx.start.charPositionInLine} ${ctx.text}`);
            },
            exitTitleDescription: (ctx: TitleDescriptionContext) => { 
                console.log(`exitTitleDescription:`);
            },
        };
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        console.log('done');
    });

    return;

});
