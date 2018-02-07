// $ANTLR 3.5.2 Minijava.g 2017-09-11 21:52:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MinijavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOATLITERAL", "IDENTIFIER", 
		"INTLITERAL", "WHITESPACE", "'!'", "'&&'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'=='", "'>'", "'String'", 
		"'System.out.println'", "'['", "']'", "'boolean'", "'class'", "'else'", 
		"'extends'", "'false'", "'if'", "'int'", "'length'", "'main'", "'new'", 
		"'public'", "'return'", "'static'", "'this'", "'true'", "'void'", "'while'", 
		"'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MinijavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MinijavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MinijavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Minijava.g"; }



	// $ANTLR start "program"
	// Minijava.g:10:1: program : mainClass ( classDeclaration )* EOF ;
	public final void program() throws RecognitionException {
		try {
			// Minijava.g:10:10: ( mainClass ( classDeclaration )* EOF )
			// Minijava.g:10:12: mainClass ( classDeclaration )* EOF
			{
			pushFollow(FOLLOW_mainClass_in_program18);
			mainClass();
			state._fsp--;

			// Minijava.g:10:22: ( classDeclaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==29) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Minijava.g:10:24: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_program22);
					classDeclaration();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_program27); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "mainClass"
	// Minijava.g:12:1: mainClass : 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}' ;
	public final void mainClass() throws RecognitionException {
		try {
			// Minijava.g:12:11: ( 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}' )
			// Minijava.g:12:13: 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}'
			{
			match(input,29,FOLLOW_29_in_mainClass38); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_mainClass40); 
			match(input,45,FOLLOW_45_in_mainClass42); 
			match(input,38,FOLLOW_38_in_mainClass44); 
			match(input,40,FOLLOW_40_in_mainClass46); 
			match(input,43,FOLLOW_43_in_mainClass48); 
			match(input,36,FOLLOW_36_in_mainClass50); 
			match(input,11,FOLLOW_11_in_mainClass52); 
			match(input,24,FOLLOW_24_in_mainClass54); 
			match(input,26,FOLLOW_26_in_mainClass56); 
			match(input,27,FOLLOW_27_in_mainClass58); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_mainClass60); 
			match(input,12,FOLLOW_12_in_mainClass62); 
			match(input,45,FOLLOW_45_in_mainClass64); 
			pushFollow(FOLLOW_statement_in_mainClass66);
			statement();
			state._fsp--;

			match(input,46,FOLLOW_46_in_mainClass68); 
			match(input,46,FOLLOW_46_in_mainClass70); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mainClass"



	// $ANTLR start "classDeclaration"
	// Minijava.g:14:1: classDeclaration : 'class' IDENTIFIER ( 'extends' IDENTIFIER )? '{' ( varDeclaration )* ( methodDeclaration )* '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// Minijava.g:14:17: ( 'class' IDENTIFIER ( 'extends' IDENTIFIER )? '{' ( varDeclaration )* ( methodDeclaration )* '}' )
			// Minijava.g:14:19: 'class' IDENTIFIER ( 'extends' IDENTIFIER )? '{' ( varDeclaration )* ( methodDeclaration )* '}'
			{
			match(input,29,FOLLOW_29_in_classDeclaration80); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration82); 
			// Minijava.g:14:38: ( 'extends' IDENTIFIER )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==31) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Minijava.g:14:40: 'extends' IDENTIFIER
					{
					match(input,31,FOLLOW_31_in_classDeclaration86); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration88); 
					}
					break;

			}

			match(input,45,FOLLOW_45_in_classDeclaration93); 
			// Minijava.g:14:68: ( varDeclaration )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==IDENTIFIER||LA3_0==28||LA3_0==34) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Minijava.g:14:70: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_classDeclaration97);
					varDeclaration();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			// Minijava.g:14:88: ( methodDeclaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==38) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Minijava.g:14:90: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classDeclaration104);
					methodDeclaration();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,46,FOLLOW_46_in_classDeclaration109); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "varDeclaration"
	// Minijava.g:16:1: varDeclaration : type IDENTIFIER ';' ;
	public final void varDeclaration() throws RecognitionException {
		try {
			// Minijava.g:16:16: ( type IDENTIFIER ';' )
			// Minijava.g:16:18: type IDENTIFIER ';'
			{
			pushFollow(FOLLOW_type_in_varDeclaration120);
			type();
			state._fsp--;

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclaration122); 
			match(input,19,FOLLOW_19_in_varDeclaration124); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDeclaration"



	// $ANTLR start "methodDeclaration"
	// Minijava.g:18:1: methodDeclaration : 'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expr ';' '}' ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// Minijava.g:18:18: ( 'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expr ';' '}' )
			// Minijava.g:18:20: 'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expr ';' '}'
			{
			match(input,38,FOLLOW_38_in_methodDeclaration134); 
			pushFollow(FOLLOW_type_in_methodDeclaration136);
			type();
			state._fsp--;

			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration138); 
			match(input,11,FOLLOW_11_in_methodDeclaration140); 
			// Minijava.g:18:49: ( type IDENTIFIER ( ',' type IDENTIFIER )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENTIFIER||LA6_0==28||LA6_0==34) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Minijava.g:18:51: type IDENTIFIER ( ',' type IDENTIFIER )*
					{
					pushFollow(FOLLOW_type_in_methodDeclaration144);
					type();
					state._fsp--;

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration146); 
					// Minijava.g:18:67: ( ',' type IDENTIFIER )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==15) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// Minijava.g:18:69: ',' type IDENTIFIER
							{
							match(input,15,FOLLOW_15_in_methodDeclaration150); 
							pushFollow(FOLLOW_type_in_methodDeclaration152);
							type();
							state._fsp--;

							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration154); 
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			match(input,12,FOLLOW_12_in_methodDeclaration162); 
			match(input,45,FOLLOW_45_in_methodDeclaration164); 
			// Minijava.g:18:103: ( varDeclaration )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDENTIFIER) ) {
					int LA7_2 = input.LA(2);
					if ( (LA7_2==IDENTIFIER) ) {
						alt7=1;
					}

				}
				else if ( (LA7_0==28||LA7_0==34) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Minijava.g:18:105: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_methodDeclaration168);
					varDeclaration();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			// Minijava.g:18:123: ( statement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==IDENTIFIER||LA8_0==25||LA8_0==33||(LA8_0 >= 44 && LA8_0 <= 45)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Minijava.g:18:125: statement
					{
					pushFollow(FOLLOW_statement_in_methodDeclaration175);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,39,FOLLOW_39_in_methodDeclaration180); 
			pushFollow(FOLLOW_expr_in_methodDeclaration182);
			expr();
			state._fsp--;

			match(input,19,FOLLOW_19_in_methodDeclaration184); 
			match(input,46,FOLLOW_46_in_methodDeclaration186); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "methodDeclaration"



	// $ANTLR start "type"
	// Minijava.g:20:1: type : ( 'int' '[' ']' | 'boolean' | 'int' | IDENTIFIER );
	public final void type() throws RecognitionException {
		try {
			// Minijava.g:20:7: ( 'int' '[' ']' | 'boolean' | 'int' | IDENTIFIER )
			int alt9=4;
			switch ( input.LA(1) ) {
			case 34:
				{
				int LA9_1 = input.LA(2);
				if ( (LA9_1==26) ) {
					alt9=1;
				}
				else if ( (LA9_1==IDENTIFIER) ) {
					alt9=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 28:
				{
				alt9=2;
				}
				break;
			case IDENTIFIER:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// Minijava.g:20:9: 'int' '[' ']'
					{
					match(input,34,FOLLOW_34_in_type198); 
					match(input,26,FOLLOW_26_in_type200); 
					match(input,27,FOLLOW_27_in_type202); 
					}
					break;
				case 2 :
					// Minijava.g:21:6: 'boolean'
					{
					match(input,28,FOLLOW_28_in_type209); 
					}
					break;
				case 3 :
					// Minijava.g:22:6: 'int'
					{
					match(input,34,FOLLOW_34_in_type216); 
					}
					break;
				case 4 :
					// Minijava.g:23:6: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type223); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// Minijava.g:25:1: statement : ( '{' ( statement )* '}' | 'if' '(' expr ')' statement 'else' statement | 'while' '(' expr ')' statement | 'System.out.println' '(' expr ')' ';' | IDENTIFIER '=' expr ';' | IDENTIFIER '[' expr ']' '=' expr ';' );
	public final void statement() throws RecognitionException {
		try {
			// Minijava.g:25:11: ( '{' ( statement )* '}' | 'if' '(' expr ')' statement 'else' statement | 'while' '(' expr ')' statement | 'System.out.println' '(' expr ')' ';' | IDENTIFIER '=' expr ';' | IDENTIFIER '[' expr ']' '=' expr ';' )
			int alt11=6;
			switch ( input.LA(1) ) {
			case 45:
				{
				alt11=1;
				}
				break;
			case 33:
				{
				alt11=2;
				}
				break;
			case 44:
				{
				alt11=3;
				}
				break;
			case 25:
				{
				alt11=4;
				}
				break;
			case IDENTIFIER:
				{
				int LA11_5 = input.LA(2);
				if ( (LA11_5==21) ) {
					alt11=5;
				}
				else if ( (LA11_5==26) ) {
					alt11=6;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// Minijava.g:25:13: '{' ( statement )* '}'
					{
					match(input,45,FOLLOW_45_in_statement234); 
					// Minijava.g:25:17: ( statement )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==IDENTIFIER||LA10_0==25||LA10_0==33||(LA10_0 >= 44 && LA10_0 <= 45)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Minijava.g:25:19: statement
							{
							pushFollow(FOLLOW_statement_in_statement238);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					match(input,46,FOLLOW_46_in_statement243); 
					}
					break;
				case 2 :
					// Minijava.g:26:6: 'if' '(' expr ')' statement 'else' statement
					{
					match(input,33,FOLLOW_33_in_statement250); 
					match(input,11,FOLLOW_11_in_statement252); 
					pushFollow(FOLLOW_expr_in_statement254);
					expr();
					state._fsp--;

					match(input,12,FOLLOW_12_in_statement256); 
					pushFollow(FOLLOW_statement_in_statement258);
					statement();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement260); 
					pushFollow(FOLLOW_statement_in_statement262);
					statement();
					state._fsp--;

					}
					break;
				case 3 :
					// Minijava.g:27:6: 'while' '(' expr ')' statement
					{
					match(input,44,FOLLOW_44_in_statement269); 
					match(input,11,FOLLOW_11_in_statement271); 
					pushFollow(FOLLOW_expr_in_statement273);
					expr();
					state._fsp--;

					match(input,12,FOLLOW_12_in_statement275); 
					pushFollow(FOLLOW_statement_in_statement277);
					statement();
					state._fsp--;

					}
					break;
				case 4 :
					// Minijava.g:28:6: 'System.out.println' '(' expr ')' ';'
					{
					match(input,25,FOLLOW_25_in_statement284); 
					match(input,11,FOLLOW_11_in_statement286); 
					pushFollow(FOLLOW_expr_in_statement288);
					expr();
					state._fsp--;

					match(input,12,FOLLOW_12_in_statement290); 
					match(input,19,FOLLOW_19_in_statement292); 
					}
					break;
				case 5 :
					// Minijava.g:29:6: IDENTIFIER '=' expr ';'
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement299); 
					match(input,21,FOLLOW_21_in_statement301); 
					pushFollow(FOLLOW_expr_in_statement303);
					expr();
					state._fsp--;

					match(input,19,FOLLOW_19_in_statement305); 
					}
					break;
				case 6 :
					// Minijava.g:30:6: IDENTIFIER '[' expr ']' '=' expr ';'
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement312); 
					match(input,26,FOLLOW_26_in_statement314); 
					pushFollow(FOLLOW_expr_in_statement316);
					expr();
					state._fsp--;

					match(input,27,FOLLOW_27_in_statement318); 
					match(input,21,FOLLOW_21_in_statement320); 
					pushFollow(FOLLOW_expr_in_statement322);
					expr();
					state._fsp--;

					match(input,19,FOLLOW_19_in_statement324); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// Minijava.g:33:1: expr : comparison ( '&&' comparison )* ;
	public final void expr() throws RecognitionException {
		try {
			// Minijava.g:33:7: ( comparison ( '&&' comparison )* )
			// Minijava.g:33:10: comparison ( '&&' comparison )*
			{
			pushFollow(FOLLOW_comparison_in_expr338);
			comparison();
			state._fsp--;

			// Minijava.g:33:21: ( '&&' comparison )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==10) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Minijava.g:33:22: '&&' comparison
					{
					match(input,10,FOLLOW_10_in_expr341); 
					pushFollow(FOLLOW_comparison_in_expr343);
					comparison();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "comparison"
	// Minijava.g:36:1: comparison : addSub ( ( '<' | '>' | '==' ) addSub )* ;
	public final void comparison() throws RecognitionException {
		try {
			// Minijava.g:36:12: ( addSub ( ( '<' | '>' | '==' ) addSub )* )
			// Minijava.g:36:15: addSub ( ( '<' | '>' | '==' ) addSub )*
			{
			pushFollow(FOLLOW_addSub_in_comparison366);
			addSub();
			state._fsp--;

			// Minijava.g:36:21: ( ( '<' | '>' | '==' ) addSub )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==20||(LA13_0 >= 22 && LA13_0 <= 23)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Minijava.g:36:22: ( '<' | '>' | '==' ) addSub
					{
					if ( input.LA(1)==20||(input.LA(1) >= 22 && input.LA(1) <= 23) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addSub_in_comparison379);
					addSub();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparison"



	// $ANTLR start "addSub"
	// Minijava.g:39:1: addSub : mulDiv ( ( '+' | '-' ) mulDiv )* ;
	public final void addSub() throws RecognitionException {
		try {
			// Minijava.g:39:9: ( mulDiv ( ( '+' | '-' ) mulDiv )* )
			// Minijava.g:39:11: mulDiv ( ( '+' | '-' ) mulDiv )*
			{
			pushFollow(FOLLOW_mulDiv_in_addSub397);
			mulDiv();
			state._fsp--;

			// Minijava.g:39:17: ( ( '+' | '-' ) mulDiv )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==14||LA14_0==16) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Minijava.g:39:18: ( '+' | '-' ) mulDiv
					{
					if ( input.LA(1)==14||input.LA(1)==16 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulDiv_in_addSub407);
					mulDiv();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addSub"



	// $ANTLR start "mulDiv"
	// Minijava.g:42:1: mulDiv : ( primary ( ( '*' | '/' ) primary )* | '!' primary );
	public final void mulDiv() throws RecognitionException {
		try {
			// Minijava.g:42:9: ( primary ( ( '*' | '/' ) primary )* | '!' primary )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= FLOATLITERAL && LA16_0 <= INTLITERAL)||LA16_0==11||LA16_0==32||LA16_0==37||(LA16_0 >= 41 && LA16_0 <= 42)) ) {
				alt16=1;
			}
			else if ( (LA16_0==9) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Minijava.g:42:11: primary ( ( '*' | '/' ) primary )*
					{
					pushFollow(FOLLOW_primary_in_mulDiv425);
					primary();
					state._fsp--;

					// Minijava.g:42:20: ( ( '*' | '/' ) primary )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==13||LA15_0==18) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Minijava.g:42:21: ( '*' | '/' ) primary
							{
							if ( input.LA(1)==13||input.LA(1)==18 ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_primary_in_mulDiv437);
							primary();
							state._fsp--;

							}
							break;

						default :
							break loop15;
						}
					}

					}
					break;
				case 2 :
					// Minijava.g:42:46: '!' primary
					{
					match(input,9,FOLLOW_9_in_mulDiv444); 
					pushFollow(FOLLOW_primary_in_mulDiv446);
					primary();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mulDiv"



	// $ANTLR start "primary"
	// Minijava.g:45:1: primary : ( INTLITERAL | 'true' | 'false' | IDENTIFIER | FLOATLITERAL | 'this' | 'new' 'int' '[' expr ']' | 'new' IDENTIFIER '(' ')' | '(' expr ')' ) ( '[' expr ']' | '.' 'length' | '.' IDENTIFIER '(' ( expr ( ',' expr )* )? ')' )* ;
	public final void primary() throws RecognitionException {
		try {
			// Minijava.g:45:9: ( ( INTLITERAL | 'true' | 'false' | IDENTIFIER | FLOATLITERAL | 'this' | 'new' 'int' '[' expr ']' | 'new' IDENTIFIER '(' ')' | '(' expr ')' ) ( '[' expr ']' | '.' 'length' | '.' IDENTIFIER '(' ( expr ( ',' expr )* )? ')' )* )
			// Minijava.g:46:3: ( INTLITERAL | 'true' | 'false' | IDENTIFIER | FLOATLITERAL | 'this' | 'new' 'int' '[' expr ']' | 'new' IDENTIFIER '(' ')' | '(' expr ')' ) ( '[' expr ']' | '.' 'length' | '.' IDENTIFIER '(' ( expr ( ',' expr )* )? ')' )*
			{
			// Minijava.g:46:3: ( INTLITERAL | 'true' | 'false' | IDENTIFIER | FLOATLITERAL | 'this' | 'new' 'int' '[' expr ']' | 'new' IDENTIFIER '(' ')' | '(' expr ')' )
			int alt17=9;
			switch ( input.LA(1) ) {
			case INTLITERAL:
				{
				alt17=1;
				}
				break;
			case 42:
				{
				alt17=2;
				}
				break;
			case 32:
				{
				alt17=3;
				}
				break;
			case IDENTIFIER:
				{
				alt17=4;
				}
				break;
			case FLOATLITERAL:
				{
				alt17=5;
				}
				break;
			case 41:
				{
				alt17=6;
				}
				break;
			case 37:
				{
				int LA17_7 = input.LA(2);
				if ( (LA17_7==34) ) {
					alt17=7;
				}
				else if ( (LA17_7==IDENTIFIER) ) {
					alt17=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 11:
				{
				alt17=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Minijava.g:46:5: INTLITERAL
					{
					match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary469); 
					}
					break;
				case 2 :
					// Minijava.g:47:5: 'true'
					{
					match(input,42,FOLLOW_42_in_primary475); 
					}
					break;
				case 3 :
					// Minijava.g:48:5: 'false'
					{
					match(input,32,FOLLOW_32_in_primary481); 
					}
					break;
				case 4 :
					// Minijava.g:49:5: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary487); 
					}
					break;
				case 5 :
					// Minijava.g:50:5: FLOATLITERAL
					{
					match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary493); 
					}
					break;
				case 6 :
					// Minijava.g:51:5: 'this'
					{
					match(input,41,FOLLOW_41_in_primary499); 
					}
					break;
				case 7 :
					// Minijava.g:52:5: 'new' 'int' '[' expr ']'
					{
					match(input,37,FOLLOW_37_in_primary505); 
					match(input,34,FOLLOW_34_in_primary507); 
					match(input,26,FOLLOW_26_in_primary509); 
					pushFollow(FOLLOW_expr_in_primary511);
					expr();
					state._fsp--;

					match(input,27,FOLLOW_27_in_primary513); 
					}
					break;
				case 8 :
					// Minijava.g:53:5: 'new' IDENTIFIER '(' ')'
					{
					match(input,37,FOLLOW_37_in_primary519); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary521); 
					match(input,11,FOLLOW_11_in_primary523); 
					match(input,12,FOLLOW_12_in_primary525); 
					}
					break;
				case 9 :
					// Minijava.g:54:5: '(' expr ')'
					{
					match(input,11,FOLLOW_11_in_primary531); 
					pushFollow(FOLLOW_expr_in_primary533);
					expr();
					state._fsp--;

					match(input,12,FOLLOW_12_in_primary535); 
					}
					break;

			}

			// Minijava.g:56:3: ( '[' expr ']' | '.' 'length' | '.' IDENTIFIER '(' ( expr ( ',' expr )* )? ')' )*
			loop20:
			while (true) {
				int alt20=4;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==26) ) {
					alt20=1;
				}
				else if ( (LA20_0==17) ) {
					int LA20_3 = input.LA(2);
					if ( (LA20_3==35) ) {
						alt20=2;
					}
					else if ( (LA20_3==IDENTIFIER) ) {
						alt20=3;
					}

				}

				switch (alt20) {
				case 1 :
					// Minijava.g:56:5: '[' expr ']'
					{
					match(input,26,FOLLOW_26_in_primary545); 
					pushFollow(FOLLOW_expr_in_primary547);
					expr();
					state._fsp--;

					match(input,27,FOLLOW_27_in_primary549); 
					}
					break;
				case 2 :
					// Minijava.g:57:5: '.' 'length'
					{
					match(input,17,FOLLOW_17_in_primary555); 
					match(input,35,FOLLOW_35_in_primary557); 
					}
					break;
				case 3 :
					// Minijava.g:58:5: '.' IDENTIFIER '(' ( expr ( ',' expr )* )? ')'
					{
					match(input,17,FOLLOW_17_in_primary563); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary565); 
					match(input,11,FOLLOW_11_in_primary567); 
					// Minijava.g:58:24: ( expr ( ',' expr )* )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( ((LA19_0 >= FLOATLITERAL && LA19_0 <= INTLITERAL)||LA19_0==9||LA19_0==11||LA19_0==32||LA19_0==37||(LA19_0 >= 41 && LA19_0 <= 42)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Minijava.g:58:25: expr ( ',' expr )*
							{
							pushFollow(FOLLOW_expr_in_primary570);
							expr();
							state._fsp--;

							// Minijava.g:58:30: ( ',' expr )*
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( (LA18_0==15) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// Minijava.g:58:32: ',' expr
									{
									match(input,15,FOLLOW_15_in_primary574); 
									pushFollow(FOLLOW_expr_in_primary576);
									expr();
									state._fsp--;

									}
									break;

								default :
									break loop18;
								}
							}

							}
							break;

					}

					match(input,12,FOLLOW_12_in_primary584); 
					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primary"

	// Delegated rules



	public static final BitSet FOLLOW_mainClass_in_program18 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_classDeclaration_in_program22 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_EOF_in_program27 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_mainClass38 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_mainClass40 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_mainClass42 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_mainClass44 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_mainClass46 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_mainClass48 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_mainClass50 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_mainClass52 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_mainClass54 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_mainClass56 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_mainClass58 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_mainClass60 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_mainClass62 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_mainClass64 = new BitSet(new long[]{0x0000300202000040L});
	public static final BitSet FOLLOW_statement_in_mainClass66 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_mainClass68 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_mainClass70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_classDeclaration80 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration82 = new BitSet(new long[]{0x0000200080000000L});
	public static final BitSet FOLLOW_31_in_classDeclaration86 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration88 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_classDeclaration93 = new BitSet(new long[]{0x0000404410000040L});
	public static final BitSet FOLLOW_varDeclaration_in_classDeclaration97 = new BitSet(new long[]{0x0000404410000040L});
	public static final BitSet FOLLOW_methodDeclaration_in_classDeclaration104 = new BitSet(new long[]{0x0000404000000000L});
	public static final BitSet FOLLOW_46_in_classDeclaration109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_varDeclaration120 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varDeclaration122 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_varDeclaration124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_methodDeclaration134 = new BitSet(new long[]{0x0000000410000040L});
	public static final BitSet FOLLOW_type_in_methodDeclaration136 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration138 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_methodDeclaration140 = new BitSet(new long[]{0x0000000410001040L});
	public static final BitSet FOLLOW_type_in_methodDeclaration144 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration146 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_15_in_methodDeclaration150 = new BitSet(new long[]{0x0000000410000040L});
	public static final BitSet FOLLOW_type_in_methodDeclaration152 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration154 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_12_in_methodDeclaration162 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_methodDeclaration164 = new BitSet(new long[]{0x0000308612000040L});
	public static final BitSet FOLLOW_varDeclaration_in_methodDeclaration168 = new BitSet(new long[]{0x0000308612000040L});
	public static final BitSet FOLLOW_statement_in_methodDeclaration175 = new BitSet(new long[]{0x0000308202000040L});
	public static final BitSet FOLLOW_39_in_methodDeclaration180 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_methodDeclaration182 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_methodDeclaration184 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_methodDeclaration186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type198 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_type200 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_type202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_type209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_statement234 = new BitSet(new long[]{0x0000700202000040L});
	public static final BitSet FOLLOW_statement_in_statement238 = new BitSet(new long[]{0x0000700202000040L});
	public static final BitSet FOLLOW_46_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_statement250 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_statement252 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_statement254 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_statement256 = new BitSet(new long[]{0x0000300202000040L});
	public static final BitSet FOLLOW_statement_in_statement258 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement260 = new BitSet(new long[]{0x0000300202000040L});
	public static final BitSet FOLLOW_statement_in_statement262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_statement269 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_statement271 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_statement273 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_statement275 = new BitSet(new long[]{0x0000300202000040L});
	public static final BitSet FOLLOW_statement_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_statement284 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_statement286 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_statement288 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_statement290 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_statement292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement299 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_statement301 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_statement303 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement312 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_statement314 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_statement316 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_statement318 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_statement320 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_statement322 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_expr338 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_expr341 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_comparison_in_expr343 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_addSub_in_comparison366 = new BitSet(new long[]{0x0000000000D00002L});
	public static final BitSet FOLLOW_set_in_comparison368 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_addSub_in_comparison379 = new BitSet(new long[]{0x0000000000D00002L});
	public static final BitSet FOLLOW_mulDiv_in_addSub397 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_set_in_addSub399 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_mulDiv_in_addSub407 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_primary_in_mulDiv425 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_set_in_mulDiv429 = new BitSet(new long[]{0x00000621000008E0L});
	public static final BitSet FOLLOW_primary_in_mulDiv437 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_9_in_mulDiv444 = new BitSet(new long[]{0x00000621000008E0L});
	public static final BitSet FOLLOW_primary_in_mulDiv446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_primary469 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_42_in_primary475 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_32_in_primary481 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary487 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FLOATLITERAL_in_primary493 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_41_in_primary499 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_37_in_primary505 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_primary507 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_primary509 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_primary511 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_primary513 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_37_in_primary519 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary521 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_primary523 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_primary525 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_11_in_primary531 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_primary533 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_primary535 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_26_in_primary545 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_primary547 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_primary549 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_17_in_primary555 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_primary557 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_17_in_primary563 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary565 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_primary567 = new BitSet(new long[]{0x0000062100001AE0L});
	public static final BitSet FOLLOW_expr_in_primary570 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_15_in_primary574 = new BitSet(new long[]{0x0000062100000AE0L});
	public static final BitSet FOLLOW_expr_in_primary576 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_12_in_primary584 = new BitSet(new long[]{0x0000000004020002L});
}
