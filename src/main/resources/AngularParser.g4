parser grammar AngularParser;

options {
  tokenVocab=AngularLexer;
}
program : importStatement statment* ;

eos : SEMICOLON? ;

importStatement : (IMPORT importFromBlock)* ;
importFromBlock
    : STRINGLITERAL eos
    | IDENTIFIER? moduleItems? FROM STRINGLITERAL eos
    ;

moduleItems
    : '{' (IDENTIFIER (COMMA IDENTIFIER)*)? '}'
    | '{' (COMPONENT )? '}'
    ;


statment
    :
      functionDeclaration
    | componentDeclaration
    | classDeclaration
    | expressionStatement
    | variableStatement
    ;


expressionStatement : singleExpression (',' singleExpression)* eos ;

returnStatement : RETURN (singleExpression (',' singleExpression)*)? eos ;

functionDeclaration
    : EXPORT? IDENTIFIER '(' singleExpression* (',' singleExpression)* ')' '{' statment* '}' exportStatement?
    ;

exportStatement
    : EXPORT IDENTIFIER eos
    ;

variableStatement
    : varModifier ? variableDeclaration (',' variableDeclaration)* eos
    ;

varModifier
    : EXPORT? VAR
    | EXPORT? LET
    | EXPORT? CONST
    ;

variableDeclaration
    : assignable (ASSIGN singleExpression)?
    ;

assignable : arrayLiteral | IDENTIFIER | OBJECTLITERAL ;

singleExpression:
          literal
        | indexarray
        | arrayLiteral
        | forstatment
        | objectLiteral
        | mustacheExpression
        | returnStatement
        | singleExpression DOT singleExpression
        | singleExpression MULTIPLY singleExpression
        | singleExpression DIVIDE singleExpression
        | singleExpression PLUS singleExpression
        | singleExpression MINUS singleExpression
        | singleExpression COLON singleExpression
        | singleExpression AND singleExpression
        | singleExpression QUESTIONMARK singleExpression COLON singleExpression
        | singleExpression ASSIGN singleExpression
        | singleExpression singleExpression
        | htmlElements
        | OPENPAREN singleExpression (COMMA singleExpression)*  CLOSEPAREN
        | IDENTIFIER
        | MAP
        | singleExpression PLUSPLUS
        | OPENBRACE singleExpression (OPENPAREN CLOSEPAREN)?CLOSEBRACE
        | singleExpression MINUSMINUS
        | THIS
        | singleExpressionCss
        ;

singleExpressionCss
    : DOT? IDENTIFIER objectLiteral
    ;
 forstatment : FOR '(' variableStatement  IDENTIFIER (ASSIGN|MORETHAN|LESSTHAN ) singleExpression ';'singleExpression ')' '{'singleExpression eos?'}' ;

functionCall
    : IDENTIFIER OPENPAREN (singleExpression (COMMA singleExpression)*)? CLOSEPAREN
    ;

directive
    : '*ngIf'
    | '*ngFor'
    ;

ifStatement
    : IF OPENPAREN singleExpression CLOSEPAREN statementBlock (ELSE statementBlock)?
    ;

statementBlock
    : '{' statment* '}'
    ;

componentDeclaration
    : AT COMPONENT '(' componentAttributes ')'
    ;

componentAttributes
    : '{' (componentAttribute (',' componentAttribute)* ','?)? '}'
    ;
componentAttribute
    : selectorDeclaration
    | standaloneDeclaration
    | importsDeclaration
    | templateDeclaration
    | stylesDeclaration
    | singleExpressionCss
    ;

selectorDeclaration
    : SELECTOR COLON STRINGLITERAL
    ;

standaloneDeclaration
    : STANDALONE COLON BOOLEANLITERAL
    ;

importsDeclaration
    : IMPORTS COLON arrayLiteral
    ;

templateDeclaration
    : TEMPLATE COLON '`' htmlElements '`'
    ;

stylesDeclaration
    : STYLES  COLON arrayLiteral
    ;


classDeclaration
    : EXPORT? CLASS IDENTIFIER  classBody
    ;


classBody
    :'{' singleExpression* |functionDeclaration*  '}'
    ;

templateStatement
    : htmlElements
    | singleExpression
    ;

htmlElements : htmlElement+ ;
htmlElement
    : '<' IDENTIFIER ( htmlAttribute)*  '>' htmlContent? CLOSE_TAG IDENTIFIER '>'
    | '<' IDENTIFIER ( htmlAttribute)*  '/' '>'
    ;

htmlContent : (htmlElement  |singleExpression)* ;

htmlAttribute
    : IDENTIFIER (ASSIGN htmlAttributeValue)?
    | '[' CLASS DOT IDENTIFIER ']' (ASSIGN htmlAttributeValue)?
    | '(' IDENTIFIER ')' (ASSIGN htmlAttributeValue)?
    | directive (ASSIGN htmlAttributeValue)?
    | CLASS (ASSIGN htmlAttributeValue)?
    |'['IDENTIFIER']' (ASSIGN htmlAttributeValue)?
    ;

mustacheExpression : '{{'  (singleExpression (',' singleExpression)*)?  '}}';

  htmlAttributeValue :STRINGLITERAL
                     |  '{'singleExpression (','  singleExpression)* '}'

                     ;

arrayLiteral : '[''`'?  (singleExpression (',' singleExpression)*)?  '`'?']'
             ;
indexarray : IDENTIFIER '['DECIMALLITERAL']'
           ;
arrayCss : '['  '`' (singleExpressionCss)*? '`' ']'
             ;
objectLiteral
    : '{' (propertyAssignment (',' propertyAssignment)* (';' propertyAssignment)* )?  '}'
    ;

propertyAssignment
    : singleExpression ':' singleExpression ';'?
    ;

literal
    : NULLLITERAL
    | BOOLEANLITERAL
    | STRINGLITERAL
    | DECIMALLITERAL
    | HEXCOLOR
    ;



