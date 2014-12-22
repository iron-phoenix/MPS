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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'node'", "';'", "'is connected with ['", "']'", "', '", "'isolated'"
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
    public String getGrammarFileName() { return "../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:61:1: ( ruleModel EOF )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:69:1: ruleModel : ( ( rule__Model__NodeAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:73:2: ( ( ( rule__Model__NodeAssignment )* ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:74:1: ( ( rule__Model__NodeAssignment )* )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:74:1: ( ( rule__Model__NodeAssignment )* )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:75:1: ( rule__Model__NodeAssignment )*
            {
             before(grammarAccess.getModelAccess().getNodeAssignment()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:76:1: ( rule__Model__NodeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:76:2: rule__Model__NodeAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__NodeAssignment_in_ruleModel94);
            	    rule__Model__NodeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getNodeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNode"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:88:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:89:1: ( ruleNode EOF )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:90:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode122);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:97:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:101:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:102:1: ( ( rule__Node__Group__0 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:102:1: ( ( rule__Node__Group__0 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:103:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:104:1: ( rule__Node__Group__0 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:104:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode155);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleConnection"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:116:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:117:1: ( ruleConnection EOF )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:118:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection182);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:125:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:129:2: ( ( ( rule__Connection__Group__0 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:130:1: ( ( rule__Connection__Group__0 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:130:1: ( ( rule__Connection__Group__0 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:131:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:132:1: ( rule__Connection__Group__0 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:132:2: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_rule__Connection__Group__0_in_ruleConnection215);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleNoConnection"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:144:1: entryRuleNoConnection : ruleNoConnection EOF ;
    public final void entryRuleNoConnection() throws RecognitionException {
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:145:1: ( ruleNoConnection EOF )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:146:1: ruleNoConnection EOF
            {
             before(grammarAccess.getNoConnectionRule()); 
            pushFollow(FOLLOW_ruleNoConnection_in_entryRuleNoConnection242);
            ruleNoConnection();

            state._fsp--;

             after(grammarAccess.getNoConnectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoConnection249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoConnection"


    // $ANTLR start "ruleNoConnection"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:153:1: ruleNoConnection : ( ( rule__NoConnection__ConnectionAssignment ) ) ;
    public final void ruleNoConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:157:2: ( ( ( rule__NoConnection__ConnectionAssignment ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:158:1: ( ( rule__NoConnection__ConnectionAssignment ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:158:1: ( ( rule__NoConnection__ConnectionAssignment ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:159:1: ( rule__NoConnection__ConnectionAssignment )
            {
             before(grammarAccess.getNoConnectionAccess().getConnectionAssignment()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:160:1: ( rule__NoConnection__ConnectionAssignment )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:160:2: rule__NoConnection__ConnectionAssignment
            {
            pushFollow(FOLLOW_rule__NoConnection__ConnectionAssignment_in_ruleNoConnection275);
            rule__NoConnection__ConnectionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNoConnectionAccess().getConnectionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoConnection"


    // $ANTLR start "rule__Node__ConnectionsAlternatives_2_0"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:172:1: rule__Node__ConnectionsAlternatives_2_0 : ( ( ruleConnection ) | ( ruleNoConnection ) );
    public final void rule__Node__ConnectionsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:176:1: ( ( ruleConnection ) | ( ruleNoConnection ) )
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
                    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:177:1: ( ruleConnection )
                    {
                    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:177:1: ( ruleConnection )
                    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:178:1: ruleConnection
                    {
                     before(grammarAccess.getNodeAccess().getConnectionsConnectionParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleConnection_in_rule__Node__ConnectionsAlternatives_2_0311);
                    ruleConnection();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getConnectionsConnectionParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:183:6: ( ruleNoConnection )
                    {
                    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:183:6: ( ruleNoConnection )
                    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:184:1: ruleNoConnection
                    {
                     before(grammarAccess.getNodeAccess().getConnectionsNoConnectionParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleNoConnection_in_rule__Node__ConnectionsAlternatives_2_0328);
                    ruleNoConnection();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getConnectionsNoConnectionParserRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ConnectionsAlternatives_2_0"


    // $ANTLR start "rule__Node__Group__0"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:196:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:200:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:201:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0358);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0361);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:208:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:212:1: ( ( 'node' ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:213:1: ( 'node' )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:213:1: ( 'node' )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:214:1: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Node__Group__0__Impl389); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:227:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:231:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:232:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__1420);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__1423);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:239:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:243:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:244:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:244:1: ( ( rule__Node__NameAssignment_1 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:245:1: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:246:1: ( rule__Node__NameAssignment_1 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:246:2: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl450);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:256:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:260:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:261:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__2480);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__2483);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:268:1: rule__Node__Group__2__Impl : ( ( rule__Node__ConnectionsAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:272:1: ( ( ( rule__Node__ConnectionsAssignment_2 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:273:1: ( ( rule__Node__ConnectionsAssignment_2 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:273:1: ( ( rule__Node__ConnectionsAssignment_2 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:274:1: ( rule__Node__ConnectionsAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getConnectionsAssignment_2()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:275:1: ( rule__Node__ConnectionsAssignment_2 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:275:2: rule__Node__ConnectionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__ConnectionsAssignment_2_in_rule__Node__Group__2__Impl510);
            rule__Node__ConnectionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getConnectionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:285:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:289:1: ( rule__Node__Group__3__Impl )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:290:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__3540);
            rule__Node__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:296:1: rule__Node__Group__3__Impl : ( ';' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:300:1: ( ( ';' ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:301:1: ( ';' )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:301:1: ( ';' )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:302:1: ';'
            {
             before(grammarAccess.getNodeAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Node__Group__3__Impl568); 
             after(grammarAccess.getNodeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:323:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:327:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:328:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__0607);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__0610);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:335:1: rule__Connection__Group__0__Impl : ( 'is connected with [' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:339:1: ( ( 'is connected with [' ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:340:1: ( 'is connected with [' )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:340:1: ( 'is connected with [' )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:341:1: 'is connected with ['
            {
             before(grammarAccess.getConnectionAccess().getIsConnectedWithKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Connection__Group__0__Impl638); 
             after(grammarAccess.getConnectionAccess().getIsConnectedWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:354:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:358:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:359:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__1669);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__1672);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:366:1: rule__Connection__Group__1__Impl : ( ( rule__Connection__ConnectionAssignment_1 ) ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:370:1: ( ( ( rule__Connection__ConnectionAssignment_1 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:371:1: ( ( rule__Connection__ConnectionAssignment_1 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:371:1: ( ( rule__Connection__ConnectionAssignment_1 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:372:1: ( rule__Connection__ConnectionAssignment_1 )
            {
             before(grammarAccess.getConnectionAccess().getConnectionAssignment_1()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:373:1: ( rule__Connection__ConnectionAssignment_1 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:373:2: rule__Connection__ConnectionAssignment_1
            {
            pushFollow(FOLLOW_rule__Connection__ConnectionAssignment_1_in_rule__Connection__Group__1__Impl699);
            rule__Connection__ConnectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getConnectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:383:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:387:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:388:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__2729);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__2732);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:395:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__Group_2__0 )* ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:399:1: ( ( ( rule__Connection__Group_2__0 )* ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:400:1: ( ( rule__Connection__Group_2__0 )* )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:400:1: ( ( rule__Connection__Group_2__0 )* )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:401:1: ( rule__Connection__Group_2__0 )*
            {
             before(grammarAccess.getConnectionAccess().getGroup_2()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:402:1: ( rule__Connection__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:402:2: rule__Connection__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl759);
            	    rule__Connection__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConnectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:412:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:416:1: ( rule__Connection__Group__3__Impl )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:417:2: rule__Connection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__3790);
            rule__Connection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:423:1: rule__Connection__Group__3__Impl : ( ']' ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:427:1: ( ( ']' ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:428:1: ( ']' )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:428:1: ( ']' )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:429:1: ']'
            {
             before(grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Connection__Group__3__Impl818); 
             after(grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group_2__0"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:450:1: rule__Connection__Group_2__0 : rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 ;
    public final void rule__Connection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:454:1: ( rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:455:2: rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1
            {
            pushFollow(FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__0857);
            rule__Connection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__0860);
            rule__Connection__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__0"


    // $ANTLR start "rule__Connection__Group_2__0__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:462:1: rule__Connection__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__Connection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:466:1: ( ( ', ' ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:467:1: ( ', ' )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:467:1: ( ', ' )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:468:1: ', '
            {
             before(grammarAccess.getConnectionAccess().getCommaSpaceKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Connection__Group_2__0__Impl888); 
             after(grammarAccess.getConnectionAccess().getCommaSpaceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__0__Impl"


    // $ANTLR start "rule__Connection__Group_2__1"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:481:1: rule__Connection__Group_2__1 : rule__Connection__Group_2__1__Impl ;
    public final void rule__Connection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:485:1: ( rule__Connection__Group_2__1__Impl )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:486:2: rule__Connection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__1919);
            rule__Connection__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__1"


    // $ANTLR start "rule__Connection__Group_2__1__Impl"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:492:1: rule__Connection__Group_2__1__Impl : ( ( rule__Connection__ConnectionAssignment_2_1 ) ) ;
    public final void rule__Connection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:496:1: ( ( ( rule__Connection__ConnectionAssignment_2_1 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:497:1: ( ( rule__Connection__ConnectionAssignment_2_1 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:497:1: ( ( rule__Connection__ConnectionAssignment_2_1 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:498:1: ( rule__Connection__ConnectionAssignment_2_1 )
            {
             before(grammarAccess.getConnectionAccess().getConnectionAssignment_2_1()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:499:1: ( rule__Connection__ConnectionAssignment_2_1 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:499:2: rule__Connection__ConnectionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Connection__ConnectionAssignment_2_1_in_rule__Connection__Group_2__1__Impl946);
            rule__Connection__ConnectionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getConnectionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_2__1__Impl"


    // $ANTLR start "rule__Model__NodeAssignment"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:514:1: rule__Model__NodeAssignment : ( ruleNode ) ;
    public final void rule__Model__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:518:1: ( ( ruleNode ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:519:1: ( ruleNode )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:519:1: ( ruleNode )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:520:1: ruleNode
            {
             before(grammarAccess.getModelAccess().getNodeNodeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Model__NodeAssignment985);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodeNodeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NodeAssignment"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:529:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:533:1: ( ( RULE_ID ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:534:1: ( RULE_ID )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:534:1: ( RULE_ID )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:535:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_11016); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__ConnectionsAssignment_2"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:544:1: rule__Node__ConnectionsAssignment_2 : ( ( rule__Node__ConnectionsAlternatives_2_0 ) ) ;
    public final void rule__Node__ConnectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:548:1: ( ( ( rule__Node__ConnectionsAlternatives_2_0 ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:549:1: ( ( rule__Node__ConnectionsAlternatives_2_0 ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:549:1: ( ( rule__Node__ConnectionsAlternatives_2_0 ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:550:1: ( rule__Node__ConnectionsAlternatives_2_0 )
            {
             before(grammarAccess.getNodeAccess().getConnectionsAlternatives_2_0()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:551:1: ( rule__Node__ConnectionsAlternatives_2_0 )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:551:2: rule__Node__ConnectionsAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Node__ConnectionsAlternatives_2_0_in_rule__Node__ConnectionsAssignment_21047);
            rule__Node__ConnectionsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getConnectionsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ConnectionsAssignment_2"


    // $ANTLR start "rule__Connection__ConnectionAssignment_1"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:560:1: rule__Connection__ConnectionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connection__ConnectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:564:1: ( ( ( RULE_ID ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:565:1: ( ( RULE_ID ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:565:1: ( ( RULE_ID ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:566:1: ( RULE_ID )
            {
             before(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_1_0()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:567:1: ( RULE_ID )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:568:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connection__ConnectionAssignment_11084); 
             after(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ConnectionAssignment_1"


    // $ANTLR start "rule__Connection__ConnectionAssignment_2_1"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:579:1: rule__Connection__ConnectionAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connection__ConnectionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:583:1: ( ( ( RULE_ID ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:584:1: ( ( RULE_ID ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:584:1: ( ( RULE_ID ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:585:1: ( RULE_ID )
            {
             before(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_2_1_0()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:586:1: ( RULE_ID )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:587:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connection__ConnectionAssignment_2_11123); 
             after(grammarAccess.getConnectionAccess().getConnectionNodeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getConnectionNodeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ConnectionAssignment_2_1"


    // $ANTLR start "rule__NoConnection__ConnectionAssignment"
    // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:598:1: rule__NoConnection__ConnectionAssignment : ( ( 'isolated' ) ) ;
    public final void rule__NoConnection__ConnectionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:602:1: ( ( ( 'isolated' ) ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:603:1: ( ( 'isolated' ) )
            {
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:603:1: ( ( 'isolated' ) )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:604:1: ( 'isolated' )
            {
             before(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); 
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:605:1: ( 'isolated' )
            // ../ru.spbau.luchikhin.graph.ui/src-gen/ru/spbau/luchikhin/ui/contentassist/antlr/internal/InternalGraph.g:606:1: 'isolated'
            {
             before(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__NoConnection__ConnectionAssignment1163); 
             after(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); 

            }

             after(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoConnection__ConnectionAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodeAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoConnection_in_entryRuleNoConnection242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoConnection249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoConnection__ConnectionAssignment_in_ruleNoConnection275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Node__ConnectionsAlternatives_2_0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoConnection_in_rule__Node__ConnectionsAlternatives_2_0328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Node__Group__0__Impl389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__1420 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__2480 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ConnectionsAssignment_2_in_rule__Node__Group__2__Impl510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Node__Group__3__Impl568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__0607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Connection__Group__0__Impl638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__1669 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__ConnectionAssignment_1_in_rule__Connection__Group__1__Impl699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__2729 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl759 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Connection__Group__3__Impl818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__0857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__0860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Connection__Group_2__0__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__ConnectionAssignment_2_1_in_rule__Connection__Group_2__1__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Model__NodeAssignment985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ConnectionsAlternatives_2_0_in_rule__Node__ConnectionsAssignment_21047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__ConnectionAssignment_11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__ConnectionAssignment_2_11123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NoConnection__ConnectionAssignment1163 = new BitSet(new long[]{0x0000000000000002L});

}