/*
* generated by Xtext
*/
package ru.spbau.luchikhin.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GraphGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cNodeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNodeNodeParserRuleCall_0 = (RuleCall)cNodeAssignment.eContents().get(0);
		
		//Model:
		//	node+=Node*;
		public ParserRule getRule() { return rule; }

		//node+=Node*
		public Assignment getNodeAssignment() { return cNodeAssignment; }

		//Node
		public RuleCall getNodeNodeParserRuleCall_0() { return cNodeNodeParserRuleCall_0; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNodeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cConnectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cConnectionsAlternatives_2_0 = (Alternatives)cConnectionsAssignment_2.eContents().get(0);
		private final RuleCall cConnectionsConnectionParserRuleCall_2_0_0 = (RuleCall)cConnectionsAlternatives_2_0.eContents().get(0);
		private final RuleCall cConnectionsNoConnectionParserRuleCall_2_0_1 = (RuleCall)cConnectionsAlternatives_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Node:
		//	"node" name=ID connections=(Connection | NoConnection) ";";
		public ParserRule getRule() { return rule; }

		//"node" name=ID connections=(Connection | NoConnection) ";"
		public Group getGroup() { return cGroup; }

		//"node"
		public Keyword getNodeKeyword_0() { return cNodeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//connections=(Connection | NoConnection)
		public Assignment getConnectionsAssignment_2() { return cConnectionsAssignment_2; }

		//Connection | NoConnection
		public Alternatives getConnectionsAlternatives_2_0() { return cConnectionsAlternatives_2_0; }

		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_2_0_0() { return cConnectionsConnectionParserRuleCall_2_0_0; }

		//NoConnection
		public RuleCall getConnectionsNoConnectionParserRuleCall_2_0_1() { return cConnectionsNoConnectionParserRuleCall_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIsConnectedWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConnectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cConnectionNodeCrossReference_1_0 = (CrossReference)cConnectionAssignment_1.eContents().get(0);
		private final RuleCall cConnectionNodeIDTerminalRuleCall_1_0_1 = (RuleCall)cConnectionNodeCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaSpaceKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cConnectionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cConnectionNodeCrossReference_2_1_0 = (CrossReference)cConnectionAssignment_2_1.eContents().get(0);
		private final RuleCall cConnectionNodeIDTerminalRuleCall_2_1_0_1 = (RuleCall)cConnectionNodeCrossReference_2_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Connection:
		//	"is connected with [" connection+=[Node] (", " connection+=[Node])* "]";
		public ParserRule getRule() { return rule; }

		//"is connected with [" connection+=[Node] (", " connection+=[Node])* "]"
		public Group getGroup() { return cGroup; }

		//"is connected with ["
		public Keyword getIsConnectedWithKeyword_0() { return cIsConnectedWithKeyword_0; }

		//connection+=[Node]
		public Assignment getConnectionAssignment_1() { return cConnectionAssignment_1; }

		//[Node]
		public CrossReference getConnectionNodeCrossReference_1_0() { return cConnectionNodeCrossReference_1_0; }

		//ID
		public RuleCall getConnectionNodeIDTerminalRuleCall_1_0_1() { return cConnectionNodeIDTerminalRuleCall_1_0_1; }

		//(", " connection+=[Node])*
		public Group getGroup_2() { return cGroup_2; }

		//", "
		public Keyword getCommaSpaceKeyword_2_0() { return cCommaSpaceKeyword_2_0; }

		//connection+=[Node]
		public Assignment getConnectionAssignment_2_1() { return cConnectionAssignment_2_1; }

		//[Node]
		public CrossReference getConnectionNodeCrossReference_2_1_0() { return cConnectionNodeCrossReference_2_1_0; }

		//ID
		public RuleCall getConnectionNodeIDTerminalRuleCall_2_1_0_1() { return cConnectionNodeIDTerminalRuleCall_2_1_0_1; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class NoConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NoConnection");
		private final Assignment cConnectionAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cConnectionIsolatedKeyword_0 = (Keyword)cConnectionAssignment.eContents().get(0);
		
		//NoConnection:
		//	connection="isolated";
		public ParserRule getRule() { return rule; }

		//connection="isolated"
		public Assignment getConnectionAssignment() { return cConnectionAssignment; }

		//"isolated"
		public Keyword getConnectionIsolatedKeyword_0() { return cConnectionIsolatedKeyword_0; }
	}
	
	
	private final ModelElements pModel;
	private final NodeElements pNode;
	private final ConnectionElements pConnection;
	private final NoConnectionElements pNoConnection;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GraphGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pNode = new NodeElements();
		this.pConnection = new ConnectionElements();
		this.pNoConnection = new NoConnectionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ru.spbau.luchikhin.Graph".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	node+=Node*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Node:
	//	"node" name=ID connections=(Connection | NoConnection) ";";
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//Connection:
	//	"is connected with [" connection+=[Node] (", " connection+=[Node])* "]";
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}

	//NoConnection:
	//	connection="isolated";
	public NoConnectionElements getNoConnectionAccess() {
		return pNoConnection;
	}
	
	public ParserRule getNoConnectionRule() {
		return getNoConnectionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}