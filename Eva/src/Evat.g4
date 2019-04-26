grammar Evat;

/*
Parser rules
*/

eva
    : (tagDeclar | evaComment)*
    ;

tagDeclar
    : TAG_NAME tagAttributeDeclaration? tagScope
    | TAG_NAME tagAttributeDeclaration? (COLON string)? SEMI_COLON
    | TAG_NAME tagAttributeDeclaration? (COLON string)? GTSYM tagContentCompact
    | string  tagAttributeDeclaration? (tagScope | tagScope? SEMI_COLON)
    ;
//    : tagName tagAttributeDeclaration? tagScope
//    | tagName tagAttributeDeclaration? (COLON string)? SEMI_COLON
//    | tagName tagAttributeDeclaration? (COLON string)? GTSYM tagContentCompact
//    | string  tagAttributeDeclaration? (tagScope | tagScope? SEMI_COLON)
//    ;

tagContentCompact
    : tagDeclar
    ;

tagContent
    : (tagDeclar | evaComment | tagText)*
    ;

tagAttributeDeclaration
    : OPEN_PAREN tagAttributes CLOSE_PAREN
    ;

tagAttributes
    : tagAttribute (COMMA tagAttribute)*
    ;

tagAttribute
    : tagAttributeName EQUALSYM tagAttributeValue
    | tagAttributeName
    ;

tagAttributeValue
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    ;

tagScope
    : OPEN_BRACE tagContent CLOSE_BRACE
    ;

tagAttributeName
    : TAG_ATTRIBUTE
    ;

tagText
    : 'text' EQUALSYM string
    ;

string
    : SINGLE_QUOTE_STRING
    | DOUBLE_QUOTE_STRING
    ;

evaComment
    : ML_COMMENT
    ;


/*
Lexer rules
*/

//tagname and parameter declarations
TAG_NAME
    : TAG_NAME_DECLR
    ;

TAG_ATTRIBUTE
    : ATSYM TAG_NAME_DECLR
    ;


//comment delcarations
SL_COMMENT
	:	'//' (~('\n'|'\r'))* NEWLINE
	;

ML_COMMENT
    : '/*' .*? '*/'
    ;


//Symbols
ATSYM : '@';
HASHSYM : '#';
QUESTIONSYM : '?';
PERCSYM  : '%';
TILDE : '~';
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
COMMA : ',';
COLON : ':';
SEMI_COLON : ';';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
EQUALSYM : '=';
GTSYM : '>';
LTSYM : '<';
PLUS  : '+';
TIMES : '*';
DIV   : '/';
MINUS : '-';


//string declarations
SINGLE_QUOTE_STRING
    : '\'' ~[']* '\''
    ;

DOUBLE_QUOTE_STRING
    : '"' ~["]* '"'
    ;


//fragments
fragment
UNICODE
    : 'u' HEX HEX HEX HEX
    ;

fragment
HEX
    : [0-9a-fA-F]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NAME_DECLR
    : TAG_NameStartChar TAG_NameChar*
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

fragment
NEWLINE
    : ('\n' | ('\r')?'\n')
    ;


// Whitespace
WS
    : [ \t\n\r]+ -> skip
    ;