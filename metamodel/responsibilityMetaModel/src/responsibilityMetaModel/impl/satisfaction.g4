

grammar satisfaction;

@lexer::header{

package responsibilityMetaModel.impl;

}

@parser::header{

package responsibilityMetaModel.impl;

import responsibilityMetaModel.Entity;
	
}

@parser::members {

	private List<Entity> context;
		
	public satisfactionParser(TokenStream input, List<Entity> c) {
		super(input);
		context = c;
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
		
	private boolean lookup(String string) {
	
		//Search
		for (Entity e : context){
			if (e.getName().equals(string)){
				return e.satisfied(); //return status
			}
		}
		return false; //if no match, return false
	}
}

eval returns [boolean value]
	:	exp=expression {$value=$exp.value;};

expression returns [boolean value]:
	s = statement {$value=$s.value;}
	|a = andExpression {$value=$a.value;}
	| o = orExpression {$value=$o.value;}
;
andExpression returns [boolean value]:
	s = statement + Space + 'and' + Space + e = expression {$value = $s.value && $e.value;}
;

orExpression returns [boolean value]:
	s = statement + Space + 'or' + Space + e = expression {$value = $s.value || $e.value;}
;

statement returns [boolean value]:
	'?' {$value =  true;}
	| i = Id {$value = lookup($i.text);}
	| LeftParam exp= expression RightParam {$value=$exp.value;}
	; 
	
Id:
	[a-zA-Z]+;
	
LeftParam: '(';
RightParam: ')';

Space: ' '+; 

