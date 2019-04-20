grammar Eva;

/*
Parser rules
*/

htmlDoc
    : htmlElement*     #elements
    ;

htmlElement
    : htmlElementDeclr              #element
    | htmlComment                   #elementComment
    | htmlElementSpecialDeclr       #elementSpecial
    ;

htmlElementDeclr
    : htmlTagName htmlAttributeList? htmlTagScope   #elementGen
    | htmlElementCompact                            #elementCompact
    ;

htmlElementCompact
    : htmlTagName htmlAttributeList? (COLON text)? SEMI_COLON                                   #elementCompactDeclrSingle
    | htmlTagName htmlAttributeList? (COLON text)? SEMI_COLON GTSYM htmlElementCompactContent   #elementCompactDeclrMulti
    ;

htmlElementCompactContent
    : htmlElementCompact+       #elementCompactContent
    ;

htmlContent
    : htmlTagText? ((htmlComment COLON| htmlElement) htmlTagText?)*  #elementContent
    ;

htmlAttributeList
    : OPEN_PAREN htmlAttributeParameterList? CLOSE_PAREN        #elementAttributeList
    ;

htmlAttributeParameterList
    : htmlAttributeParameter (COMMA htmlAttributeParameter)*    #elementAttributeParameters
    ;

htmlAttributeParameter
    : htmlParamName EQUALSYM text                               #elementParameter
    ;

htmlTagScope
    : OPEN_BRACE htmlContent CLOSE_BRACE                        #elementTagScope
    ;

htmlTagName
    : TAG_NAME                                                  #elementTagName
    ;

htmlParamName
    : TAG_PARAM                                                 #elementParameterName
    ;

htmlTagNameOptChars
    : ( QUESTIONSYM | PERCSYM)                                  #elementNameOptChars
    ;

htmlTagText
    : text                  #elementTextGen
    | 'text' COLON text     #elementTextSpecific
    ;

text
    : SINGLE_QUOTE_STRING   #singleQuotedString
    | DOUBLE_QUOTE_STRING   #doubleQuotedString
    ;

htmlComment
    : ML_COMMENT            #mlComment
    | SL_COMMENT            #slComment
    ;

/* Html special tags */
/* scriptlet('?', '%' are needed as params) */
htmlElementSpecialDeclr
    : ('xml' | 'dtd' | 'script' | 'cdata') htmlElementSpecialBody      #elementSpecialGen
    | 'scriptlet' htmlTagNameOptChars htmlElementSpecialBody           #elementSpecialScriptlet
    ;

htmlElementSpecialBody
    : htmlAttributeList? COLON text     #elementSpecialTagDeclr
    ;


/*
Lexer rules
*/

TAG_NAME
    : TAG_NAME_DECLR
    ;

TAG_PARAM
    : ATSYM TAG_NAME_DECLR
    ;

SL_COMMENT
	:	'//' (~('\n'|'\r'))* NEWLINE
	;

ML_COMMENT
    : '/*' .*? '*/'
    ;

ATSYM : '@';
HASHSYM : '#';
QUESTIONSYM : '?';
PERCSYM  : '%';
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

SINGLE_QUOTE_STRING
    : '\'' ~[']* '\''
    ;

DOUBLE_QUOTE_STRING
    : '"' ~["]* '"'
    ;

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
    : ('\n'|'\r'('\n')?)
    ;

// Whitespace
WS
    : [ \t\n\r]+ -> skip
    ;