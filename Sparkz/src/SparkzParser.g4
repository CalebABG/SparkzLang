parser grammar SparkzParser;

options {
    tokenVocab=SparkzLexer;
}


/*
Parser rules
*/


/* Start grammar rule! */
sparkz
    : elementDeclaration* EOF
    ;


elementDeclaration
    : elementNormalDeclaration              # normalElement
    | elementCompactDeclaration             # compactElement
    | elementCompactContentDeclaration      # compactExtElement
    ;


elementCompactDeclaration
    : elementName elementAttributeListDeclaration? elementCompactStringDeclaration? ';'
    ;


elementCompactContentDeclaration
    : elementName elementAttributeListDeclaration? elementCompactStringDeclaration? '>' elementCompactContent
    ;


elementCompactStringDeclaration
    : ':' string
    ;


elementCompactContent
    : elementDeclaration
    ;


elementNormalDeclaration
    : elementName elementAttributeListDeclaration? elementBody
    ;


elementBody
    : '{' elementBodyContent '}'
    ;


elementBodyContent
    : (elementDeclaration | elementBodyPropertyDeclaration)*
    ;


elementBodyPropertyDeclaration
    : '.' elementName '=' string
    ;


elementAttributeListDeclaration
    : '(' elementAttributes ')'
    ;


elementAttributes
    : elementAttribute (',' elementAttribute)*
    ;


elementAttribute
    : elementAttributeName ('=' elementAttributeValue)?
    ;


elementAttributeName
    : '@' elementName
    ;


elementAttributeValue
    : string
    ;


elementName
    : TagNameDeclaration
    | TagNameSpecialDeclaration
    ;


string
    : StringLiteral
    ;