grammar Minijava;

//@parser::header
//{package minijava.parser;}

//@lexer::header
//{package minijava.parser;}


program		:	mainClass ( classDeclaration )* EOF
			;
mainClass	:	'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}'
			;
classDeclaration:	'class' IDENTIFIER ( 'extends' IDENTIFIER )? '{' ( varDeclaration )* ( methodDeclaration )* '}'
			;
varDeclaration	:	type IDENTIFIER ';'
			;
methodDeclaration:	'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expr ';' '}'
			;
type		:	'int' '[' ']'
			|	'boolean'
			|	'int'
			|	IDENTIFIER
			;
statement	:	'{' ( statement )* '}'
			|	'if' '(' expr ')' statement 'else' statement
			|	'while' '(' expr ')' statement
			|	'System.out.println' '(' expr ')' ';'
			|	IDENTIFIER '=' expr ';'
			|	IDENTIFIER '[' expr ']' '=' expr ';'
			;
// The top-level rule for boolean and arithmetic expressions for Part II			
expr		:	 comparison ('&&' comparison)*  
			;
						
comparison	: 	addSub(('<' | '>' | '==')addSub)*
			;
			
addSub		:	mulDiv(('+' | '-') mulDiv)*
			;
			
mulDiv		:	primary  (('*' | '/') primary )* | '!' primary
			;
						
primary	:	
		(	INTLITERAL
		|	'true'
		|	'false'
		|	IDENTIFIER
		|	FLOATLITERAL
		|	'this'
		|	'new' 'int' '[' expr ']'
		|	'new' IDENTIFIER '(' ')'
		|	'(' expr ')'
		)
		(	'[' expr ']'
		|	'.' 'length'
		|	'.' IDENTIFIER '(' (expr ( ',' expr )* )? ')'
		)*
		;

// Fill in the following token rules for Part I
INTLITERAL	:	'0'..'9'+
		  	;
FLOATLITERAL:	'0'..'9' + ('.' '0'..'9' *)?

			;	
IDENTIFIER	:	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
		  	;
COMMENT	  	:	'//' .* '\n' {skip();} 
		  	;
WHITESPACE	:  	 (' '|'\t'|'\n'|'\r')+ {skip();} 
			;