grammar Eva;

// $antlr-format on

/*
Parser rules
*/

evaDoc
    : ((elemDeclar | evaComment)+)?
    ;

elemDeclar
    : elemName elemAttributeDeclar? elemScope                                                  #elementGen
    | string elemAttributeDeclar? (elemScope | elemScope? SEMI_COLON)                          #elementSpecial  //TILDE?
    | elemName elemAttributeDeclar? (COLON string)? SEMI_COLON                                 #elementCompactSingle
    | elemName elemAttributeDeclar? (COLON string)? GTSYM elemCompactContent                   #elementCompactMulti
    ;

elemCompactContent
    : (elemDeclar)       #elementCompactContent
    ;

elemContent
    : (elemDeclar | evaComment | elemText)*  #elementContent
    ;

elemAttributeDeclar
    : OPEN_PAREN elemAttributes CLOSE_PAREN                     #elementAttributeList
    ;

elemAttributes
    : elemAttribute (COMMA elemAttribute)*                      #elementAttributeParameters
    ;

elemAttribute
    : paramName EQUALSYM string                                 #elementParameter
    ;

elemScope
    : OPEN_BRACE elemContent CLOSE_BRACE                        #elementScope
    ;

elemName
    : TAG_NAME                                                  #elementName
    ;

paramName
    : TAG_PARAM                                                 #elementParameterName
    ;

elemText
    : 'text' EQUALSYM string                                    #evaText
    ;

string
    : SINGLE_QUOTE_STRING   #singleQuotedString
    | DOUBLE_QUOTE_STRING   #doubleQuotedString
    ;

evaComment
    : ML_COMMENT            #mlComment
    | SL_COMMENT            #slComment
    ;


/*
Lexer rules
*/

//tagname and parameter declarations
TAG_NAME
    : TAG_NAME_DECLR
    ;

TAG_PARAM
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