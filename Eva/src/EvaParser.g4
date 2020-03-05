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
    : tagName tagAttributeDeclaration? elementBody
    ;


elementCompactDeclaration
    : tagName tagAttributeDeclaration? elementCompactStringDeclaration? ';'
    ;


elementCompactContentDeclaration
    : tagName tagAttributeDeclaration? elementCompactStringDeclaration? '>' elementCompactContent
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


tagAttributeDeclaration
    : '(' tagAttributeList ')'
    ;


tagAttributeList
    : tagAttribute (',' tagAttribute)*
    ;


tagAttribute
    : tagAttributeName '=' tagAttributeValue
    ;


tagAttributeValue
    : StringLiteral
    ;


elementBody
    : '{' elementBodyContent '}'
    ;


tagAttributeName
    : TagAttribute
    ;


string
    : StringLiteral
    ;


tagName
    : TagNameDeclaration
    | TagNameSpecialDeclaration
    ;
