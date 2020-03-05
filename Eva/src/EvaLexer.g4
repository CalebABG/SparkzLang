lexer grammar EvaLexer;

/*
Lexer rules
*/

// Tagname and parameter declarations
TagAttribute
    : AT TagNameDeclaration
    ;


TagNameDeclaration
    : TagNameStart TagNamePart*
    ;


ElementBodyPropertDeclaration
    : ':' TagNameStart TagNamePart*
    ;


TagNameSpecialDeclaration
    : '`' TagNameDeclaration '`'
    ;

// String declarations
StringLiteral
	:	'"' StringCharacters? '"'
    ;


// Symbols
AT : '@';
POUND : '#';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';
ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
COLONCOLON : '::';


// Fragments
fragment
StringCharacters
	:	StringCharacter+
	;


fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;


fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	;


fragment
TagNameStart
    : [a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;


fragment
TagNamePart
    : TagNameStart
    | '-'
    | '_'
    | '.'
    | Digit
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;


fragment
Digit
    : [0-9]
    ;


// Whitespace and comments
WS  :  [ \t\r\n]+ -> skip
    ;


COMMENT
    :   '/*' .*? '*/' -> skip
    ;


LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;