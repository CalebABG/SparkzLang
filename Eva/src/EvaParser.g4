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
    : tagName tagAttributeDeclaration? (':' string)? ';'
    ;


elementCompactContentDeclaration
    : tagName tagAttributeDeclaration? (':' string)? '>' tagContentCompact
    ;


tagContentCompact
    : elementDeclaration
    ;


elementBodyContent
    : (elementDeclaration | elementBodyText)*
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
