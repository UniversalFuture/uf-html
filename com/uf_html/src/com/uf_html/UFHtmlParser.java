// Generated from C:/Users/tobe/Source/Repos/uf-html/com/uf_html/src/com/uf_html\UFHtml.g4 by ANTLR 4.5
package com.uf_html;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UFHtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS_NAME=1, COMMA=2, DOT=3, EQUALS=4, EXCLAMATION_POINT=5, ID=6, LBRACKET=7, 
		LCURLY=8, LPAREN=9, NUMBER=10, POUND=11, QUOTE=12, RANGLE=13, RBRACKET=14, 
		RCURLY=15, RPAREN=16, SEMI=17, STRING_LITERAL=18, TAG_NAME=19, WS=20;
	public static final int
		RULE_document = 0, RULE_directive = 1, RULE_directive_single = 2, RULE_directive_double = 3, 
		RULE_element = 4, RULE_attr_set = 5, RULE_attrs = 6, RULE_elementType = 7, 
		RULE_emptyElement = 8, RULE_fullElement = 9, RULE_inner_Text = 10, RULE_tag_name = 11;
	public static final String[] ruleNames = {
		"document", "directive", "directive_single", "directive_double", "element", 
		"attr_set", "attrs", "elementType", "emptyElement", "fullElement", "inner_Text", 
		"tag_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "'.'", "'='", "'!'", null, "'['", "'{'", "'('", null, 
		"'#'", "'\"'", "'>'", "']'", "'}'", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS_NAME", "COMMA", "DOT", "EQUALS", "EXCLAMATION_POINT", "ID", 
		"LBRACKET", "LCURLY", "LPAREN", "NUMBER", "POUND", "QUOTE", "RANGLE", 
		"RBRACKET", "RCURLY", "RPAREN", "SEMI", "STRING_LITERAL", "TAG_NAME", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UFHtml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UFHtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(UFHtmlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(UFHtmlParser.SEMI, i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24); 
					directive();
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(25); 
						match(SEMI);
						}
						}
						setState(30);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); 
				element();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(37); 
					match(SEMI);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS_NAME) | (1L << EXCLAMATION_POINT) | (1L << ID) | (1L << TAG_NAME))) != 0) );
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

	public static class DirectiveContext extends ParserRuleContext {
		public Directive_singleContext directive_single() {
			return getRuleContext(Directive_singleContext.class,0);
		}
		public Directive_doubleContext directive_double() {
			return getRuleContext(Directive_doubleContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); 
				directive_single();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); 
				directive_double();
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

	public static class Directive_singleContext extends ParserRuleContext {
		public Token key;
		public TerminalNode EXCLAMATION_POINT() { return getToken(UFHtmlParser.EXCLAMATION_POINT, 0); }
		public TerminalNode TAG_NAME() { return getToken(UFHtmlParser.TAG_NAME, 0); }
		public Directive_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterDirective_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitDirective_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitDirective_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_singleContext directive_single() throws RecognitionException {
		Directive_singleContext _localctx = new Directive_singleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			match(EXCLAMATION_POINT);
			setState(52); 
			((Directive_singleContext)_localctx).key = match(TAG_NAME);
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

	public static class Directive_doubleContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public TerminalNode EXCLAMATION_POINT() { return getToken(UFHtmlParser.EXCLAMATION_POINT, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(UFHtmlParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(UFHtmlParser.TAG_NAME, i);
		}
		public Directive_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterDirective_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitDirective_double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitDirective_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_doubleContext directive_double() throws RecognitionException {
		Directive_doubleContext _localctx = new Directive_doubleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_directive_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			match(EXCLAMATION_POINT);
			setState(55); 
			((Directive_doubleContext)_localctx).key = match(TAG_NAME);
			setState(56); 
			((Directive_doubleContext)_localctx).value = match(TAG_NAME);
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

	public static class ElementContext extends ParserRuleContext {
		public java.util.HashMap<String, String> attributes =  new java.util.HashMap<String, String>();
		public Token exclamation;
		public EmptyElementContext emptyElement() {
			return getRuleContext(EmptyElementContext.class,0);
		}
		public FullElementContext fullElement() {
			return getRuleContext(FullElementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(UFHtmlParser.SEMI, 0); }
		public TerminalNode EXCLAMATION_POINT() { return getToken(UFHtmlParser.EXCLAMATION_POINT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if (_la==EXCLAMATION_POINT) {
				{
				setState(58); 
				((ElementContext)_localctx).exclamation = match(EXCLAMATION_POINT);
				}
			}

			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(61); 
				emptyElement();
				}
				break;
			case 2:
				{
				setState(62); 
				fullElement();
				}
				break;
			}
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(65); 
				match(SEMI);
				}
				break;
			}
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

	public static class Attr_setContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public TerminalNode EQUALS() { return getToken(UFHtmlParser.EQUALS, 0); }
		public TerminalNode TAG_NAME() { return getToken(UFHtmlParser.TAG_NAME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UFHtmlParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(UFHtmlParser.NUMBER, 0); }
		public Attr_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterAttr_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitAttr_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitAttr_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_setContext attr_set() throws RecognitionException {
		Attr_setContext _localctx = new Attr_setContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(68); 
				((Attr_setContext)_localctx).key = match(TAG_NAME);
				}
				break;
			case 2:
				{
				{
				setState(69); 
				((Attr_setContext)_localctx).key = match(TAG_NAME);
				}
				setState(70); 
				match(EQUALS);
				setState(71);
				((Attr_setContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRING_LITERAL) ) {
					((Attr_setContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}

			            if (((Attr_setContext)_localctx).value != null) {
			                ((ElementContext)getInvokingContext(4)).attributes.put((((Attr_setContext)_localctx).key!=null?((Attr_setContext)_localctx).key.getText():null), (((Attr_setContext)_localctx).value!=null?((Attr_setContext)_localctx).value.getText():null));
			            }
			            else {
			                ((ElementContext)getInvokingContext(4)).attributes.put((((Attr_setContext)_localctx).key!=null?((Attr_setContext)_localctx).key.getText():null), (((Attr_setContext)_localctx).key!=null?((Attr_setContext)_localctx).key.getText():null));
			            }
			        
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

	public static class AttrsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(UFHtmlParser.LBRACKET, 0); }
		public List<Attr_setContext> attr_set() {
			return getRuleContexts(Attr_setContext.class);
		}
		public Attr_setContext attr_set(int i) {
			return getRuleContext(Attr_setContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(UFHtmlParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UFHtmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UFHtmlParser.COMMA, i);
		}
		public AttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			match(LBRACKET);
			setState(77); 
			attr_set();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78); 
				match(COMMA);
				setState(79); 
				attr_set();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); 
			match(RBRACKET);
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

	public static class ElementTypeContext extends ParserRuleContext {
		public Token tagName;
		public Token className;
		public Token id;
		public TerminalNode TAG_NAME() { return getToken(UFHtmlParser.TAG_NAME, 0); }
		public TerminalNode ID() { return getToken(UFHtmlParser.ID, 0); }
		public List<TerminalNode> CLASS_NAME() { return getTokens(UFHtmlParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(UFHtmlParser.CLASS_NAME, i);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitElementType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(87); 
				((ElementTypeContext)_localctx).tagName = match(TAG_NAME);
				}
				break;
			case 2:
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==TAG_NAME) {
					{
					setState(88); 
					((ElementTypeContext)_localctx).tagName = match(TAG_NAME);
					}
				}

				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91); 
					((ElementTypeContext)_localctx).className = match(CLASS_NAME);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLASS_NAME );
				}
				break;
			case 3:
				{
				setState(97);
				_la = _input.LA(1);
				if (_la==TAG_NAME) {
					{
					setState(96); 
					((ElementTypeContext)_localctx).tagName = match(TAG_NAME);
					}
				}

				setState(99); 
				((ElementTypeContext)_localctx).id = match(ID);
				}
				break;
			case 4:
				{
				setState(118);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(101);
					_la = _input.LA(1);
					if (_la==TAG_NAME) {
						{
						setState(100); 
						((ElementTypeContext)_localctx).tagName = match(TAG_NAME);
						}
					}

					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(103); 
						((ElementTypeContext)_localctx).className = match(CLASS_NAME);
						}
						}
						setState(106); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CLASS_NAME );
					setState(108); 
					((ElementTypeContext)_localctx).id = match(ID);
					}
					break;
				case 2:
					{
					setState(110);
					_la = _input.LA(1);
					if (_la==TAG_NAME) {
						{
						setState(109); 
						((ElementTypeContext)_localctx).tagName = match(TAG_NAME);
						}
					}

					setState(112); 
					((ElementTypeContext)_localctx).id = match(ID);
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(113); 
						((ElementTypeContext)_localctx).className = match(CLASS_NAME);
						}
						}
						setState(116); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CLASS_NAME );
					}
					break;
				}
				}
				break;
			}

			        if (((ElementTypeContext)_localctx).id != null) {
			            ((ElementContext)getInvokingContext(4)).attributes.put("id", (((ElementTypeContext)_localctx).id!=null?((ElementTypeContext)_localctx).id.getText():null).replaceAll("#", ""));
			        }
			        if (((ElementTypeContext)_localctx).className != null) {
			            ((ElementContext)getInvokingContext(4)).attributes.put("class", (((ElementTypeContext)_localctx).className!=null?((ElementTypeContext)_localctx).className.getText():null).replaceAll("\\.", ""));
			        }
			    
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

	public static class EmptyElementContext extends ParserRuleContext {
		public AttrsContext attributes;
		public Inner_TextContext innerText;
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(UFHtmlParser.SEMI, 0); }
		public TerminalNode LCURLY() { return getToken(UFHtmlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(UFHtmlParser.RCURLY, 0); }
		public TerminalNode RANGLE() { return getToken(UFHtmlParser.RANGLE, 0); }
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public Inner_TextContext inner_Text() {
			return getRuleContext(Inner_TextContext.class,0);
		}
		public EmptyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterEmptyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitEmptyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitEmptyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyElementContext emptyElement() throws RecognitionException {
		EmptyElementContext _localctx = new EmptyElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_emptyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(124); 
				elementType();
				setState(126);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(125); 
					((EmptyElementContext)_localctx).attributes = attrs();
					}
				}

				setState(130);
				_la = _input.LA(1);
				if (_la==RANGLE) {
					{
					setState(128); 
					match(RANGLE);
					setState(129); 
					((EmptyElementContext)_localctx).innerText = inner_Text();
					}
				}

				setState(132); 
				match(SEMI);
				}
				break;
			case 2:
				{
				setState(134); 
				elementType();
				setState(136);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(135); 
					((EmptyElementContext)_localctx).attributes = attrs();
					}
				}

				setState(138); 
				match(LCURLY);
				setState(139); 
				match(RCURLY);
				setState(143);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL) {
					{
					{
					setState(140); 
					((EmptyElementContext)_localctx).innerText = inner_Text();
					}
					setState(141); 
					match(SEMI);
					}
				}

				}
				break;
			}
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

	public static class FullElementContext extends ParserRuleContext {
		public AttrsContext attributes;
		public ElementContext children;
		public Inner_TextContext innerText;
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(UFHtmlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(UFHtmlParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(UFHtmlParser.SEMI, 0); }
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Inner_TextContext inner_Text() {
			return getRuleContext(Inner_TextContext.class,0);
		}
		public FullElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterFullElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitFullElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitFullElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullElementContext fullElement() throws RecognitionException {
		FullElementContext _localctx = new FullElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fullElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			elementType();
			setState(149);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(148); 
				((FullElementContext)_localctx).attributes = attrs();
				}
			}

			setState(151); 
			match(LCURLY);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152); 
				((FullElementContext)_localctx).children = element();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS_NAME) | (1L << EXCLAMATION_POINT) | (1L << ID) | (1L << TAG_NAME))) != 0) );
			setState(157); 
			match(RCURLY);
			setState(161);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				{
				setState(158); 
				((FullElementContext)_localctx).innerText = inner_Text();
				}
				setState(159); 
				match(SEMI);
				}
			}

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

	public static class Inner_TextContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(UFHtmlParser.STRING_LITERAL, 0); }
		public Inner_TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_Text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterInner_Text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitInner_Text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitInner_Text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_TextContext inner_Text() throws RecognitionException {
		Inner_TextContext _localctx = new Inner_TextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inner_Text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			match(STRING_LITERAL);
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

	public static class Tag_nameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(UFHtmlParser.TAG_NAME, 0); }
		public Tag_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).enterTag_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFHtmlListener ) ((UFHtmlListener)listener).exitTag_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UFHtmlVisitor ) return ((UFHtmlVisitor<? extends T>)visitor).visitTag_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_nameContext tag_name() throws RecognitionException {
		Tag_nameContext _localctx = new Tag_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); 
			match(TAG_NAME);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\6\2.\n\2\r\2\16\2/\3\3\3\3"+
		"\5\3\64\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\5\6>\n\6\3\6\3\6\5\6B\n\6"+
		"\3\6\5\6E\n\6\3\7\3\7\3\7\3\7\5\7K\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bS\n"+
		"\b\f\b\16\bV\13\b\3\b\3\b\3\t\3\t\5\t\\\n\t\3\t\6\t_\n\t\r\t\16\t`\3\t"+
		"\5\td\n\t\3\t\3\t\5\th\n\t\3\t\6\tk\n\t\r\t\16\tl\3\t\3\t\5\tq\n\t\3\t"+
		"\3\t\6\tu\n\t\r\t\16\tv\5\ty\n\t\5\t{\n\t\3\t\3\t\3\n\3\n\5\n\u0081\n"+
		"\n\3\n\3\n\5\n\u0085\n\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0092\n\n\5\n\u0094\n\n\3\13\3\13\5\13\u0098\n\13\3\13\3\13\6"+
		"\13\u009c\n\13\r\13\16\13\u009d\3\13\3\13\3\13\3\13\5\13\u00a4\n\13\3"+
		"\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\f\f\24"+
		"\24\u00ba\2#\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\f"+
		"J\3\2\2\2\16N\3\2\2\2\20z\3\2\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2\2\26"+
		"\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\36\5\4\3\2\33\35\7\23\2\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2"+
		"!\32\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$-\3\2\2\2%#\3\2\2\2&*\5\n"+
		"\6\2\')\7\23\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*"+
		"\3\2\2\2-&\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\64"+
		"\5\6\4\2\62\64\5\b\5\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66"+
		"\7\7\2\2\66\67\7\25\2\2\67\7\3\2\2\289\7\7\2\29:\7\25\2\2:;\7\25\2\2;"+
		"\t\3\2\2\2<>\7\7\2\2=<\3\2\2\2=>\3\2\2\2>A\3\2\2\2?B\5\22\n\2@B\5\24\13"+
		"\2A?\3\2\2\2A@\3\2\2\2BD\3\2\2\2CE\7\23\2\2DC\3\2\2\2DE\3\2\2\2E\13\3"+
		"\2\2\2FK\7\25\2\2GH\7\25\2\2HI\7\6\2\2IK\t\2\2\2JF\3\2\2\2JG\3\2\2\2K"+
		"L\3\2\2\2LM\b\7\1\2M\r\3\2\2\2NO\7\t\2\2OT\5\f\7\2PQ\7\4\2\2QS\5\f\7\2"+
		"RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\20\2"+
		"\2X\17\3\2\2\2Y{\7\25\2\2Z\\\7\25\2\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"]_\7\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a{\3\2\2\2bd\7\25\2"+
		"\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2e{\7\b\2\2fh\7\25\2\2gf\3\2\2\2gh\3\2"+
		"\2\2hj\3\2\2\2ik\7\3\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2"+
		"\2\2ny\7\b\2\2oq\7\25\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7\b\2\2su\7"+
		"\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xg\3\2\2\2xp\3"+
		"\2\2\2y{\3\2\2\2zY\3\2\2\2z[\3\2\2\2zc\3\2\2\2zx\3\2\2\2{|\3\2\2\2|}\b"+
		"\t\1\2}\21\3\2\2\2~\u0080\5\20\t\2\177\u0081\5\16\b\2\u0080\177\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\7\17\2\2\u0083"+
		"\u0085\5\26\f\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7\23\2\2\u0087\u0094\3\2\2\2\u0088\u008a\5\20\t\2\u0089"+
		"\u008b\5\16\b\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\7\n\2\2\u008d\u0091\7\21\2\2\u008e\u008f\5\26\f\2\u008f"+
		"\u0090\7\23\2\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0094\3\2\2\2\u0093~\3\2\2\2\u0093\u0088\3\2\2\2\u0094\23"+
		"\3\2\2\2\u0095\u0097\5\20\t\2\u0096\u0098\5\16\b\2\u0097\u0096\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\7\n\2\2\u009a\u009c"+
		"\5\n\6\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\7\21\2\2\u00a0\u00a1\5"+
		"\26\f\2\u00a1\u00a2\7\23\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\24\2\2\u00a6\27\3\2\2\2"+
		"\u00a7\u00a8\7\25\2\2\u00a8\31\3\2\2\2\35\36#*/\63=ADJT[`cglpvxz\u0080"+
		"\u0084\u008a\u0091\u0093\u0097\u009d\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}