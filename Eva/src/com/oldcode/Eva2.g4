grammar Eva2;

/*
Parser rules
*/

h5doc
    : h5elem*     #elements
    ;

h5elem
    : h5elemdclr              #element
    | h5comment               #elementComment
    | h5elemsdclr             #elementSpecial
    ;

h5elemdclr
    : h5tagname h5attrlist? h5tagscope          #elementGen
    | h5elemcompact                             #elementCompact
    ;

h5elemcompact
    : h5tagname h5attrlist? (COLON text)? SEMI_COLON                                   #elementCompactDeclrSingle
    | h5tagname h5attrlist? (COLON text)? SEMI_COLON? GTSYM h5elemcompactcontent   #elementCompactDeclrMulti //check '?' doesnt cause problems
    ;

h5elemcompactcontent
    : h5elemcompact+       #elementCompactContent
    ;

h5content
    : h5text? ((h5comment COLON| h5elem) h5text?)*  #elementContent
    ;

h5attrlist
    : OPEN_PAREN h5attrparams? CLOSE_PAREN        #elementAttributeList
    ;

h5attrparams
    : h5attrparam (COMMA h5attrparam)*    #elementAttributeParameters
    ;

h5attrparam
    : h5paramname EQUALSYM text                               #elementParameter
    ;

h5tagscope
    : OPEN_BRACE h5content CLOSE_BRACE                        #elementTagScope
    ;

h5tagname
    : TAG_NAME                                                  #elementTagName
    ;

h5paramname
    : TAG_PARAM                                                 #elementParameterName
    ;

h5tagchars
    : ( QUESTIONSYM | PERCSYM)                                  #elementNameOptChars
    ;

h5text
//    : text                  #elementTextGen
    : 'text' COLON text     #elementTextSpecific
//    | 'text' COLON text     #elementTextSpecific
    ;

text
    : SINGLE_QUOTE_STRING   #singleQuotedString
    | DOUBLE_QUOTE_STRING   #doubleQuotedString
    ;

h5comment
    : ML_COMMENT            #mlComment
    | SL_COMMENT            #slComment
    ;

/* Html special tags */
/* scriptlet('?', '%' are needed as params) */
h5elemsdclr
    : ('@xml' | '@dtd' | '@script' | '@cdata') h5elemsbody      #elementSpecialGen
    | '@scriptlet' h5tagchars h5elemsbody                    #elementSpecialScriptlet
    ;

h5elemsbody
    : h5attrlist? COLON text     #elementSpecialTagDeclr
    ;


/*
Lexer rules
*/

XML : '@xml';
DTD : '@dtd';
SCRIPT : '@script';
CDATA : '@cdata';
SCRIPTLET : '@scriptlet';

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