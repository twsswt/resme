package responsibilityMetaModel.tests;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.UnbufferedTokenStream;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import responsibilityMetaModel.Entity;
import responsibilityMetaModel.impl.satisfactionLexer;
import responsibilityMetaModel.impl.satisfactionParser;

public class ParserTest extends TestCase {
	
	private satisfactionParser fixture;

	private Entity stubbedEntity;
	
	public void setUp (){
		
		CharStream stream = new ANTLRInputStream("Resource");
		satisfactionLexer lexer = new satisfactionLexer(stream);
		
		List<Entity> context = new ArrayList<Entity>();
		
		InvocationHandler handler = new InvocationHandler(){

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if (method.getName().equals("getName"))
					return "Resource";
				else if (method.getName().equals("satisfied")){
					return true;
				}
				return null;
			}
			
		};
		
		stubbedEntity = (Entity)Proxy.newProxyInstance(
			getClass().getClassLoader(),
			new Class[]{Entity.class},
			handler);
		
		context.add(stubbedEntity);
		
		UnbufferedTokenStream<Token> t = new UnbufferedTokenStream<>(lexer);
		fixture = new satisfactionParser(t, context);
	}

	public static void main(String[] args) {
		TestRunner.run(ParserTest.class);
	}
	
	public void testEvaluateResource () throws Exception {	

		Boolean result = fixture.eval().value;
		
		assertTrue("Wasn't true.", result);
		
	}

}
