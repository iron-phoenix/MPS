package ru.spbau.luchikhin.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ru.spbau.luchikhin.services.GraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'node'", "';'", "'is connected with ['", "', '", "']'", "'isolated'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGraphParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphParser.tokenNames; }
    public String getGrammarFileName() { return "../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g"; }



     	private GraphGrammarAccess grammarAccess;
     	
        public InternalGraphParser(TokenStream input, GraphGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GraphGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:76:1: ruleModel returns [EObject current=null] : ( (lv_node_0_0= ruleNode ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;


         enterRule(); 
            
        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:79:28: ( ( (lv_node_0_0= ruleNode ) )* )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:80:1: ( (lv_node_0_0= ruleNode ) )*
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:80:1: ( (lv_node_0_0= ruleNode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:81:1: (lv_node_0_0= ruleNode )
            	    {
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:81:1: (lv_node_0_0= ruleNode )
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:82:3: lv_node_0_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNodeNodeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleModel130);
            	    lv_node_0_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"node",
            	            		lv_node_0_0, 
            	            		"Node");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNode"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:106:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:107:2: (iv_ruleNode= ruleNode EOF )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:108:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode166);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:115:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_connections_2_1 = null;

        EObject lv_connections_2_2 = null;


         enterRule(); 
            
        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:118:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) ) ) otherlv_3= ';' ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:119:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) ) ) otherlv_3= ';' )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:119:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) ) ) otherlv_3= ';' )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:119:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNode213); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:124:1: (lv_name_1_0= RULE_ID )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:141:2: ( ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:142:1: ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:142:1: ( (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:143:1: (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:143:1: (lv_connections_2_1= ruleConnection | lv_connections_2_2= ruleNoConnection )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:144:3: lv_connections_2_1= ruleConnection
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeAccess().getConnectionsConnectionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConnection_in_ruleNode258);
                    lv_connections_2_1=ruleConnection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"connections",
                            		lv_connections_2_1, 
                            		"Connection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:159:8: lv_connections_2_2= ruleNoConnection
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeAccess().getConnectionsNoConnectionParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNoConnection_in_ruleNode277);
                    lv_connections_2_2=ruleNoConnection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"connections",
                            		lv_connections_2_2, 
                            		"NoConnection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleNode292); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleConnection"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:189:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:190:2: (iv_ruleConnection= ruleConnection EOF )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:191:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection328);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:198:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'is connected with [' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ', ' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:201:28: ( (otherlv_0= 'is connected with [' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ', ' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:202:1: (otherlv_0= 'is connected with [' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ', ' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:202:1: (otherlv_0= 'is connected with [' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ', ' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:202:3: otherlv_0= 'is connected with [' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ', ' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleConnection375); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getIsConnectedWithKeyword_0());
                
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:206:1: ( (otherlv_1= RULE_ID ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:207:1: (otherlv_1= RULE_ID )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:207:1: (otherlv_1= RULE_ID )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:208:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnection395); 

            		newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_1_0()); 
            	

            }


            }

            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:219:2: (otherlv_2= ', ' ( (otherlv_3= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:219:4: otherlv_2= ', ' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleConnection408); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getCommaSpaceKeyword_2_0());
            	        
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:223:1: ( (otherlv_3= RULE_ID ) )
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:224:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:224:1: (otherlv_3= RULE_ID )
            	    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:225:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConnectionRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnection428); 

            	    		newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConnection442); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleNoConnection"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:248:1: entryRuleNoConnection returns [EObject current=null] : iv_ruleNoConnection= ruleNoConnection EOF ;
    public final EObject entryRuleNoConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoConnection = null;


        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:249:2: (iv_ruleNoConnection= ruleNoConnection EOF )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:250:2: iv_ruleNoConnection= ruleNoConnection EOF
            {
             newCompositeNode(grammarAccess.getNoConnectionRule()); 
            pushFollow(FOLLOW_ruleNoConnection_in_entryRuleNoConnection478);
            iv_ruleNoConnection=ruleNoConnection();

            state._fsp--;

             current =iv_ruleNoConnection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoConnection488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoConnection"


    // $ANTLR start "ruleNoConnection"
    // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:257:1: ruleNoConnection returns [EObject current=null] : ( (lv_connection_0_0= 'isolated' ) ) ;
    public final EObject ruleNoConnection() throws RecognitionException {
        EObject current = null;

        Token lv_connection_0_0=null;

         enterRule(); 
            
        try {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:260:28: ( ( (lv_connection_0_0= 'isolated' ) ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:261:1: ( (lv_connection_0_0= 'isolated' ) )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:261:1: ( (lv_connection_0_0= 'isolated' ) )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:262:1: (lv_connection_0_0= 'isolated' )
            {
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:262:1: (lv_connection_0_0= 'isolated' )
            // ../ru.spbau.luchikhin.graph/src-gen/ru/spbau/luchikhin/parser/antlr/internal/InternalGraph.g:263:3: lv_connection_0_0= 'isolated'
            {
            lv_connection_0_0=(Token)match(input,16,FOLLOW_16_in_ruleNoConnection530); 

                    newLeafNode(lv_connection_0_0, grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoConnectionRule());
            	        }
                   		setWithLastConsumed(current, "connection", lv_connection_0_0, "isolated");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoConnection"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNode213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode230 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleConnection_in_ruleNode258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleNoConnection_in_ruleNode277 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNode292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConnection375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnection395 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleConnection408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnection428 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleConnection442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoConnection_in_entryRuleNoConnection478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoConnection488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNoConnection530 = new BitSet(new long[]{0x0000000000000002L});

}