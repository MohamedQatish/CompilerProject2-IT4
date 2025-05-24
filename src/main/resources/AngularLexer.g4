

lexer grammar AngularLexer;

MULTILINECOMMENT  : '/*' .*? '*/'             -> channel(HIDDEN);
SINGLELINECOMMENT : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
AT                         : '@';
BACKTICK                   : '`';
CLASS                      : 'class';
EXPORT                     : 'export';
LET                        : 'let';
COMPONENT                  : 'Component';
SELECTOR                   : 'selector';
STANDALONE                 : 'standalone';
IMPORTS                    : 'imports';
TEMPLATE                   : 'template';
STYLES                     : 'styles';
SEMICOLON                  : ';';
OPENBRACKET                : '[';
CLOSEBRACKET               : ']';
OPENPAREN                  : '(';
CLOSEPAREN                 : ')';
OPENBRACE                  : '{';
CLOSEBRACE                 : '}';
COMMA                      : ',';
ASSIGN                     : '=';
QUESTIONMARK               : '?';
QUESTIONMARKDOT            : '?.';
COLON                      : ':';
ELLIPSIS                   : '...';
DOT                        : '.';
PLUSPLUS                   : '++';
MINUSMINUS                 : '--';
PLUS                       : '+';
MINUS                      : '-';
BITNOT                     : '~';
NOT                        : '!';
MULTIPLY                   : '*';
DIVIDE                     : '/';
MODULUS                    : '%';
NULLCOALESCE               : '??';
HASHTAG                    : '#';
RIGHTSHIFTARITHMETIC       : '>>';
LEFTSHIFTARITHMETIC        : '<<';
RIGHTSHIFTLOGICAL          : '>>>';
LESSTHAN                   : '<';
MORETHAN                   : '>';
LESSTHANEQUALS             : '<=';
GREATERTHANEQUALS          : '>=';
EQUALS                     : '==';
NOTEQUALS                  : '!=';
IDENTITYEQUALS             : '===';
IDENTITYNOTEQUALS          : '!==';
BITAND                     : '&';
BITXOR                     : '^';
BITOR                      : '|';
AND                        : '&&';
OR                         : '||';
MULTIPLYASSIGN             : '*=';
DIVIDEASSIGN               : '/=';
MODULUSASSIGN              : '%=';
PLUSASSIGN                 : '+=';
MINUSASSIGN                : '-=';
LEFTSHIFTARITHMETICASSIGN  : '<<=';
RIGHTSHIFTARITHMETICASSIGN : '>>=';
RIGHTSHIFTLOGICALASSIGN    : '>>>=';
BITANDASSIGN               : '&=';
BITXORASSIGN               : '^=';
BITORASSIGN                : '|=';
NULLISHCOALESCINGASSIGN    : '??=';
ARROW                      : '=>';
REACTCREATEELEMENT         : 'React.createElement';
BREAK                      : 'break';
DO                         : 'do';
INSTANCEOF                 : 'instanceof';
TYPEOF                     : 'typeof';
CASE                       : 'case';
ELSE                       : 'else';
ELSEIF                     : 'else if';
NEW                        : 'new';
VAR                        : 'var';
CATCH                      : 'catch';
FINALLY                    : 'finally';
RETURN                     : 'return';
VOID                       : 'void';
CONTINUE                   : 'continue';
FOR                        : 'for';
SWITCH                     : 'switch';
WHILE                      : 'while';
DEBUGGER                   : 'debugger';
FUNCTION                   : 'function';
THIS                       : 'this';
WITH                       : 'with';
DEFAULT                    : 'default';
IF                         : 'if';
THROW                      : 'throw';
DELETE                     : 'delete';
IN                         : 'in';
TRY                        : 'try';
AS                         : 'as';
FROM                       : 'from';
OF                         : 'of';
NULLLITERAL                : 'null';
BOOLEANLITERAL             : 'true' | 'false';

STRINGLITERAL:
    ('"' DOUBLESTRINGCHARACTER* '"' | '\'' SINGLESTRINGCHARACTER* '\'')
;

/// Future Reserved Words
ENUM                      : 'enum';
EXTENDS                   : 'extends';
SUPER                     : 'super';
CONST                     : 'const';
IMPORT                    : 'import';
IMPLEMENTS                : 'implements';
STRICTLET                 : 'let';
PRIVATE                   : 'private';
PUBLIC                    : 'public';
INTERFACE                 : 'interface';
PACKAGE                   : 'package';
PROTECTED                 : 'protected';
STATIC                    : 'static';
MAP                       : 'map';

DECIMALLITERAL:
    DECIMALINTEGERLITERAL '.' [0-9] [0-9_]* EXPONENTPART?
    | '.' [0-9] [0-9_]* EXPONENTPART?
    | DECIMALINTEGERLITERAL EXPONENTPART?
;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_-]* |[0-9_a-zA-Z] [a-zA-Z_]*;
TAGNAME: TAGNAMESTARTCHAR TAGNAMECHAR*;
ID: [a-zA-Z]+;
NUMBER : [0-9]+;
WS: [ \t\r\n]+ -> skip;
fragment ESC: '\\' (["\\/bfnrt] | UNICODE_ESCAPE);
fragment UNICODE_ESCAPE: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment HEX_DIGIT: [0-9a-fA-F];
fragment ATTRIBUTECHAR:
    '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
;
fragment TAGNAMESTARTCHAR:
    [a-zA-Z];

fragment TAGNAMECHAR:
    TAGNAMESTARTCHAR
    | '-'
    | '_'
    // | '.'
    | DIGIT;

fragment DIGIT: [0-9];

fragment ATTRIBUTECHARS: ATTRIBUTECHAR+ ' '?;

fragment HEXCHARS: '#' [0-9a-fA-F]+;

fragment DECCHARS: [0-9]+ '%'?;

fragment DOUBLEQUOTESTRING: '"' ~[<"]* '"';
fragment SINGLEQUOTESTRING: '\'' ~[<']* '\'';
fragment DOUBLESTRINGCHARACTER: ~["\\] | '\\' ESCAPESEQUENCE | LINECONTINUATION;

fragment SINGLESTRINGCHARACTER: ~['\\] | '\\' ESCAPESEQUENCE | LINECONTINUATION;

fragment ESCAPESEQUENCE:
    CHARACTERESCAPESEQUENCE
    | '0' // no digit ahead! TODO
;

fragment CHARACTERESCAPESEQUENCE: SINGLEESCAPECHARACTER | NONESCAPECHARACTER;
fragment SINGLEESCAPECHARACTER: ['"\\bfnrtv];

fragment NONESCAPECHARACTER: ~['"\\bfnrtv0-9xu\r\n];

fragment ESCAPECHARACTER: SINGLEESCAPECHARACTER | [0-9] | [xu];

fragment LINECONTINUATION: '\\' [\r\n\u2028\u2029];

fragment HEXDIGIT: [_0-9a-fA-F];

fragment DECIMALINTEGERLITERAL: '0' | [1-9] [0-9_]*;

fragment EXPONENTPART: [eE] [+-]? [0-9_]+;

fragment IDENTIFIERPART: IDENTIFIERSTART | [\p{Mn}] | [\p{Nd}] | [\p{Pc}];

fragment IDENTIFIERSTART: [\p{L}] | [$_];
// fragment IDENTIFIERSTART: [\p{L}$] ~[:.];

fragment REGULAREXPRESSIONFIRSTCHAR:
    ~[*\r\n\u2028\u2029\\/[]
    | REGULAREXPRESSIONBACKSLASHSEQUENCE
    | '[' REGULAREXPRESSIONCLASSCHAR* ']'
;

fragment REGULAREXPRESSIONCHAR:
    ~[\r\n\u2028\u2029\\/[]
    | REGULAREXPRESSIONBACKSLASHSEQUENCE
    | '[' REGULAREXPRESSIONCLASSCHAR* ']'
;

fragment REGULAREXPRESSIONCLASSCHAR: ~[\r\n\u2028\u2029\]\\] | REGULAREXPRESSIONBACKSLASHSEQUENCE;

fragment REGULAREXPRESSIONBACKSLASHSEQUENCE: '\\' ~[\r\n\u2028\u2029];

fragment CAPITALLETTER: [A-Z];

fragment LOWERCASE: [a-z];

NGIFDIRECTIVE: '*ngIf';
NGFORDIRECTIVE: '*ngFor';
NGMODULE: 'NgModule';
INJECTABLE: 'Injectable';
PIPE: 'Pipe';

QUT: '"';
OPEN_MUSTACHE: '{{';
CLOSE_MUSTACHE: '}}';
CLOSE_TAG: '</';
HEXCOLOR: '#' [0-9a-fA-F]+;

// Keep other tokens from ReactLexer that are shared
//Margin                     : 'margin';
//Margin_top                 : 'margin_top';
//Padding                    : 'padding';
//Display                    :'display';
//Color                      : 'color';
//Border_color               : 'border-color';
//Box_shadow                 : 'box-shadow';
//Flex                       : 'flex';
//Background_color           : 'background-color';
//Width                      : 'width';
//Line_height                : 'line-height';
//Flex_direction             : 'flex-direction';
//Flex_wrap                  : 'flex-wrap';
//Gap                        : 'gap';
//Justify_content            : 'justify-content';