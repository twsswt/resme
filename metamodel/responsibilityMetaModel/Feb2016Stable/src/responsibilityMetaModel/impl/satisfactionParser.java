package responsibilityMetaModel.impl;
// Generated from satisfaction.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import responsibilityMetaModel.Entity;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class satisfactionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, Id=4, LeftParam=5, RightParam=6, Space=7;
	public static final String[] tokenNames = {
		"<INVALID>", "'and'", "'or'", "'?'", "Id", "'('", "')'", "Space"
	};
	public static final int
		RULE_eval = 0, RULE_expression = 1, RULE_andExpression = 2, RULE_orExpression = 3, 
		RULE_statement = 4;
	public static final String[] ruleNames = {
		"eval", "expression", "andExpression", "orExpression", "statement"
	};
	private List<Entity> context;

	@Override
	public String getGrammarFileName() { return "satisfaction.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public satisfactionParser(TokenStream input, List<Entity> c) {
		super(input);
		context = c;
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public boolean value;
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); ((EvalContext)_localctx).exp = expression();
			((EvalContext)_localctx).value = ((EvalContext)_localctx).exp.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public boolean value;
		public StatementContext s;
		public AndExpressionContext a;
		public OrExpressionContext o;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13); ((ExpressionContext)_localctx).s = statement();
				((ExpressionContext)_localctx).value = ((ExpressionContext)_localctx).s.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16); ((ExpressionContext)_localctx).a = andExpression();
				((ExpressionContext)_localctx).value = ((ExpressionContext)_localctx).a.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(19); ((ExpressionContext)_localctx).o = orExpression();
				((ExpressionContext)_localctx).value = ((ExpressionContext)_localctx).o.value;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public boolean value;
		public StatementContext s;
		public ExpressionContext e;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Space(int i) {
			return getToken(satisfactionParser.Space, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(satisfactionParser.Space); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24); ((AndExpressionContext)_localctx).s = statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Id) | (1L << LeftParam))) != 0) );
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29); match(Space);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Space );
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); match(T__2);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39); match(Space);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Space );
			setState(44); ((AndExpressionContext)_localctx).e = expression();
			((AndExpressionContext)_localctx).value =  ((AndExpressionContext)_localctx).s.value && ((AndExpressionContext)_localctx).e.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public boolean value;
		public StatementContext s;
		public ExpressionContext e;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Space(int i) {
			return getToken(satisfactionParser.Space, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(satisfactionParser.Space); }
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).exitOrExpression(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); ((OrExpressionContext)_localctx).s = statement();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Id) | (1L << LeftParam))) != 0) );
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); match(Space);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Space );
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57); match(T__1);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62); match(Space);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Space );
			setState(67); ((OrExpressionContext)_localctx).e = expression();
			((OrExpressionContext)_localctx).value =  ((OrExpressionContext)_localctx).s.value || ((OrExpressionContext)_localctx).e.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public boolean value;
		public Token i;
		public ExpressionContext exp;
		public TerminalNode RightParam() { return getToken(satisfactionParser.RightParam, 0); }
		public TerminalNode Id() { return getToken(satisfactionParser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParam() { return getToken(satisfactionParser.LeftParam, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof satisfactionListener ) ((satisfactionListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(T__0);
				((StatementContext)_localctx).value =   true;
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); ((StatementContext)_localctx).i = match(Id);
				((StatementContext)_localctx).value =  lookup((((StatementContext)_localctx).i!=null?((StatementContext)_localctx).i.getText():null));
				}
				break;
			case LeftParam:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(LeftParam);
				setState(75); ((StatementContext)_localctx).exp = expression();
				setState(76); match(RightParam);
				((StatementContext)_localctx).value = ((StatementContext)_localctx).exp.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tT\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\4\6\4\34\n\4\r\4\16\4\35\3\4\6\4!\n\4\r\4\16\4\"\3\4"+
		"\6\4&\n\4\r\4\16\4\'\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\4\3\5\6\5\63\n\5"+
		"\r\5\16\5\64\3\5\6\58\n\5\r\5\16\59\3\5\6\5=\n\5\r\5\16\5>\3\5\6\5B\n"+
		"\5\r\5\16\5C\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6"+
		"\3\6\2\2\7\2\4\6\b\n\2\2Z\2\f\3\2\2\2\4\30\3\2\2\2\6\33\3\2\2\2\b\62\3"+
		"\2\2\2\nQ\3\2\2\2\f\r\5\4\3\2\r\16\b\2\1\2\16\3\3\2\2\2\17\20\5\n\6\2"+
		"\20\21\b\3\1\2\21\31\3\2\2\2\22\23\5\6\4\2\23\24\b\3\1\2\24\31\3\2\2\2"+
		"\25\26\5\b\5\2\26\27\b\3\1\2\27\31\3\2\2\2\30\17\3\2\2\2\30\22\3\2\2\2"+
		"\30\25\3\2\2\2\31\5\3\2\2\2\32\34\5\n\6\2\33\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37!\7\t\2\2 \37\3\2\2\2!\"\3"+
		"\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\7\3\2\2%$\3\2\2\2&\'\3\2\2\2"+
		"\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)+\7\t\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-.\3\2\2\2./\5\4\3\2/\60\b\4\1\2\60\7\3\2\2\2\61\63\5\n\6"+
		"\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2"+
		"\2\668\7\t\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2"+
		";=\7\4\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@B\7\t\2\2"+
		"A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\4\3\2FG\b\5\1\2"+
		"G\t\3\2\2\2HI\7\5\2\2IR\b\6\1\2JK\7\6\2\2KR\b\6\1\2LM\7\7\2\2MN\5\4\3"+
		"\2NO\7\b\2\2OP\b\6\1\2PR\3\2\2\2QH\3\2\2\2QJ\3\2\2\2QL\3\2\2\2R\13\3\2"+
		"\2\2\f\30\35\"\',\649>CQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}