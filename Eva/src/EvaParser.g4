parser grammar EvaParser;

options {
    tokenVocab=EvaLexer;
}


/*
Parser rules
*/

eva
    : (elementDeclaration)* EOF
    ;


elementDeclaration
    : elementNormalDeclaration              # normalElementDeclaration
    | elementCompactDeclaration             # compactElementDeclaration
    | elementCompactContentDeclaration      # compactElementContentDeclaration
    ;

elementNormalDeclaration
    : elementName elementAttributeListDeclaration? elementBody
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


elementBody
    : '{' elementBodyContent '}'
    ;


elementAttributeListDeclaration
    : '(' elementAttributes ')'
    ;


elementAttributes
    : elementAttribute (',' elementAttribute)*
    ;


elementAttribute
    : elementAttributeName '=' elementAttributeValue
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