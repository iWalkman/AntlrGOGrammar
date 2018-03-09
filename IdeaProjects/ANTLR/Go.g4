grammar Go;

options {
    language = CSharp;
}

file
    : (statement )* statement? EOF
    ;

statement
    : expression
    | printlnStatement
    | typeDeclaration
    | methodDeclaration
    | returnStatement
    | shortDeclarationStatement
    | importStatement
    ;

importStatement
    : 'import' StringLiteral
    ;

shortDeclarationStatement
    : Id ':=' expression
    ;

returnStatement
    : 'return' expression (',' expression)*
    ;

printlnStatement
    : 'fmt.Println' '(' (expression (',' expression)*)? ')'
    ;

typeDeclaration
    : 'type' Id 'struct' '{' (varDeclaration | methodDeclaration)* '}'
    ;

varDeclaration
    : Id (',' Id)* TypeName
    ;

methodDeclaration
    : 'func' ('('( Id TypeName (',' Id TypeName)*)? ')')? Id '(' ')' '{' (statement )* statement?'}'
    ;

primaryExpression
    : Id
    | '(' expression ')'
    | ComplexLitteral
    | IntegerLiteral
    | FloatLitteral
    | StringLiteral
    | functionCall
    | objectConstuctor
    ;

functionCall
    : Id '(' (expression|keyWordParametr) (',' (expression|keyWordParametr))* ')';

objectConstuctor
    : Id '{' (expression|keyWordParametr) (',' (expression|keyWordParametr))* '}'
    ;

keyWordParametr
    : Id ':' expression
    ;

structureMemberExpression
    : structureMemberExpression '.' primaryExpression
    | primaryExpression
    ;

unaryExpression
    : structureMemberExpression
    | '!' structureMemberExpression
    | '*' structureMemberExpression
    ;

multiplicativeExpression
    : unaryExpression
    | multiplicativeExpression '*' unaryExpression
    | multiplicativeExpression '%' unaryExpression
    | multiplicativeExpression '&' unaryExpression
    ;

additiveExpression
    : multiplicativeExpression
    | additiveExpression '-' multiplicativeExpression
    | additiveExpression '|' multiplicativeExpression
    ;

comparisonExpression
    : additiveExpression
    | comparisonExpression '<' additiveExpression
    | comparisonExpression '<=' additiveExpression
    | comparisonExpression '==' additiveExpression
    | comparisonExpression '>=' additiveExpression
    | comparisonExpression '>' additiveExpression
    | comparisonExpression '!=' additiveExpression
    ;

assighmentExpression
    : comparisonExpression
    | comparisonExpression '=' assighmentExpression
    ;

expression
    : assighmentExpression
    ;

TypeName
    : 'int'
    | 'float'
    | 'complex'
    | 'string'
    ;

PrintLn: 'fmt.Println' ;

OpenParen: '(';
CloseParen: ')';

Minus : '-';

ComplexLitteral: ((IntegerLiteral | FloatLitteral) '+')? (IntegerLiteral | FloatLitteral) 'i';

IntegerLiteral: Minus? Digit+;

StringLiteral: '"' (~["])*  '"';

Point: '.';

FloatLitteral: Minus? Digit+ ('.' Digit+);

Plus: '+';

Multiply : '*';

Modulo : '%';

Bitwiseand : '&';

Palochka: '|' ;

LessThan: '<';
LessOrEqual: '<=';
Equals: '==';
GreaterOrEqual:'>=';
GreaterThan:'>';
NotEquals:'!=';

Id: Letter (Letter | Digit) *;

Letter:[A-Za-z_];

Digit: [0-9];

VosklichatelniyZnak : '!';

Prisvaivanie: '=';

Kovicka: '"';

Import: 'import';

I: 'i';

Whitespace: [' '\t]+ -> skip;

NewLine: ('\n' | '\r' | '\r\n')+ -> skip;