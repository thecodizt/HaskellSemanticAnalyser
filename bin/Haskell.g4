grammar Haskell;

@header {
    import ast.*;
}

start
	returns[ASTNode node]:
	t1 = declaration {$node = $t1.node; $node.print();};

declaration
	returns[ASTNode node]:
	a=gendeclaration SEMICOLON {$node = new DeclarationStm($a.node);}
	| b=funlhs c=rhs {$node = new FunctionDeclarationStm($b.node, $c.node);}
	| d=pat e=rhs {$node = new PatternDeclarationStm($d.node, $e.node);};

gendeclaration
	returns[ASTNode node]:
	ID DOUBLE_COLON a=types {$node = new GeneralDeclaration($ID.text, $a.node);};

pat
	returns[ASTNode node]:
	ID {$node = new IdPat($ID.text);}
	| UID {$node = new UIdPat($UID.text);}
	| literal {$node = $literal.node;};

pats
	returns[ASTNode node]:
	pat pats {$node = new PatsList($pat.node, $pats.node);}
	| pat {$node = new SinglePat($pat.node);};

funlhs
	returns[ASTNode node]:
	ID pats {$node = new FunLhsClass($ID.text, $pats.node);}
	| ID LPAREN pats RPAREN {$node = new ParenFunLhs($ID.text, $pats.node);};

rhs
	returns[ASTNode node]:
	ASSIGN a=expression {$node = new AssignRhs($a.node);}
	| ASSIGN b=list_comprehensions {$node = new ListComprehensionRhs($b.node);}
	| ASSIGN c=function_application {$node = new FunctionApplicationRhs($c.node);}
	| RARROW d=expression {$node = new ArrowRhs($d.node);}
	| e=gdrhs {$node = new GdrhsRhs($e.node);};

expression
	returns[ASTNode node]:
	if_statement {$node = new IfExpression($if_statement.node);}
	| case_statement {$node = new CaseExpression($case_statement.node);}
	| let_statement {$node = new LetExpression($let_statement.node);}
	| do_block {$node = new DoBlockExpression($do_block.node);}
	| ID {$node = new IdExpression($ID.text);}
	| literal {$node = $literal.node;}
	| function_application {$node = new FunctionApplicationExpression($function_application.node);}
	| list_comprehensions {$node = new ListComprehensionExpression($list_comprehensions.node);}
	| x=expression y=op z=expression {$node = new OpExpression($x.node, $y.value, $z.node);}
	| MINUS zz=expression {$node = new MinusExpression($zz.node);};

if_statement
	returns[ASTNode node]:
	IF a=expression THEN b=expression ELSE c=expression {$node = new IfStatement($a.node, $b.node, $c.node);};

case_statement
	returns[ASTNode node]:
	CASE expression OF case_alternatives {$node = new CaseStatement($expression.node, $case_alternatives.node);};

case_alternatives
	returns[ASTNode node]:
	case_alternative case_alternatives {$node = new CaseAlternativesList($case_alternative.node, $case_alternatives.node);}
	| case_alternative {$node = new SingleCaseAlternative($case_alternative.node);};

case_alternative
	returns[ASTNode node]:
	pat ARROW expression {$node = new CaseAlternative($pat.node, $expression.node);};

do_block
	returns[ASTNode node]:
	DO stmts {$node = new DoBlock($stmts.node);};

stmts
	returns[ASTNode node]:
	stmt stmts {$node = new StmtsList($stmt.node, $stmts.node);}
	| stmt {$node = new SingleStmt($stmt.node);};

stmt
	returns[ASTNode node]:
	a=expression {$node = new ExpressionStmt($a.node);}
	| b=pat ARROW c=expression {$node = new PatArrowExpressionStmt($b.node, $c.node);}
	| d=pat ASSIGN e=expression {$node = new PatAssignExpressionStmt($d.node, $e.node);}
	| f=pat ASSIGN g=expression DOUBLE_COLON h=types {$node = new PatAssignTypedExpressionStmt($f.node, $g.node, $h.node);};
//	| LET i=declarations {$node = new LetStmt($i.node);};

gdrhs
	returns[ASTNode node]:
	gd ASSIGN expression gdrhs {$node = new GdrhsList($gd.node, $expression.node, $gdrhs.node);}
	| {$node = new EmptyGdrhs();};

gd
	returns[ASTNode node]:
	VBAR exp1 {$node = new GdExpression($exp1.node);};

exp1
	returns[ASTNode node]:
	expression DOUBLE_COLON DOUBLEARROW type {$node = new Exp1TypedExpression($expression.node, $type.node);}
	| expression {$node = new Exp1Expression($expression.node);};

types
	returns[ASTNode node]:
	type ARROW types {$node = new TypesList($type.node, $types.node);}
	| type {$node = new SingleType($type.node);};

type
	returns[ASTNode node]:
	ARROW type {$node = new ArrowType($type.node);}
	| atype {$node = new AtypeType($atype.node);};

atype
	returns[ASTNode node]:
	UID {$node = new UidAtype($UID.text);}
	| ID {$node = new IdAtype($ID.text);}
	| UID LPAREN RPAREN {$node = new UidParenAtype($UID.text);}
	| LPAREN types RPAREN {$node = new ParenTypesAtype($types.node);}
	| LPAREN type_list RPAREN {$node = new ParenTypeListAtype($type_list.node);}
	| LBRACKET atype RBRACKET {$node = new BracketAtype($atype.node);};

let_statement
	returns[ASTNode node]:
	LET a=declarations IN b=expression {};
//	LET a=declarations IN b=expression {$node = new LetStatement($a.node, $b.node);};

function_application
	returns[ASTNode node]:
	ID args {$node = new IdFunctionApplication($ID.text, $args.node);}
	| ID LPAREN args RPAREN {$node = new IdParenFunctionApplication($ID.text, $args.node);};
//	| q = qvcon args {$node = new QvconFunctionApplication($q.node, $args.node);}
//	| r = qvcon {$node = new QvconFunctionApplicationWithoutArgs($r.node);};

args
	returns[ASTNode node]:
	expression COMMA args {$node = new ArgsList($expression.node, $args.node);}
	| expression {$node = new SingleArg($expression.node);}
	| f = function_application {$node = new FunctionApplicationArg($f.node);};

op
	returns[String value]:
	PLUS {$value="+";}
	| MINUS {$value="-";}
	| MULT {$value="*";}
	| DIV {$value="/";}
	| EQUALS {$value="==";}
	| NOT_EQUALS {$value="/=";}
	| LESS_THAN {$value="<";}
	| GREATER_THAN {$value=">";}
	| LESS_THAN_EQUAL {$value="<=";}
	| GREATER_THAN_EQUAL {$value=">=";}
	| AND {$value="&&";}
	| OR {$value="||";}
	| COLON {$value=":";}
	| CONCAT {$value="++";}
	| RARROW {$value="->";}
	| BACKTICK ID BACKTICK {$value=$BACKTICK.text + $ID.text + $BACKTICK.text;}
	| BACKTICK UID BACKTICK {$value=$BACKTICK.text + $UID.text + $BACKTICK.text;};

literal
	returns[ASTNode node]:
	INTEGER {$node = new IntegerLiteral(Integer.parseInt($INTEGER.text));}
	| FLOAT {$node = new FloatLiteral(Float.parseFloat($FLOAT.text));}
	| CHAR {$node = new CharLiteral($CHAR.text);}
	| STRING {$node = new StringLiteral($STRING.text);}
	| TRUE {$node = new BooleanLiteral(true);}
	| FALSE {$node = new BooleanLiteral(false);};

type_list
	returns[ASTNode node]:
	type COMMA type_list {$node = new TypeList($type.node, $type_list.node);}
	| type {$node = new SingleTypeList($type.node);};

list_comprehensions
	returns[ASTNode node]:
	LPAREN exps RPAREN {$node = new ParenExpsList($exps.node);}
	| LBRACKET exps RBRACKET {$node = new BracketExpsList($exps.node);}
	| LBRACKET expression RANGE RBRACKET {$node = new BracketRange($expression.node);}
	| LBRACKET RBRACKET {$node = new EmptyBracketList();};

gens
	returns[ASTNode node]:
	gen COMMA gens {$node = new GensList($gen.node, $gens.node);}
	| gen {$node = new SingleGen($gen.node);};

gen
	returns[ASTNode node]:
	a=pat ARROW b=expression {$node = new GenClass($a.node, $b.node);}
	| d=expression {$node = new GenExpression($d.node);};
//	| LET c = declarations {$node = new GenLet($c.node);}

exps
	returns[ASTNode node]:
	expression COMMA exps {$node = new ExpsList($expression.node, $exps.node);}
	| expression {$node = new SingleExp($expression.node);};

declarations: decl declarations | decl;

decl: gendecl | funlhs rhs | pat rhs;

gendecl: ID DOUBLE_COLON types;

qvcon: ID | UID;

//KEYWORDS:
AS: 'as';
CASE: 'case';
DEFAULT: 'default';
DO: 'do';
ELSE: 'else';
HIDING: 'hiding';
IF: 'if';
IMPORT: 'import';
IN: 'in';
INFIX: 'infix';
INFIXL: 'infixl';
INFIXR: 'infixr';
LET: 'let';
MODULE: 'module';
OF: 'of';
QUALIFIED: 'qualified';
THEN: 'then';
WHERE: 'where';
WILDCARD: '_';
FORALL: 'forall';
FOREIGN: 'foreign';
EXPORT: 'export';
SAFE: 'safe';
INTERRUPTIBLE: 'interruptible';
UNSAFE: 'unsafe';
MDO: 'mdo';
FAMILY: 'family';
ROLE: 'role';
STDCALL: 'stdcall';
CCALL: 'ccall';
CAPI: 'capi';
CPPCALL: 'cplusplus';
JSCALL: 'javascript';
REC: 'rec';
GROUP: 'group';
BY: 'by';
USING: 'using';
PATTERN: 'pattern';
STOCK: 'stock';
ANYCLASS: 'anyclass';
VIA: 'via';
TRUE: 'True';
FALSE: 'False';

//OBJECT RELATED KEYWORDS: (justification provided in text)
DATA: 'data';
TYPE: 'type';
CLASS: 'class';
INSTANCE: 'instance';
NEWTYPE: 'newtype';
DERIVING: 'deriving';

//OPERATORS:
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
EQUALS: '==';
NOT_EQUALS: '/=';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_THAN_EQUAL: '<=';
GREATER_THAN_EQUAL: '>=';
AND: '&&';
OR: '||';
NOT: 'not';
BITWISE_AND: '&';
VBAR: '|';
XOR: 'xor';
ASSIGN: '=';
DOT: '.';
COLON: ':';
CONCAT: '++';

//SYMBOLS:
DOLLAR: '$';
LBRACKET: '[';
RBRACKET: ']';
RANGE: '..';
BACKSLASH: '\\';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
BACKTICK: '`';
SEMICOLON: ';';
LFLOWER: '{';
RFLOWER: '}';
DOUBLEARROW: '=>';
RARROW: '<-';

// Type Annotations and Bindings
DOUBLE_COLON: '::';
BIND_RIGHT: '>>=';
BANG: '!';

// Other Operators
HASH: '#';
QUESTION: '?';
AT: '@';
CARET: '^';
TILDE: '~';
DEFINE: ':=';

// White Characters:
WS: [ \t]+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
TAB: [\t]+;

//COMMENTS:
COMMENT: '--' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '{-' .*? '-}' -> skip;

//IDENTIFIERS:
UID: [A-Z][a-zA-Z0-9]*;
ID: [a-zA-Z][a-zA-Z0-9_]*;

//CONSTANTS
INTEGER: [0-9]+;
FLOAT: ([0-9]+ '.' [0-9]* | '.' [0-9]+ | [0-9]+) (
		[eE] [+\-]? [0-9]+
	)?;
CHAR: '\'' ~'\'' '\'';
STRING: '"' ( '\\' . | ~('\n' | '\r' | '"'))* '"';

//OTHER TOKENS:
ARROW: '->';