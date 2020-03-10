parser grammar EvaParser;

options {
    tokenVocab=EvaLexer;
}


/*
Parser rules
*/


/* Start grammar rule! */
eva
    : (elementDeclaration)* EOF
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
    : elementDeclaration* elementBodyText? elementDeclaration*
    | elementBodyText
    ;


elementBodyText
    : elementBodyProperty '=' string
    ;


elementBodyProperty
    : ElementBodyPropertDeclaration
    ;


elementAttributeListDeclaration
    : '(' elementAttributes ')'
    ;


elementAttributes
    : elementAttribute (',' elementAttribute)*
    ;


elementAttribute
    : elementAttributeName ('=' elementAttributeValue)?
//    : elementAttributeName '=' elementAttributeValue
    ;


elementAttributeName
    : TagAttribute
    ;


elementAttributeValue
    : StringLiteral
    ;


elementName
    : TagNameDeclaration
    | TagNameSpecialDeclaration
    ;


string
    : StringLiteral
    ;