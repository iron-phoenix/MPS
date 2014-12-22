/*
* generated by Xtext
*/
grammar InternalGraph;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package ru.spbau.luchikhin.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package ru.spbau.luchikhin.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ru.spbau.luchikhin.services.GraphGrammarAccess;

}

@parser::members {
 
 	private GraphGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(GraphGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getNodeAssignment()); }
(rule__Model__NodeAssignment)*
{ after(grammarAccess.getModelAccess().getNodeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNode
entryRuleNode 
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeAccess().getGroup()); }
(rule__Node__Group__0)
{ after(grammarAccess.getNodeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConnection
entryRuleConnection 
:
{ before(grammarAccess.getConnectionRule()); }
	 ruleConnection
{ after(grammarAccess.getConnectionRule()); } 
	 EOF 
;

// Rule Connection
ruleConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConnectionAccess().getGroup()); }
(rule__Connection__Group__0)
{ after(grammarAccess.getConnectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNoConnection
entryRuleNoConnection 
:
{ before(grammarAccess.getNoConnectionRule()); }
	 ruleNoConnection
{ after(grammarAccess.getNoConnectionRule()); } 
	 EOF 
;

// Rule NoConnection
ruleNoConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNoConnectionAccess().getConnectionAssignment()); }
(rule__NoConnection__ConnectionAssignment)
{ after(grammarAccess.getNoConnectionAccess().getConnectionAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Node__ConnectionsAlternatives_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getConnectionsConnectionParserRuleCall_2_0_0()); }
	ruleConnection
{ after(grammarAccess.getNodeAccess().getConnectionsConnectionParserRuleCall_2_0_0()); }
)

    |(
{ before(grammarAccess.getNodeAccess().getConnectionsNoConnectionParserRuleCall_2_0_1()); }
	ruleNoConnection
{ after(grammarAccess.getNodeAccess().getConnectionsNoConnectionParserRuleCall_2_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Node__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNodeKeyword_0()); }

	'node' 

{ after(grammarAccess.getNodeAccess().getNodeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__1__Impl
	rule__Node__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameAssignment_1()); }
(rule__Node__NameAssignment_1)
{ after(grammarAccess.getNodeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__2__Impl
	rule__Node__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getConnectionsAssignment_2()); }
(rule__Node__ConnectionsAssignment_2)
{ after(grammarAccess.getNodeAccess().getConnectionsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getSemicolonKeyword_3()); }

	';' 

{ after(grammarAccess.getNodeAccess().getSemicolonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Connection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__0__Impl
	rule__Connection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getIsConnectedWithKeyword_0()); }

	'is connected with [' 

{ after(grammarAccess.getConnectionAccess().getIsConnectedWithKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__1__Impl
	rule__Connection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getConnectionAssignment_1()); }
(rule__Connection__ConnectionAssignment_1)
{ after(grammarAccess.getConnectionAccess().getConnectionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__2__Impl
	rule__Connection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getGroup_2()); }
(rule__Connection__Group_2__0)*
{ after(grammarAccess.getConnectionAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3()); }

	']' 

{ after(grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Connection__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group_2__0__Impl
	rule__Connection__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getCommaSpaceKeyword_2_0()); }

	', ' 

{ after(grammarAccess.getConnectionAccess().getCommaSpaceKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getConnectionAssignment_2_1()); }
(rule__Connection__ConnectionAssignment_2_1)
{ after(grammarAccess.getConnectionAccess().getConnectionAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__NodeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNodeNodeParserRuleCall_0()); }
	ruleNode{ after(grammarAccess.getModelAccess().getNodeNodeParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ConnectionsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getConnectionsAlternatives_2_0()); }
(rule__Node__ConnectionsAlternatives_2_0)
{ after(grammarAccess.getNodeAccess().getConnectionsAlternatives_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__ConnectionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_1_0()); }
(
{ before(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__ConnectionAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_2_1_0()); }
(
{ before(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_2_1_0_1()); }
	RULE_ID{ after(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NoConnection__ConnectionAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); }
(
{ before(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); }

	'isolated' 

{ after(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); }
)

{ after(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

