package responsibilityMetaModel.impl;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.UnbufferedTokenStream;

import responsibilityMetaModel.Entity;

public class parserTest {
	
	public static void main (String[] args){
	
	//boilerplate

	CharStream stream = new ANTLRInputStream("Resource");
	satisfactionLexer lexer = new satisfactionLexer(stream);
	//System.out.println(lexer.getAllTokens());
	UnbufferedTokenStream<Token> t = new UnbufferedTokenStream<>(lexer);
	List<Entity> newList = new ArrayList<Entity>();
	satisfactionParser parser = new satisfactionParser(t);
	        
	try
	{

	    System.out.println(parser.eval().value);
	}
	catch (RecognitionException e)
	{
	    System.err.println(e.toString());
	}
	
	}

}
