// $ANTLR 3.5.2 Minijava.g 2017-09-11 21:52:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MinijavaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int COMMENT=4;
	public static final int FLOATLITERAL=5;
	public static final int IDENTIFIER=6;
	public static final int INTLITERAL=7;
	public static final int WHITESPACE=8;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MinijavaLexer() {} 
	public MinijavaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MinijavaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Minijava.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:2:6: ( '!' )
			// Minijava.g:2:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:3:7: ( '&&' )
			// Minijava.g:3:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:4:7: ( '(' )
			// Minijava.g:4:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:5:7: ( ')' )
			// Minijava.g:5:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:6:7: ( '*' )
			// Minijava.g:6:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:7:7: ( '+' )
			// Minijava.g:7:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:8:7: ( ',' )
			// Minijava.g:8:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:9:7: ( '-' )
			// Minijava.g:9:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:10:7: ( '.' )
			// Minijava.g:10:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:11:7: ( '/' )
			// Minijava.g:11:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:12:7: ( ';' )
			// Minijava.g:12:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:13:7: ( '<' )
			// Minijava.g:13:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:14:7: ( '=' )
			// Minijava.g:14:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:15:7: ( '==' )
			// Minijava.g:15:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:16:7: ( '>' )
			// Minijava.g:16:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:17:7: ( 'String' )
			// Minijava.g:17:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:18:7: ( 'System.out.println' )
			// Minijava.g:18:9: 'System.out.println'
			{
			match("System.out.println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:19:7: ( '[' )
			// Minijava.g:19:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:20:7: ( ']' )
			// Minijava.g:20:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:21:7: ( 'boolean' )
			// Minijava.g:21:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:22:7: ( 'class' )
			// Minijava.g:22:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:23:7: ( 'else' )
			// Minijava.g:23:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:24:7: ( 'extends' )
			// Minijava.g:24:9: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:25:7: ( 'false' )
			// Minijava.g:25:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:26:7: ( 'if' )
			// Minijava.g:26:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:27:7: ( 'int' )
			// Minijava.g:27:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:28:7: ( 'length' )
			// Minijava.g:28:9: 'length'
			{
			match("length"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:29:7: ( 'main' )
			// Minijava.g:29:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:30:7: ( 'new' )
			// Minijava.g:30:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:31:7: ( 'public' )
			// Minijava.g:31:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:32:7: ( 'return' )
			// Minijava.g:32:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:33:7: ( 'static' )
			// Minijava.g:33:9: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:34:7: ( 'this' )
			// Minijava.g:34:9: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:35:7: ( 'true' )
			// Minijava.g:35:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:36:7: ( 'void' )
			// Minijava.g:36:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:37:7: ( 'while' )
			// Minijava.g:37:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:38:7: ( '{' )
			// Minijava.g:38:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:39:7: ( '}' )
			// Minijava.g:39:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "INTLITERAL"
	public final void mINTLITERAL() throws RecognitionException {
		try {
			int _type = INTLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:63:12: ( ( '0' .. '9' )+ )
			// Minijava.g:63:14: ( '0' .. '9' )+
			{
			// Minijava.g:63:14: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Minijava.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLITERAL"

	// $ANTLR start "FLOATLITERAL"
	public final void mFLOATLITERAL() throws RecognitionException {
		try {
			int _type = FLOATLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:65:13: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
			// Minijava.g:65:15: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
			{
			// Minijava.g:65:15: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Minijava.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// Minijava.g:65:26: ( '.' ( '0' .. '9' )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Minijava.g:65:27: '.' ( '0' .. '9' )*
					{
					match('.'); 
					// Minijava.g:65:31: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Minijava.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATLITERAL"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:68:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// Minijava.g:68:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Minijava.g:68:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Minijava.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:70:12: ( '//' ( . )* '\\n' )
			// Minijava.g:70:14: '//' ( . )* '\\n'
			{
			match("//"); 

			// Minijava.g:70:19: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\n') ) {
					alt6=2;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Minijava.g:70:19: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Minijava.g:72:12: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// Minijava.g:72:17: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// Minijava.g:72:17: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Minijava.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// Minijava.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | INTLITERAL | FLOATLITERAL | IDENTIFIER | COMMENT | WHITESPACE )
		int alt8=43;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Minijava.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// Minijava.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// Minijava.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// Minijava.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// Minijava.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// Minijava.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// Minijava.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// Minijava.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// Minijava.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// Minijava.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// Minijava.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// Minijava.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// Minijava.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// Minijava.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// Minijava.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// Minijava.g:1:99: T__24
				{
				mT__24(); 

				}
				break;
			case 17 :
				// Minijava.g:1:105: T__25
				{
				mT__25(); 

				}
				break;
			case 18 :
				// Minijava.g:1:111: T__26
				{
				mT__26(); 

				}
				break;
			case 19 :
				// Minijava.g:1:117: T__27
				{
				mT__27(); 

				}
				break;
			case 20 :
				// Minijava.g:1:123: T__28
				{
				mT__28(); 

				}
				break;
			case 21 :
				// Minijava.g:1:129: T__29
				{
				mT__29(); 

				}
				break;
			case 22 :
				// Minijava.g:1:135: T__30
				{
				mT__30(); 

				}
				break;
			case 23 :
				// Minijava.g:1:141: T__31
				{
				mT__31(); 

				}
				break;
			case 24 :
				// Minijava.g:1:147: T__32
				{
				mT__32(); 

				}
				break;
			case 25 :
				// Minijava.g:1:153: T__33
				{
				mT__33(); 

				}
				break;
			case 26 :
				// Minijava.g:1:159: T__34
				{
				mT__34(); 

				}
				break;
			case 27 :
				// Minijava.g:1:165: T__35
				{
				mT__35(); 

				}
				break;
			case 28 :
				// Minijava.g:1:171: T__36
				{
				mT__36(); 

				}
				break;
			case 29 :
				// Minijava.g:1:177: T__37
				{
				mT__37(); 

				}
				break;
			case 30 :
				// Minijava.g:1:183: T__38
				{
				mT__38(); 

				}
				break;
			case 31 :
				// Minijava.g:1:189: T__39
				{
				mT__39(); 

				}
				break;
			case 32 :
				// Minijava.g:1:195: T__40
				{
				mT__40(); 

				}
				break;
			case 33 :
				// Minijava.g:1:201: T__41
				{
				mT__41(); 

				}
				break;
			case 34 :
				// Minijava.g:1:207: T__42
				{
				mT__42(); 

				}
				break;
			case 35 :
				// Minijava.g:1:213: T__43
				{
				mT__43(); 

				}
				break;
			case 36 :
				// Minijava.g:1:219: T__44
				{
				mT__44(); 

				}
				break;
			case 37 :
				// Minijava.g:1:225: T__45
				{
				mT__45(); 

				}
				break;
			case 38 :
				// Minijava.g:1:231: T__46
				{
				mT__46(); 

				}
				break;
			case 39 :
				// Minijava.g:1:237: INTLITERAL
				{
				mINTLITERAL(); 

				}
				break;
			case 40 :
				// Minijava.g:1:248: FLOATLITERAL
				{
				mFLOATLITERAL(); 

				}
				break;
			case 41 :
				// Minijava.g:1:261: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 42 :
				// Minijava.g:1:272: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 43 :
				// Minijava.g:1:280: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\12\uffff\1\46\2\uffff\1\50\1\uffff\1\43\2\uffff\16\43\2\uffff\1\74\6"+
		"\uffff\7\43\1\105\13\43\2\uffff\7\43\1\uffff\1\130\2\43\1\133\13\43\1"+
		"\147\2\43\1\uffff\1\43\1\153\1\uffff\3\43\1\157\1\160\1\161\4\43\1\166"+
		"\1\uffff\1\43\1\170\1\43\1\uffff\3\43\3\uffff\1\175\1\176\2\43\1\uffff"+
		"\1\43\1\uffff\1\u0082\1\u0083\1\u0084\1\u0085\3\uffff\1\u0086\1\u0087"+
		"\6\uffff";
	static final String DFA8_eofS =
		"\u0088\uffff";
	static final String DFA8_minS =
		"\1\11\11\uffff\1\57\2\uffff\1\75\1\uffff\1\164\2\uffff\1\157\2\154\1\141"+
		"\1\146\1\145\1\141\1\145\1\165\1\145\1\164\1\150\1\157\1\150\2\uffff\1"+
		"\56\6\uffff\1\162\1\163\1\157\1\141\1\163\1\164\1\154\1\60\1\164\1\156"+
		"\1\151\1\167\1\142\1\164\1\141\1\151\1\165\2\151\2\uffff\1\151\1\164\1"+
		"\154\1\163\2\145\1\163\1\uffff\1\60\1\147\1\156\1\60\1\154\1\165\1\164"+
		"\1\163\1\145\1\144\1\154\1\156\2\145\1\163\1\60\1\156\1\145\1\uffff\1"+
		"\164\1\60\1\uffff\1\151\1\162\1\151\3\60\1\145\1\147\1\155\1\141\1\60"+
		"\1\uffff\1\144\1\60\1\150\1\uffff\1\143\1\156\1\143\3\uffff\2\60\1\56"+
		"\1\156\1\uffff\1\163\1\uffff\4\60\3\uffff\2\60\6\uffff";
	static final String DFA8_maxS =
		"\1\175\11\uffff\1\57\2\uffff\1\75\1\uffff\1\171\2\uffff\1\157\1\154\1"+
		"\170\1\141\1\156\1\145\1\141\1\145\1\165\1\145\1\164\1\162\1\157\1\150"+
		"\2\uffff\1\71\6\uffff\1\162\1\163\1\157\1\141\1\163\1\164\1\154\1\172"+
		"\1\164\1\156\1\151\1\167\1\142\1\164\1\141\1\151\1\165\2\151\2\uffff\1"+
		"\151\1\164\1\154\1\163\2\145\1\163\1\uffff\1\172\1\147\1\156\1\172\1\154"+
		"\1\165\1\164\1\163\1\145\1\144\1\154\1\156\2\145\1\163\1\172\1\156\1\145"+
		"\1\uffff\1\164\1\172\1\uffff\1\151\1\162\1\151\3\172\1\145\1\147\1\155"+
		"\1\141\1\172\1\uffff\1\144\1\172\1\150\1\uffff\1\143\1\156\1\143\3\uffff"+
		"\2\172\1\56\1\156\1\uffff\1\163\1\uffff\4\172\3\uffff\2\172\6\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\1\14\1\uffff"+
		"\1\17\1\uffff\1\22\1\23\16\uffff\1\45\1\46\1\uffff\1\51\1\53\1\52\1\12"+
		"\1\16\1\15\23\uffff\1\47\1\50\7\uffff\1\31\22\uffff\1\32\2\uffff\1\35"+
		"\13\uffff\1\26\3\uffff\1\34\3\uffff\1\41\1\42\1\43\4\uffff\1\25\1\uffff"+
		"\1\30\4\uffff\1\44\1\20\1\21\2\uffff\1\33\1\36\1\37\1\40\1\24\1\27";
	static final String DFA8_specialS =
		"\u0088\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\1\4\uffff\1\2\1\uffff\1\3\1\4\1\5"+
			"\1\6\1\7\1\10\1\11\1\12\12\42\1\uffff\1\13\1\14\1\15\1\16\2\uffff\22"+
			"\43\1\17\7\43\1\20\1\uffff\1\21\1\uffff\1\43\1\uffff\1\43\1\22\1\23\1"+
			"\43\1\24\1\25\2\43\1\26\2\43\1\27\1\30\1\31\1\43\1\32\1\43\1\33\1\34"+
			"\1\35\1\43\1\36\1\37\3\43\1\40\1\uffff\1\41",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\45",
			"",
			"",
			"\1\47",
			"",
			"\1\51\4\uffff\1\52",
			"",
			"",
			"\1\53",
			"\1\54",
			"\1\55\13\uffff\1\56",
			"\1\57",
			"\1\60\7\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70\11\uffff\1\71",
			"\1\72",
			"\1\73",
			"",
			"",
			"\1\75\1\uffff\12\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\131",
			"\1\132",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\150",
			"\1\151",
			"",
			"\1\152",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\154",
			"\1\155",
			"\1\156",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\167",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\177",
			"\1\u0080",
			"",
			"\1\u0081",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | INTLITERAL | FLOATLITERAL | IDENTIFIER | COMMENT | WHITESPACE );";
		}
	}

}
