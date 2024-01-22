package dk.sdu.bdd.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.bdd.xtext.services.BddDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBddDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'using'", "'declarative'", "'entity'", "'-'", "'is'", "','", "'{'", "'actions:'", "'states:'", "'and'", "'the'", "'properties:'", "'}'", "'imperative'", "'on'", "'in'", "'from'", "'to'", "'into'", "'for'", "'with'", "'linearly'", "'/'", "'off'", "'*'", "'which'", "'means'", "'Given'", "'When'", "'Then'", "'Scenario:'", "'out'", "'I'", "'do'", "'not'", "'all'", "'And'", "'#'", "'of'", "'are'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBddDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBddDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBddDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBddDsl.g"; }



     	private BddDslGrammarAccess grammarAccess;

        public InternalBddDslParser(TokenStream input, BddDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BddDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBddDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBddDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBddDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBddDsl.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_modelRefs_2_0 = null;

        EObject lv_declarativeEntityDef_3_0 = null;

        EObject lv_imperativeEntityDef_4_0 = null;

        EObject lv_scenarios_5_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:77:2: ( ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* ) )
            // InternalBddDsl.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* )
            {
            // InternalBddDsl.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* )
            // InternalBddDsl.g:79:3: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )*
            {
            // InternalBddDsl.g:79:3: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBddDsl.g:80:4: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0_0());
            			
            // InternalBddDsl.g:84:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalBddDsl.g:85:5: (lv_name_1_0= RULE_ID )
            {
            // InternalBddDsl.g:85:5: (lv_name_1_0= RULE_ID )
            // InternalBddDsl.g:86:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            						newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getModelRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            }

            // InternalBddDsl.g:103:3: ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    alt1=3;
                    }
                    break;
                case 42:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBddDsl.g:104:4: ( (lv_modelRefs_2_0= ruleModelRef ) )
            	    {
            	    // InternalBddDsl.g:104:4: ( (lv_modelRefs_2_0= ruleModelRef ) )
            	    // InternalBddDsl.g:105:5: (lv_modelRefs_2_0= ruleModelRef )
            	    {
            	    // InternalBddDsl.g:105:5: (lv_modelRefs_2_0= ruleModelRef )
            	    // InternalBddDsl.g:106:6: lv_modelRefs_2_0= ruleModelRef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getModelRefsModelRefParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_modelRefs_2_0=ruleModelRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelRefs",
            	    							lv_modelRefs_2_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ModelRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBddDsl.g:124:4: ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) )
            	    {
            	    // InternalBddDsl.g:124:4: ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) )
            	    // InternalBddDsl.g:125:5: (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef )
            	    {
            	    // InternalBddDsl.g:125:5: (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef )
            	    // InternalBddDsl.g:126:6: lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getDeclarativeEntityDefDeclarativeEntityDefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_declarativeEntityDef_3_0=ruleDeclarativeEntityDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"declarativeEntityDef",
            	    							lv_declarativeEntityDef_3_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBddDsl.g:144:4: ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) )
            	    {
            	    // InternalBddDsl.g:144:4: ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) )
            	    // InternalBddDsl.g:145:5: (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef )
            	    {
            	    // InternalBddDsl.g:145:5: (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef )
            	    // InternalBddDsl.g:146:6: lv_imperativeEntityDef_4_0= ruleImperativeEntityDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getImperativeEntityDefImperativeEntityDefParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_imperativeEntityDef_4_0=ruleImperativeEntityDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"imperativeEntityDef",
            	    							lv_imperativeEntityDef_4_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBddDsl.g:164:4: ( (lv_scenarios_5_0= ruleScenario ) )
            	    {
            	    // InternalBddDsl.g:164:4: ( (lv_scenarios_5_0= ruleScenario ) )
            	    // InternalBddDsl.g:165:5: (lv_scenarios_5_0= ruleScenario )
            	    {
            	    // InternalBddDsl.g:165:5: (lv_scenarios_5_0= ruleScenario )
            	    // InternalBddDsl.g:166:6: lv_scenarios_5_0= ruleScenario
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_scenarios_5_0=ruleScenario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scenarios",
            	    							lv_scenarios_5_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.Scenario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelRef"
    // InternalBddDsl.g:188:1: entryRuleModelRef returns [EObject current=null] : iv_ruleModelRef= ruleModelRef EOF ;
    public final EObject entryRuleModelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRef = null;


        try {
            // InternalBddDsl.g:188:49: (iv_ruleModelRef= ruleModelRef EOF )
            // InternalBddDsl.g:189:2: iv_ruleModelRef= ruleModelRef EOF
            {
             newCompositeNode(grammarAccess.getModelRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelRef=ruleModelRef();

            state._fsp--;

             current =iv_ruleModelRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelRef"


    // $ANTLR start "ruleModelRef"
    // InternalBddDsl.g:195:1: ruleModelRef returns [EObject current=null] : (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleModelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:201:2: ( (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBddDsl.g:202:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBddDsl.g:202:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) )
            // InternalBddDsl.g:203:3: otherlv_0= 'using' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelRefAccess().getUsingKeyword_0());
            		
            // InternalBddDsl.g:207:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:208:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:208:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:209:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getModelRefAccess().getModelRefModelCrossReference_1_0());
            				

            }


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
    // $ANTLR end "ruleModelRef"


    // $ANTLR start "entryRuleDeclarativeEntityDef"
    // InternalBddDsl.g:224:1: entryRuleDeclarativeEntityDef returns [EObject current=null] : iv_ruleDeclarativeEntityDef= ruleDeclarativeEntityDef EOF ;
    public final EObject entryRuleDeclarativeEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityDef = null;


        try {
            // InternalBddDsl.g:224:61: (iv_ruleDeclarativeEntityDef= ruleDeclarativeEntityDef EOF )
            // InternalBddDsl.g:225:2: iv_ruleDeclarativeEntityDef= ruleDeclarativeEntityDef EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityDef=ruleDeclarativeEntityDef();

            state._fsp--;

             current =iv_ruleDeclarativeEntityDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeEntityDef"


    // $ANTLR start "ruleDeclarativeEntityDef"
    // InternalBddDsl.g:231:1: ruleDeclarativeEntityDef returns [EObject current=null] : (otherlv_0= 'declarative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )* )? otherlv_34= '}' ) ;
    public final EObject ruleDeclarativeEntityDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        EObject lv_actions_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_states_15_0 = null;

        EObject lv_states_23_0 = null;

        EObject lv_properties_25_0 = null;

        EObject lv_properties_33_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:237:2: ( (otherlv_0= 'declarative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )* )? otherlv_34= '}' ) )
            // InternalBddDsl.g:238:2: (otherlv_0= 'declarative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )* )? otherlv_34= '}' )
            {
            // InternalBddDsl.g:238:2: (otherlv_0= 'declarative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )* )? otherlv_34= '}' )
            // InternalBddDsl.g:239:3: otherlv_0= 'declarative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )* )? otherlv_34= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarativeEntityDefAccess().getDeclarativeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityDefAccess().getEntityKeyword_1());
            		
            // InternalBddDsl.g:247:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // InternalBddDsl.g:248:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // InternalBddDsl.g:248:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // InternalBddDsl.g:249:5: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // InternalBddDsl.g:249:5: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBddDsl.g:250:6: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getDeclarativeEntityDefAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:265:6: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getDeclarativeEntityDefAccess().getNameSTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:282:3: (otherlv_3= '-' ruleWORD )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBddDsl.g:283:4: otherlv_3= '-' ruleWORD
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeclarativeEntityDefAccess().getHyphenMinusKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_8);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:295:3: (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBddDsl.g:296:4: otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclarativeEntityDefAccess().getIsKeyword_4_0());
                    			
                    // InternalBddDsl.g:300:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBddDsl.g:301:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBddDsl.g:301:5: (otherlv_6= RULE_ID )
                    // InternalBddDsl.g:302:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_6, grammarAccess.getDeclarativeEntityDefAccess().getSuperEntitiesDeclarativeEntityDefCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalBddDsl.g:313:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBddDsl.g:314:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBddDsl.g:318:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalBddDsl.g:319:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalBddDsl.g:319:6: (otherlv_8= RULE_ID )
                    	    // InternalBddDsl.g:320:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getDeclarativeEntityDefAccess().getSuperEntitiesDeclarativeEntityDefCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getDeclarativeEntityDefAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBddDsl.g:337:3: (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBddDsl.g:338:4: otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )*
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeclarativeEntityDefAccess().getActionsKeyword_6_0());
                    			
                    // InternalBddDsl.g:342:4: ( (lv_actions_11_0= ruleActionDef ) )
                    // InternalBddDsl.g:343:5: (lv_actions_11_0= ruleActionDef )
                    {
                    // InternalBddDsl.g:343:5: (lv_actions_11_0= ruleActionDef )
                    // InternalBddDsl.g:344:6: lv_actions_11_0= ruleActionDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getActionsActionDefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_actions_11_0=ruleActionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_11_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ActionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:361:4: (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBddDsl.g:362:5: otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalBddDsl.g:366:5: ( (lv_actions_13_0= ruleActionDef ) )
                    	    // InternalBddDsl.g:367:6: (lv_actions_13_0= ruleActionDef )
                    	    {
                    	    // InternalBddDsl.g:367:6: (lv_actions_13_0= ruleActionDef )
                    	    // InternalBddDsl.g:368:7: lv_actions_13_0= ruleActionDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getActionsActionDefParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_actions_13_0=ruleActionDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_13_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ActionDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:387:3: (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBddDsl.g:388:4: otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )*
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeclarativeEntityDefAccess().getStatesKeyword_7_0());
                    			
                    // InternalBddDsl.g:392:4: ( (lv_states_15_0= ruleStateDef ) )
                    // InternalBddDsl.g:393:5: (lv_states_15_0= ruleStateDef )
                    {
                    // InternalBddDsl.g:393:5: (lv_states_15_0= ruleStateDef )
                    // InternalBddDsl.g:394:6: lv_states_15_0= ruleStateDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getStatesStateDefParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_states_15_0=ruleStateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_15_0,
                    							"dk.sdu.bdd.xtext.BddDsl.StateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:411:4: ( ruleWORD )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==RULE_ID||LA8_1==17||(LA8_1>=21 && LA8_1<=24)) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalBddDsl.g:412:5: ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_7_2());
                            				
                            pushFollow(FOLLOW_12);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:420:4: ( ruleWORD otherlv_18= '-' ruleWORD )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBddDsl.g:421:5: ruleWORD otherlv_18= '-' ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_7_3_0());
                            				
                            pushFollow(FOLLOW_13);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            otherlv_18=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_18, grammarAccess.getDeclarativeEntityDefAccess().getHyphenMinusKeyword_7_3_1());
                            				

                            					newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_7_3_2());
                            				
                            pushFollow(FOLLOW_14);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:440:4: ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17||(LA11_0>=21 && LA11_0<=22)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBddDsl.g:441:5: (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleStateDef ) )
                    	    {
                    	    // InternalBddDsl.g:441:5: (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' )
                    	    int alt10=3;
                    	    switch ( input.LA(1) ) {
                    	    case 17:
                    	        {
                    	        alt10=1;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt10=2;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt10=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt10) {
                    	        case 1 :
                    	            // InternalBddDsl.g:442:6: otherlv_20= ','
                    	            {
                    	            otherlv_20=(Token)match(input,17,FOLLOW_3); 

                    	            						newLeafNode(otherlv_20, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_7_4_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalBddDsl.g:447:6: otherlv_21= 'and'
                    	            {
                    	            otherlv_21=(Token)match(input,21,FOLLOW_3); 

                    	            						newLeafNode(otherlv_21, grammarAccess.getDeclarativeEntityDefAccess().getAndKeyword_7_4_0_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalBddDsl.g:452:6: otherlv_22= 'the'
                    	            {
                    	            otherlv_22=(Token)match(input,22,FOLLOW_3); 

                    	            						newLeafNode(otherlv_22, grammarAccess.getDeclarativeEntityDefAccess().getTheKeyword_7_4_0_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalBddDsl.g:457:5: ( (lv_states_23_0= ruleStateDef ) )
                    	    // InternalBddDsl.g:458:6: (lv_states_23_0= ruleStateDef )
                    	    {
                    	    // InternalBddDsl.g:458:6: (lv_states_23_0= ruleStateDef )
                    	    // InternalBddDsl.g:459:7: lv_states_23_0= ruleStateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getStatesStateDefParserRuleCall_7_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_states_23_0=ruleStateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_23_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.StateDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:478:3: (otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBddDsl.g:479:4: otherlv_24= 'properties:' ( (lv_properties_25_0= rulePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )*
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getDeclarativeEntityDefAccess().getPropertiesKeyword_8_0());
                    			
                    // InternalBddDsl.g:483:4: ( (lv_properties_25_0= rulePropertyDef ) )
                    // InternalBddDsl.g:484:5: (lv_properties_25_0= rulePropertyDef )
                    {
                    // InternalBddDsl.g:484:5: (lv_properties_25_0= rulePropertyDef )
                    // InternalBddDsl.g:485:6: lv_properties_25_0= rulePropertyDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getPropertiesPropertyDefParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_properties_25_0=rulePropertyDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_25_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PropertyDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:502:4: ( ruleWORD )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==RULE_ID||LA13_1==17||(LA13_1>=21 && LA13_1<=22)||LA13_1==24) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalBddDsl.g:503:5: ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_8_2());
                            				
                            pushFollow(FOLLOW_15);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:511:4: ( ruleWORD otherlv_28= '-' ruleWORD )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalBddDsl.g:512:5: ruleWORD otherlv_28= '-' ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_8_3_0());
                            				
                            pushFollow(FOLLOW_13);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            otherlv_28=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_28, grammarAccess.getDeclarativeEntityDefAccess().getHyphenMinusKeyword_8_3_1());
                            				

                            					newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getWORDParserRuleCall_8_3_2());
                            				
                            pushFollow(FOLLOW_16);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:531:4: ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17||(LA16_0>=21 && LA16_0<=22)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBddDsl.g:532:5: (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= rulePropertyDef ) )
                    	    {
                    	    // InternalBddDsl.g:532:5: (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' )
                    	    int alt15=3;
                    	    switch ( input.LA(1) ) {
                    	    case 17:
                    	        {
                    	        alt15=1;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt15=2;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt15=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalBddDsl.g:533:6: otherlv_30= ','
                    	            {
                    	            otherlv_30=(Token)match(input,17,FOLLOW_3); 

                    	            						newLeafNode(otherlv_30, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_8_4_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalBddDsl.g:538:6: otherlv_31= 'and'
                    	            {
                    	            otherlv_31=(Token)match(input,21,FOLLOW_3); 

                    	            						newLeafNode(otherlv_31, grammarAccess.getDeclarativeEntityDefAccess().getAndKeyword_8_4_0_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalBddDsl.g:543:6: otherlv_32= 'the'
                    	            {
                    	            otherlv_32=(Token)match(input,22,FOLLOW_3); 

                    	            						newLeafNode(otherlv_32, grammarAccess.getDeclarativeEntityDefAccess().getTheKeyword_8_4_0_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalBddDsl.g:548:5: ( (lv_properties_33_0= rulePropertyDef ) )
                    	    // InternalBddDsl.g:549:6: (lv_properties_33_0= rulePropertyDef )
                    	    {
                    	    // InternalBddDsl.g:549:6: (lv_properties_33_0= rulePropertyDef )
                    	    // InternalBddDsl.g:550:7: lv_properties_33_0= rulePropertyDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getPropertiesPropertyDefParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_properties_33_0=rulePropertyDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_33_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.PropertyDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_34=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getDeclarativeEntityDefAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleDeclarativeEntityDef"


    // $ANTLR start "entryRuleImperativeEntityDef"
    // InternalBddDsl.g:577:1: entryRuleImperativeEntityDef returns [EObject current=null] : iv_ruleImperativeEntityDef= ruleImperativeEntityDef EOF ;
    public final EObject entryRuleImperativeEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityDef = null;


        try {
            // InternalBddDsl.g:577:60: (iv_ruleImperativeEntityDef= ruleImperativeEntityDef EOF )
            // InternalBddDsl.g:578:2: iv_ruleImperativeEntityDef= ruleImperativeEntityDef EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityDef=ruleImperativeEntityDef();

            state._fsp--;

             current =iv_ruleImperativeEntityDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeEntityDef"


    // $ANTLR start "ruleImperativeEntityDef"
    // InternalBddDsl.g:584:1: ruleImperativeEntityDef returns [EObject current=null] : (otherlv_0= 'imperative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )* )? otherlv_34= '}' ) ;
    public final EObject ruleImperativeEntityDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        EObject lv_actions_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_states_15_0 = null;

        EObject lv_states_23_0 = null;

        EObject lv_properties_25_0 = null;

        EObject lv_properties_33_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:590:2: ( (otherlv_0= 'imperative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )* )? otherlv_34= '}' ) )
            // InternalBddDsl.g:591:2: (otherlv_0= 'imperative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )* )? otherlv_34= '}' )
            {
            // InternalBddDsl.g:591:2: (otherlv_0= 'imperative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )* )? otherlv_34= '}' )
            // InternalBddDsl.g:592:3: otherlv_0= 'imperative' otherlv_1= 'entity' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '-' ruleWORD )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )* )? (otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )* )? otherlv_34= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeEntityDefAccess().getImperativeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImperativeEntityDefAccess().getEntityKeyword_1());
            		
            // InternalBddDsl.g:600:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // InternalBddDsl.g:601:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // InternalBddDsl.g:601:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // InternalBddDsl.g:602:5: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // InternalBddDsl.g:602:5: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBddDsl.g:603:6: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getImperativeEntityDefAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:618:6: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getImperativeEntityDefAccess().getNameSTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:635:3: (otherlv_3= '-' ruleWORD )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBddDsl.g:636:4: otherlv_3= '-' ruleWORD
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getImperativeEntityDefAccess().getHyphenMinusKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_8);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:648:3: (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBddDsl.g:649:4: otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getImperativeEntityDefAccess().getIsKeyword_4_0());
                    			
                    // InternalBddDsl.g:653:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBddDsl.g:654:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBddDsl.g:654:5: (otherlv_6= RULE_ID )
                    // InternalBddDsl.g:655:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImperativeEntityDefRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_6, grammarAccess.getImperativeEntityDefAccess().getSuperEntitiesImperativeEntityDefCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalBddDsl.g:666:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalBddDsl.g:667:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBddDsl.g:671:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalBddDsl.g:672:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalBddDsl.g:672:6: (otherlv_8= RULE_ID )
                    	    // InternalBddDsl.g:673:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getImperativeEntityDefAccess().getSuperEntitiesImperativeEntityDefCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getImperativeEntityDefAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBddDsl.g:690:3: (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBddDsl.g:691:4: otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )*
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getImperativeEntityDefAccess().getActionsKeyword_6_0());
                    			
                    // InternalBddDsl.g:695:4: ( (lv_actions_11_0= ruleImperativeActionDef ) )
                    // InternalBddDsl.g:696:5: (lv_actions_11_0= ruleImperativeActionDef )
                    {
                    // InternalBddDsl.g:696:5: (lv_actions_11_0= ruleImperativeActionDef )
                    // InternalBddDsl.g:697:6: lv_actions_11_0= ruleImperativeActionDef
                    {

                    						newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getActionsImperativeActionDefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_actions_11_0=ruleImperativeActionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_11_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeActionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:714:4: (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalBddDsl.g:715:5: otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalBddDsl.g:719:5: ( (lv_actions_13_0= ruleImperativeActionDef ) )
                    	    // InternalBddDsl.g:720:6: (lv_actions_13_0= ruleImperativeActionDef )
                    	    {
                    	    // InternalBddDsl.g:720:6: (lv_actions_13_0= ruleImperativeActionDef )
                    	    // InternalBddDsl.g:721:7: lv_actions_13_0= ruleImperativeActionDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getActionsImperativeActionDefParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_actions_13_0=ruleImperativeActionDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_13_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ImperativeActionDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:740:3: (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBddDsl.g:741:4: otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) ( ruleWORD )? ( ruleWORD otherlv_18= '-' ruleWORD )? ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )*
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getImperativeEntityDefAccess().getStatesKeyword_7_0());
                    			
                    // InternalBddDsl.g:745:4: ( (lv_states_15_0= ruleImperativeStateDef ) )
                    // InternalBddDsl.g:746:5: (lv_states_15_0= ruleImperativeStateDef )
                    {
                    // InternalBddDsl.g:746:5: (lv_states_15_0= ruleImperativeStateDef )
                    // InternalBddDsl.g:747:6: lv_states_15_0= ruleImperativeStateDef
                    {

                    						newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getStatesImperativeStateDefParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_states_15_0=ruleImperativeStateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_15_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeStateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:764:4: ( ruleWORD )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==RULE_ID||LA24_1==17||(LA24_1>=21 && LA24_1<=24)) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalBddDsl.g:765:5: ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_7_2());
                            				
                            pushFollow(FOLLOW_12);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:773:4: ( ruleWORD otherlv_18= '-' ruleWORD )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalBddDsl.g:774:5: ruleWORD otherlv_18= '-' ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_7_3_0());
                            				
                            pushFollow(FOLLOW_13);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            otherlv_18=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_18, grammarAccess.getImperativeEntityDefAccess().getHyphenMinusKeyword_7_3_1());
                            				

                            					newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_7_3_2());
                            				
                            pushFollow(FOLLOW_14);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:793:4: ( (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17||(LA27_0>=21 && LA27_0<=22)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalBddDsl.g:794:5: (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' ) ( (lv_states_23_0= ruleImperativeStateDef ) )
                    	    {
                    	    // InternalBddDsl.g:794:5: (otherlv_20= ',' | otherlv_21= 'and' | otherlv_22= 'the' )
                    	    int alt26=3;
                    	    switch ( input.LA(1) ) {
                    	    case 17:
                    	        {
                    	        alt26=1;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt26=2;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt26=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 26, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt26) {
                    	        case 1 :
                    	            // InternalBddDsl.g:795:6: otherlv_20= ','
                    	            {
                    	            otherlv_20=(Token)match(input,17,FOLLOW_3); 

                    	            						newLeafNode(otherlv_20, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_7_4_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalBddDsl.g:800:6: otherlv_21= 'and'
                    	            {
                    	            otherlv_21=(Token)match(input,21,FOLLOW_3); 

                    	            						newLeafNode(otherlv_21, grammarAccess.getImperativeEntityDefAccess().getAndKeyword_7_4_0_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalBddDsl.g:805:6: otherlv_22= 'the'
                    	            {
                    	            otherlv_22=(Token)match(input,22,FOLLOW_3); 

                    	            						newLeafNode(otherlv_22, grammarAccess.getImperativeEntityDefAccess().getTheKeyword_7_4_0_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalBddDsl.g:810:5: ( (lv_states_23_0= ruleImperativeStateDef ) )
                    	    // InternalBddDsl.g:811:6: (lv_states_23_0= ruleImperativeStateDef )
                    	    {
                    	    // InternalBddDsl.g:811:6: (lv_states_23_0= ruleImperativeStateDef )
                    	    // InternalBddDsl.g:812:7: lv_states_23_0= ruleImperativeStateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getStatesImperativeStateDefParserRuleCall_7_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_states_23_0=ruleImperativeStateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_23_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ImperativeStateDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:831:3: (otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBddDsl.g:832:4: otherlv_24= 'properties:' ( (lv_properties_25_0= ruleImperativePropertyDef ) ) ( ruleWORD )? ( ruleWORD otherlv_28= '-' ruleWORD )? ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )*
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getImperativeEntityDefAccess().getPropertiesKeyword_8_0());
                    			
                    // InternalBddDsl.g:836:4: ( (lv_properties_25_0= ruleImperativePropertyDef ) )
                    // InternalBddDsl.g:837:5: (lv_properties_25_0= ruleImperativePropertyDef )
                    {
                    // InternalBddDsl.g:837:5: (lv_properties_25_0= ruleImperativePropertyDef )
                    // InternalBddDsl.g:838:6: lv_properties_25_0= ruleImperativePropertyDef
                    {

                    						newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getPropertiesImperativePropertyDefParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_properties_25_0=ruleImperativePropertyDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_25_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:855:4: ( ruleWORD )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==RULE_ID||LA29_1==17||(LA29_1>=21 && LA29_1<=22)||LA29_1==24) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalBddDsl.g:856:5: ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_8_2());
                            				
                            pushFollow(FOLLOW_15);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:864:4: ( ruleWORD otherlv_28= '-' ruleWORD )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalBddDsl.g:865:5: ruleWORD otherlv_28= '-' ruleWORD
                            {

                            					newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_8_3_0());
                            				
                            pushFollow(FOLLOW_13);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            otherlv_28=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_28, grammarAccess.getImperativeEntityDefAccess().getHyphenMinusKeyword_8_3_1());
                            				

                            					newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getWORDParserRuleCall_8_3_2());
                            				
                            pushFollow(FOLLOW_16);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:884:4: ( (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17||(LA32_0>=21 && LA32_0<=22)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalBddDsl.g:885:5: (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' ) ( (lv_properties_33_0= ruleImperativePropertyDef ) )
                    	    {
                    	    // InternalBddDsl.g:885:5: (otherlv_30= ',' | otherlv_31= 'and' | otherlv_32= 'the' )
                    	    int alt31=3;
                    	    switch ( input.LA(1) ) {
                    	    case 17:
                    	        {
                    	        alt31=1;
                    	        }
                    	        break;
                    	    case 21:
                    	        {
                    	        alt31=2;
                    	        }
                    	        break;
                    	    case 22:
                    	        {
                    	        alt31=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 31, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt31) {
                    	        case 1 :
                    	            // InternalBddDsl.g:886:6: otherlv_30= ','
                    	            {
                    	            otherlv_30=(Token)match(input,17,FOLLOW_3); 

                    	            						newLeafNode(otherlv_30, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_8_4_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalBddDsl.g:891:6: otherlv_31= 'and'
                    	            {
                    	            otherlv_31=(Token)match(input,21,FOLLOW_3); 

                    	            						newLeafNode(otherlv_31, grammarAccess.getImperativeEntityDefAccess().getAndKeyword_8_4_0_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalBddDsl.g:896:6: otherlv_32= 'the'
                    	            {
                    	            otherlv_32=(Token)match(input,22,FOLLOW_3); 

                    	            						newLeafNode(otherlv_32, grammarAccess.getImperativeEntityDefAccess().getTheKeyword_8_4_0_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalBddDsl.g:901:5: ( (lv_properties_33_0= ruleImperativePropertyDef ) )
                    	    // InternalBddDsl.g:902:6: (lv_properties_33_0= ruleImperativePropertyDef )
                    	    {
                    	    // InternalBddDsl.g:902:6: (lv_properties_33_0= ruleImperativePropertyDef )
                    	    // InternalBddDsl.g:903:7: lv_properties_33_0= ruleImperativePropertyDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getPropertiesImperativePropertyDefParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_properties_33_0=ruleImperativePropertyDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_33_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_34=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getImperativeEntityDefAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleImperativeEntityDef"


    // $ANTLR start "entryRuleImperativeActionDef"
    // InternalBddDsl.g:930:1: entryRuleImperativeActionDef returns [EObject current=null] : iv_ruleImperativeActionDef= ruleImperativeActionDef EOF ;
    public final EObject entryRuleImperativeActionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeActionDef = null;


        try {
            // InternalBddDsl.g:930:60: (iv_ruleImperativeActionDef= ruleImperativeActionDef EOF )
            // InternalBddDsl.g:931:2: iv_ruleImperativeActionDef= ruleImperativeActionDef EOF
            {
             newCompositeNode(grammarAccess.getImperativeActionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeActionDef=ruleImperativeActionDef();

            state._fsp--;

             current =iv_ruleImperativeActionDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeActionDef"


    // $ANTLR start "ruleImperativeActionDef"
    // InternalBddDsl.g:937:1: ruleImperativeActionDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? ) ;
    public final EObject ruleImperativeActionDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:943:2: ( ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? ) )
            // InternalBddDsl.g:944:2: ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? )
            {
            // InternalBddDsl.g:944:2: ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? )
            // InternalBddDsl.g:945:3: ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )?
            {
            // InternalBddDsl.g:945:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:946:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:946:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:947:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getImperativeActionDefAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeActionDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:964:3: ( ruleWORD )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBddDsl.g:965:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getImperativeActionDefAccess().getWORDParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleImperativeActionDef"


    // $ANTLR start "entryRuleActionDef"
    // InternalBddDsl.g:977:1: entryRuleActionDef returns [EObject current=null] : iv_ruleActionDef= ruleActionDef EOF ;
    public final EObject entryRuleActionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDef = null;


        try {
            // InternalBddDsl.g:977:50: (iv_ruleActionDef= ruleActionDef EOF )
            // InternalBddDsl.g:978:2: iv_ruleActionDef= ruleActionDef EOF
            {
             newCompositeNode(grammarAccess.getActionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDef=ruleActionDef();

            state._fsp--;

             current =iv_ruleActionDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionDef"


    // $ANTLR start "ruleActionDef"
    // InternalBddDsl.g:984:1: ruleActionDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? ) ;
    public final EObject ruleActionDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:990:2: ( ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? ) )
            // InternalBddDsl.g:991:2: ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? )
            {
            // InternalBddDsl.g:991:2: ( ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )? )
            // InternalBddDsl.g:992:3: ( (lv_name_0_0= ruleWORD ) ) ( ruleWORD )?
            {
            // InternalBddDsl.g:992:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:993:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:993:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:994:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getActionDefAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1011:3: ( ruleWORD )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBddDsl.g:1012:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getActionDefAccess().getWORDParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleActionDef"


    // $ANTLR start "entryRulePREP"
    // InternalBddDsl.g:1024:1: entryRulePREP returns [String current=null] : iv_rulePREP= rulePREP EOF ;
    public final String entryRulePREP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREP = null;


        try {
            // InternalBddDsl.g:1024:44: (iv_rulePREP= rulePREP EOF )
            // InternalBddDsl.g:1025:2: iv_rulePREP= rulePREP EOF
            {
             newCompositeNode(grammarAccess.getPREPRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePREP=rulePREP();

            state._fsp--;

             current =iv_rulePREP.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePREP"


    // $ANTLR start "rulePREP"
    // InternalBddDsl.g:1031:1: rulePREP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' ) ;
    public final AntlrDatatypeRuleToken rulePREP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1037:2: ( (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' ) )
            // InternalBddDsl.g:1038:2: (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' )
            {
            // InternalBddDsl.g:1038:2: (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' )
            int alt36=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt36=1;
                }
                break;
            case 27:
                {
                alt36=2;
                }
                break;
            case 28:
                {
                alt36=3;
                }
                break;
            case 29:
                {
                alt36=4;
                }
                break;
            case 30:
                {
                alt36=5;
                }
                break;
            case 31:
                {
                alt36=6;
                }
                break;
            case 32:
                {
                alt36=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalBddDsl.g:1039:3: kw= 'on'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getOnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1045:3: kw= 'in'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getInKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1051:3: kw= 'from'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getFromKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:1057:3: kw= 'to'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBddDsl.g:1063:3: kw= 'into'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getIntoKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBddDsl.g:1069:3: kw= 'for'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getForKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBddDsl.g:1075:3: kw= 'with'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getWithKeyword_6());
                    		

                    }
                    break;

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
    // $ANTLR end "rulePREP"


    // $ANTLR start "entryRuleADVERB"
    // InternalBddDsl.g:1084:1: entryRuleADVERB returns [String current=null] : iv_ruleADVERB= ruleADVERB EOF ;
    public final String entryRuleADVERB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADVERB = null;


        try {
            // InternalBddDsl.g:1084:46: (iv_ruleADVERB= ruleADVERB EOF )
            // InternalBddDsl.g:1085:2: iv_ruleADVERB= ruleADVERB EOF
            {
             newCompositeNode(grammarAccess.getADVERBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADVERB=ruleADVERB();

            state._fsp--;

             current =iv_ruleADVERB.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleADVERB"


    // $ANTLR start "ruleADVERB"
    // InternalBddDsl.g:1091:1: ruleADVERB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'linearly' ;
    public final AntlrDatatypeRuleToken ruleADVERB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1097:2: (kw= 'linearly' )
            // InternalBddDsl.g:1098:2: kw= 'linearly'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getADVERBAccess().getLinearlyKeyword());
            	

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
    // $ANTLR end "ruleADVERB"


    // $ANTLR start "entryRuleWORD"
    // InternalBddDsl.g:1106:1: entryRuleWORD returns [String current=null] : iv_ruleWORD= ruleWORD EOF ;
    public final String entryRuleWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWORD = null;


        try {
            // InternalBddDsl.g:1106:44: (iv_ruleWORD= ruleWORD EOF )
            // InternalBddDsl.g:1107:2: iv_ruleWORD= ruleWORD EOF
            {
             newCompositeNode(grammarAccess.getWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWORD=ruleWORD();

            state._fsp--;

             current =iv_ruleWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWORD"


    // $ANTLR start "ruleWORD"
    // InternalBddDsl.g:1113:1: ruleWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1119:2: (this_ID_0= RULE_ID )
            // InternalBddDsl.g:1120:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getWORDAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleWORD"


    // $ANTLR start "entryRuleStateDef"
    // InternalBddDsl.g:1130:1: entryRuleStateDef returns [EObject current=null] : iv_ruleStateDef= ruleStateDef EOF ;
    public final EObject entryRuleStateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDef = null;


        try {
            // InternalBddDsl.g:1130:49: (iv_ruleStateDef= ruleStateDef EOF )
            // InternalBddDsl.g:1131:2: iv_ruleStateDef= ruleStateDef EOF
            {
             newCompositeNode(grammarAccess.getStateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDef=ruleStateDef();

            state._fsp--;

             current =iv_ruleStateDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateDef"


    // $ANTLR start "ruleStateDef"
    // InternalBddDsl.g:1137:1: ruleStateDef returns [EObject current=null] : ( ( (lv_postive_0_0= ruleStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) ) )? ) ;
    public final EObject ruleStateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_postive_0_0 = null;

        EObject lv_negative_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1143:2: ( ( ( (lv_postive_0_0= ruleStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) ) )? ) )
            // InternalBddDsl.g:1144:2: ( ( (lv_postive_0_0= ruleStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) ) )? )
            {
            // InternalBddDsl.g:1144:2: ( ( (lv_postive_0_0= ruleStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) ) )? )
            // InternalBddDsl.g:1145:3: ( (lv_postive_0_0= ruleStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) ) )?
            {
            // InternalBddDsl.g:1145:3: ( (lv_postive_0_0= ruleStateName ) )
            // InternalBddDsl.g:1146:4: (lv_postive_0_0= ruleStateName )
            {
            // InternalBddDsl.g:1146:4: (lv_postive_0_0= ruleStateName )
            // InternalBddDsl.g:1147:5: lv_postive_0_0= ruleStateName
            {

            					newCompositeNode(grammarAccess.getStateDefAccess().getPostiveStateNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_postive_0_0=ruleStateName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDefRule());
            					}
            					set(
            						current,
            						"postive",
            						lv_postive_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.StateName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1164:3: ( rulePREP )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=26 && LA37_0<=32)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBddDsl.g:1165:4: rulePREP
                    {

                    				newCompositeNode(grammarAccess.getStateDefAccess().getPREPParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_19);
                    rulePREP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1173:3: (otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBddDsl.g:1174:4: otherlv_2= '/' ( (lv_negative_3_0= ruleStateName ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateDefAccess().getSolidusKeyword_2_0());
                    			
                    // InternalBddDsl.g:1178:4: ( (lv_negative_3_0= ruleStateName ) )
                    // InternalBddDsl.g:1179:5: (lv_negative_3_0= ruleStateName )
                    {
                    // InternalBddDsl.g:1179:5: (lv_negative_3_0= ruleStateName )
                    // InternalBddDsl.g:1180:6: lv_negative_3_0= ruleStateName
                    {

                    						newCompositeNode(grammarAccess.getStateDefAccess().getNegativeStateNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_negative_3_0=ruleStateName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateDefRule());
                    						}
                    						set(
                    							current,
                    							"negative",
                    							lv_negative_3_0,
                    							"dk.sdu.bdd.xtext.BddDsl.StateName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleStateDef"


    // $ANTLR start "entryRuleStateName"
    // InternalBddDsl.g:1202:1: entryRuleStateName returns [EObject current=null] : iv_ruleStateName= ruleStateName EOF ;
    public final EObject entryRuleStateName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateName = null;


        try {
            // InternalBddDsl.g:1202:50: (iv_ruleStateName= ruleStateName EOF )
            // InternalBddDsl.g:1203:2: iv_ruleStateName= ruleStateName EOF
            {
             newCompositeNode(grammarAccess.getStateNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateName=ruleStateName();

            state._fsp--;

             current =iv_ruleStateName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateName"


    // $ANTLR start "ruleStateName"
    // InternalBddDsl.g:1209:1: ruleStateName returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? ) ;
    public final EObject ruleStateName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1215:2: ( ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? ) )
            // InternalBddDsl.g:1216:2: ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? )
            {
            // InternalBddDsl.g:1216:2: ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? )
            // InternalBddDsl.g:1217:3: ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )?
            {
            // InternalBddDsl.g:1217:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:1218:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:1218:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:1219:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getStateNameAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1236:3: (otherlv_1= 'and' | otherlv_2= 'off' )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EOF||LA39_1==RULE_ID||LA39_1==17||(LA39_1>=21 && LA39_1<=24)||(LA39_1>=26 && LA39_1<=32)||LA39_1==34) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==35) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // InternalBddDsl.g:1237:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getStateNameAccess().getAndKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1242:4: otherlv_2= 'off'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateNameAccess().getOffKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1247:3: ( ruleWORD )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBddDsl.g:1248:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getStateNameAccess().getWORDParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleStateName"


    // $ANTLR start "entryRulePropertyDef"
    // InternalBddDsl.g:1260:1: entryRulePropertyDef returns [EObject current=null] : iv_rulePropertyDef= rulePropertyDef EOF ;
    public final EObject entryRulePropertyDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDef = null;


        try {
            // InternalBddDsl.g:1260:52: (iv_rulePropertyDef= rulePropertyDef EOF )
            // InternalBddDsl.g:1261:2: iv_rulePropertyDef= rulePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDef=rulePropertyDef();

            state._fsp--;

             current =iv_rulePropertyDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // InternalBddDsl.g:1267:1: rulePropertyDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? ) ;
    public final EObject rulePropertyDef() throws RecognitionException {
        EObject current = null;

        Token lv_plural_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1273:2: ( ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? ) )
            // InternalBddDsl.g:1274:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? )
            {
            // InternalBddDsl.g:1274:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? )
            // InternalBddDsl.g:1275:3: ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )?
            {
            // InternalBddDsl.g:1275:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:1276:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:1276:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:1277:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getPropertyDefAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1294:3: ( (lv_plural_1_0= '*' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBddDsl.g:1295:4: (lv_plural_1_0= '*' )
                    {
                    // InternalBddDsl.g:1295:4: (lv_plural_1_0= '*' )
                    // InternalBddDsl.g:1296:5: lv_plural_1_0= '*'
                    {
                    lv_plural_1_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_plural_1_0, grammarAccess.getPropertyDefAccess().getPluralAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyDefRule());
                    					}
                    					setWithLastConsumed(current, "plural", lv_plural_1_0 != null, "*");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleImperativeStateDef"
    // InternalBddDsl.g:1312:1: entryRuleImperativeStateDef returns [EObject current=null] : iv_ruleImperativeStateDef= ruleImperativeStateDef EOF ;
    public final EObject entryRuleImperativeStateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeStateDef = null;


        try {
            // InternalBddDsl.g:1312:59: (iv_ruleImperativeStateDef= ruleImperativeStateDef EOF )
            // InternalBddDsl.g:1313:2: iv_ruleImperativeStateDef= ruleImperativeStateDef EOF
            {
             newCompositeNode(grammarAccess.getImperativeStateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeStateDef=ruleImperativeStateDef();

            state._fsp--;

             current =iv_ruleImperativeStateDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeStateDef"


    // $ANTLR start "ruleImperativeStateDef"
    // InternalBddDsl.g:1319:1: ruleImperativeStateDef returns [EObject current=null] : ( ( (lv_postive_0_0= ruleImperativeStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) ) )? ) ;
    public final EObject ruleImperativeStateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_postive_0_0 = null;

        EObject lv_negative_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1325:2: ( ( ( (lv_postive_0_0= ruleImperativeStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) ) )? ) )
            // InternalBddDsl.g:1326:2: ( ( (lv_postive_0_0= ruleImperativeStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) ) )? )
            {
            // InternalBddDsl.g:1326:2: ( ( (lv_postive_0_0= ruleImperativeStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) ) )? )
            // InternalBddDsl.g:1327:3: ( (lv_postive_0_0= ruleImperativeStateName ) ) ( rulePREP )? (otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) ) )?
            {
            // InternalBddDsl.g:1327:3: ( (lv_postive_0_0= ruleImperativeStateName ) )
            // InternalBddDsl.g:1328:4: (lv_postive_0_0= ruleImperativeStateName )
            {
            // InternalBddDsl.g:1328:4: (lv_postive_0_0= ruleImperativeStateName )
            // InternalBddDsl.g:1329:5: lv_postive_0_0= ruleImperativeStateName
            {

            					newCompositeNode(grammarAccess.getImperativeStateDefAccess().getPostiveImperativeStateNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_postive_0_0=ruleImperativeStateName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeStateDefRule());
            					}
            					set(
            						current,
            						"postive",
            						lv_postive_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeStateName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1346:3: ( rulePREP )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=26 && LA42_0<=32)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBddDsl.g:1347:4: rulePREP
                    {

                    				newCompositeNode(grammarAccess.getImperativeStateDefAccess().getPREPParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_19);
                    rulePREP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1355:3: (otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBddDsl.g:1356:4: otherlv_2= '/' ( (lv_negative_3_0= ruleImperativeStateName ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getImperativeStateDefAccess().getSolidusKeyword_2_0());
                    			
                    // InternalBddDsl.g:1360:4: ( (lv_negative_3_0= ruleImperativeStateName ) )
                    // InternalBddDsl.g:1361:5: (lv_negative_3_0= ruleImperativeStateName )
                    {
                    // InternalBddDsl.g:1361:5: (lv_negative_3_0= ruleImperativeStateName )
                    // InternalBddDsl.g:1362:6: lv_negative_3_0= ruleImperativeStateName
                    {

                    						newCompositeNode(grammarAccess.getImperativeStateDefAccess().getNegativeImperativeStateNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_negative_3_0=ruleImperativeStateName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeStateDefRule());
                    						}
                    						set(
                    							current,
                    							"negative",
                    							lv_negative_3_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeStateName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleImperativeStateDef"


    // $ANTLR start "entryRuleImperativeStateName"
    // InternalBddDsl.g:1384:1: entryRuleImperativeStateName returns [EObject current=null] : iv_ruleImperativeStateName= ruleImperativeStateName EOF ;
    public final EObject entryRuleImperativeStateName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeStateName = null;


        try {
            // InternalBddDsl.g:1384:60: (iv_ruleImperativeStateName= ruleImperativeStateName EOF )
            // InternalBddDsl.g:1385:2: iv_ruleImperativeStateName= ruleImperativeStateName EOF
            {
             newCompositeNode(grammarAccess.getImperativeStateNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeStateName=ruleImperativeStateName();

            state._fsp--;

             current =iv_ruleImperativeStateName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeStateName"


    // $ANTLR start "ruleImperativeStateName"
    // InternalBddDsl.g:1391:1: ruleImperativeStateName returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? ) ;
    public final EObject ruleImperativeStateName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1397:2: ( ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? ) )
            // InternalBddDsl.g:1398:2: ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? )
            {
            // InternalBddDsl.g:1398:2: ( ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )? )
            // InternalBddDsl.g:1399:3: ( (lv_name_0_0= ruleWORD ) ) (otherlv_1= 'and' | otherlv_2= 'off' )? ( ruleWORD )?
            {
            // InternalBddDsl.g:1399:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:1400:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:1400:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:1401:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getImperativeStateNameAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeStateNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1418:3: (otherlv_1= 'and' | otherlv_2= 'off' )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF||LA44_1==RULE_ID||LA44_1==17||(LA44_1>=21 && LA44_1<=24)||(LA44_1>=26 && LA44_1<=32)||LA44_1==34) ) {
                    alt44=1;
                }
            }
            else if ( (LA44_0==35) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // InternalBddDsl.g:1419:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getImperativeStateNameAccess().getAndKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1424:4: otherlv_2= 'off'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getImperativeStateNameAccess().getOffKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1429:3: ( ruleWORD )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBddDsl.g:1430:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getImperativeStateNameAccess().getWORDParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleImperativeStateName"


    // $ANTLR start "entryRuleImperativePropertyDef"
    // InternalBddDsl.g:1442:1: entryRuleImperativePropertyDef returns [EObject current=null] : iv_ruleImperativePropertyDef= ruleImperativePropertyDef EOF ;
    public final EObject entryRuleImperativePropertyDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativePropertyDef = null;


        try {
            // InternalBddDsl.g:1442:62: (iv_ruleImperativePropertyDef= ruleImperativePropertyDef EOF )
            // InternalBddDsl.g:1443:2: iv_ruleImperativePropertyDef= ruleImperativePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getImperativePropertyDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativePropertyDef=ruleImperativePropertyDef();

            state._fsp--;

             current =iv_ruleImperativePropertyDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativePropertyDef"


    // $ANTLR start "ruleImperativePropertyDef"
    // InternalBddDsl.g:1449:1: ruleImperativePropertyDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? ) ;
    public final EObject ruleImperativePropertyDef() throws RecognitionException {
        EObject current = null;

        Token lv_plural_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1455:2: ( ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? ) )
            // InternalBddDsl.g:1456:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? )
            {
            // InternalBddDsl.g:1456:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? )
            // InternalBddDsl.g:1457:3: ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )?
            {
            // InternalBddDsl.g:1457:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:1458:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:1458:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:1459:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getImperativePropertyDefAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativePropertyDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1476:3: ( (lv_plural_1_0= '*' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBddDsl.g:1477:4: (lv_plural_1_0= '*' )
                    {
                    // InternalBddDsl.g:1477:4: (lv_plural_1_0= '*' )
                    // InternalBddDsl.g:1478:5: lv_plural_1_0= '*'
                    {
                    lv_plural_1_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_plural_1_0, grammarAccess.getImperativePropertyDefAccess().getPluralAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImperativePropertyDefRule());
                    					}
                    					setWithLastConsumed(current, "plural", lv_plural_1_0 != null, "*");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleImperativePropertyDef"


    // $ANTLR start "entryRuleID_OR_STRING"
    // InternalBddDsl.g:1494:1: entryRuleID_OR_STRING returns [String current=null] : iv_ruleID_OR_STRING= ruleID_OR_STRING EOF ;
    public final String entryRuleID_OR_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_OR_STRING = null;


        try {
            // InternalBddDsl.g:1494:52: (iv_ruleID_OR_STRING= ruleID_OR_STRING EOF )
            // InternalBddDsl.g:1495:2: iv_ruleID_OR_STRING= ruleID_OR_STRING EOF
            {
             newCompositeNode(grammarAccess.getID_OR_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID_OR_STRING=ruleID_OR_STRING();

            state._fsp--;

             current =iv_ruleID_OR_STRING.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleID_OR_STRING"


    // $ANTLR start "ruleID_OR_STRING"
    // InternalBddDsl.g:1501:1: ruleID_OR_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleID_OR_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1507:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalBddDsl.g:1508:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalBddDsl.g:1508:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_STRING) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalBddDsl.g:1509:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getID_OR_STRINGAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1517:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getID_OR_STRINGAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleID_OR_STRING"


    // $ANTLR start "entryRuleImperativeScenario"
    // InternalBddDsl.g:1528:1: entryRuleImperativeScenario returns [EObject current=null] : iv_ruleImperativeScenario= ruleImperativeScenario EOF ;
    public final EObject entryRuleImperativeScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenario = null;


        try {
            // InternalBddDsl.g:1528:59: (iv_ruleImperativeScenario= ruleImperativeScenario EOF )
            // InternalBddDsl.g:1529:2: iv_ruleImperativeScenario= ruleImperativeScenario EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenario=ruleImperativeScenario();

            state._fsp--;

             current =iv_ruleImperativeScenario; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeScenario"


    // $ANTLR start "ruleImperativeScenario"
    // InternalBddDsl.g:1535:1: ruleImperativeScenario returns [EObject current=null] : (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) ) ;
    public final EObject ruleImperativeScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_preState_3_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_postState_7_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1541:2: ( (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) ) )
            // InternalBddDsl.g:1542:2: (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) )
            {
            // InternalBddDsl.g:1542:2: (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) )
            // InternalBddDsl.g:1543:3: otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeScenarioAccess().getWhichKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getImperativeScenarioAccess().getMeansKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getImperativeScenarioAccess().getGivenKeyword_2());
            		
            // InternalBddDsl.g:1555:3: ( (lv_preState_3_0= ruleImperativeScenarioState ) )
            // InternalBddDsl.g:1556:4: (lv_preState_3_0= ruleImperativeScenarioState )
            {
            // InternalBddDsl.g:1556:4: (lv_preState_3_0= ruleImperativeScenarioState )
            // InternalBddDsl.g:1557:5: lv_preState_3_0= ruleImperativeScenarioState
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioAccess().getPreStateImperativeScenarioStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_preState_3_0=ruleImperativeScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioRule());
            					}
            					set(
            						current,
            						"preState",
            						lv_preState_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getImperativeScenarioAccess().getWhenKeyword_4());
            		
            // InternalBddDsl.g:1578:3: ( (lv_action_5_0= ruleImperativeScenarioAction ) )
            // InternalBddDsl.g:1579:4: (lv_action_5_0= ruleImperativeScenarioAction )
            {
            // InternalBddDsl.g:1579:4: (lv_action_5_0= ruleImperativeScenarioAction )
            // InternalBddDsl.g:1580:5: lv_action_5_0= ruleImperativeScenarioAction
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioAccess().getActionImperativeScenarioActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_action_5_0=ruleImperativeScenarioAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getImperativeScenarioAccess().getThenKeyword_6());
            		
            // InternalBddDsl.g:1601:3: ( (lv_postState_7_0= ruleImperativeScenarioState ) )
            // InternalBddDsl.g:1602:4: (lv_postState_7_0= ruleImperativeScenarioState )
            {
            // InternalBddDsl.g:1602:4: (lv_postState_7_0= ruleImperativeScenarioState )
            // InternalBddDsl.g:1603:5: lv_postState_7_0= ruleImperativeScenarioState
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioAccess().getPostStateImperativeScenarioStateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_postState_7_0=ruleImperativeScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioRule());
            					}
            					set(
            						current,
            						"postState",
            						lv_postState_7_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleImperativeScenario"


    // $ANTLR start "entryRuleScenario"
    // InternalBddDsl.g:1624:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalBddDsl.g:1624:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalBddDsl.g:1625:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalBddDsl.g:1631:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) ( ruleWORD )? (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )? ( ruleWORD )? (otherlv_13= 'off' | otherlv_14= 'on' | otherlv_15= 'in' | otherlv_16= '-' | otherlv_17= 'the' )? ( ruleWORD )? (otherlv_19= 'on' | otherlv_20= 'in' | otherlv_21= '-' | otherlv_22= 'the' )? ( ruleWORD )? (otherlv_24= 'in' | otherlv_25= '-' | otherlv_26= 'the' )? ( ruleWORD )? ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative1_44_0= ruleImperativeScenario ) )? ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) ) ( (lv_imperative2_67_0= ruleImperativeScenario ) )? ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative3_84_0= ruleImperativeScenario ) )? ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_preStateE_43_0 = null;

        EObject lv_imperative1_44_0 = null;

        EObject lv_actionE_66_0 = null;

        EObject lv_imperative2_67_0 = null;

        EObject lv_preStateE1_83_0 = null;

        EObject lv_imperative3_84_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1637:2: ( (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) ( ruleWORD )? (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )? ( ruleWORD )? (otherlv_13= 'off' | otherlv_14= 'on' | otherlv_15= 'in' | otherlv_16= '-' | otherlv_17= 'the' )? ( ruleWORD )? (otherlv_19= 'on' | otherlv_20= 'in' | otherlv_21= '-' | otherlv_22= 'the' )? ( ruleWORD )? (otherlv_24= 'in' | otherlv_25= '-' | otherlv_26= 'the' )? ( ruleWORD )? ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative1_44_0= ruleImperativeScenario ) )? ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) ) ( (lv_imperative2_67_0= ruleImperativeScenario ) )? ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative3_84_0= ruleImperativeScenario ) )? ) )
            // InternalBddDsl.g:1638:2: (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) ( ruleWORD )? (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )? ( ruleWORD )? (otherlv_13= 'off' | otherlv_14= 'on' | otherlv_15= 'in' | otherlv_16= '-' | otherlv_17= 'the' )? ( ruleWORD )? (otherlv_19= 'on' | otherlv_20= 'in' | otherlv_21= '-' | otherlv_22= 'the' )? ( ruleWORD )? (otherlv_24= 'in' | otherlv_25= '-' | otherlv_26= 'the' )? ( ruleWORD )? ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative1_44_0= ruleImperativeScenario ) )? ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) ) ( (lv_imperative2_67_0= ruleImperativeScenario ) )? ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative3_84_0= ruleImperativeScenario ) )? )
            {
            // InternalBddDsl.g:1638:2: (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) ( ruleWORD )? (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )? ( ruleWORD )? (otherlv_13= 'off' | otherlv_14= 'on' | otherlv_15= 'in' | otherlv_16= '-' | otherlv_17= 'the' )? ( ruleWORD )? (otherlv_19= 'on' | otherlv_20= 'in' | otherlv_21= '-' | otherlv_22= 'the' )? ( ruleWORD )? (otherlv_24= 'in' | otherlv_25= '-' | otherlv_26= 'the' )? ( ruleWORD )? ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative1_44_0= ruleImperativeScenario ) )? ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) ) ( (lv_imperative2_67_0= ruleImperativeScenario ) )? ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative3_84_0= ruleImperativeScenario ) )? )
            // InternalBddDsl.g:1639:3: otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) ( ruleWORD )? (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )? ( ruleWORD )? (otherlv_13= 'off' | otherlv_14= 'on' | otherlv_15= 'in' | otherlv_16= '-' | otherlv_17= 'the' )? ( ruleWORD )? (otherlv_19= 'on' | otherlv_20= 'in' | otherlv_21= '-' | otherlv_22= 'the' )? ( ruleWORD )? (otherlv_24= 'in' | otherlv_25= '-' | otherlv_26= 'the' )? ( ruleWORD )? ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative1_44_0= ruleImperativeScenario ) )? ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) ) ( (lv_imperative2_67_0= ruleImperativeScenario ) )? ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) ) ( (lv_imperative3_84_0= ruleImperativeScenario ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalBddDsl.g:1643:3: ( (lv_name_1_0= ruleID_OR_STRING ) )
            // InternalBddDsl.g:1644:4: (lv_name_1_0= ruleID_OR_STRING )
            {
            // InternalBddDsl.g:1644:4: (lv_name_1_0= ruleID_OR_STRING )
            // InternalBddDsl.g:1645:5: lv_name_1_0= ruleID_OR_STRING
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameID_OR_STRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_1_0=ruleID_OR_STRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.ID_OR_STRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1662:3: ( ruleWORD )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBddDsl.g:1663:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getScenarioAccess().getWORDParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_27);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1671:3: (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )?
            int alt49=9;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalBddDsl.g:1672:4: otherlv_3= 'out'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getOutKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1677:4: otherlv_4= 'off'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getOffKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1682:4: otherlv_5= 'on'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getOnKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:1687:4: otherlv_6= 'in'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getInKeyword_3_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalBddDsl.g:1692:4: otherlv_7= '-'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_3_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalBddDsl.g:1697:4: otherlv_8= 'the'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getTheKeyword_3_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalBddDsl.g:1702:4: (otherlv_9= 'to' otherlv_10= 'the' )
                    {
                    // InternalBddDsl.g:1702:4: (otherlv_9= 'to' otherlv_10= 'the' )
                    // InternalBddDsl.g:1703:5: otherlv_9= 'to' otherlv_10= 'the'
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_24); 

                    					newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getToKeyword_3_6_0());
                    				
                    otherlv_10=(Token)match(input,22,FOLLOW_28); 

                    					newLeafNode(otherlv_10, grammarAccess.getScenarioAccess().getTheKeyword_3_6_1());
                    				

                    }


                    }
                    break;
                case 8 :
                    // InternalBddDsl.g:1713:4: otherlv_11= 'to'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getScenarioAccess().getToKeyword_3_7());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1718:3: ( ruleWORD )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBddDsl.g:1719:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getScenarioAccess().getWORDParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_28);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1727:3: (otherlv_13= 'off' | otherlv_14= 'on' | otherlv_15= 'in' | otherlv_16= '-' | otherlv_17= 'the' )?
            int alt51=6;
            switch ( input.LA(1) ) {
                case 35:
                    {
                    alt51=1;
                    }
                    break;
                case 26:
                    {
                    alt51=2;
                    }
                    break;
                case 27:
                    {
                    alt51=3;
                    }
                    break;
                case 15:
                    {
                    alt51=4;
                    }
                    break;
                case 22:
                    {
                    alt51=5;
                    }
                    break;
            }

            switch (alt51) {
                case 1 :
                    // InternalBddDsl.g:1728:4: otherlv_13= 'off'
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getScenarioAccess().getOffKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1733:4: otherlv_14= 'on'
                    {
                    otherlv_14=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getScenarioAccess().getOnKeyword_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1738:4: otherlv_15= 'in'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getScenarioAccess().getInKeyword_5_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:1743:4: otherlv_16= '-'
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_5_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalBddDsl.g:1748:4: otherlv_17= 'the'
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getScenarioAccess().getTheKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1753:3: ( ruleWORD )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBddDsl.g:1754:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getScenarioAccess().getWORDParserRuleCall_6());
                    			
                    pushFollow(FOLLOW_29);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1762:3: (otherlv_19= 'on' | otherlv_20= 'in' | otherlv_21= '-' | otherlv_22= 'the' )?
            int alt53=5;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt53=1;
                    }
                    break;
                case 27:
                    {
                    alt53=2;
                    }
                    break;
                case 15:
                    {
                    alt53=3;
                    }
                    break;
                case 22:
                    {
                    alt53=4;
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // InternalBddDsl.g:1763:4: otherlv_19= 'on'
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getScenarioAccess().getOnKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1768:4: otherlv_20= 'in'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_30); 

                    				newLeafNode(otherlv_20, grammarAccess.getScenarioAccess().getInKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1773:4: otherlv_21= '-'
                    {
                    otherlv_21=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_21, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_7_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:1778:4: otherlv_22= 'the'
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getScenarioAccess().getTheKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1783:3: ( ruleWORD )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBddDsl.g:1784:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getScenarioAccess().getWORDParserRuleCall_8());
                    			
                    pushFollow(FOLLOW_30);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1792:3: (otherlv_24= 'in' | otherlv_25= '-' | otherlv_26= 'the' )?
            int alt55=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt55=1;
                    }
                    break;
                case 15:
                    {
                    alt55=2;
                    }
                    break;
                case 22:
                    {
                    alt55=3;
                    }
                    break;
            }

            switch (alt55) {
                case 1 :
                    // InternalBddDsl.g:1793:4: otherlv_24= 'in'
                    {
                    otherlv_24=(Token)match(input,27,FOLLOW_31); 

                    				newLeafNode(otherlv_24, grammarAccess.getScenarioAccess().getInKeyword_9_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1798:4: otherlv_25= '-'
                    {
                    otherlv_25=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getScenarioAccess().getHyphenMinusKeyword_9_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1803:4: otherlv_26= 'the'
                    {
                    otherlv_26=(Token)match(input,22,FOLLOW_31); 

                    				newLeafNode(otherlv_26, grammarAccess.getScenarioAccess().getTheKeyword_9_2());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1808:3: ( ruleWORD )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBddDsl.g:1809:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getScenarioAccess().getWORDParserRuleCall_10());
                    			
                    pushFollow(FOLLOW_23);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1817:3: ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalBddDsl.g:1818:4: ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION )
                    {
                    // InternalBddDsl.g:1818:4: ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION )
                    // InternalBddDsl.g:1819:5: ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION
                    {
                    // InternalBddDsl.g:1819:5: ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' )
                    int alt57=3;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==39) ) {
                        switch ( input.LA(2) ) {
                        case 22:
                            {
                            alt57=1;
                            }
                            break;
                        case RULE_STRING:
                        case RULE_INT:
                        case 45:
                        case 49:
                            {
                            alt57=3;
                            }
                            break;
                        case 44:
                            {
                            alt57=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 1, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalBddDsl.g:1820:6: (otherlv_28= 'Given' otherlv_29= 'the' )
                            {
                            // InternalBddDsl.g:1820:6: (otherlv_28= 'Given' otherlv_29= 'the' )
                            // InternalBddDsl.g:1821:7: otherlv_28= 'Given' otherlv_29= 'the'
                            {
                            otherlv_28=(Token)match(input,39,FOLLOW_24); 

                            							newLeafNode(otherlv_28, grammarAccess.getScenarioAccess().getGivenKeyword_11_0_0_0_0());
                            						
                            otherlv_29=(Token)match(input,22,FOLLOW_32); 

                            							newLeafNode(otherlv_29, grammarAccess.getScenarioAccess().getTheKeyword_11_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:1831:6: (otherlv_30= 'Given' otherlv_31= 'I' )
                            {
                            // InternalBddDsl.g:1831:6: (otherlv_30= 'Given' otherlv_31= 'I' )
                            // InternalBddDsl.g:1832:7: otherlv_30= 'Given' otherlv_31= 'I'
                            {
                            otherlv_30=(Token)match(input,39,FOLLOW_33); 

                            							newLeafNode(otherlv_30, grammarAccess.getScenarioAccess().getGivenKeyword_11_0_0_1_0());
                            						
                            otherlv_31=(Token)match(input,44,FOLLOW_32); 

                            							newLeafNode(otherlv_31, grammarAccess.getScenarioAccess().getIKeyword_11_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:1842:6: otherlv_32= 'Given'
                            {
                            otherlv_32=(Token)match(input,39,FOLLOW_32); 

                            						newLeafNode(otherlv_32, grammarAccess.getScenarioAccess().getGivenKeyword_11_0_0_2());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:1847:5: (otherlv_33= 'do' otherlv_34= 'not' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==45) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalBddDsl.g:1848:6: otherlv_33= 'do' otherlv_34= 'not'
                            {
                            otherlv_33=(Token)match(input,45,FOLLOW_34); 

                            						newLeafNode(otherlv_33, grammarAccess.getScenarioAccess().getDoKeyword_11_0_1_0());
                            					
                            otherlv_34=(Token)match(input,46,FOLLOW_32); 

                            						newLeafNode(otherlv_34, grammarAccess.getScenarioAccess().getNotKeyword_11_0_1_1());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getScenarioAccess().getOPTIONParserRuleCall_11_0_2());
                    				
                    pushFollow(FOLLOW_35);
                    ruleOPTION();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1866:4: (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) )
                    {
                    // InternalBddDsl.g:1866:4: (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) )
                    // InternalBddDsl.g:1867:5: otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) )
                    {
                    otherlv_36=(Token)match(input,39,FOLLOW_36); 

                    					newLeafNode(otherlv_36, grammarAccess.getScenarioAccess().getGivenKeyword_11_1_0());
                    				
                    // InternalBddDsl.g:1871:5: (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )?
                    int alt59=4;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // InternalBddDsl.g:1872:6: otherlv_37= 'the'
                            {
                            otherlv_37=(Token)match(input,22,FOLLOW_36); 

                            						newLeafNode(otherlv_37, grammarAccess.getScenarioAccess().getTheKeyword_11_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:1877:6: (otherlv_38= 'all' otherlv_39= 'the' )
                            {
                            // InternalBddDsl.g:1877:6: (otherlv_38= 'all' otherlv_39= 'the' )
                            // InternalBddDsl.g:1878:7: otherlv_38= 'all' otherlv_39= 'the'
                            {
                            otherlv_38=(Token)match(input,47,FOLLOW_24); 

                            							newLeafNode(otherlv_38, grammarAccess.getScenarioAccess().getAllKeyword_11_1_1_1_0());
                            						
                            otherlv_39=(Token)match(input,22,FOLLOW_36); 

                            							newLeafNode(otherlv_39, grammarAccess.getScenarioAccess().getTheKeyword_11_1_1_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:1888:6: otherlv_40= 'I'
                            {
                            otherlv_40=(Token)match(input,44,FOLLOW_36); 

                            						newLeafNode(otherlv_40, grammarAccess.getScenarioAccess().getIKeyword_11_1_1_2());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:1893:5: (otherlv_41= 'do' otherlv_42= 'not' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==45) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalBddDsl.g:1894:6: otherlv_41= 'do' otherlv_42= 'not'
                            {
                            otherlv_41=(Token)match(input,45,FOLLOW_34); 

                            						newLeafNode(otherlv_41, grammarAccess.getScenarioAccess().getDoKeyword_11_1_2_0());
                            					
                            otherlv_42=(Token)match(input,46,FOLLOW_36); 

                            						newLeafNode(otherlv_42, grammarAccess.getScenarioAccess().getNotKeyword_11_1_2_1());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:1903:5: ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) )
                    // InternalBddDsl.g:1904:6: (lv_preStateE_43_0= ruleDeclarativeScenarioState )
                    {
                    // InternalBddDsl.g:1904:6: (lv_preStateE_43_0= ruleDeclarativeScenarioState )
                    // InternalBddDsl.g:1905:7: lv_preStateE_43_0= ruleDeclarativeScenarioState
                    {

                    							newCompositeNode(grammarAccess.getScenarioAccess().getPreStateEDeclarativeScenarioStateParserRuleCall_11_1_3_0());
                    						
                    pushFollow(FOLLOW_35);
                    lv_preStateE_43_0=ruleDeclarativeScenarioState();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    							}
                    							set(
                    								current,
                    								"preStateE",
                    								lv_preStateE_43_0,
                    								"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioState");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBddDsl.g:1924:3: ( (lv_imperative1_44_0= ruleImperativeScenario ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBddDsl.g:1925:4: (lv_imperative1_44_0= ruleImperativeScenario )
                    {
                    // InternalBddDsl.g:1925:4: (lv_imperative1_44_0= ruleImperativeScenario )
                    // InternalBddDsl.g:1926:5: lv_imperative1_44_0= ruleImperativeScenario
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getImperative1ImperativeScenarioParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_imperative1_44_0=ruleImperativeScenario();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"imperative1",
                    						lv_imperative1_44_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenario");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:1943:3: ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) )
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // InternalBddDsl.g:1944:4: ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION )
                    {
                    // InternalBddDsl.g:1944:4: ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION )
                    // InternalBddDsl.g:1945:5: ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION
                    {
                    // InternalBddDsl.g:1945:5: ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) )
                    int alt63=4;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==40) ) {
                        switch ( input.LA(2) ) {
                        case 22:
                            {
                            alt63=2;
                            }
                            break;
                        case 44:
                            {
                            alt63=1;
                            }
                            break;
                        case RULE_STRING:
                        case RULE_INT:
                        case 45:
                        case 49:
                            {
                            alt63=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 1, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA63_0==48) ) {
                        alt63=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalBddDsl.g:1946:6: (otherlv_45= 'When' otherlv_46= 'I' )
                            {
                            // InternalBddDsl.g:1946:6: (otherlv_45= 'When' otherlv_46= 'I' )
                            // InternalBddDsl.g:1947:7: otherlv_45= 'When' otherlv_46= 'I'
                            {
                            otherlv_45=(Token)match(input,40,FOLLOW_33); 

                            							newLeafNode(otherlv_45, grammarAccess.getScenarioAccess().getWhenKeyword_13_0_0_0_0());
                            						
                            otherlv_46=(Token)match(input,44,FOLLOW_32); 

                            							newLeafNode(otherlv_46, grammarAccess.getScenarioAccess().getIKeyword_13_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:1957:6: (otherlv_47= 'When' otherlv_48= 'the' )
                            {
                            // InternalBddDsl.g:1957:6: (otherlv_47= 'When' otherlv_48= 'the' )
                            // InternalBddDsl.g:1958:7: otherlv_47= 'When' otherlv_48= 'the'
                            {
                            otherlv_47=(Token)match(input,40,FOLLOW_24); 

                            							newLeafNode(otherlv_47, grammarAccess.getScenarioAccess().getWhenKeyword_13_0_0_1_0());
                            						
                            otherlv_48=(Token)match(input,22,FOLLOW_32); 

                            							newLeafNode(otherlv_48, grammarAccess.getScenarioAccess().getTheKeyword_13_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:1968:6: otherlv_49= 'When'
                            {
                            otherlv_49=(Token)match(input,40,FOLLOW_32); 

                            						newLeafNode(otherlv_49, grammarAccess.getScenarioAccess().getWhenKeyword_13_0_0_2());
                            					

                            }
                            break;
                        case 4 :
                            // InternalBddDsl.g:1973:6: (otherlv_50= 'And' otherlv_51= 'I' )
                            {
                            // InternalBddDsl.g:1973:6: (otherlv_50= 'And' otherlv_51= 'I' )
                            // InternalBddDsl.g:1974:7: otherlv_50= 'And' otherlv_51= 'I'
                            {
                            otherlv_50=(Token)match(input,48,FOLLOW_33); 

                            							newLeafNode(otherlv_50, grammarAccess.getScenarioAccess().getAndKeyword_13_0_0_3_0());
                            						
                            otherlv_51=(Token)match(input,44,FOLLOW_32); 

                            							newLeafNode(otherlv_51, grammarAccess.getScenarioAccess().getIKeyword_13_0_0_3_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalBddDsl.g:1984:5: (otherlv_52= 'do' otherlv_53= 'not' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==45) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalBddDsl.g:1985:6: otherlv_52= 'do' otherlv_53= 'not'
                            {
                            otherlv_52=(Token)match(input,45,FOLLOW_34); 

                            						newLeafNode(otherlv_52, grammarAccess.getScenarioAccess().getDoKeyword_13_0_1_0());
                            					
                            otherlv_53=(Token)match(input,46,FOLLOW_32); 

                            						newLeafNode(otherlv_53, grammarAccess.getScenarioAccess().getNotKeyword_13_0_1_1());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getScenarioAccess().getOPTIONParserRuleCall_13_0_2());
                    				
                    pushFollow(FOLLOW_38);
                    ruleOPTION();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2003:4: ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) )
                    {
                    // InternalBddDsl.g:2003:4: ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) )
                    // InternalBddDsl.g:2004:5: ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) )
                    {
                    // InternalBddDsl.g:2004:5: ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' )
                    int alt65=5;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // InternalBddDsl.g:2005:6: (otherlv_55= 'When' otherlv_56= 'I' )
                            {
                            // InternalBddDsl.g:2005:6: (otherlv_55= 'When' otherlv_56= 'I' )
                            // InternalBddDsl.g:2006:7: otherlv_55= 'When' otherlv_56= 'I'
                            {
                            otherlv_55=(Token)match(input,40,FOLLOW_33); 

                            							newLeafNode(otherlv_55, grammarAccess.getScenarioAccess().getWhenKeyword_13_1_0_0_0());
                            						
                            otherlv_56=(Token)match(input,44,FOLLOW_36); 

                            							newLeafNode(otherlv_56, grammarAccess.getScenarioAccess().getIKeyword_13_1_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2016:6: (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' )
                            {
                            // InternalBddDsl.g:2016:6: (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' )
                            // InternalBddDsl.g:2017:7: otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not'
                            {
                            otherlv_57=(Token)match(input,40,FOLLOW_33); 

                            							newLeafNode(otherlv_57, grammarAccess.getScenarioAccess().getWhenKeyword_13_1_0_1_0());
                            						
                            otherlv_58=(Token)match(input,44,FOLLOW_39); 

                            							newLeafNode(otherlv_58, grammarAccess.getScenarioAccess().getIKeyword_13_1_0_1_1());
                            						
                            otherlv_59=(Token)match(input,45,FOLLOW_34); 

                            							newLeafNode(otherlv_59, grammarAccess.getScenarioAccess().getDoKeyword_13_1_0_1_2());
                            						
                            otherlv_60=(Token)match(input,46,FOLLOW_36); 

                            							newLeafNode(otherlv_60, grammarAccess.getScenarioAccess().getNotKeyword_13_1_0_1_3());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:2035:6: (otherlv_61= 'When' otherlv_62= 'the' )
                            {
                            // InternalBddDsl.g:2035:6: (otherlv_61= 'When' otherlv_62= 'the' )
                            // InternalBddDsl.g:2036:7: otherlv_61= 'When' otherlv_62= 'the'
                            {
                            otherlv_61=(Token)match(input,40,FOLLOW_24); 

                            							newLeafNode(otherlv_61, grammarAccess.getScenarioAccess().getWhenKeyword_13_1_0_2_0());
                            						
                            otherlv_62=(Token)match(input,22,FOLLOW_36); 

                            							newLeafNode(otherlv_62, grammarAccess.getScenarioAccess().getTheKeyword_13_1_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalBddDsl.g:2046:6: (otherlv_63= 'Given' otherlv_64= 'I' )
                            {
                            // InternalBddDsl.g:2046:6: (otherlv_63= 'Given' otherlv_64= 'I' )
                            // InternalBddDsl.g:2047:7: otherlv_63= 'Given' otherlv_64= 'I'
                            {
                            otherlv_63=(Token)match(input,39,FOLLOW_33); 

                            							newLeafNode(otherlv_63, grammarAccess.getScenarioAccess().getGivenKeyword_13_1_0_3_0());
                            						
                            otherlv_64=(Token)match(input,44,FOLLOW_36); 

                            							newLeafNode(otherlv_64, grammarAccess.getScenarioAccess().getIKeyword_13_1_0_3_1());
                            						

                            }


                            }
                            break;
                        case 5 :
                            // InternalBddDsl.g:2057:6: otherlv_65= 'When'
                            {
                            otherlv_65=(Token)match(input,40,FOLLOW_36); 

                            						newLeafNode(otherlv_65, grammarAccess.getScenarioAccess().getWhenKeyword_13_1_0_4());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:2062:5: ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) )
                    // InternalBddDsl.g:2063:6: (lv_actionE_66_0= ruleDeclarativeScenarioAction )
                    {
                    // InternalBddDsl.g:2063:6: (lv_actionE_66_0= ruleDeclarativeScenarioAction )
                    // InternalBddDsl.g:2064:7: lv_actionE_66_0= ruleDeclarativeScenarioAction
                    {

                    							newCompositeNode(grammarAccess.getScenarioAccess().getActionEDeclarativeScenarioActionParserRuleCall_13_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_actionE_66_0=ruleDeclarativeScenarioAction();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    							}
                    							set(
                    								current,
                    								"actionE",
                    								lv_actionE_66_0,
                    								"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioAction");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBddDsl.g:2083:3: ( (lv_imperative2_67_0= ruleImperativeScenario ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==37) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBddDsl.g:2084:4: (lv_imperative2_67_0= ruleImperativeScenario )
                    {
                    // InternalBddDsl.g:2084:4: (lv_imperative2_67_0= ruleImperativeScenario )
                    // InternalBddDsl.g:2085:5: lv_imperative2_67_0= ruleImperativeScenario
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getImperative2ImperativeScenarioParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_imperative2_67_0=ruleImperativeScenario();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"imperative2",
                    						lv_imperative2_67_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenario");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:2102:3: ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalBddDsl.g:2103:4: ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION )
                    {
                    // InternalBddDsl.g:2103:4: ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION )
                    // InternalBddDsl.g:2104:5: ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION
                    {
                    // InternalBddDsl.g:2104:5: ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' )
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==41) ) {
                        switch ( input.LA(2) ) {
                        case RULE_STRING:
                        case RULE_INT:
                        case 45:
                        case 49:
                            {
                            alt68=3;
                            }
                            break;
                        case 44:
                            {
                            alt68=2;
                            }
                            break;
                        case 22:
                            {
                            alt68=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 68, 1, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalBddDsl.g:2105:6: (otherlv_68= 'Then' otherlv_69= 'the' )
                            {
                            // InternalBddDsl.g:2105:6: (otherlv_68= 'Then' otherlv_69= 'the' )
                            // InternalBddDsl.g:2106:7: otherlv_68= 'Then' otherlv_69= 'the'
                            {
                            otherlv_68=(Token)match(input,41,FOLLOW_24); 

                            							newLeafNode(otherlv_68, grammarAccess.getScenarioAccess().getThenKeyword_15_0_0_0_0());
                            						
                            otherlv_69=(Token)match(input,22,FOLLOW_32); 

                            							newLeafNode(otherlv_69, grammarAccess.getScenarioAccess().getTheKeyword_15_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2116:6: (otherlv_70= 'Then' otherlv_71= 'I' )
                            {
                            // InternalBddDsl.g:2116:6: (otherlv_70= 'Then' otherlv_71= 'I' )
                            // InternalBddDsl.g:2117:7: otherlv_70= 'Then' otherlv_71= 'I'
                            {
                            otherlv_70=(Token)match(input,41,FOLLOW_33); 

                            							newLeafNode(otherlv_70, grammarAccess.getScenarioAccess().getThenKeyword_15_0_0_1_0());
                            						
                            otherlv_71=(Token)match(input,44,FOLLOW_32); 

                            							newLeafNode(otherlv_71, grammarAccess.getScenarioAccess().getIKeyword_15_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:2127:6: otherlv_72= 'Then'
                            {
                            otherlv_72=(Token)match(input,41,FOLLOW_32); 

                            						newLeafNode(otherlv_72, grammarAccess.getScenarioAccess().getThenKeyword_15_0_0_2());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:2132:5: (otherlv_73= 'do' otherlv_74= 'not' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==45) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalBddDsl.g:2133:6: otherlv_73= 'do' otherlv_74= 'not'
                            {
                            otherlv_73=(Token)match(input,45,FOLLOW_34); 

                            						newLeafNode(otherlv_73, grammarAccess.getScenarioAccess().getDoKeyword_15_0_1_0());
                            					
                            otherlv_74=(Token)match(input,46,FOLLOW_32); 

                            						newLeafNode(otherlv_74, grammarAccess.getScenarioAccess().getNotKeyword_15_0_1_1());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getScenarioAccess().getOPTIONParserRuleCall_15_0_2());
                    				
                    pushFollow(FOLLOW_40);
                    ruleOPTION();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2151:4: (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) )
                    {
                    // InternalBddDsl.g:2151:4: (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) )
                    // InternalBddDsl.g:2152:5: otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) )
                    {
                    otherlv_76=(Token)match(input,41,FOLLOW_36); 

                    					newLeafNode(otherlv_76, grammarAccess.getScenarioAccess().getThenKeyword_15_1_0());
                    				
                    // InternalBddDsl.g:2156:5: (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )?
                    int alt70=4;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // InternalBddDsl.g:2157:6: otherlv_77= 'the'
                            {
                            otherlv_77=(Token)match(input,22,FOLLOW_36); 

                            						newLeafNode(otherlv_77, grammarAccess.getScenarioAccess().getTheKeyword_15_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2162:6: (otherlv_78= 'all' otherlv_79= 'the' )
                            {
                            // InternalBddDsl.g:2162:6: (otherlv_78= 'all' otherlv_79= 'the' )
                            // InternalBddDsl.g:2163:7: otherlv_78= 'all' otherlv_79= 'the'
                            {
                            otherlv_78=(Token)match(input,47,FOLLOW_24); 

                            							newLeafNode(otherlv_78, grammarAccess.getScenarioAccess().getAllKeyword_15_1_1_1_0());
                            						
                            otherlv_79=(Token)match(input,22,FOLLOW_36); 

                            							newLeafNode(otherlv_79, grammarAccess.getScenarioAccess().getTheKeyword_15_1_1_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:2173:6: otherlv_80= 'I'
                            {
                            otherlv_80=(Token)match(input,44,FOLLOW_36); 

                            						newLeafNode(otherlv_80, grammarAccess.getScenarioAccess().getIKeyword_15_1_1_2());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:2178:5: (otherlv_81= 'do' otherlv_82= 'not' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==45) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalBddDsl.g:2179:6: otherlv_81= 'do' otherlv_82= 'not'
                            {
                            otherlv_81=(Token)match(input,45,FOLLOW_34); 

                            						newLeafNode(otherlv_81, grammarAccess.getScenarioAccess().getDoKeyword_15_1_2_0());
                            					
                            otherlv_82=(Token)match(input,46,FOLLOW_36); 

                            						newLeafNode(otherlv_82, grammarAccess.getScenarioAccess().getNotKeyword_15_1_2_1());
                            					

                            }
                            break;

                    }

                    // InternalBddDsl.g:2188:5: ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) )
                    // InternalBddDsl.g:2189:6: (lv_preStateE1_83_0= ruleDeclarativeScenarioState )
                    {
                    // InternalBddDsl.g:2189:6: (lv_preStateE1_83_0= ruleDeclarativeScenarioState )
                    // InternalBddDsl.g:2190:7: lv_preStateE1_83_0= ruleDeclarativeScenarioState
                    {

                    							newCompositeNode(grammarAccess.getScenarioAccess().getPreStateE1DeclarativeScenarioStateParserRuleCall_15_1_3_0());
                    						
                    pushFollow(FOLLOW_40);
                    lv_preStateE1_83_0=ruleDeclarativeScenarioState();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    							}
                    							set(
                    								current,
                    								"preStateE1",
                    								lv_preStateE1_83_0,
                    								"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioState");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBddDsl.g:2209:3: ( (lv_imperative3_84_0= ruleImperativeScenario ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==37) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalBddDsl.g:2210:4: (lv_imperative3_84_0= ruleImperativeScenario )
                    {
                    // InternalBddDsl.g:2210:4: (lv_imperative3_84_0= ruleImperativeScenario )
                    // InternalBddDsl.g:2211:5: lv_imperative3_84_0= ruleImperativeScenario
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getImperative3ImperativeScenarioParserRuleCall_16_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_imperative3_84_0=ruleImperativeScenario();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"imperative3",
                    						lv_imperative3_84_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenario");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleDeclarativeScenarioState"
    // InternalBddDsl.g:2232:1: entryRuleDeclarativeScenarioState returns [EObject current=null] : iv_ruleDeclarativeScenarioState= ruleDeclarativeScenarioState EOF ;
    public final EObject entryRuleDeclarativeScenarioState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeScenarioState = null;


        try {
            // InternalBddDsl.g:2232:65: (iv_ruleDeclarativeScenarioState= ruleDeclarativeScenarioState EOF )
            // InternalBddDsl.g:2233:2: iv_ruleDeclarativeScenarioState= ruleDeclarativeScenarioState EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeScenarioStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeScenarioState=ruleDeclarativeScenarioState();

            state._fsp--;

             current =iv_ruleDeclarativeScenarioState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeScenarioState"


    // $ANTLR start "ruleDeclarativeScenarioState"
    // InternalBddDsl.g:2239:1: ruleDeclarativeScenarioState returns [EObject current=null] : ( (lv_states_0_0= ruleDeclarativeStatePhrase ) ) ;
    public final EObject ruleDeclarativeScenarioState() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2245:2: ( ( (lv_states_0_0= ruleDeclarativeStatePhrase ) ) )
            // InternalBddDsl.g:2246:2: ( (lv_states_0_0= ruleDeclarativeStatePhrase ) )
            {
            // InternalBddDsl.g:2246:2: ( (lv_states_0_0= ruleDeclarativeStatePhrase ) )
            // InternalBddDsl.g:2247:3: (lv_states_0_0= ruleDeclarativeStatePhrase )
            {
            // InternalBddDsl.g:2247:3: (lv_states_0_0= ruleDeclarativeStatePhrase )
            // InternalBddDsl.g:2248:4: lv_states_0_0= ruleDeclarativeStatePhrase
            {

            				newCompositeNode(grammarAccess.getDeclarativeScenarioStateAccess().getStatesDeclarativeStatePhraseParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_states_0_0=ruleDeclarativeStatePhrase();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateRule());
            				}
            				set(
            					current,
            					"states",
            					lv_states_0_0,
            					"dk.sdu.bdd.xtext.BddDsl.DeclarativeStatePhrase");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDeclarativeScenarioState"


    // $ANTLR start "entryRuleImperativeScenarioState"
    // InternalBddDsl.g:2268:1: entryRuleImperativeScenarioState returns [EObject current=null] : iv_ruleImperativeScenarioState= ruleImperativeScenarioState EOF ;
    public final EObject entryRuleImperativeScenarioState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenarioState = null;


        try {
            // InternalBddDsl.g:2268:64: (iv_ruleImperativeScenarioState= ruleImperativeScenarioState EOF )
            // InternalBddDsl.g:2269:2: iv_ruleImperativeScenarioState= ruleImperativeScenarioState EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenarioState=ruleImperativeScenarioState();

            state._fsp--;

             current =iv_ruleImperativeScenarioState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeScenarioState"


    // $ANTLR start "ruleImperativeScenarioState"
    // InternalBddDsl.g:2275:1: ruleImperativeScenarioState returns [EObject current=null] : ( ( (lv_states_0_0= ruleImperativeStatePhrase ) ) (otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) ) )* ) ;
    public final EObject ruleImperativeScenarioState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_states_0_0 = null;

        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2281:2: ( ( ( (lv_states_0_0= ruleImperativeStatePhrase ) ) (otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) ) )* ) )
            // InternalBddDsl.g:2282:2: ( ( (lv_states_0_0= ruleImperativeStatePhrase ) ) (otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) ) )* )
            {
            // InternalBddDsl.g:2282:2: ( ( (lv_states_0_0= ruleImperativeStatePhrase ) ) (otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) ) )* )
            // InternalBddDsl.g:2283:3: ( (lv_states_0_0= ruleImperativeStatePhrase ) ) (otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) ) )*
            {
            // InternalBddDsl.g:2283:3: ( (lv_states_0_0= ruleImperativeStatePhrase ) )
            // InternalBddDsl.g:2284:4: (lv_states_0_0= ruleImperativeStatePhrase )
            {
            // InternalBddDsl.g:2284:4: (lv_states_0_0= ruleImperativeStatePhrase )
            // InternalBddDsl.g:2285:5: lv_states_0_0= ruleImperativeStatePhrase
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getStatesImperativeStatePhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_states_0_0=ruleImperativeStatePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioStateRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeStatePhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:2302:3: (otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==48) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==22) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // InternalBddDsl.g:2303:4: otherlv_1= 'And' ( (lv_states_2_0= ruleImperativeStatePhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_24); 

            	    				newLeafNode(otherlv_1, grammarAccess.getImperativeScenarioStateAccess().getAndKeyword_1_0());
            	    			
            	    // InternalBddDsl.g:2307:4: ( (lv_states_2_0= ruleImperativeStatePhrase ) )
            	    // InternalBddDsl.g:2308:5: (lv_states_2_0= ruleImperativeStatePhrase )
            	    {
            	    // InternalBddDsl.g:2308:5: (lv_states_2_0= ruleImperativeStatePhrase )
            	    // InternalBddDsl.g:2309:6: lv_states_2_0= ruleImperativeStatePhrase
            	    {

            	    						newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getStatesImperativeStatePhraseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_states_2_0=ruleImperativeStatePhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_2_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ImperativeStatePhrase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


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
    // $ANTLR end "ruleImperativeScenarioState"


    // $ANTLR start "entryRuleDeclarativeScenarioAction"
    // InternalBddDsl.g:2331:1: entryRuleDeclarativeScenarioAction returns [EObject current=null] : iv_ruleDeclarativeScenarioAction= ruleDeclarativeScenarioAction EOF ;
    public final EObject entryRuleDeclarativeScenarioAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeScenarioAction = null;


        try {
            // InternalBddDsl.g:2331:66: (iv_ruleDeclarativeScenarioAction= ruleDeclarativeScenarioAction EOF )
            // InternalBddDsl.g:2332:2: iv_ruleDeclarativeScenarioAction= ruleDeclarativeScenarioAction EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeScenarioActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeScenarioAction=ruleDeclarativeScenarioAction();

            state._fsp--;

             current =iv_ruleDeclarativeScenarioAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeScenarioAction"


    // $ANTLR start "ruleDeclarativeScenarioAction"
    // InternalBddDsl.g:2338:1: ruleDeclarativeScenarioAction returns [EObject current=null] : ( (lv_actions_0_0= ruleDeclarativeActionPhrase ) ) ;
    public final EObject ruleDeclarativeScenarioAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2344:2: ( ( (lv_actions_0_0= ruleDeclarativeActionPhrase ) ) )
            // InternalBddDsl.g:2345:2: ( (lv_actions_0_0= ruleDeclarativeActionPhrase ) )
            {
            // InternalBddDsl.g:2345:2: ( (lv_actions_0_0= ruleDeclarativeActionPhrase ) )
            // InternalBddDsl.g:2346:3: (lv_actions_0_0= ruleDeclarativeActionPhrase )
            {
            // InternalBddDsl.g:2346:3: (lv_actions_0_0= ruleDeclarativeActionPhrase )
            // InternalBddDsl.g:2347:4: lv_actions_0_0= ruleDeclarativeActionPhrase
            {

            				newCompositeNode(grammarAccess.getDeclarativeScenarioActionAccess().getActionsDeclarativeActionPhraseParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_actions_0_0=ruleDeclarativeActionPhrase();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionRule());
            				}
            				set(
            					current,
            					"actions",
            					lv_actions_0_0,
            					"dk.sdu.bdd.xtext.BddDsl.DeclarativeActionPhrase");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDeclarativeScenarioAction"


    // $ANTLR start "entryRuleImperativeScenarioAction"
    // InternalBddDsl.g:2367:1: entryRuleImperativeScenarioAction returns [EObject current=null] : iv_ruleImperativeScenarioAction= ruleImperativeScenarioAction EOF ;
    public final EObject entryRuleImperativeScenarioAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenarioAction = null;


        try {
            // InternalBddDsl.g:2367:65: (iv_ruleImperativeScenarioAction= ruleImperativeScenarioAction EOF )
            // InternalBddDsl.g:2368:2: iv_ruleImperativeScenarioAction= ruleImperativeScenarioAction EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenarioAction=ruleImperativeScenarioAction();

            state._fsp--;

             current =iv_ruleImperativeScenarioAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeScenarioAction"


    // $ANTLR start "ruleImperativeScenarioAction"
    // InternalBddDsl.g:2374:1: ruleImperativeScenarioAction returns [EObject current=null] : ( ( (lv_actions_0_0= ruleImperativeActionPhrase ) ) (otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) ) )* ) ;
    public final EObject ruleImperativeScenarioAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2380:2: ( ( ( (lv_actions_0_0= ruleImperativeActionPhrase ) ) (otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) ) )* ) )
            // InternalBddDsl.g:2381:2: ( ( (lv_actions_0_0= ruleImperativeActionPhrase ) ) (otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) ) )* )
            {
            // InternalBddDsl.g:2381:2: ( ( (lv_actions_0_0= ruleImperativeActionPhrase ) ) (otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) ) )* )
            // InternalBddDsl.g:2382:3: ( (lv_actions_0_0= ruleImperativeActionPhrase ) ) (otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) ) )*
            {
            // InternalBddDsl.g:2382:3: ( (lv_actions_0_0= ruleImperativeActionPhrase ) )
            // InternalBddDsl.g:2383:4: (lv_actions_0_0= ruleImperativeActionPhrase )
            {
            // InternalBddDsl.g:2383:4: (lv_actions_0_0= ruleImperativeActionPhrase )
            // InternalBddDsl.g:2384:5: lv_actions_0_0= ruleImperativeActionPhrase
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioActionAccess().getActionsImperativeActionPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_actions_0_0=ruleImperativeActionPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioActionRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeActionPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:2401:3: (otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==48) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalBddDsl.g:2402:4: otherlv_1= 'And' ( (lv_actions_2_0= ruleImperativeActionPhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_24); 

            	    				newLeafNode(otherlv_1, grammarAccess.getImperativeScenarioActionAccess().getAndKeyword_1_0());
            	    			
            	    // InternalBddDsl.g:2406:4: ( (lv_actions_2_0= ruleImperativeActionPhrase ) )
            	    // InternalBddDsl.g:2407:5: (lv_actions_2_0= ruleImperativeActionPhrase )
            	    {
            	    // InternalBddDsl.g:2407:5: (lv_actions_2_0= ruleImperativeActionPhrase )
            	    // InternalBddDsl.g:2408:6: lv_actions_2_0= ruleImperativeActionPhrase
            	    {

            	    						newCompositeNode(grammarAccess.getImperativeScenarioActionAccess().getActionsImperativeActionPhraseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_actions_2_0=ruleImperativeActionPhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImperativeScenarioActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_2_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ImperativeActionPhrase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


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
    // $ANTLR end "ruleImperativeScenarioAction"


    // $ANTLR start "entryRuleDeclarativeStatePhrase"
    // InternalBddDsl.g:2430:1: entryRuleDeclarativeStatePhrase returns [EObject current=null] : iv_ruleDeclarativeStatePhrase= ruleDeclarativeStatePhrase EOF ;
    public final EObject entryRuleDeclarativeStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeStatePhrase = null;


        try {
            // InternalBddDsl.g:2430:63: (iv_ruleDeclarativeStatePhrase= ruleDeclarativeStatePhrase EOF )
            // InternalBddDsl.g:2431:2: iv_ruleDeclarativeStatePhrase= ruleDeclarativeStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeStatePhrase=ruleDeclarativeStatePhrase();

            state._fsp--;

             current =iv_ruleDeclarativeStatePhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeStatePhrase"


    // $ANTLR start "ruleDeclarativeStatePhrase"
    // InternalBddDsl.g:2437:1: ruleDeclarativeStatePhrase returns [EObject current=null] : (this_DeclarativeEntityPropertyStatePhrase_0= ruleDeclarativeEntityPropertyStatePhrase | ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) ) ) ;
    public final EObject ruleDeclarativeStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject this_DeclarativeEntityPropertyStatePhrase_0 = null;

        EObject lv_esp_1_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2443:2: ( (this_DeclarativeEntityPropertyStatePhrase_0= ruleDeclarativeEntityPropertyStatePhrase | ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) ) ) )
            // InternalBddDsl.g:2444:2: (this_DeclarativeEntityPropertyStatePhrase_0= ruleDeclarativeEntityPropertyStatePhrase | ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) ) )
            {
            // InternalBddDsl.g:2444:2: (this_DeclarativeEntityPropertyStatePhrase_0= ruleDeclarativeEntityPropertyStatePhrase | ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) ) )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalBddDsl.g:2445:3: this_DeclarativeEntityPropertyStatePhrase_0= ruleDeclarativeEntityPropertyStatePhrase
                    {

                    			newCompositeNode(grammarAccess.getDeclarativeStatePhraseAccess().getDeclarativeEntityPropertyStatePhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclarativeEntityPropertyStatePhrase_0=ruleDeclarativeEntityPropertyStatePhrase();

                    state._fsp--;


                    			current = this_DeclarativeEntityPropertyStatePhrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2454:3: ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) )
                    {
                    // InternalBddDsl.g:2454:3: ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) )
                    // InternalBddDsl.g:2455:4: (lv_esp_1_0= ruleDeclarativeEntityStatePhrase )
                    {
                    // InternalBddDsl.g:2455:4: (lv_esp_1_0= ruleDeclarativeEntityStatePhrase )
                    // InternalBddDsl.g:2456:5: lv_esp_1_0= ruleDeclarativeEntityStatePhrase
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeStatePhraseAccess().getEspDeclarativeEntityStatePhraseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_esp_1_0=ruleDeclarativeEntityStatePhrase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"esp",
                    						lv_esp_1_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityStatePhrase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeStatePhrase"


    // $ANTLR start "entryRuleImperativeStatePhrase"
    // InternalBddDsl.g:2477:1: entryRuleImperativeStatePhrase returns [EObject current=null] : iv_ruleImperativeStatePhrase= ruleImperativeStatePhrase EOF ;
    public final EObject entryRuleImperativeStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeStatePhrase = null;


        try {
            // InternalBddDsl.g:2477:62: (iv_ruleImperativeStatePhrase= ruleImperativeStatePhrase EOF )
            // InternalBddDsl.g:2478:2: iv_ruleImperativeStatePhrase= ruleImperativeStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getImperativeStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeStatePhrase=ruleImperativeStatePhrase();

            state._fsp--;

             current =iv_ruleImperativeStatePhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeStatePhrase"


    // $ANTLR start "ruleImperativeStatePhrase"
    // InternalBddDsl.g:2484:1: ruleImperativeStatePhrase returns [EObject current=null] : ( ( (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase ) ) | ( (lv_esp_1_0= ruleImperativeEntityStatePhrase ) ) ) ;
    public final EObject ruleImperativeStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_epsp_0_0 = null;

        EObject lv_esp_1_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2490:2: ( ( ( (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase ) ) | ( (lv_esp_1_0= ruleImperativeEntityStatePhrase ) ) ) )
            // InternalBddDsl.g:2491:2: ( ( (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase ) ) | ( (lv_esp_1_0= ruleImperativeEntityStatePhrase ) ) )
            {
            // InternalBddDsl.g:2491:2: ( ( (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase ) ) | ( (lv_esp_1_0= ruleImperativeEntityStatePhrase ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==22) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==RULE_ID) ) {
                    int LA77_2 = input.LA(3);

                    if ( (LA77_2==RULE_STRING) ) {
                        alt77=2;
                    }
                    else if ( (LA77_2==31||LA77_2==50) ) {
                        alt77=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalBddDsl.g:2492:3: ( (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase ) )
                    {
                    // InternalBddDsl.g:2492:3: ( (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase ) )
                    // InternalBddDsl.g:2493:4: (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase )
                    {
                    // InternalBddDsl.g:2493:4: (lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase )
                    // InternalBddDsl.g:2494:5: lv_epsp_0_0= ruleImperativeEntityPropertyStatePhrase
                    {

                    					newCompositeNode(grammarAccess.getImperativeStatePhraseAccess().getEpspImperativeEntityPropertyStatePhraseParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_epsp_0_0=ruleImperativeEntityPropertyStatePhrase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"epsp",
                    						lv_epsp_0_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityPropertyStatePhrase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2512:3: ( (lv_esp_1_0= ruleImperativeEntityStatePhrase ) )
                    {
                    // InternalBddDsl.g:2512:3: ( (lv_esp_1_0= ruleImperativeEntityStatePhrase ) )
                    // InternalBddDsl.g:2513:4: (lv_esp_1_0= ruleImperativeEntityStatePhrase )
                    {
                    // InternalBddDsl.g:2513:4: (lv_esp_1_0= ruleImperativeEntityStatePhrase )
                    // InternalBddDsl.g:2514:5: lv_esp_1_0= ruleImperativeEntityStatePhrase
                    {

                    					newCompositeNode(grammarAccess.getImperativeStatePhraseAccess().getEspImperativeEntityStatePhraseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_esp_1_0=ruleImperativeEntityStatePhrase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"esp",
                    						lv_esp_1_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityStatePhrase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleImperativeStatePhrase"


    // $ANTLR start "entryRuleENTITY_IDENTITY"
    // InternalBddDsl.g:2535:1: entryRuleENTITY_IDENTITY returns [String current=null] : iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF ;
    public final String entryRuleENTITY_IDENTITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTITY_IDENTITY = null;


        try {
            // InternalBddDsl.g:2535:55: (iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF )
            // InternalBddDsl.g:2536:2: iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF
            {
             newCompositeNode(grammarAccess.getENTITY_IDENTITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENTITY_IDENTITY=ruleENTITY_IDENTITY();

            state._fsp--;

             current =iv_ruleENTITY_IDENTITY.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleENTITY_IDENTITY"


    // $ANTLR start "ruleENTITY_IDENTITY"
    // InternalBddDsl.g:2542:1: ruleENTITY_IDENTITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleENTITY_IDENTITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalBddDsl.g:2548:2: ( ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING ) )
            // InternalBddDsl.g:2549:2: ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING )
            {
            // InternalBddDsl.g:2549:2: ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==49) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_STRING) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalBddDsl.g:2550:3: (kw= '#' this_INT_1= RULE_INT )
                    {
                    // InternalBddDsl.g:2550:3: (kw= '#' this_INT_1= RULE_INT )
                    // InternalBddDsl.g:2551:4: kw= '#' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,49,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getENTITY_IDENTITYAccess().getNumberSignKeyword_0_0());
                    			
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getENTITY_IDENTITYAccess().getINTTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2565:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getENTITY_IDENTITYAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleENTITY_IDENTITY"


    // $ANTLR start "entryRuleOPTION"
    // InternalBddDsl.g:2576:1: entryRuleOPTION returns [String current=null] : iv_ruleOPTION= ruleOPTION EOF ;
    public final String entryRuleOPTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPTION = null;


        try {
            // InternalBddDsl.g:2576:46: (iv_ruleOPTION= ruleOPTION EOF )
            // InternalBddDsl.g:2577:2: iv_ruleOPTION= ruleOPTION EOF
            {
             newCompositeNode(grammarAccess.getOPTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPTION=ruleOPTION();

            state._fsp--;

             current =iv_ruleOPTION.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOPTION"


    // $ANTLR start "ruleOPTION"
    // InternalBddDsl.g:2583:1: ruleOPTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ) ;
    public final AntlrDatatypeRuleToken ruleOPTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalBddDsl.g:2589:2: ( ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ) )
            // InternalBddDsl.g:2590:2: ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            {
            // InternalBddDsl.g:2590:2: ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // InternalBddDsl.g:2591:3: (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // InternalBddDsl.g:2591:3: (kw= '#' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==49) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalBddDsl.g:2592:4: kw= '#'
                    {
                    kw=(Token)match(input,49,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOPTIONAccess().getNumberSignKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:2598:3: (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_STRING) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalBddDsl.g:2599:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getOPTIONAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2607:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_2);
                    			

                    				newLeafNode(this_STRING_2, grammarAccess.getOPTIONAccess().getSTRINGTerminalRuleCall_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleOPTION"


    // $ANTLR start "entryRuleDeclarativeEntityRef"
    // InternalBddDsl.g:2619:1: entryRuleDeclarativeEntityRef returns [EObject current=null] : iv_ruleDeclarativeEntityRef= ruleDeclarativeEntityRef EOF ;
    public final EObject entryRuleDeclarativeEntityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityRef = null;


        try {
            // InternalBddDsl.g:2619:61: (iv_ruleDeclarativeEntityRef= ruleDeclarativeEntityRef EOF )
            // InternalBddDsl.g:2620:2: iv_ruleDeclarativeEntityRef= ruleDeclarativeEntityRef EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityRef=ruleDeclarativeEntityRef();

            state._fsp--;

             current =iv_ruleDeclarativeEntityRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeEntityRef"


    // $ANTLR start "ruleDeclarativeEntityRef"
    // InternalBddDsl.g:2626:1: ruleDeclarativeEntityRef returns [EObject current=null] : ( ( ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) ) ) | ( (lv_name_11_0= ruleENTITY_IDENTITY ) ) ) ;
    public final EObject ruleDeclarativeEntityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_10_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2632:2: ( ( ( ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) ) ) | ( (lv_name_11_0= ruleENTITY_IDENTITY ) ) ) )
            // InternalBddDsl.g:2633:2: ( ( ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) ) ) | ( (lv_name_11_0= ruleENTITY_IDENTITY ) ) )
            {
            // InternalBddDsl.g:2633:2: ( ( ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) ) ) | ( (lv_name_11_0= ruleENTITY_IDENTITY ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==22||LA84_0==31||LA84_0==47||LA84_0==50) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_STRING||LA84_0==49) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalBddDsl.g:2634:3: ( ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) ) )
                    {
                    // InternalBddDsl.g:2634:3: ( ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) ) )
                    // InternalBddDsl.g:2635:4: ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )? (otherlv_4= 'for' | otherlv_5= 'of' )? ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) )
                    {
                    // InternalBddDsl.g:2635:4: ( ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_ID) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalBddDsl.g:2636:5: ruleWORD ruleOPTION otherlv_2= 'for' otherlv_3= 'the'
                            {

                            					newCompositeNode(grammarAccess.getDeclarativeEntityRefAccess().getWORDParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_32);
                            ruleWORD();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            					newCompositeNode(grammarAccess.getDeclarativeEntityRefAccess().getOPTIONParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_44);
                            ruleOPTION();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            otherlv_2=(Token)match(input,31,FOLLOW_24); 

                            					newLeafNode(otherlv_2, grammarAccess.getDeclarativeEntityRefAccess().getForKeyword_0_0_2());
                            				
                            otherlv_3=(Token)match(input,22,FOLLOW_45); 

                            					newLeafNode(otherlv_3, grammarAccess.getDeclarativeEntityRefAccess().getTheKeyword_0_0_3());
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:2659:4: (otherlv_4= 'for' | otherlv_5= 'of' )?
                    int alt82=3;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==31) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==50) ) {
                        alt82=2;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalBddDsl.g:2660:5: otherlv_4= 'for'
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_46); 

                            					newLeafNode(otherlv_4, grammarAccess.getDeclarativeEntityRefAccess().getForKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2665:5: otherlv_5= 'of'
                            {
                            otherlv_5=(Token)match(input,50,FOLLOW_46); 

                            					newLeafNode(otherlv_5, grammarAccess.getDeclarativeEntityRefAccess().getOfKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:2670:4: ( (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) ) )
                    // InternalBddDsl.g:2671:5: (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) ) ( ( ruleWORD ) ) ( (lv_name_10_0= ruleENTITY_IDENTITY ) )
                    {
                    // InternalBddDsl.g:2671:5: (otherlv_6= 'the' | (otherlv_7= 'all' otherlv_8= 'the' ) )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==22) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==47) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalBddDsl.g:2672:6: otherlv_6= 'the'
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_3); 

                            						newLeafNode(otherlv_6, grammarAccess.getDeclarativeEntityRefAccess().getTheKeyword_0_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2677:6: (otherlv_7= 'all' otherlv_8= 'the' )
                            {
                            // InternalBddDsl.g:2677:6: (otherlv_7= 'all' otherlv_8= 'the' )
                            // InternalBddDsl.g:2678:7: otherlv_7= 'all' otherlv_8= 'the'
                            {
                            otherlv_7=(Token)match(input,47,FOLLOW_24); 

                            							newLeafNode(otherlv_7, grammarAccess.getDeclarativeEntityRefAccess().getAllKeyword_0_2_0_1_0());
                            						
                            otherlv_8=(Token)match(input,22,FOLLOW_3); 

                            							newLeafNode(otherlv_8, grammarAccess.getDeclarativeEntityRefAccess().getTheKeyword_0_2_0_1_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalBddDsl.g:2688:5: ( ( ruleWORD ) )
                    // InternalBddDsl.g:2689:6: ( ruleWORD )
                    {
                    // InternalBddDsl.g:2689:6: ( ruleWORD )
                    // InternalBddDsl.g:2690:7: ruleWORD
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDeclarativeEntityRefRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getDeclarativeEntityRefAccess().getEntityDeclarativeEntityDefCrossReference_0_2_1_0());
                    						
                    pushFollow(FOLLOW_36);
                    ruleWORD();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBddDsl.g:2704:5: ( (lv_name_10_0= ruleENTITY_IDENTITY ) )
                    // InternalBddDsl.g:2705:6: (lv_name_10_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:2705:6: (lv_name_10_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:2706:7: lv_name_10_0= ruleENTITY_IDENTITY
                    {

                    							newCompositeNode(grammarAccess.getDeclarativeEntityRefAccess().getNameENTITY_IDENTITYParserRuleCall_0_2_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_name_10_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityRefRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_10_0,
                    								"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2726:3: ( (lv_name_11_0= ruleENTITY_IDENTITY ) )
                    {
                    // InternalBddDsl.g:2726:3: ( (lv_name_11_0= ruleENTITY_IDENTITY ) )
                    // InternalBddDsl.g:2727:4: (lv_name_11_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:2727:4: (lv_name_11_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:2728:5: lv_name_11_0= ruleENTITY_IDENTITY
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityRefAccess().getNameENTITY_IDENTITYParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_11_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityRefRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_11_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeEntityRef"


    // $ANTLR start "entryRuleImperativeEntityRef"
    // InternalBddDsl.g:2749:1: entryRuleImperativeEntityRef returns [EObject current=null] : iv_ruleImperativeEntityRef= ruleImperativeEntityRef EOF ;
    public final EObject entryRuleImperativeEntityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityRef = null;


        try {
            // InternalBddDsl.g:2749:60: (iv_ruleImperativeEntityRef= ruleImperativeEntityRef EOF )
            // InternalBddDsl.g:2750:2: iv_ruleImperativeEntityRef= ruleImperativeEntityRef EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityRef=ruleImperativeEntityRef();

            state._fsp--;

             current =iv_ruleImperativeEntityRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeEntityRef"


    // $ANTLR start "ruleImperativeEntityRef"
    // InternalBddDsl.g:2756:1: ruleImperativeEntityRef returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImperativeEntityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:2762:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalBddDsl.g:2763:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalBddDsl.g:2763:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalBddDsl.g:2764:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeEntityRefAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:2768:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:2769:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:2769:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:2770:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(otherlv_1, grammarAccess.getImperativeEntityRefAccess().getEntityImperativeEntityDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:2781:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalBddDsl.g:2782:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalBddDsl.g:2782:4: (lv_name_2_0= RULE_STRING )
            // InternalBddDsl.g:2783:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getImperativeEntityRefAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleImperativeEntityRef"


    // $ANTLR start "entryRuleDeclarativeEntityStatePhrase"
    // InternalBddDsl.g:2803:1: entryRuleDeclarativeEntityStatePhrase returns [EObject current=null] : iv_ruleDeclarativeEntityStatePhrase= ruleDeclarativeEntityStatePhrase EOF ;
    public final EObject entryRuleDeclarativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityStatePhrase = null;


        try {
            // InternalBddDsl.g:2803:69: (iv_ruleDeclarativeEntityStatePhrase= ruleDeclarativeEntityStatePhrase EOF )
            // InternalBddDsl.g:2804:2: iv_ruleDeclarativeEntityStatePhrase= ruleDeclarativeEntityStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityStatePhrase=ruleDeclarativeEntityStatePhrase();

            state._fsp--;

             current =iv_ruleDeclarativeEntityStatePhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeEntityStatePhrase"


    // $ANTLR start "ruleDeclarativeEntityStatePhrase"
    // InternalBddDsl.g:2810:1: ruleDeclarativeEntityStatePhrase returns [EObject current=null] : ( ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )? ( (lv_entity_14_0= ruleDeclarativeEntityRef ) ) (otherlv_15= 'is' | otherlv_16= 'are' ) (otherlv_17= 'not' )? ( (otherlv_18= RULE_ID ) ) ( ruleWORD )? ) ;
    public final EObject ruleDeclarativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_entity_14_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2816:2: ( ( ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )? ( (lv_entity_14_0= ruleDeclarativeEntityRef ) ) (otherlv_15= 'is' | otherlv_16= 'are' ) (otherlv_17= 'not' )? ( (otherlv_18= RULE_ID ) ) ( ruleWORD )? ) )
            // InternalBddDsl.g:2817:2: ( ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )? ( (lv_entity_14_0= ruleDeclarativeEntityRef ) ) (otherlv_15= 'is' | otherlv_16= 'are' ) (otherlv_17= 'not' )? ( (otherlv_18= RULE_ID ) ) ( ruleWORD )? )
            {
            // InternalBddDsl.g:2817:2: ( ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )? ( (lv_entity_14_0= ruleDeclarativeEntityRef ) ) (otherlv_15= 'is' | otherlv_16= 'are' ) (otherlv_17= 'not' )? ( (otherlv_18= RULE_ID ) ) ( ruleWORD )? )
            // InternalBddDsl.g:2818:3: ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )? ( (lv_entity_14_0= ruleDeclarativeEntityRef ) ) (otherlv_15= 'is' | otherlv_16= 'are' ) (otherlv_17= 'not' )? ( (otherlv_18= RULE_ID ) ) ( ruleWORD )?
            {
            // InternalBddDsl.g:2818:3: ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalBddDsl.g:2819:4: ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' )
                    {
                    // InternalBddDsl.g:2819:4: ( ( ruleWORD ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_ID) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalBddDsl.g:2820:5: ( ruleWORD )
                            {
                            // InternalBddDsl.g:2820:5: ( ruleWORD )
                            // InternalBddDsl.g:2821:6: ruleWORD
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeclarativeEntityStatePhraseRule());
                            						}
                            					

                            						newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getPropertyPropertyDefCrossReference_0_0_0());
                            					
                            pushFollow(FOLLOW_48);
                            ruleWORD();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalBddDsl.g:2835:4: (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )?
                    int alt86=3;
                    alt86 = dfa86.predict(input);
                    switch (alt86) {
                        case 1 :
                            // InternalBddDsl.g:2836:5: otherlv_1= 'of'
                            {
                            otherlv_1=(Token)match(input,50,FOLLOW_48); 

                            					newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityStatePhraseAccess().getOfKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2841:5: (otherlv_2= 'of' otherlv_3= 'the' )
                            {
                            // InternalBddDsl.g:2841:5: (otherlv_2= 'of' otherlv_3= 'the' )
                            // InternalBddDsl.g:2842:6: otherlv_2= 'of' otherlv_3= 'the'
                            {
                            otherlv_2=(Token)match(input,50,FOLLOW_24); 

                            						newLeafNode(otherlv_2, grammarAccess.getDeclarativeEntityStatePhraseAccess().getOfKeyword_0_1_1_0());
                            					
                            otherlv_3=(Token)match(input,22,FOLLOW_48); 

                            						newLeafNode(otherlv_3, grammarAccess.getDeclarativeEntityStatePhraseAccess().getTheKeyword_0_1_1_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalBddDsl.g:2852:4: ( ruleOPTION )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( ((LA87_0>=RULE_STRING && LA87_0<=RULE_INT)||LA87_0==49) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalBddDsl.g:2853:5: ruleOPTION
                            {

                            					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getOPTIONParserRuleCall_0_2());
                            				
                            pushFollow(FOLLOW_49);
                            ruleOPTION();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:2861:4: (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )?
                    int alt88=3;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==31) ) {
                        switch ( input.LA(2) ) {
                            case 31:
                                {
                                alt88=1;
                                }
                                break;
                            case 50:
                                {
                                alt88=1;
                                }
                                break;
                            case 22:
                                {
                                int LA88_5 = input.LA(3);

                                if ( (LA88_5==50) ) {
                                    alt88=2;
                                }
                                else if ( (LA88_5==31) ) {
                                    alt88=2;
                                }
                                }
                                break;
                        }

                    }
                    switch (alt88) {
                        case 1 :
                            // InternalBddDsl.g:2862:5: otherlv_5= 'for'
                            {
                            otherlv_5=(Token)match(input,31,FOLLOW_49); 

                            					newLeafNode(otherlv_5, grammarAccess.getDeclarativeEntityStatePhraseAccess().getForKeyword_0_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2867:5: (otherlv_6= 'for' otherlv_7= 'the' )
                            {
                            // InternalBddDsl.g:2867:5: (otherlv_6= 'for' otherlv_7= 'the' )
                            // InternalBddDsl.g:2868:6: otherlv_6= 'for' otherlv_7= 'the'
                            {
                            otherlv_6=(Token)match(input,31,FOLLOW_24); 

                            						newLeafNode(otherlv_6, grammarAccess.getDeclarativeEntityStatePhraseAccess().getForKeyword_0_3_1_0());
                            					
                            otherlv_7=(Token)match(input,22,FOLLOW_49); 

                            						newLeafNode(otherlv_7, grammarAccess.getDeclarativeEntityStatePhraseAccess().getTheKeyword_0_3_1_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalBddDsl.g:2878:4: (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' )
                    int alt89=4;
                    alt89 = dfa89.predict(input);
                    switch (alt89) {
                        case 1 :
                            // InternalBddDsl.g:2879:5: otherlv_8= 'of'
                            {
                            otherlv_8=(Token)match(input,50,FOLLOW_36); 

                            					newLeafNode(otherlv_8, grammarAccess.getDeclarativeEntityStatePhraseAccess().getOfKeyword_0_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:2884:5: (otherlv_9= 'of' otherlv_10= 'the' )
                            {
                            // InternalBddDsl.g:2884:5: (otherlv_9= 'of' otherlv_10= 'the' )
                            // InternalBddDsl.g:2885:6: otherlv_9= 'of' otherlv_10= 'the'
                            {
                            otherlv_9=(Token)match(input,50,FOLLOW_24); 

                            						newLeafNode(otherlv_9, grammarAccess.getDeclarativeEntityStatePhraseAccess().getOfKeyword_0_4_1_0());
                            					
                            otherlv_10=(Token)match(input,22,FOLLOW_36); 

                            						newLeafNode(otherlv_10, grammarAccess.getDeclarativeEntityStatePhraseAccess().getTheKeyword_0_4_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalBddDsl.g:2895:5: (otherlv_11= 'for' otherlv_12= 'the' )
                            {
                            // InternalBddDsl.g:2895:5: (otherlv_11= 'for' otherlv_12= 'the' )
                            // InternalBddDsl.g:2896:6: otherlv_11= 'for' otherlv_12= 'the'
                            {
                            otherlv_11=(Token)match(input,31,FOLLOW_24); 

                            						newLeafNode(otherlv_11, grammarAccess.getDeclarativeEntityStatePhraseAccess().getForKeyword_0_4_2_0());
                            					
                            otherlv_12=(Token)match(input,22,FOLLOW_36); 

                            						newLeafNode(otherlv_12, grammarAccess.getDeclarativeEntityStatePhraseAccess().getTheKeyword_0_4_2_1());
                            					

                            }


                            }
                            break;
                        case 4 :
                            // InternalBddDsl.g:2906:5: otherlv_13= 'for'
                            {
                            otherlv_13=(Token)match(input,31,FOLLOW_36); 

                            					newLeafNode(otherlv_13, grammarAccess.getDeclarativeEntityStatePhraseAccess().getForKeyword_0_4_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:2912:3: ( (lv_entity_14_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:2913:4: (lv_entity_14_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:2913:4: (lv_entity_14_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:2914:5: lv_entity_14_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getEntityDeclarativeEntityRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_entity_14_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_14_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:2931:3: (otherlv_15= 'is' | otherlv_16= 'are' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==16) ) {
                alt91=1;
            }
            else if ( (LA91_0==51) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalBddDsl.g:2932:4: otherlv_15= 'is'
                    {
                    otherlv_15=(Token)match(input,16,FOLLOW_51); 

                    				newLeafNode(otherlv_15, grammarAccess.getDeclarativeEntityStatePhraseAccess().getIsKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2937:4: otherlv_16= 'are'
                    {
                    otherlv_16=(Token)match(input,51,FOLLOW_51); 

                    				newLeafNode(otherlv_16, grammarAccess.getDeclarativeEntityStatePhraseAccess().getAreKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:2942:3: (otherlv_17= 'not' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==46) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalBddDsl.g:2943:4: otherlv_17= 'not'
                    {
                    otherlv_17=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getDeclarativeEntityStatePhraseAccess().getNotKeyword_3());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:2948:3: ( (otherlv_18= RULE_ID ) )
            // InternalBddDsl.g:2949:4: (otherlv_18= RULE_ID )
            {
            // InternalBddDsl.g:2949:4: (otherlv_18= RULE_ID )
            // InternalBddDsl.g:2950:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeEntityStatePhraseRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_18, grammarAccess.getDeclarativeEntityStatePhraseAccess().getStateStateNameCrossReference_4_0());
            				

            }


            }

            // InternalBddDsl.g:2961:3: ( ruleWORD )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalBddDsl.g:2962:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getWORDParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeEntityStatePhrase"


    // $ANTLR start "entryRuleImperativeEntityStatePhrase"
    // InternalBddDsl.g:2974:1: entryRuleImperativeEntityStatePhrase returns [EObject current=null] : iv_ruleImperativeEntityStatePhrase= ruleImperativeEntityStatePhrase EOF ;
    public final EObject entryRuleImperativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityStatePhrase = null;


        try {
            // InternalBddDsl.g:2974:68: (iv_ruleImperativeEntityStatePhrase= ruleImperativeEntityStatePhrase EOF )
            // InternalBddDsl.g:2975:2: iv_ruleImperativeEntityStatePhrase= ruleImperativeEntityStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityStatePhrase=ruleImperativeEntityStatePhrase();

            state._fsp--;

             current =iv_ruleImperativeEntityStatePhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeEntityStatePhrase"


    // $ANTLR start "ruleImperativeEntityStatePhrase"
    // InternalBddDsl.g:2981:1: ruleImperativeEntityStatePhrase returns [EObject current=null] : ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleImperativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_entity_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2987:2: ( ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBddDsl.g:2988:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBddDsl.g:2988:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )
            // InternalBddDsl.g:2989:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) ) otherlv_1= 'is' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBddDsl.g:2989:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:2990:4: (lv_entity_0_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:2990:4: (lv_entity_0_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:2991:5: lv_entity_0_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityStatePhraseAccess().getEntityImperativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_entity_0_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getImperativeEntityStatePhraseAccess().getIsKeyword_1());
            		
            // InternalBddDsl.g:3012:3: ( (otherlv_2= RULE_ID ) )
            // InternalBddDsl.g:3013:4: (otherlv_2= RULE_ID )
            {
            // InternalBddDsl.g:3013:4: (otherlv_2= RULE_ID )
            // InternalBddDsl.g:3014:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityStatePhraseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getImperativeEntityStatePhraseAccess().getStateImperativeStateNameCrossReference_2_0());
            				

            }


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
    // $ANTLR end "ruleImperativeEntityStatePhrase"


    // $ANTLR start "entryRuleDeclarativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3029:1: entryRuleDeclarativeEntityPropertyStatePhrase returns [EObject current=null] : iv_ruleDeclarativeEntityPropertyStatePhrase= ruleDeclarativeEntityPropertyStatePhrase EOF ;
    public final EObject entryRuleDeclarativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityPropertyStatePhrase = null;


        try {
            // InternalBddDsl.g:3029:77: (iv_ruleDeclarativeEntityPropertyStatePhrase= ruleDeclarativeEntityPropertyStatePhrase EOF )
            // InternalBddDsl.g:3030:2: iv_ruleDeclarativeEntityPropertyStatePhrase= ruleDeclarativeEntityPropertyStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityPropertyStatePhrase=ruleDeclarativeEntityPropertyStatePhrase();

            state._fsp--;

             current =iv_ruleDeclarativeEntityPropertyStatePhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeEntityPropertyStatePhrase"


    // $ANTLR start "ruleDeclarativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3036:1: ruleDeclarativeEntityPropertyStatePhrase returns [EObject current=null] : ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) ) ( (lv_entity_12_0= ruleDeclarativeEntityRef ) ) ( ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? ) | ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? ) ) ) ;
    public final EObject ruleDeclarativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        EObject lv_entity_12_0 = null;

        EObject lv_value_16_0 = null;

        EObject lv_values_22_0 = null;

        EObject lv_values_25_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3042:2: ( ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) ) ( (lv_entity_12_0= ruleDeclarativeEntityRef ) ) ( ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? ) | ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? ) ) ) )
            // InternalBddDsl.g:3043:2: ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) ) ( (lv_entity_12_0= ruleDeclarativeEntityRef ) ) ( ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? ) | ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? ) ) )
            {
            // InternalBddDsl.g:3043:2: ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) ) ( (lv_entity_12_0= ruleDeclarativeEntityRef ) ) ( ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? ) | ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? ) ) )
            // InternalBddDsl.g:3044:3: ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) ) ( (lv_entity_12_0= ruleDeclarativeEntityRef ) ) ( ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? ) | ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? ) )
            {
            // InternalBddDsl.g:3044:3: ( ( ruleWORD ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalBddDsl.g:3045:4: ( ruleWORD )
                    {
                    // InternalBddDsl.g:3045:4: ( ruleWORD )
                    // InternalBddDsl.g:3046:5: ruleWORD
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getPropertyPropertyDefCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_53);
                    ruleWORD();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3060:3: (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )?
            int alt95=3;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // InternalBddDsl.g:3061:4: otherlv_1= 'of'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_53); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getOfKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3066:4: (otherlv_2= 'of' otherlv_3= 'the' )
                    {
                    // InternalBddDsl.g:3066:4: (otherlv_2= 'of' otherlv_3= 'the' )
                    // InternalBddDsl.g:3067:5: otherlv_2= 'of' otherlv_3= 'the'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_24); 

                    					newLeafNode(otherlv_2, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getOfKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,22,FOLLOW_53); 

                    					newLeafNode(otherlv_3, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getTheKeyword_1_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3077:3: ( ruleOPTION )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_STRING && LA96_0<=RULE_INT)||LA96_0==49) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalBddDsl.g:3078:4: ruleOPTION
                    {

                    				newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getOPTIONParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_54);
                    ruleOPTION();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3086:3: (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) )
            int alt97=5;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalBddDsl.g:3087:4: otherlv_5= 'of'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getOfKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3092:4: otherlv_6= 'for'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getForKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:3097:4: otherlv_7= 'from'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getFromKeyword_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:3102:4: (otherlv_8= 'for' otherlv_9= 'the' )
                    {
                    // InternalBddDsl.g:3102:4: (otherlv_8= 'for' otherlv_9= 'the' )
                    // InternalBddDsl.g:3103:5: otherlv_8= 'for' otherlv_9= 'the'
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_24); 

                    					newLeafNode(otherlv_8, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getForKeyword_3_3_0());
                    				
                    otherlv_9=(Token)match(input,22,FOLLOW_36); 

                    					newLeafNode(otherlv_9, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getTheKeyword_3_3_1());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalBddDsl.g:3113:4: (otherlv_10= 'of' otherlv_11= 'the' )
                    {
                    // InternalBddDsl.g:3113:4: (otherlv_10= 'of' otherlv_11= 'the' )
                    // InternalBddDsl.g:3114:5: otherlv_10= 'of' otherlv_11= 'the'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_24); 

                    					newLeafNode(otherlv_10, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getOfKeyword_3_4_0());
                    				
                    otherlv_11=(Token)match(input,22,FOLLOW_36); 

                    					newLeafNode(otherlv_11, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getTheKeyword_3_4_1());
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3124:3: ( (lv_entity_12_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3125:4: (lv_entity_12_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3125:4: (lv_entity_12_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3126:5: lv_entity_12_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getEntityDeclarativeEntityRefParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_55);
            lv_entity_12_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_12_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3143:3: ( ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? ) | ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==16) ) {
                alt106=1;
            }
            else if ( (LA106_0==EOF||LA106_0==RULE_ID||(LA106_0>=12 && LA106_0<=13)||LA106_0==17||LA106_0==25||LA106_0==37||(LA106_0>=39 && LA106_0<=40)||LA106_0==42||LA106_0==48||LA106_0==51) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalBddDsl.g:3144:4: ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? )
                    {
                    // InternalBddDsl.g:3144:4: ( ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )? )
                    // InternalBddDsl.g:3145:5: ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? ) ( ruleWORD )?
                    {
                    // InternalBddDsl.g:3145:5: ( (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )? )
                    // InternalBddDsl.g:3146:6: (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) ) ( (lv_value_16_0= ruleSimpleValue ) ) ( ruleWORD )?
                    {
                    // InternalBddDsl.g:3146:6: (otherlv_13= 'is' | (otherlv_14= 'is' otherlv_15= 'not' ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==16) ) {
                        int LA98_1 = input.LA(2);

                        if ( ((LA98_1>=RULE_STRING && LA98_1<=RULE_INT)) ) {
                            alt98=1;
                        }
                        else if ( (LA98_1==46) ) {
                            alt98=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 98, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalBddDsl.g:3147:7: otherlv_13= 'is'
                            {
                            otherlv_13=(Token)match(input,16,FOLLOW_43); 

                            							newLeafNode(otherlv_13, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getIsKeyword_5_0_0_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:3152:7: (otherlv_14= 'is' otherlv_15= 'not' )
                            {
                            // InternalBddDsl.g:3152:7: (otherlv_14= 'is' otherlv_15= 'not' )
                            // InternalBddDsl.g:3153:8: otherlv_14= 'is' otherlv_15= 'not'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_34); 

                            								newLeafNode(otherlv_14, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getIsKeyword_5_0_0_0_1_0());
                            							
                            otherlv_15=(Token)match(input,46,FOLLOW_43); 

                            								newLeafNode(otherlv_15, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getNotKeyword_5_0_0_0_1_1());
                            							

                            }


                            }
                            break;

                    }

                    // InternalBddDsl.g:3163:6: ( (lv_value_16_0= ruleSimpleValue ) )
                    // InternalBddDsl.g:3164:7: (lv_value_16_0= ruleSimpleValue )
                    {
                    // InternalBddDsl.g:3164:7: (lv_value_16_0= ruleSimpleValue )
                    // InternalBddDsl.g:3165:8: lv_value_16_0= ruleSimpleValue
                    {

                    								newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getValueSimpleValueParserRuleCall_5_0_0_1_0());
                    							
                    pushFollow(FOLLOW_17);
                    lv_value_16_0=ruleSimpleValue();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
                    								}
                    								set(
                    									current,
                    									"value",
                    									lv_value_16_0,
                    									"dk.sdu.bdd.xtext.BddDsl.SimpleValue");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalBddDsl.g:3182:6: ( ruleWORD )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==RULE_ID) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalBddDsl.g:3183:7: ruleWORD
                            {

                            							newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getWORDParserRuleCall_5_0_0_2());
                            						
                            pushFollow(FOLLOW_17);
                            ruleWORD();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }

                    // InternalBddDsl.g:3192:5: ( ruleWORD )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==RULE_ID) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalBddDsl.g:3193:6: ruleWORD
                            {

                            						newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getWORDParserRuleCall_5_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            ruleWORD();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3203:4: ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? )
                    {
                    // InternalBddDsl.g:3203:4: ( ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )? )
                    // InternalBddDsl.g:3204:5: ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* ) ( ruleWORD )?
                    {
                    // InternalBddDsl.g:3204:5: ( ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? ) | (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )* )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==51) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==EOF||LA104_0==RULE_ID||(LA104_0>=12 && LA104_0<=13)||LA104_0==17||LA104_0==25||LA104_0==37||(LA104_0>=39 && LA104_0<=40)||LA104_0==42||LA104_0==48) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalBddDsl.g:3205:6: ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? )
                            {
                            // InternalBddDsl.g:3205:6: ( (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )? )
                            // InternalBddDsl.g:3206:7: (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) ) ( (lv_values_22_0= ruleSimpleValue ) ) ( ruleWORD )?
                            {
                            // InternalBddDsl.g:3206:7: (otherlv_19= 'are' | (otherlv_20= 'are' otherlv_21= 'not' ) )
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==51) ) {
                                int LA101_1 = input.LA(2);

                                if ( ((LA101_1>=RULE_STRING && LA101_1<=RULE_INT)) ) {
                                    alt101=1;
                                }
                                else if ( (LA101_1==46) ) {
                                    alt101=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 101, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 101, 0, input);

                                throw nvae;
                            }
                            switch (alt101) {
                                case 1 :
                                    // InternalBddDsl.g:3207:8: otherlv_19= 'are'
                                    {
                                    otherlv_19=(Token)match(input,51,FOLLOW_43); 

                                    								newLeafNode(otherlv_19, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getAreKeyword_5_1_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalBddDsl.g:3212:8: (otherlv_20= 'are' otherlv_21= 'not' )
                                    {
                                    // InternalBddDsl.g:3212:8: (otherlv_20= 'are' otherlv_21= 'not' )
                                    // InternalBddDsl.g:3213:9: otherlv_20= 'are' otherlv_21= 'not'
                                    {
                                    otherlv_20=(Token)match(input,51,FOLLOW_34); 

                                    									newLeafNode(otherlv_20, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getAreKeyword_5_1_0_0_0_1_0());
                                    								
                                    otherlv_21=(Token)match(input,46,FOLLOW_43); 

                                    									newLeafNode(otherlv_21, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getNotKeyword_5_1_0_0_0_1_1());
                                    								

                                    }


                                    }
                                    break;

                            }

                            // InternalBddDsl.g:3223:7: ( (lv_values_22_0= ruleSimpleValue ) )
                            // InternalBddDsl.g:3224:8: (lv_values_22_0= ruleSimpleValue )
                            {
                            // InternalBddDsl.g:3224:8: (lv_values_22_0= ruleSimpleValue )
                            // InternalBddDsl.g:3225:9: lv_values_22_0= ruleSimpleValue
                            {

                            									newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getValuesSimpleValueParserRuleCall_5_1_0_0_1_0());
                            								
                            pushFollow(FOLLOW_17);
                            lv_values_22_0=ruleSimpleValue();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
                            									}
                            									add(
                            										current,
                            										"values",
                            										lv_values_22_0,
                            										"dk.sdu.bdd.xtext.BddDsl.SimpleValue");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalBddDsl.g:3242:7: ( ruleWORD )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==RULE_ID) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // InternalBddDsl.g:3243:8: ruleWORD
                                    {

                                    								newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getWORDParserRuleCall_5_1_0_0_2());
                                    							
                                    pushFollow(FOLLOW_17);
                                    ruleWORD();

                                    state._fsp--;


                                    								afterParserOrEnumRuleCall();
                                    							

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:3253:6: (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )*
                            {
                            // InternalBddDsl.g:3253:6: (otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) ) )*
                            loop103:
                            do {
                                int alt103=2;
                                int LA103_0 = input.LA(1);

                                if ( (LA103_0==17) ) {
                                    alt103=1;
                                }


                                switch (alt103) {
                            	case 1 :
                            	    // InternalBddDsl.g:3254:7: otherlv_24= ',' ( (lv_values_25_0= ruleSimpleValue ) )
                            	    {
                            	    otherlv_24=(Token)match(input,17,FOLLOW_43); 

                            	    							newLeafNode(otherlv_24, grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getCommaKeyword_5_1_0_1_0());
                            	    						
                            	    // InternalBddDsl.g:3258:7: ( (lv_values_25_0= ruleSimpleValue ) )
                            	    // InternalBddDsl.g:3259:8: (lv_values_25_0= ruleSimpleValue )
                            	    {
                            	    // InternalBddDsl.g:3259:8: (lv_values_25_0= ruleSimpleValue )
                            	    // InternalBddDsl.g:3260:9: lv_values_25_0= ruleSimpleValue
                            	    {

                            	    									newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getValuesSimpleValueParserRuleCall_5_1_0_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_56);
                            	    lv_values_25_0=ruleSimpleValue();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"values",
                            	    										lv_values_25_0,
                            	    										"dk.sdu.bdd.xtext.BddDsl.SimpleValue");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop103;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalBddDsl.g:3279:5: ( ruleWORD )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==RULE_ID) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalBddDsl.g:3280:6: ruleWORD
                            {

                            						newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getWORDParserRuleCall_5_1_1());
                            					
                            pushFollow(FOLLOW_2);
                            ruleWORD();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeEntityPropertyStatePhrase"


    // $ANTLR start "entryRuleImperativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3294:1: entryRuleImperativeEntityPropertyStatePhrase returns [EObject current=null] : iv_ruleImperativeEntityPropertyStatePhrase= ruleImperativeEntityPropertyStatePhrase EOF ;
    public final EObject entryRuleImperativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityPropertyStatePhrase = null;


        try {
            // InternalBddDsl.g:3294:76: (iv_ruleImperativeEntityPropertyStatePhrase= ruleImperativeEntityPropertyStatePhrase EOF )
            // InternalBddDsl.g:3295:2: iv_ruleImperativeEntityPropertyStatePhrase= ruleImperativeEntityPropertyStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityPropertyStatePhrase=ruleImperativeEntityPropertyStatePhrase();

            state._fsp--;

             current =iv_ruleImperativeEntityPropertyStatePhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeEntityPropertyStatePhrase"


    // $ANTLR start "ruleImperativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3301:1: ruleImperativeEntityPropertyStatePhrase returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'of' | otherlv_3= 'for' ) ( (lv_entity_4_0= ruleImperativeEntityRef ) ) otherlv_5= 'is' ( (lv_propertyValue_6_0= ruleStringValue ) ) ) ;
    public final EObject ruleImperativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entity_4_0 = null;

        EObject lv_propertyValue_6_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3307:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'of' | otherlv_3= 'for' ) ( (lv_entity_4_0= ruleImperativeEntityRef ) ) otherlv_5= 'is' ( (lv_propertyValue_6_0= ruleStringValue ) ) ) )
            // InternalBddDsl.g:3308:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'of' | otherlv_3= 'for' ) ( (lv_entity_4_0= ruleImperativeEntityRef ) ) otherlv_5= 'is' ( (lv_propertyValue_6_0= ruleStringValue ) ) )
            {
            // InternalBddDsl.g:3308:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'of' | otherlv_3= 'for' ) ( (lv_entity_4_0= ruleImperativeEntityRef ) ) otherlv_5= 'is' ( (lv_propertyValue_6_0= ruleStringValue ) ) )
            // InternalBddDsl.g:3309:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'of' | otherlv_3= 'for' ) ( (lv_entity_4_0= ruleImperativeEntityRef ) ) otherlv_5= 'is' ( (lv_propertyValue_6_0= ruleStringValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:3313:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:3314:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:3314:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:3315:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_1, grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getPropertyImperativePropertyDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:3326:3: (otherlv_2= 'of' | otherlv_3= 'for' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==50) ) {
                alt107=1;
            }
            else if ( (LA107_0==31) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalBddDsl.g:3327:4: otherlv_2= 'of'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getOfKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3332:4: otherlv_3= 'for'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getForKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3337:3: ( (lv_entity_4_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:3338:4: (lv_entity_4_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:3338:4: (lv_entity_4_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:3339:5: lv_entity_4_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getEntityImperativeEntityRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
            lv_entity_4_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getIsKeyword_4());
            		
            // InternalBddDsl.g:3360:3: ( (lv_propertyValue_6_0= ruleStringValue ) )
            // InternalBddDsl.g:3361:4: (lv_propertyValue_6_0= ruleStringValue )
            {
            // InternalBddDsl.g:3361:4: (lv_propertyValue_6_0= ruleStringValue )
            // InternalBddDsl.g:3362:5: lv_propertyValue_6_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getPropertyValueStringValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_propertyValue_6_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"propertyValue",
            						lv_propertyValue_6_0,
            						"dk.sdu.bdd.xtext.BddDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleImperativeEntityPropertyStatePhrase"


    // $ANTLR start "entryRuleSimpleValue"
    // InternalBddDsl.g:3383:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // InternalBddDsl.g:3383:52: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // InternalBddDsl.g:3384:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // InternalBddDsl.g:3390:1: ruleSimpleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DoubleValue_2= ruleDoubleValue ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_DoubleValue_2 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3396:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DoubleValue_2= ruleDoubleValue ) )
            // InternalBddDsl.g:3397:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DoubleValue_2= ruleDoubleValue )
            {
            // InternalBddDsl.g:3397:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DoubleValue_2= ruleDoubleValue )
            int alt108=3;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_INT) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==EOF||(LA108_1>=RULE_ID && LA108_1<=RULE_STRING)||(LA108_1>=12 && LA108_1<=13)||LA108_1==17||(LA108_1>=21 && LA108_1<=22)||(LA108_1>=25 && LA108_1<=32)||LA108_1==35||LA108_1==37||(LA108_1>=39 && LA108_1<=40)||LA108_1==42||(LA108_1>=47 && LA108_1<=50)) ) {
                    alt108=1;
                }
                else if ( (LA108_1==52) ) {
                    alt108=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA108_0==RULE_STRING) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalBddDsl.g:3398:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getSimpleValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3407:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getSimpleValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:3416:3: this_DoubleValue_2= ruleDoubleValue
                    {

                    			newCompositeNode(grammarAccess.getSimpleValueAccess().getDoubleValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleValue_2=ruleDoubleValue();

                    state._fsp--;


                    			current = this_DoubleValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalBddDsl.g:3428:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBddDsl.g:3428:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBddDsl.g:3429:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalBddDsl.g:3435:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:3441:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalBddDsl.g:3442:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalBddDsl.g:3442:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalBddDsl.g:3443:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalBddDsl.g:3443:3: (lv_value_0_0= RULE_STRING )
            // InternalBddDsl.g:3444:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalBddDsl.g:3463:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalBddDsl.g:3463:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalBddDsl.g:3464:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalBddDsl.g:3470:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:3476:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalBddDsl.g:3477:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalBddDsl.g:3477:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalBddDsl.g:3478:3: (lv_value_0_0= RULE_INT )
            {
            // InternalBddDsl.g:3478:3: (lv_value_0_0= RULE_INT )
            // InternalBddDsl.g:3479:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleDoubleValue"
    // InternalBddDsl.g:3498:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // InternalBddDsl.g:3498:52: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalBddDsl.g:3499:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
             newCompositeNode(grammarAccess.getDoubleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;

             current =iv_ruleDoubleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // InternalBddDsl.g:3505:1: ruleDoubleValue returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3511:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalBddDsl.g:3512:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalBddDsl.g:3512:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalBddDsl.g:3513:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalBddDsl.g:3513:3: (lv_value_0_0= ruleDOUBLE )
            // InternalBddDsl.g:3514:4: lv_value_0_0= ruleDOUBLE
            {

            				newCompositeNode(grammarAccess.getDoubleValueAccess().getValueDOUBLEParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDOUBLE();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDoubleValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dk.sdu.bdd.xtext.BddDsl.DOUBLE");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleDeclarativeActionPhrase"
    // InternalBddDsl.g:3534:1: entryRuleDeclarativeActionPhrase returns [EObject current=null] : iv_ruleDeclarativeActionPhrase= ruleDeclarativeActionPhrase EOF ;
    public final EObject entryRuleDeclarativeActionPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeActionPhrase = null;


        try {
            // InternalBddDsl.g:3534:64: (iv_ruleDeclarativeActionPhrase= ruleDeclarativeActionPhrase EOF )
            // InternalBddDsl.g:3535:2: iv_ruleDeclarativeActionPhrase= ruleDeclarativeActionPhrase EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeActionPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeActionPhrase=ruleDeclarativeActionPhrase();

            state._fsp--;

             current =iv_ruleDeclarativeActionPhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeActionPhrase"


    // $ANTLR start "ruleDeclarativeActionPhrase"
    // InternalBddDsl.g:3541:1: ruleDeclarativeActionPhrase returns [EObject current=null] : (this_DeclarativeEntityAction_0= ruleDeclarativeEntityAction | this_VerbAction_1= ruleVerbAction ) ;
    public final EObject ruleDeclarativeActionPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_DeclarativeEntityAction_0 = null;

        EObject this_VerbAction_1 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3547:2: ( (this_DeclarativeEntityAction_0= ruleDeclarativeEntityAction | this_VerbAction_1= ruleVerbAction ) )
            // InternalBddDsl.g:3548:2: (this_DeclarativeEntityAction_0= ruleDeclarativeEntityAction | this_VerbAction_1= ruleVerbAction )
            {
            // InternalBddDsl.g:3548:2: (this_DeclarativeEntityAction_0= ruleDeclarativeEntityAction | this_VerbAction_1= ruleVerbAction )
            int alt109=2;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // InternalBddDsl.g:3549:3: this_DeclarativeEntityAction_0= ruleDeclarativeEntityAction
                    {

                    			newCompositeNode(grammarAccess.getDeclarativeActionPhraseAccess().getDeclarativeEntityActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclarativeEntityAction_0=ruleDeclarativeEntityAction();

                    state._fsp--;


                    			current = this_DeclarativeEntityAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3558:3: this_VerbAction_1= ruleVerbAction
                    {

                    			newCompositeNode(grammarAccess.getDeclarativeActionPhraseAccess().getVerbActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerbAction_1=ruleVerbAction();

                    state._fsp--;


                    			current = this_VerbAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeActionPhrase"


    // $ANTLR start "entryRuleImperativeActionPhrase"
    // InternalBddDsl.g:3570:1: entryRuleImperativeActionPhrase returns [EObject current=null] : iv_ruleImperativeActionPhrase= ruleImperativeActionPhrase EOF ;
    public final EObject entryRuleImperativeActionPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeActionPhrase = null;


        try {
            // InternalBddDsl.g:3570:63: (iv_ruleImperativeActionPhrase= ruleImperativeActionPhrase EOF )
            // InternalBddDsl.g:3571:2: iv_ruleImperativeActionPhrase= ruleImperativeActionPhrase EOF
            {
             newCompositeNode(grammarAccess.getImperativeActionPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeActionPhrase=ruleImperativeActionPhrase();

            state._fsp--;

             current =iv_ruleImperativeActionPhrase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeActionPhrase"


    // $ANTLR start "ruleImperativeActionPhrase"
    // InternalBddDsl.g:3577:1: ruleImperativeActionPhrase returns [EObject current=null] : this_ImperativeEntityAction_0= ruleImperativeEntityAction ;
    public final EObject ruleImperativeActionPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_ImperativeEntityAction_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3583:2: (this_ImperativeEntityAction_0= ruleImperativeEntityAction )
            // InternalBddDsl.g:3584:2: this_ImperativeEntityAction_0= ruleImperativeEntityAction
            {

            		newCompositeNode(grammarAccess.getImperativeActionPhraseAccess().getImperativeEntityActionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ImperativeEntityAction_0=ruleImperativeEntityAction();

            state._fsp--;


            		current = this_ImperativeEntityAction_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleImperativeActionPhrase"


    // $ANTLR start "entryRuleVerbAction"
    // InternalBddDsl.g:3595:1: entryRuleVerbAction returns [EObject current=null] : iv_ruleVerbAction= ruleVerbAction EOF ;
    public final EObject entryRuleVerbAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbAction = null;


        try {
            // InternalBddDsl.g:3595:51: (iv_ruleVerbAction= ruleVerbAction EOF )
            // InternalBddDsl.g:3596:2: iv_ruleVerbAction= ruleVerbAction EOF
            {
             newCompositeNode(grammarAccess.getVerbActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbAction=ruleVerbAction();

            state._fsp--;

             current =iv_ruleVerbAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVerbAction"


    // $ANTLR start "ruleVerbAction"
    // InternalBddDsl.g:3602:1: ruleVerbAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleDeclarativeActionRef ) ) (otherlv_1= 'and' )? ( ruleWORD )? (otherlv_3= 'on' )? ( ruleWORD otherlv_5= '-' ruleWORD )? ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )? ( (lv_entity_11_0= ruleDeclarativeEntityDef ) )? (otherlv_12= 'on' | otherlv_13= 'off' | otherlv_14= 'in' )? ( (lv_entity2_15_0= ruleDeclarativeEntityRef ) ) (otherlv_16= 'on' | otherlv_17= 'off' | otherlv_18= 'in' )? (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )? ( rulePREP )? ( (lv_entity3_26_0= ruleDeclarativeEntityRef ) )? ) ;
    public final EObject ruleVerbAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_action_0_0 = null;

        EObject lv_entity_11_0 = null;

        EObject lv_entity2_15_0 = null;

        EObject lv_entity3_26_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3608:2: ( ( ( (lv_action_0_0= ruleDeclarativeActionRef ) ) (otherlv_1= 'and' )? ( ruleWORD )? (otherlv_3= 'on' )? ( ruleWORD otherlv_5= '-' ruleWORD )? ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )? ( (lv_entity_11_0= ruleDeclarativeEntityDef ) )? (otherlv_12= 'on' | otherlv_13= 'off' | otherlv_14= 'in' )? ( (lv_entity2_15_0= ruleDeclarativeEntityRef ) ) (otherlv_16= 'on' | otherlv_17= 'off' | otherlv_18= 'in' )? (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )? ( rulePREP )? ( (lv_entity3_26_0= ruleDeclarativeEntityRef ) )? ) )
            // InternalBddDsl.g:3609:2: ( ( (lv_action_0_0= ruleDeclarativeActionRef ) ) (otherlv_1= 'and' )? ( ruleWORD )? (otherlv_3= 'on' )? ( ruleWORD otherlv_5= '-' ruleWORD )? ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )? ( (lv_entity_11_0= ruleDeclarativeEntityDef ) )? (otherlv_12= 'on' | otherlv_13= 'off' | otherlv_14= 'in' )? ( (lv_entity2_15_0= ruleDeclarativeEntityRef ) ) (otherlv_16= 'on' | otherlv_17= 'off' | otherlv_18= 'in' )? (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )? ( rulePREP )? ( (lv_entity3_26_0= ruleDeclarativeEntityRef ) )? )
            {
            // InternalBddDsl.g:3609:2: ( ( (lv_action_0_0= ruleDeclarativeActionRef ) ) (otherlv_1= 'and' )? ( ruleWORD )? (otherlv_3= 'on' )? ( ruleWORD otherlv_5= '-' ruleWORD )? ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )? ( (lv_entity_11_0= ruleDeclarativeEntityDef ) )? (otherlv_12= 'on' | otherlv_13= 'off' | otherlv_14= 'in' )? ( (lv_entity2_15_0= ruleDeclarativeEntityRef ) ) (otherlv_16= 'on' | otherlv_17= 'off' | otherlv_18= 'in' )? (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )? ( rulePREP )? ( (lv_entity3_26_0= ruleDeclarativeEntityRef ) )? )
            // InternalBddDsl.g:3610:3: ( (lv_action_0_0= ruleDeclarativeActionRef ) ) (otherlv_1= 'and' )? ( ruleWORD )? (otherlv_3= 'on' )? ( ruleWORD otherlv_5= '-' ruleWORD )? ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )? ( (lv_entity_11_0= ruleDeclarativeEntityDef ) )? (otherlv_12= 'on' | otherlv_13= 'off' | otherlv_14= 'in' )? ( (lv_entity2_15_0= ruleDeclarativeEntityRef ) ) (otherlv_16= 'on' | otherlv_17= 'off' | otherlv_18= 'in' )? (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )? ( rulePREP )? ( (lv_entity3_26_0= ruleDeclarativeEntityRef ) )?
            {
            // InternalBddDsl.g:3610:3: ( (lv_action_0_0= ruleDeclarativeActionRef ) )
            // InternalBddDsl.g:3611:4: (lv_action_0_0= ruleDeclarativeActionRef )
            {
            // InternalBddDsl.g:3611:4: (lv_action_0_0= ruleDeclarativeActionRef )
            // InternalBddDsl.g:3612:5: lv_action_0_0= ruleDeclarativeActionRef
            {

            					newCompositeNode(grammarAccess.getVerbActionAccess().getActionDeclarativeActionRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
            lv_action_0_0=ruleDeclarativeActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3629:3: (otherlv_1= 'and' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==21) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalBddDsl.g:3630:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_58); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerbActionAccess().getAndKeyword_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3635:3: ( ruleWORD )?
            int alt111=2;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // InternalBddDsl.g:3636:4: ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getVerbActionAccess().getWORDParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_58);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3644:3: (otherlv_3= 'on' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==26) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalBddDsl.g:3645:4: otherlv_3= 'on'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_58); 

                    				newLeafNode(otherlv_3, grammarAccess.getVerbActionAccess().getOnKeyword_3());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3650:3: ( ruleWORD otherlv_5= '-' ruleWORD )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_ID) ) {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==15) ) {
                    alt113=1;
                }
            }
            switch (alt113) {
                case 1 :
                    // InternalBddDsl.g:3651:4: ruleWORD otherlv_5= '-' ruleWORD
                    {

                    				newCompositeNode(grammarAccess.getVerbActionAccess().getWORDParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_13);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVerbActionAccess().getHyphenMinusKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getVerbActionAccess().getWORDParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_58);
                    ruleWORD();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3670:3: ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )?
            int alt114=4;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // InternalBddDsl.g:3671:4: (otherlv_7= 'for' otherlv_8= 'the' )
                    {
                    // InternalBddDsl.g:3671:4: (otherlv_7= 'for' otherlv_8= 'the' )
                    // InternalBddDsl.g:3672:5: otherlv_7= 'for' otherlv_8= 'the'
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_24); 

                    					newLeafNode(otherlv_7, grammarAccess.getVerbActionAccess().getForKeyword_5_0_0());
                    				
                    otherlv_8=(Token)match(input,22,FOLLOW_58); 

                    					newLeafNode(otherlv_8, grammarAccess.getVerbActionAccess().getTheKeyword_5_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3682:4: otherlv_9= 'the'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getVerbActionAccess().getTheKeyword_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:3687:4: otherlv_10= 'on'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getVerbActionAccess().getOnKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3692:3: ( (lv_entity_11_0= ruleDeclarativeEntityDef ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==13) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalBddDsl.g:3693:4: (lv_entity_11_0= ruleDeclarativeEntityDef )
                    {
                    // InternalBddDsl.g:3693:4: (lv_entity_11_0= ruleDeclarativeEntityDef )
                    // InternalBddDsl.g:3694:5: lv_entity_11_0= ruleDeclarativeEntityDef
                    {

                    					newCompositeNode(grammarAccess.getVerbActionAccess().getEntityDeclarativeEntityDefParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_59);
                    lv_entity_11_0=ruleDeclarativeEntityDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    					}
                    					set(
                    						current,
                    						"entity",
                    						lv_entity_11_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3711:3: (otherlv_12= 'on' | otherlv_13= 'off' | otherlv_14= 'in' )?
            int alt116=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt116=1;
                    }
                    break;
                case 35:
                    {
                    alt116=2;
                    }
                    break;
                case 27:
                    {
                    alt116=3;
                    }
                    break;
            }

            switch (alt116) {
                case 1 :
                    // InternalBddDsl.g:3712:4: otherlv_12= 'on'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getVerbActionAccess().getOnKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3717:4: otherlv_13= 'off'
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getVerbActionAccess().getOffKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:3722:4: otherlv_14= 'in'
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_36); 

                    				newLeafNode(otherlv_14, grammarAccess.getVerbActionAccess().getInKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3727:3: ( (lv_entity2_15_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3728:4: (lv_entity2_15_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3728:4: (lv_entity2_15_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3729:5: lv_entity2_15_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getVerbActionAccess().getEntity2DeclarativeEntityRefParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_60);
            lv_entity2_15_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbActionRule());
            					}
            					set(
            						current,
            						"entity2",
            						lv_entity2_15_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3746:3: (otherlv_16= 'on' | otherlv_17= 'off' | otherlv_18= 'in' )?
            int alt117=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt117=1;
                    }
                    break;
                case 35:
                    {
                    alt117=2;
                    }
                    break;
                case 27:
                    {
                    alt117=3;
                    }
                    break;
            }

            switch (alt117) {
                case 1 :
                    // InternalBddDsl.g:3747:4: otherlv_16= 'on'
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_61); 

                    				newLeafNode(otherlv_16, grammarAccess.getVerbActionAccess().getOnKeyword_9_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3752:4: otherlv_17= 'off'
                    {
                    otherlv_17=(Token)match(input,35,FOLLOW_61); 

                    				newLeafNode(otherlv_17, grammarAccess.getVerbActionAccess().getOffKeyword_9_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:3757:4: otherlv_18= 'in'
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_61); 

                    				newLeafNode(otherlv_18, grammarAccess.getVerbActionAccess().getInKeyword_9_2());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3762:3: (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )?
            int alt118=5;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // InternalBddDsl.g:3763:4: otherlv_19= 'of'
                    {
                    otherlv_19=(Token)match(input,50,FOLLOW_61); 

                    				newLeafNode(otherlv_19, grammarAccess.getVerbActionAccess().getOfKeyword_10_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:3768:4: otherlv_20= 'for'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_61); 

                    				newLeafNode(otherlv_20, grammarAccess.getVerbActionAccess().getForKeyword_10_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:3773:4: (otherlv_21= 'for' otherlv_22= 'the' )
                    {
                    // InternalBddDsl.g:3773:4: (otherlv_21= 'for' otherlv_22= 'the' )
                    // InternalBddDsl.g:3774:5: otherlv_21= 'for' otherlv_22= 'the'
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_24); 

                    					newLeafNode(otherlv_21, grammarAccess.getVerbActionAccess().getForKeyword_10_2_0());
                    				
                    otherlv_22=(Token)match(input,22,FOLLOW_61); 

                    					newLeafNode(otherlv_22, grammarAccess.getVerbActionAccess().getTheKeyword_10_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:3784:4: (otherlv_23= 'of' otherlv_24= 'the' )
                    {
                    // InternalBddDsl.g:3784:4: (otherlv_23= 'of' otherlv_24= 'the' )
                    // InternalBddDsl.g:3785:5: otherlv_23= 'of' otherlv_24= 'the'
                    {
                    otherlv_23=(Token)match(input,50,FOLLOW_24); 

                    					newLeafNode(otherlv_23, grammarAccess.getVerbActionAccess().getOfKeyword_10_3_0());
                    				
                    otherlv_24=(Token)match(input,22,FOLLOW_61); 

                    					newLeafNode(otherlv_24, grammarAccess.getVerbActionAccess().getTheKeyword_10_3_1());
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3795:3: ( rulePREP )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=26 && LA119_0<=30)) ) {
                alt119=1;
            }
            else if ( ((LA119_0>=31 && LA119_0<=32)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalBddDsl.g:3796:4: rulePREP
                    {

                    				newCompositeNode(grammarAccess.getVerbActionAccess().getPREPParserRuleCall_11());
                    			
                    pushFollow(FOLLOW_62);
                    rulePREP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:3804:3: ( (lv_entity3_26_0= ruleDeclarativeEntityRef ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=RULE_ID && LA120_0<=RULE_STRING)||LA120_0==22||LA120_0==31||LA120_0==47||(LA120_0>=49 && LA120_0<=50)) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalBddDsl.g:3805:4: (lv_entity3_26_0= ruleDeclarativeEntityRef )
                    {
                    // InternalBddDsl.g:3805:4: (lv_entity3_26_0= ruleDeclarativeEntityRef )
                    // InternalBddDsl.g:3806:5: lv_entity3_26_0= ruleDeclarativeEntityRef
                    {

                    					newCompositeNode(grammarAccess.getVerbActionAccess().getEntity3DeclarativeEntityRefParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_entity3_26_0=ruleDeclarativeEntityRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    					}
                    					set(
                    						current,
                    						"entity3",
                    						lv_entity3_26_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleVerbAction"


    // $ANTLR start "entryRuleDeclarativeEntityAction"
    // InternalBddDsl.g:3827:1: entryRuleDeclarativeEntityAction returns [EObject current=null] : iv_ruleDeclarativeEntityAction= ruleDeclarativeEntityAction EOF ;
    public final EObject entryRuleDeclarativeEntityAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityAction = null;


        try {
            // InternalBddDsl.g:3827:64: (iv_ruleDeclarativeEntityAction= ruleDeclarativeEntityAction EOF )
            // InternalBddDsl.g:3828:2: iv_ruleDeclarativeEntityAction= ruleDeclarativeEntityAction EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityAction=ruleDeclarativeEntityAction();

            state._fsp--;

             current =iv_ruleDeclarativeEntityAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeEntityAction"


    // $ANTLR start "ruleDeclarativeEntityAction"
    // InternalBddDsl.g:3834:1: ruleDeclarativeEntityAction returns [EObject current=null] : ( ( (lv_entityAction_0_0= ruleDeclarativeEntityRef ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_entityRef_2_0= ruleDeclarativeEntityRef ) )? ( (lv_propertyRef_3_0= rulePropertyRef ) )? ) ;
    public final EObject ruleDeclarativeEntityAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entityAction_0_0 = null;

        EObject lv_entityRef_2_0 = null;

        EObject lv_propertyRef_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3840:2: ( ( ( (lv_entityAction_0_0= ruleDeclarativeEntityRef ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_entityRef_2_0= ruleDeclarativeEntityRef ) )? ( (lv_propertyRef_3_0= rulePropertyRef ) )? ) )
            // InternalBddDsl.g:3841:2: ( ( (lv_entityAction_0_0= ruleDeclarativeEntityRef ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_entityRef_2_0= ruleDeclarativeEntityRef ) )? ( (lv_propertyRef_3_0= rulePropertyRef ) )? )
            {
            // InternalBddDsl.g:3841:2: ( ( (lv_entityAction_0_0= ruleDeclarativeEntityRef ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_entityRef_2_0= ruleDeclarativeEntityRef ) )? ( (lv_propertyRef_3_0= rulePropertyRef ) )? )
            // InternalBddDsl.g:3842:3: ( (lv_entityAction_0_0= ruleDeclarativeEntityRef ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_entityRef_2_0= ruleDeclarativeEntityRef ) )? ( (lv_propertyRef_3_0= rulePropertyRef ) )?
            {
            // InternalBddDsl.g:3842:3: ( (lv_entityAction_0_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3843:4: (lv_entityAction_0_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3843:4: (lv_entityAction_0_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3844:5: lv_entityAction_0_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getEntityActionDeclarativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entityAction_0_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
            					}
            					set(
            						current,
            						"entityAction",
            						lv_entityAction_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3861:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:3862:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:3862:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:3863:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeEntityActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityActionAccess().getActionDefActionDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:3874:3: ( (lv_entityRef_2_0= ruleDeclarativeEntityRef ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=RULE_ID && LA121_0<=RULE_STRING)||LA121_0==22||LA121_0==31||LA121_0==47||(LA121_0>=49 && LA121_0<=50)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalBddDsl.g:3875:4: (lv_entityRef_2_0= ruleDeclarativeEntityRef )
                    {
                    // InternalBddDsl.g:3875:4: (lv_entityRef_2_0= ruleDeclarativeEntityRef )
                    // InternalBddDsl.g:3876:5: lv_entityRef_2_0= ruleDeclarativeEntityRef
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getEntityRefDeclarativeEntityRefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_64);
                    lv_entityRef_2_0=ruleDeclarativeEntityRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
                    					}
                    					set(
                    						current,
                    						"entityRef",
                    						lv_entityRef_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3893:3: ( (lv_propertyRef_3_0= rulePropertyRef ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==29) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalBddDsl.g:3894:4: (lv_propertyRef_3_0= rulePropertyRef )
                    {
                    // InternalBddDsl.g:3894:4: (lv_propertyRef_3_0= rulePropertyRef )
                    // InternalBddDsl.g:3895:5: lv_propertyRef_3_0= rulePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getPropertyRefPropertyRefParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyRef_3_0=rulePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
                    					}
                    					set(
                    						current,
                    						"propertyRef",
                    						lv_propertyRef_3_0,
                    						"dk.sdu.bdd.xtext.BddDsl.PropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeEntityAction"


    // $ANTLR start "entryRuleImperativeEntityAction"
    // InternalBddDsl.g:3916:1: entryRuleImperativeEntityAction returns [EObject current=null] : iv_ruleImperativeEntityAction= ruleImperativeEntityAction EOF ;
    public final EObject entryRuleImperativeEntityAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityAction = null;


        try {
            // InternalBddDsl.g:3916:63: (iv_ruleImperativeEntityAction= ruleImperativeEntityAction EOF )
            // InternalBddDsl.g:3917:2: iv_ruleImperativeEntityAction= ruleImperativeEntityAction EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityAction=ruleImperativeEntityAction();

            state._fsp--;

             current =iv_ruleImperativeEntityAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativeEntityAction"


    // $ANTLR start "ruleImperativeEntityAction"
    // InternalBddDsl.g:3923:1: ruleImperativeEntityAction returns [EObject current=null] : ( ( (lv_entityAction_0_0= ruleImperativeEntityRef ) ) ( (lv_adverb_1_0= ruleADVERB ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_propertyRef_3_0= ruleImperativePropertyRef ) )? ) ;
    public final EObject ruleImperativeEntityAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_entityAction_0_0 = null;

        AntlrDatatypeRuleToken lv_adverb_1_0 = null;

        EObject lv_propertyRef_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3929:2: ( ( ( (lv_entityAction_0_0= ruleImperativeEntityRef ) ) ( (lv_adverb_1_0= ruleADVERB ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_propertyRef_3_0= ruleImperativePropertyRef ) )? ) )
            // InternalBddDsl.g:3930:2: ( ( (lv_entityAction_0_0= ruleImperativeEntityRef ) ) ( (lv_adverb_1_0= ruleADVERB ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_propertyRef_3_0= ruleImperativePropertyRef ) )? )
            {
            // InternalBddDsl.g:3930:2: ( ( (lv_entityAction_0_0= ruleImperativeEntityRef ) ) ( (lv_adverb_1_0= ruleADVERB ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_propertyRef_3_0= ruleImperativePropertyRef ) )? )
            // InternalBddDsl.g:3931:3: ( (lv_entityAction_0_0= ruleImperativeEntityRef ) ) ( (lv_adverb_1_0= ruleADVERB ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_propertyRef_3_0= ruleImperativePropertyRef ) )?
            {
            // InternalBddDsl.g:3931:3: ( (lv_entityAction_0_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:3932:4: (lv_entityAction_0_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:3932:4: (lv_entityAction_0_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:3933:5: lv_entityAction_0_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getEntityActionImperativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_65);
            lv_entityAction_0_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
            					}
            					set(
            						current,
            						"entityAction",
            						lv_entityAction_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3950:3: ( (lv_adverb_1_0= ruleADVERB ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==33) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalBddDsl.g:3951:4: (lv_adverb_1_0= ruleADVERB )
                    {
                    // InternalBddDsl.g:3951:4: (lv_adverb_1_0= ruleADVERB )
                    // InternalBddDsl.g:3952:5: lv_adverb_1_0= ruleADVERB
                    {

                    					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getAdverbADVERBParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_adverb_1_0=ruleADVERB();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
                    					}
                    					set(
                    						current,
                    						"adverb",
                    						lv_adverb_1_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ADVERB");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3969:3: ( (otherlv_2= RULE_ID ) )
            // InternalBddDsl.g:3970:4: (otherlv_2= RULE_ID )
            {
            // InternalBddDsl.g:3970:4: (otherlv_2= RULE_ID )
            // InternalBddDsl.g:3971:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityActionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_64); 

            					newLeafNode(otherlv_2, grammarAccess.getImperativeEntityActionAccess().getActionDefImperativeActionDefCrossReference_2_0());
            				

            }


            }

            // InternalBddDsl.g:3982:3: ( (lv_propertyRef_3_0= ruleImperativePropertyRef ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==29) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalBddDsl.g:3983:4: (lv_propertyRef_3_0= ruleImperativePropertyRef )
                    {
                    // InternalBddDsl.g:3983:4: (lv_propertyRef_3_0= ruleImperativePropertyRef )
                    // InternalBddDsl.g:3984:5: lv_propertyRef_3_0= ruleImperativePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getPropertyRefImperativePropertyRefParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyRef_3_0=ruleImperativePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
                    					}
                    					set(
                    						current,
                    						"propertyRef",
                    						lv_propertyRef_3_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleImperativeEntityAction"


    // $ANTLR start "entryRulePropertyRef"
    // InternalBddDsl.g:4005:1: entryRulePropertyRef returns [EObject current=null] : iv_rulePropertyRef= rulePropertyRef EOF ;
    public final EObject entryRulePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRef = null;


        try {
            // InternalBddDsl.g:4005:52: (iv_rulePropertyRef= rulePropertyRef EOF )
            // InternalBddDsl.g:4006:2: iv_rulePropertyRef= rulePropertyRef EOF
            {
             newCompositeNode(grammarAccess.getPropertyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyRef=rulePropertyRef();

            state._fsp--;

             current =iv_rulePropertyRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyRef"


    // $ANTLR start "rulePropertyRef"
    // InternalBddDsl.g:4012:1: rulePropertyRef returns [EObject current=null] : ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject rulePropertyRef() throws RecognitionException {
        EObject current = null;

        Token lv_propertyref_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propertyValue_2_0 = null;

        EObject lv_properyValue2_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:4018:2: ( ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalBddDsl.g:4019:2: ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalBddDsl.g:4019:2: ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? )
            // InternalBddDsl.g:4020:3: ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )?
            {
            // InternalBddDsl.g:4020:3: ( (lv_propertyref_0_0= 'to' ) )
            // InternalBddDsl.g:4021:4: (lv_propertyref_0_0= 'to' )
            {
            // InternalBddDsl.g:4021:4: (lv_propertyref_0_0= 'to' )
            // InternalBddDsl.g:4022:5: lv_propertyref_0_0= 'to'
            {
            lv_propertyref_0_0=(Token)match(input,29,FOLLOW_3); 

            					newLeafNode(lv_propertyref_0_0, grammarAccess.getPropertyRefAccess().getPropertyrefToKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRefRule());
            					}
            					setWithLastConsumed(current, "propertyref", lv_propertyref_0_0, "to");
            				

            }


            }

            // InternalBddDsl.g:4034:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:4035:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:4035:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:4036:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyRefAccess().getPropertyPropertyDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:4047:3: ( (lv_propertyValue_2_0= ruleStringValue ) )
            // InternalBddDsl.g:4048:4: (lv_propertyValue_2_0= ruleStringValue )
            {
            // InternalBddDsl.g:4048:4: (lv_propertyValue_2_0= ruleStringValue )
            // InternalBddDsl.g:4049:5: lv_propertyValue_2_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getPropertyRefAccess().getPropertyValueStringValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_66);
            lv_propertyValue_2_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRefRule());
            					}
            					set(
            						current,
            						"propertyValue",
            						lv_propertyValue_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4066:3: (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==32) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalBddDsl.g:4067:4: otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyRefAccess().getWithKeyword_3_0());
                    			
                    // InternalBddDsl.g:4071:4: ( (lv_properyValue2_4_0= ruleStringValue ) )
                    // InternalBddDsl.g:4072:5: (lv_properyValue2_4_0= ruleStringValue )
                    {
                    // InternalBddDsl.g:4072:5: (lv_properyValue2_4_0= ruleStringValue )
                    // InternalBddDsl.g:4073:6: lv_properyValue2_4_0= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getPropertyRefAccess().getProperyValue2StringValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_properyValue2_4_0=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    						}
                    						set(
                    							current,
                    							"properyValue2",
                    							lv_properyValue2_4_0,
                    							"dk.sdu.bdd.xtext.BddDsl.StringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:4090:4: ( (otherlv_5= RULE_ID ) )
                    // InternalBddDsl.g:4091:5: (otherlv_5= RULE_ID )
                    {
                    // InternalBddDsl.g:4091:5: (otherlv_5= RULE_ID )
                    // InternalBddDsl.g:4092:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRefRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getPropertyRefAccess().getPropery2PropertyDefCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePropertyRef"


    // $ANTLR start "entryRuleImperativePropertyRef"
    // InternalBddDsl.g:4108:1: entryRuleImperativePropertyRef returns [EObject current=null] : iv_ruleImperativePropertyRef= ruleImperativePropertyRef EOF ;
    public final EObject entryRuleImperativePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativePropertyRef = null;


        try {
            // InternalBddDsl.g:4108:62: (iv_ruleImperativePropertyRef= ruleImperativePropertyRef EOF )
            // InternalBddDsl.g:4109:2: iv_ruleImperativePropertyRef= ruleImperativePropertyRef EOF
            {
             newCompositeNode(grammarAccess.getImperativePropertyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativePropertyRef=ruleImperativePropertyRef();

            state._fsp--;

             current =iv_ruleImperativePropertyRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImperativePropertyRef"


    // $ANTLR start "ruleImperativePropertyRef"
    // InternalBddDsl.g:4115:1: ruleImperativePropertyRef returns [EObject current=null] : ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleImperativePropertyRef() throws RecognitionException {
        EObject current = null;

        Token lv_propertyref_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propertyValue_2_0 = null;

        EObject lv_properyValue2_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:4121:2: ( ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalBddDsl.g:4122:2: ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalBddDsl.g:4122:2: ( ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )? )
            // InternalBddDsl.g:4123:3: ( (lv_propertyref_0_0= 'to' ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleStringValue ) ) (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )?
            {
            // InternalBddDsl.g:4123:3: ( (lv_propertyref_0_0= 'to' ) )
            // InternalBddDsl.g:4124:4: (lv_propertyref_0_0= 'to' )
            {
            // InternalBddDsl.g:4124:4: (lv_propertyref_0_0= 'to' )
            // InternalBddDsl.g:4125:5: lv_propertyref_0_0= 'to'
            {
            lv_propertyref_0_0=(Token)match(input,29,FOLLOW_3); 

            					newLeafNode(lv_propertyref_0_0, grammarAccess.getImperativePropertyRefAccess().getPropertyrefToKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativePropertyRefRule());
            					}
            					setWithLastConsumed(current, "propertyref", lv_propertyref_0_0, "to");
            				

            }


            }

            // InternalBddDsl.g:4137:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:4138:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:4138:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:4139:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativePropertyRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(otherlv_1, grammarAccess.getImperativePropertyRefAccess().getPropertyImperativePropertyDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:4150:3: ( (lv_propertyValue_2_0= ruleStringValue ) )
            // InternalBddDsl.g:4151:4: (lv_propertyValue_2_0= ruleStringValue )
            {
            // InternalBddDsl.g:4151:4: (lv_propertyValue_2_0= ruleStringValue )
            // InternalBddDsl.g:4152:5: lv_propertyValue_2_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getImperativePropertyRefAccess().getPropertyValueStringValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_66);
            lv_propertyValue_2_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativePropertyRefRule());
            					}
            					set(
            						current,
            						"propertyValue",
            						lv_propertyValue_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4169:3: (otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==32) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalBddDsl.g:4170:4: otherlv_3= 'with' ( (lv_properyValue2_4_0= ruleStringValue ) ) ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getImperativePropertyRefAccess().getWithKeyword_3_0());
                    			
                    // InternalBddDsl.g:4174:4: ( (lv_properyValue2_4_0= ruleStringValue ) )
                    // InternalBddDsl.g:4175:5: (lv_properyValue2_4_0= ruleStringValue )
                    {
                    // InternalBddDsl.g:4175:5: (lv_properyValue2_4_0= ruleStringValue )
                    // InternalBddDsl.g:4176:6: lv_properyValue2_4_0= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getImperativePropertyRefAccess().getProperyValue2StringValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_properyValue2_4_0=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativePropertyRefRule());
                    						}
                    						set(
                    							current,
                    							"properyValue2",
                    							lv_properyValue2_4_0,
                    							"dk.sdu.bdd.xtext.BddDsl.StringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:4193:4: ( (otherlv_5= RULE_ID ) )
                    // InternalBddDsl.g:4194:5: (otherlv_5= RULE_ID )
                    {
                    // InternalBddDsl.g:4194:5: (otherlv_5= RULE_ID )
                    // InternalBddDsl.g:4195:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImperativePropertyRefRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getImperativePropertyRefAccess().getPropery2ImperativePropertyDefCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleImperativePropertyRef"


    // $ANTLR start "entryRuleDeclarativeActionRef"
    // InternalBddDsl.g:4211:1: entryRuleDeclarativeActionRef returns [EObject current=null] : iv_ruleDeclarativeActionRef= ruleDeclarativeActionRef EOF ;
    public final EObject entryRuleDeclarativeActionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeActionRef = null;


        try {
            // InternalBddDsl.g:4211:61: (iv_ruleDeclarativeActionRef= ruleDeclarativeActionRef EOF )
            // InternalBddDsl.g:4212:2: iv_ruleDeclarativeActionRef= ruleDeclarativeActionRef EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeActionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeActionRef=ruleDeclarativeActionRef();

            state._fsp--;

             current =iv_ruleDeclarativeActionRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarativeActionRef"


    // $ANTLR start "ruleDeclarativeActionRef"
    // InternalBddDsl.g:4218:1: ruleDeclarativeActionRef returns [EObject current=null] : ( ( ( ruleWORD ) ) (otherlv_1= 'on' )? ( (lv_argument_2_0= ruleSimpleValue ) )? ( (lv_preposition_3_0= rulePREP ) )? ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )? ) ;
    public final EObject ruleDeclarativeActionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        AntlrDatatypeRuleToken lv_preposition_3_0 = null;

        EObject lv_entity_6_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:4224:2: ( ( ( ( ruleWORD ) ) (otherlv_1= 'on' )? ( (lv_argument_2_0= ruleSimpleValue ) )? ( (lv_preposition_3_0= rulePREP ) )? ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )? ) )
            // InternalBddDsl.g:4225:2: ( ( ( ruleWORD ) ) (otherlv_1= 'on' )? ( (lv_argument_2_0= ruleSimpleValue ) )? ( (lv_preposition_3_0= rulePREP ) )? ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )? )
            {
            // InternalBddDsl.g:4225:2: ( ( ( ruleWORD ) ) (otherlv_1= 'on' )? ( (lv_argument_2_0= ruleSimpleValue ) )? ( (lv_preposition_3_0= rulePREP ) )? ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )? )
            // InternalBddDsl.g:4226:3: ( ( ruleWORD ) ) (otherlv_1= 'on' )? ( (lv_argument_2_0= ruleSimpleValue ) )? ( (lv_preposition_3_0= rulePREP ) )? ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )?
            {
            // InternalBddDsl.g:4226:3: ( ( ruleWORD ) )
            // InternalBddDsl.g:4227:4: ( ruleWORD )
            {
            // InternalBddDsl.g:4227:4: ( ruleWORD )
            // InternalBddDsl.g:4228:5: ruleWORD
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeActionRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeclarativeActionRefAccess().getVerbActionDefCrossReference_0_0());
            				
            pushFollow(FOLLOW_67);
            ruleWORD();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4242:3: (otherlv_1= 'on' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==26) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalBddDsl.g:4243:4: otherlv_1= 'on'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_67); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeclarativeActionRefAccess().getOnKeyword_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:4248:3: ( (lv_argument_2_0= ruleSimpleValue ) )?
            int alt128=2;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // InternalBddDsl.g:4249:4: (lv_argument_2_0= ruleSimpleValue )
                    {
                    // InternalBddDsl.g:4249:4: (lv_argument_2_0= ruleSimpleValue )
                    // InternalBddDsl.g:4250:5: lv_argument_2_0= ruleSimpleValue
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeActionRefAccess().getArgumentSimpleValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_68);
                    lv_argument_2_0=ruleSimpleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeActionRefRule());
                    					}
                    					set(
                    						current,
                    						"argument",
                    						lv_argument_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.SimpleValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:4267:3: ( (lv_preposition_3_0= rulePREP ) )?
            int alt129=2;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt129=1;
                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    {
                    alt129=1;
                    }
                    break;
                case 31:
                case 32:
                    {
                    alt129=1;
                    }
                    break;
            }

            switch (alt129) {
                case 1 :
                    // InternalBddDsl.g:4268:4: (lv_preposition_3_0= rulePREP )
                    {
                    // InternalBddDsl.g:4268:4: (lv_preposition_3_0= rulePREP )
                    // InternalBddDsl.g:4269:5: lv_preposition_3_0= rulePREP
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeActionRefAccess().getPrepositionPREPParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_69);
                    lv_preposition_3_0=rulePREP();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeActionRefRule());
                    					}
                    					set(
                    						current,
                    						"preposition",
                    						lv_preposition_3_0,
                    						"dk.sdu.bdd.xtext.BddDsl.PREP");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:4286:3: ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )?
            int alt131=2;
            alt131 = dfa131.predict(input);
            switch (alt131) {
                case 1 :
                    // InternalBddDsl.g:4287:4: (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) )
                    {
                    // InternalBddDsl.g:4287:4: (otherlv_4= 'the' | otherlv_5= 'on' )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==22) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==26) ) {
                        alt130=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalBddDsl.g:4288:5: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_70); 

                            					newLeafNode(otherlv_4, grammarAccess.getDeclarativeActionRefAccess().getTheKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:4293:5: otherlv_5= 'on'
                            {
                            otherlv_5=(Token)match(input,26,FOLLOW_70); 

                            					newLeafNode(otherlv_5, grammarAccess.getDeclarativeActionRefAccess().getOnKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBddDsl.g:4298:4: ( (lv_entity_6_0= ruleDeclarativeEntityDef ) )
                    // InternalBddDsl.g:4299:5: (lv_entity_6_0= ruleDeclarativeEntityDef )
                    {
                    // InternalBddDsl.g:4299:5: (lv_entity_6_0= ruleDeclarativeEntityDef )
                    // InternalBddDsl.g:4300:6: lv_entity_6_0= ruleDeclarativeEntityDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeActionRefAccess().getEntityDeclarativeEntityDefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_entity_6_0=ruleDeclarativeEntityDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeActionRefRule());
                    						}
                    						set(
                    							current,
                    							"entity",
                    							lv_entity_6_0,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDeclarativeActionRef"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalBddDsl.g:4322:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalBddDsl.g:4322:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalBddDsl.g:4323:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalBddDsl.g:4329:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalBddDsl.g:4335:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalBddDsl.g:4336:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalBddDsl.g:4336:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalBddDsl.g:4337:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_71); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,52,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDOUBLE"

    // Delegated rules


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA131 dfa131 = new DFA131(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\6\uffff\1\4\3\uffff";
    static final String dfa_3s = "\1\53\6\uffff\1\47\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\10\1\7";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\12\uffff\1\5\6\uffff\1\6\3\uffff\1\3\1\4\1\uffff\1\7\5\uffff\1\2\3\uffff\1\10\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\12\uffff\1\11\6\uffff\1\12\3\uffff\2\11\7\uffff\1\11\3\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1671:3: (otherlv_3= 'out' | otherlv_4= 'off' | otherlv_5= 'on' | otherlv_6= 'in' | otherlv_7= '-' | otherlv_8= 'the' | (otherlv_9= 'to' otherlv_10= 'the' ) | otherlv_11= 'to' )?";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\47\2\4\1\uffff\1\4\1\56\1\5\1\34\1\20\1\4\1\20\1\34\1\uffff";
    static final String dfa_9s = "\1\47\2\62\1\uffff\1\62\1\56\1\6\1\62\1\63\1\62\1\63\1\62\1\uffff";
    static final String dfa_10s = "\3\uffff\1\2\10\uffff\1\1";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\3\1\10\1\7\17\uffff\1\2\5\uffff\1\3\2\uffff\1\3\14\uffff\1\4\1\5\1\uffff\1\3\1\uffff\1\6\1\3",
            "\1\3\1\10\1\7\17\uffff\1\3\5\uffff\1\3\2\uffff\1\3\15\uffff\1\5\1\uffff\1\3\1\uffff\1\6\1\3",
            "",
            "\1\3\1\10\1\7\17\uffff\1\3\5\uffff\1\3\2\uffff\1\3\15\uffff\1\5\1\uffff\1\3\1\uffff\1\6\1\3",
            "\1\11",
            "\1\13\1\12",
            "\1\3\2\uffff\1\3\5\uffff\1\14\1\uffff\2\14\7\uffff\1\14\1\uffff\1\3",
            "\1\3\13\uffff\1\3\2\uffff\1\3\5\uffff\1\14\1\uffff\2\14\7\uffff\1\14\1\uffff\2\3",
            "\1\3\1\10\1\7\17\uffff\1\3\5\uffff\1\3\2\uffff\1\3\17\uffff\1\3\1\uffff\1\6\1\3",
            "\1\3\13\uffff\1\3\2\uffff\1\3\5\uffff\1\14\1\uffff\2\14\7\uffff\1\14\1\uffff\2\3",
            "\1\3\2\uffff\1\3\5\uffff\1\14\1\uffff\2\14\7\uffff\1\14\1\uffff\1\3",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1817:3: ( ( ( (otherlv_28= 'Given' otherlv_29= 'the' ) | (otherlv_30= 'Given' otherlv_31= 'I' ) | otherlv_32= 'Given' ) (otherlv_33= 'do' otherlv_34= 'not' )? ruleOPTION ) | (otherlv_36= 'Given' (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )? (otherlv_41= 'do' otherlv_42= 'not' )? ( (lv_preStateE_43_0= ruleDeclarativeScenarioState ) ) ) )";
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\2\4\1\26\2\uffff\1\5\1\uffff\1\4\1\5\1\20\1\5\1\uffff\1\20\1\5\2\20";
    static final String dfa_15s = "\2\62\1\26\2\uffff\1\62\1\uffff\1\62\1\6\1\63\1\62\1\uffff\1\63\1\6\2\63";
    static final String dfa_16s = "\3\uffff\1\3\1\4\1\uffff\1\1\4\uffff\1\2\4\uffff";
    static final String dfa_17s = "\20\uffff}>";
    static final String[] dfa_18s = {
            "\3\4\17\uffff\1\1\5\uffff\1\4\2\uffff\1\4\14\uffff\1\3\1\4\1\uffff\1\2\1\uffff\2\4",
            "\1\5\2\6\17\uffff\1\6\5\uffff\1\6\2\uffff\1\6\15\uffff\1\6\1\uffff\1\6\1\uffff\2\6",
            "\1\7",
            "",
            "",
            "\1\11\1\6\25\uffff\1\6\2\uffff\1\6\21\uffff\1\10\1\6",
            "",
            "\1\12\2\13\17\uffff\1\13\5\uffff\1\13\2\uffff\1\13\15\uffff\1\13\1\uffff\1\13\1\uffff\2\13",
            "\1\6\1\14",
            "\1\4\13\uffff\1\6\2\uffff\1\6\22\uffff\1\6\1\4",
            "\1\16\1\13\25\uffff\1\13\2\uffff\1\13\21\uffff\1\15\1\13",
            "",
            "\1\4\13\uffff\1\6\2\uffff\1\6\22\uffff\1\6\1\4",
            "\1\13\1\17",
            "\1\4\13\uffff\1\13\2\uffff\1\13\22\uffff\1\13\1\4",
            "\1\4\13\uffff\1\13\2\uffff\1\13\22\uffff\1\13\1\4"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1871:5: (otherlv_37= 'the' | (otherlv_38= 'all' otherlv_39= 'the' ) | otherlv_40= 'I' )?";
        }
    }
    static final String dfa_19s = "\1\47\1\4\2\uffff\2\4\1\5\1\4\1\56\2\4";
    static final String dfa_20s = "\1\60\1\62\2\uffff\2\62\1\6\1\51\1\56\1\51\1\62";
    static final String dfa_21s = "\2\uffff\1\1\1\2\7\uffff";
    static final String[] dfa_22s = {
            "\1\3\1\1\7\uffff\1\2",
            "\1\3\1\7\1\2\17\uffff\1\5\10\uffff\1\3\14\uffff\1\4\1\2\1\uffff\1\3\1\uffff\1\6\1\3",
            "",
            "",
            "\1\3\1\7\1\2\17\uffff\1\3\10\uffff\1\3\15\uffff\1\10\1\uffff\1\3\1\uffff\1\6\1\3",
            "\1\3\1\7\1\2\17\uffff\1\3\10\uffff\1\3\15\uffff\1\2\1\uffff\1\3\1\uffff\1\6\1\3",
            "\1\2\1\11",
            "\1\3\40\uffff\1\2\3\uffff\1\2",
            "\1\12",
            "\1\3\40\uffff\1\2\3\uffff\1\2",
            "\1\3\1\7\1\2\17\uffff\1\3\10\uffff\1\3\17\uffff\1\3\1\uffff\1\6\1\3"
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_5;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1943:3: ( ( ( (otherlv_45= 'When' otherlv_46= 'I' ) | (otherlv_47= 'When' otherlv_48= 'the' ) | otherlv_49= 'When' | (otherlv_50= 'And' otherlv_51= 'I' ) ) (otherlv_52= 'do' otherlv_53= 'not' )? ruleOPTION ) | ( ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' ) ( (lv_actionE_66_0= ruleDeclarativeScenarioAction ) ) ) )";
        }
    }
    static final String dfa_23s = "\53\uffff";
    static final String dfa_24s = "\1\47\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\5\2\4\1\5\1\uffff\1\5\2\26\1\4\1\26\1\4\1\uffff\1\5\2\37\2\4\1\5\1\4\1\5\1\35\1\26\2\5\1\uffff\1\35\1\26\1\6\2\uffff\1\26\1\uffff";
    static final String dfa_25s = "\1\50\1\62\1\uffff\1\62\1\uffff\1\62\2\uffff\1\62\1\uffff\1\62\1\6\2\62\1\6\1\uffff\1\61\2\57\1\62\1\26\1\62\1\uffff\1\6\2\37\1\62\1\4\1\61\1\4\1\6\1\51\1\26\1\61\1\6\1\uffff\1\51\1\62\1\6\2\uffff\1\57\1\uffff";
    static final String dfa_26s = "\2\uffff\1\4\1\uffff\1\5\1\uffff\1\2\1\1\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\14\uffff\1\3\3\uffff\2\3\1\uffff\1\3";
    static final String dfa_27s = "\53\uffff}>";
    static final String[] dfa_28s = {
            "\1\2\1\1",
            "\2\4\20\uffff\1\5\10\uffff\1\4\14\uffff\1\3\2\uffff\1\4\1\uffff\2\4",
            "",
            "\2\7\20\uffff\1\7\10\uffff\1\7\15\uffff\1\6\1\uffff\1\7\1\uffff\2\7",
            "",
            "\1\10\1\11\20\uffff\1\11\10\uffff\1\11\17\uffff\1\11\1\uffff\2\11",
            "",
            "",
            "\1\11\1\12\1\11\6\uffff\1\11\7\uffff\2\11\3\uffff\7\11\2\uffff\1\11\13\uffff\1\11\1\uffff\1\13\1\11",
            "",
            "\1\14\1\11\7\uffff\1\11\7\uffff\2\11\3\uffff\7\11\2\uffff\1\11\1\uffff\1\11\3\uffff\1\11\5\uffff\1\11\1\uffff\2\11",
            "\1\11\1\15",
            "\1\20\1\17\1\11\6\uffff\1\17\1\uffff\1\17\6\uffff\1\23\3\uffff\2\17\1\uffff\1\4\1\uffff\1\21\3\uffff\1\17\1\uffff\1\4\3\uffff\1\4\5\uffff\1\24\1\uffff\1\16\1\22",
            "\1\25\1\17\20\uffff\1\17\3\uffff\7\17\2\uffff\1\17\1\uffff\1\17\3\uffff\1\17\5\uffff\1\17\1\uffff\2\17",
            "\2\26",
            "",
            "\1\31\1\30\10\uffff\1\26\41\uffff\1\27",
            "\1\32\30\uffff\1\24",
            "\1\33\30\uffff\1\24",
            "\1\34\1\26\7\uffff\1\26\10\uffff\1\26\3\uffff\2\26\3\uffff\1\26\3\uffff\1\26\13\uffff\1\26\1\uffff\2\26",
            "\1\35",
            "\1\4\1\37\1\26\17\uffff\1\4\6\uffff\1\4\1\uffff\1\4\5\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\1\36\1\4",
            "",
            "\1\31\1\30",
            "\1\40",
            "\1\40",
            "\1\34\1\26\7\uffff\1\26\10\uffff\1\26\3\uffff\2\26\3\uffff\1\26\3\uffff\1\26\13\uffff\1\26\1\uffff\2\26",
            "\1\41",
            "\2\43\52\uffff\1\42",
            "\1\41",
            "\1\43\1\44",
            "\1\4\1\uffff\1\43\5\uffff\1\4\3\uffff\1\4",
            "\1\45",
            "\1\47\53\uffff\1\46",
            "\2\50",
            "",
            "\1\4\1\uffff\1\50\5\uffff\1\4\3\uffff\1\4",
            "\1\33\10\uffff\1\51\17\uffff\1\24\2\uffff\1\22",
            "\1\52",
            "",
            "",
            "\1\33\30\uffff\1\24",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "2004:5: ( (otherlv_55= 'When' otherlv_56= 'I' ) | (otherlv_57= 'When' otherlv_58= 'I' otherlv_59= 'do' otherlv_60= 'not' ) | (otherlv_61= 'When' otherlv_62= 'the' ) | (otherlv_63= 'Given' otherlv_64= 'I' ) | otherlv_65= 'When' )";
        }
    }
    static final String dfa_29s = "\4\uffff\2\14\4\uffff\2\14\1\uffff";
    static final String dfa_30s = "\1\51\1\4\1\56\1\5\2\14\2\4\1\uffff\1\4\2\14\1\uffff";
    static final String dfa_31s = "\1\51\1\62\1\56\1\6\1\62\1\63\2\62\1\uffff\1\62\1\63\1\62\1\uffff";
    static final String dfa_32s = "\10\uffff\1\2\3\uffff\1\1";
    static final String[] dfa_33s = {
            "\1\1",
            "\1\10\1\5\1\4\17\uffff\1\7\5\uffff\1\10\2\uffff\1\10\14\uffff\1\6\1\2\1\uffff\1\10\1\uffff\1\3\1\10",
            "\1\11",
            "\1\13\1\12",
            "\2\14\13\uffff\1\14\2\uffff\1\10\2\uffff\1\10\5\uffff\1\14\4\uffff\1\14\7\uffff\1\10",
            "\2\14\2\uffff\1\10\10\uffff\1\14\2\uffff\1\10\2\uffff\1\10\5\uffff\1\14\4\uffff\1\14\7\uffff\2\10",
            "\1\10\1\5\1\4\17\uffff\1\10\5\uffff\1\10\2\uffff\1\10\15\uffff\1\2\1\uffff\1\10\1\uffff\1\3\1\10",
            "\1\10\1\5\1\4\17\uffff\1\10\5\uffff\1\10\2\uffff\1\10\15\uffff\1\2\1\uffff\1\10\1\uffff\1\3\1\10",
            "",
            "\1\10\1\5\1\4\17\uffff\1\10\5\uffff\1\10\2\uffff\1\10\17\uffff\1\10\1\uffff\1\3\1\10",
            "\2\14\2\uffff\1\10\10\uffff\1\14\2\uffff\1\10\2\uffff\1\10\5\uffff\1\14\4\uffff\1\14\7\uffff\2\10",
            "\2\14\13\uffff\1\14\2\uffff\1\10\2\uffff\1\10\5\uffff\1\14\4\uffff\1\14\7\uffff\1\10",
            ""
    };
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_7;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_11;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "2102:3: ( ( ( (otherlv_68= 'Then' otherlv_69= 'the' ) | (otherlv_70= 'Then' otherlv_71= 'I' ) | otherlv_72= 'Then' ) (otherlv_73= 'do' otherlv_74= 'not' )? ruleOPTION ) | (otherlv_76= 'Then' (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )? (otherlv_81= 'do' otherlv_82= 'not' )? ( (lv_preStateE1_83_0= ruleDeclarativeScenarioState ) ) ) )";
        }
    }
    static final String dfa_34s = "\2\4\1\26\3\uffff\1\5\1\4\1\5\1\20\1\5\1\uffff\1\20\1\5\2\20";
    static final String dfa_35s = "\2\62\1\26\3\uffff\2\62\1\6\1\63\1\62\1\uffff\1\63\1\6\2\63";
    static final String dfa_36s = "\3\uffff\1\3\1\4\1\1\5\uffff\1\2\4\uffff";
    static final String[] dfa_37s = {
            "\3\4\17\uffff\1\1\5\uffff\1\4\2\uffff\1\4\14\uffff\1\3\1\4\1\uffff\1\2\1\uffff\2\4",
            "\1\6\2\5\17\uffff\1\5\5\uffff\1\5\2\uffff\1\5\15\uffff\1\5\1\uffff\1\5\1\uffff\2\5",
            "\1\7",
            "",
            "",
            "",
            "\1\11\1\5\25\uffff\1\5\2\uffff\1\5\21\uffff\1\10\1\5",
            "\1\12\2\13\17\uffff\1\13\5\uffff\1\13\2\uffff\1\13\15\uffff\1\13\1\uffff\1\13\1\uffff\2\13",
            "\1\5\1\14",
            "\1\4\13\uffff\1\5\2\uffff\1\5\22\uffff\1\5\1\4",
            "\1\16\1\13\25\uffff\1\13\2\uffff\1\13\21\uffff\1\15\1\13",
            "",
            "\1\4\13\uffff\1\5\2\uffff\1\5\22\uffff\1\5\1\4",
            "\1\13\1\17",
            "\1\4\13\uffff\1\13\2\uffff\1\13\22\uffff\1\13\1\4",
            "\1\4\13\uffff\1\13\2\uffff\1\13\22\uffff\1\13\1\4"
    };
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_17;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "2156:5: (otherlv_77= 'the' | (otherlv_78= 'all' otherlv_79= 'the' ) | otherlv_80= 'I' )?";
        }
    }
    static final String dfa_38s = "\75\uffff";
    static final String dfa_39s = "\24\uffff\1\7\7\uffff\1\7\12\uffff\1\7\4\uffff\1\7\3\uffff\1\7\5\uffff\1\7\1\uffff\1\7\1\uffff\3\7";
    static final String dfa_40s = "\1\4\1\5\1\4\1\5\1\34\1\20\1\4\2\uffff\1\5\2\34\2\4\1\5\3\4\1\26\1\5\1\4\1\20\1\34\4\4\1\6\2\4\1\5\2\37\2\26\1\4\1\5\11\4\1\26\1\5\1\4\1\5\2\4\1\5\1\26\1\4\1\6\1\4\1\5\3\4";
    static final String dfa_41s = "\3\62\1\6\1\62\1\63\1\62\2\uffff\1\6\4\62\1\61\3\62\1\26\1\6\2\63\5\62\1\6\1\63\1\62\1\6\2\37\2\57\1\62\1\61\2\4\1\63\2\56\2\62\1\63\1\62\1\26\1\6\1\63\1\61\2\6\1\61\1\62\1\63\1\6\1\63\1\6\3\63";
    static final String dfa_42s = "\7\uffff\1\1\1\2\64\uffff";
    static final String dfa_43s = "\75\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\1\5\1\4\17\uffff\1\10\5\uffff\1\7\2\uffff\1\6\17\uffff\1\10\1\uffff\1\3\1\2",
            "\1\13\1\12\25\uffff\1\7\2\uffff\1\15\21\uffff\1\11\1\14",
            "\1\16\1\24\1\4\17\uffff\1\21\5\uffff\1\7\2\uffff\1\17\17\uffff\1\22\1\uffff\1\23\1\20",
            "\1\26\1\25",
            "\1\7\2\uffff\1\15\22\uffff\1\27",
            "\1\10\13\uffff\1\7\2\uffff\1\15\22\uffff\1\27\1\10",
            "\1\16\1\34\20\uffff\1\30\10\uffff\1\32\17\uffff\1\22\1\uffff\1\33\1\31",
            "",
            "",
            "\1\13\1\12",
            "\1\7\2\uffff\1\35\22\uffff\1\27",
            "\1\7\2\uffff\1\35\22\uffff\1\27",
            "\1\16\1\24\1\4\17\uffff\1\21\5\uffff\1\7\2\uffff\1\17\17\uffff\1\22\1\uffff\1\23\1\20",
            "\1\16\1\34\20\uffff\1\30\10\uffff\1\32\17\uffff\1\22\1\uffff\1\33\1\31",
            "\1\40\1\37\52\uffff\1\36",
            "\1\16\1\34\20\uffff\1\30\10\uffff\1\32\17\uffff\1\22\1\uffff\1\33\1\31",
            "\1\16\1\34\20\uffff\1\43\10\uffff\1\41\17\uffff\1\22\1\uffff\1\33\1\42",
            "\1\44\1\24\1\4\17\uffff\1\45\5\uffff\1\7\2\uffff\1\17\17\uffff\1\22\1\uffff\1\23\1\20",
            "\1\46",
            "\1\26\1\47",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\2\uffff\1\7\2\uffff\1\15\5\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\1\uffff\1\27\1\51",
            "\1\10\13\uffff\1\7\2\uffff\1\15\22\uffff\1\27\1\10",
            "\1\7\2\uffff\1\15\22\uffff\1\27",
            "\1\16\1\34\20\uffff\1\43\10\uffff\1\41\17\uffff\1\22\1\uffff\1\33\1\42",
            "\1\44\1\34\20\uffff\1\45\10\uffff\1\32\17\uffff\1\22\1\uffff\1\33\1\31",
            "\2\10\20\uffff\1\52\10\uffff\1\10\17\uffff\1\22\1\uffff\2\10",
            "\2\10\20\uffff\1\53\10\uffff\1\10\17\uffff\1\22\1\uffff\2\10",
            "\1\54",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\13\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\16\1\34\20\uffff\1\55\10\uffff\1\32\17\uffff\1\22\1\uffff\1\33\1\31",
            "\1\40\1\37",
            "\1\56",
            "\1\56",
            "\1\45\30\uffff\1\22",
            "\1\45\30\uffff\1\22",
            "\1\44\1\34\20\uffff\1\45\10\uffff\1\41\17\uffff\1\22\1\uffff\1\33\1\42",
            "\1\60\1\37\52\uffff\1\57",
            "\1\61",
            "\1\61",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\2\uffff\1\7\2\uffff\1\15\5\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\1\uffff\1\27\1\51",
            "\1\10\2\7\47\uffff\1\62",
            "\1\10\2\7\47\uffff\1\63",
            "\1\64\1\10\20\uffff\1\10\10\uffff\1\10\17\uffff\1\10\1\uffff\2\10",
            "\1\64\1\10\20\uffff\1\10\10\uffff\1\10\17\uffff\1\10\1\uffff\2\10",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\13\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\44\1\34\20\uffff\1\45\10\uffff\1\32\17\uffff\1\22\1\uffff\1\33\1\31",
            "\1\65",
            "\1\40\1\66",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\5\uffff\1\56\5\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\70\53\uffff\1\67",
            "\1\10\2\7",
            "\1\10\2\7",
            "\1\72\1\10\52\uffff\1\71",
            "\1\45\10\uffff\1\41\17\uffff\1\22\2\uffff\1\42",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\5\uffff\1\56\5\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\73",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\13\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\10\1\74",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\5\uffff\1\10\5\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\13\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51",
            "\1\7\7\uffff\2\7\2\uffff\1\50\1\7\7\uffff\1\7\5\uffff\1\10\5\uffff\1\7\1\uffff\2\7\1\uffff\1\7\5\uffff\1\7\2\uffff\1\51"
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "2444:2: (this_DeclarativeEntityPropertyStatePhrase_0= ruleDeclarativeEntityPropertyStatePhrase | ( (lv_esp_1_0= ruleDeclarativeEntityStatePhrase ) ) )";
        }
    }
    static final String dfa_45s = "\1\4\1\5\1\uffff\1\5\1\20\2\uffff\1\5\2\37\1\20\1\4\1\uffff";
    static final String dfa_46s = "\2\62\1\uffff\1\6\1\63\2\uffff\1\6\2\62\1\63\1\62\1\uffff";
    static final String dfa_47s = "\2\uffff\1\1\2\uffff\1\1\1\2\5\uffff\1\1";
    static final String[] dfa_48s = {
            "\1\1\1\4\1\2\17\uffff\1\6\10\uffff\1\5\17\uffff\1\6\1\uffff\1\3\1\2",
            "\1\11\1\10\30\uffff\1\5\21\uffff\1\7\1\5",
            "",
            "\1\5\1\12",
            "\1\6\16\uffff\1\5\22\uffff\1\5\1\6",
            "",
            "",
            "\1\11\1\10",
            "\1\13\22\uffff\1\5",
            "\1\13\22\uffff\1\5",
            "\1\6\16\uffff\1\5\22\uffff\1\5\1\6",
            "\2\14\20\uffff\1\14\10\uffff\1\14\17\uffff\1\14\1\uffff\2\14",
            ""
    };
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_11;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "2818:3: ( ( ( ruleWORD ) )? (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )? ( ruleOPTION )? (otherlv_5= 'for' | (otherlv_6= 'for' otherlv_7= 'the' ) )? (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' ) )?";
        }
    }
    static final String dfa_49s = "\16\uffff";
    static final String dfa_50s = "\1\5\1\4\1\uffff\1\4\2\uffff\1\5\1\20\2\uffff\1\5\3\20";
    static final String dfa_51s = "\2\62\1\uffff\1\62\2\uffff\1\6\1\63\2\uffff\1\6\3\63";
    static final String dfa_52s = "\2\uffff\1\3\1\uffff\2\1\2\uffff\2\2\4\uffff";
    static final String dfa_53s = "\16\uffff}>";
    static final String[] dfa_54s = {
            "\2\2\30\uffff\1\2\21\uffff\1\2\1\1",
            "\1\2\1\7\1\5\17\uffff\1\3\10\uffff\1\4\17\uffff\1\2\1\uffff\1\6\1\5",
            "",
            "\1\2\1\13\1\11\17\uffff\1\2\10\uffff\1\10\17\uffff\1\2\1\uffff\1\12\1\11",
            "",
            "",
            "\1\5\1\14",
            "\1\2\16\uffff\1\5\22\uffff\1\5\1\2",
            "",
            "",
            "\1\11\1\15",
            "\1\2\16\uffff\1\11\22\uffff\1\11\1\2",
            "\1\2\16\uffff\1\5\22\uffff\1\5\1\2",
            "\1\2\16\uffff\1\11\22\uffff\1\11\1\2"
    };

    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_49;
            this.eof = dfa_49;
            this.min = dfa_50;
            this.max = dfa_51;
            this.accept = dfa_52;
            this.special = dfa_53;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "2835:4: (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )?";
        }
    }
    static final String dfa_55s = "\21\uffff";
    static final String dfa_56s = "\1\37\2\4\1\uffff\1\4\1\uffff\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\20\1\5\3\20";
    static final String dfa_57s = "\3\62\1\uffff\1\62\1\uffff\1\62\1\61\1\uffff\1\61\1\uffff\1\6\1\63\1\6\3\63";
    static final String dfa_58s = "\3\uffff\1\1\1\uffff\1\4\2\uffff\1\2\1\uffff\1\3\6\uffff";
    static final String dfa_59s = "\21\uffff}>";
    static final String[] dfa_60s = {
            "\1\2\22\uffff\1\1",
            "\2\3\20\uffff\1\4\10\uffff\1\3\17\uffff\1\3\1\uffff\2\3",
            "\2\5\20\uffff\1\6\10\uffff\1\5\17\uffff\1\5\1\uffff\2\5",
            "",
            "\1\7\1\10\20\uffff\1\10\10\uffff\1\10\17\uffff\1\10\1\uffff\2\10",
            "",
            "\1\11\1\12\20\uffff\1\12\10\uffff\1\12\17\uffff\1\12\1\uffff\2\12",
            "\1\14\1\10\52\uffff\1\13",
            "",
            "\1\16\1\12\52\uffff\1\15",
            "",
            "\1\10\1\17",
            "\1\3\16\uffff\1\10\23\uffff\1\3",
            "\1\12\1\20",
            "\1\5\16\uffff\1\12\23\uffff\1\5",
            "\1\3\16\uffff\1\10\23\uffff\1\3",
            "\1\5\16\uffff\1\12\23\uffff\1\5"
    };

    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_55;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "2878:4: (otherlv_8= 'of' | (otherlv_9= 'of' otherlv_10= 'the' ) | (otherlv_11= 'for' otherlv_12= 'the' ) | otherlv_13= 'for' )";
        }
    }
    static final String dfa_61s = "\17\uffff";
    static final String dfa_62s = "\5\uffff\1\2\3\uffff\1\2\3\uffff\2\2";
    static final String dfa_63s = "\1\5\1\4\1\uffff\1\5\1\uffff\1\4\2\uffff\2\4\2\uffff\1\5\2\4";
    static final String dfa_64s = "\2\62\1\uffff\1\6\1\uffff\1\63\2\uffff\1\62\1\63\2\uffff\1\6\2\63";
    static final String dfa_65s = "\2\uffff\1\3\1\uffff\1\1\1\uffff\2\1\2\uffff\2\2\3\uffff";
    static final String dfa_66s = "\17\uffff}>";
    static final String[] dfa_67s = {
            "\2\2\25\uffff\1\2\2\uffff\1\2\21\uffff\1\2\1\1",
            "\1\2\1\5\1\4\17\uffff\1\10\5\uffff\1\7\2\uffff\1\7\17\uffff\1\2\1\uffff\1\3\1\6",
            "",
            "\1\7\1\11",
            "",
            "\1\2\7\uffff\2\2\2\uffff\2\2\7\uffff\1\2\2\uffff\1\7\2\uffff\1\7\5\uffff\1\2\1\uffff\2\2\1\uffff\1\2\5\uffff\1\2\1\uffff\1\7\1\2",
            "",
            "",
            "\1\2\1\15\1\13\17\uffff\1\2\5\uffff\1\13\2\uffff\1\12\17\uffff\1\2\1\uffff\1\14\1\13",
            "\1\2\7\uffff\2\2\2\uffff\2\2\7\uffff\1\2\2\uffff\1\7\2\uffff\1\7\5\uffff\1\2\1\uffff\2\2\1\uffff\1\2\5\uffff\1\2\1\uffff\1\7\1\2",
            "",
            "",
            "\1\13\1\16",
            "\1\2\7\uffff\2\2\2\uffff\2\2\7\uffff\1\2\2\uffff\1\13\2\uffff\1\13\5\uffff\1\2\1\uffff\2\2\1\uffff\1\2\5\uffff\1\2\1\uffff\1\13\1\2",
            "\1\2\7\uffff\2\2\2\uffff\2\2\7\uffff\1\2\2\uffff\1\13\2\uffff\1\13\5\uffff\1\2\1\uffff\2\2\1\uffff\1\2\5\uffff\1\2\1\uffff\1\13\1\2"
    };

    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_61;
            this.eof = dfa_62;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "3060:3: (otherlv_1= 'of' | (otherlv_2= 'of' otherlv_3= 'the' ) )?";
        }
    }
    static final String dfa_68s = "\22\uffff";
    static final String dfa_69s = "\15\uffff\1\5\1\uffff\1\6\1\5\1\6";
    static final String dfa_70s = "\1\34\2\4\1\uffff\1\4\2\uffff\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\4\1\5\3\4";
    static final String dfa_71s = "\3\62\1\uffff\1\62\2\uffff\1\62\1\61\1\uffff\1\61\1\uffff\1\6\1\63\1\6\3\63";
    static final String dfa_72s = "\3\uffff\1\3\1\uffff\1\1\1\2\2\uffff\1\5\1\uffff\1\4\6\uffff";
    static final String dfa_73s = "\22\uffff}>";
    static final String[] dfa_74s = {
            "\1\3\2\uffff\1\2\22\uffff\1\1",
            "\2\5\20\uffff\1\4\10\uffff\1\5\17\uffff\1\5\1\uffff\2\5",
            "\2\6\20\uffff\1\7\10\uffff\1\6\17\uffff\1\6\1\uffff\2\6",
            "",
            "\1\10\1\11\20\uffff\1\11\10\uffff\1\11\17\uffff\1\11\1\uffff\2\11",
            "",
            "",
            "\1\12\1\13\20\uffff\1\13\10\uffff\1\13\17\uffff\1\13\1\uffff\2\13",
            "\1\15\1\11\52\uffff\1\14",
            "",
            "\1\17\1\13\52\uffff\1\16",
            "",
            "\1\11\1\20",
            "\1\5\7\uffff\2\5\2\uffff\2\5\7\uffff\1\5\5\uffff\1\11\5\uffff\1\5\1\uffff\2\5\1\uffff\1\5\5\uffff\1\5\2\uffff\1\5",
            "\1\13\1\21",
            "\1\6\7\uffff\2\6\2\uffff\2\6\7\uffff\1\6\5\uffff\1\13\5\uffff\1\6\1\uffff\2\6\1\uffff\1\6\5\uffff\1\6\2\uffff\1\6",
            "\1\5\7\uffff\2\5\2\uffff\2\5\7\uffff\1\5\5\uffff\1\11\5\uffff\1\5\1\uffff\2\5\1\uffff\1\5\5\uffff\1\5\2\uffff\1\5",
            "\1\6\7\uffff\2\6\2\uffff\2\6\7\uffff\1\6\5\uffff\1\13\5\uffff\1\6\1\uffff\2\6\1\uffff\1\6\5\uffff\1\6\2\uffff\1\6"
    };

    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[][] dfa_74 = unpackEncodedStringArray(dfa_74s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_68;
            this.eof = dfa_69;
            this.min = dfa_70;
            this.max = dfa_71;
            this.accept = dfa_72;
            this.special = dfa_73;
            this.transition = dfa_74;
        }
        public String getDescription() {
            return "3086:3: (otherlv_5= 'of' | otherlv_6= 'for' | otherlv_7= 'from' | (otherlv_8= 'for' otherlv_9= 'the' ) | (otherlv_10= 'of' otherlv_11= 'the' ) )";
        }
    }
    static final String dfa_75s = "\55\uffff";
    static final String dfa_76s = "\5\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\uffff\2\6\4\uffff\1\6\3\uffff\1\6\12\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\2\2\6\1\uffff\2\2";
    static final String dfa_77s = "\2\4\1\uffff\1\5\2\4\1\uffff\7\4\2\26\1\4\1\26\1\4\1\26\1\4\1\26\1\4\1\26\1\4\1\26\1\5\1\4\1\5\1\4\1\5\1\4\1\6\1\4\1\6\1\4\1\6\5\4\1\5\2\35";
    static final String dfa_78s = "\2\62\1\uffff\1\6\1\64\1\62\1\uffff\7\62\2\57\1\4\1\26\1\62\1\57\1\4\1\26\1\62\1\57\1\4\1\26\1\61\1\4\1\61\1\4\1\61\1\4\1\6\1\62\1\6\1\62\1\6\1\51\3\62\1\51\1\6\2\51";
    static final String dfa_79s = "\2\uffff\1\1\3\uffff\1\2\46\uffff";
    static final String dfa_80s = "\55\uffff}>";
    static final String[] dfa_81s = {
            "\1\1\1\2\20\uffff\1\2\10\uffff\1\2\17\uffff\1\2\1\uffff\2\2",
            "\1\6\1\5\1\4\6\uffff\1\6\7\uffff\2\6\3\uffff\7\6\2\uffff\1\6\13\uffff\1\6\1\uffff\1\3\1\6",
            "",
            "\1\2\1\7",
            "\2\6\7\uffff\1\6\7\uffff\2\6\3\uffff\5\6\1\10\1\6\2\uffff\1\6\13\uffff\1\6\1\uffff\2\6\1\uffff\1\6",
            "\2\6\7\uffff\1\6\7\uffff\2\6\3\uffff\5\6\1\11\1\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "",
            "\2\6\20\uffff\1\6\3\uffff\5\6\1\12\1\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\2\6\7\uffff\1\6\7\uffff\1\6\1\13\3\uffff\2\6\3\uffff\1\6\3\uffff\1\6\13\uffff\1\6\1\uffff\2\6",
            "\2\6\7\uffff\1\6\7\uffff\1\6\1\14\3\uffff\7\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\2\6\20\uffff\1\15\3\uffff\7\6\4\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\2\6\7\uffff\1\6\10\uffff\1\20\3\uffff\2\6\3\uffff\1\16\3\uffff\1\6\13\uffff\1\21\1\uffff\1\6\1\17",
            "\2\6\7\uffff\1\6\10\uffff\1\24\3\uffff\5\6\1\22\1\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\25\1\uffff\1\6\1\23",
            "\2\6\20\uffff\1\30\3\uffff\5\6\1\26\1\6\4\uffff\1\6\3\uffff\1\6\5\uffff\1\31\1\uffff\1\6\1\27",
            "\1\20\30\uffff\1\21",
            "\1\20\30\uffff\1\21",
            "\1\32",
            "\1\33",
            "\2\6\20\uffff\1\24\10\uffff\1\6\5\uffff\1\6\3\uffff\1\6\5\uffff\1\25\1\uffff\2\6",
            "\1\24\30\uffff\1\25",
            "\1\34",
            "\1\35",
            "\2\6\20\uffff\1\30\10\uffff\1\6\5\uffff\1\6\3\uffff\1\6\5\uffff\1\31\1\uffff\2\6",
            "\1\30\30\uffff\1\31",
            "\1\36",
            "\1\37",
            "\1\41\53\uffff\1\40",
            "\1\32",
            "\1\43\53\uffff\1\42",
            "\1\34",
            "\1\45\53\uffff\1\44",
            "\1\36",
            "\1\46",
            "\1\47\1\6\20\uffff\1\6\3\uffff\7\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\1\50",
            "\1\47\1\6\20\uffff\1\6\3\uffff\7\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\1\51",
            "\1\2\40\uffff\1\6\3\uffff\1\6",
            "\1\47\1\6\20\uffff\1\6\3\uffff\7\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\1\2\1\53\1\6\17\uffff\1\2\6\uffff\1\2\1\uffff\1\2\5\uffff\1\2\3\uffff\1\2\5\uffff\1\2\1\uffff\1\52\1\2",
            "\1\47\1\6\20\uffff\1\6\3\uffff\7\6\2\uffff\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff\1\6\1\uffff\2\6",
            "\1\2\40\uffff\1\6\3\uffff\1\6",
            "\1\6\1\54",
            "\1\2\1\uffff\1\6\5\uffff\1\2\3\uffff\1\2",
            "\1\2\1\uffff\1\6\5\uffff\1\2\3\uffff\1\2"
    };

    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final char[] dfa_77 = DFA.unpackEncodedStringToUnsignedChars(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final short[] dfa_79 = DFA.unpackEncodedString(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[][] dfa_81 = unpackEncodedStringArray(dfa_81s);

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_75;
            this.eof = dfa_76;
            this.min = dfa_77;
            this.max = dfa_78;
            this.accept = dfa_79;
            this.special = dfa_80;
            this.transition = dfa_81;
        }
        public String getDescription() {
            return "3548:2: (this_DeclarativeEntityAction_0= ruleDeclarativeEntityAction | this_VerbAction_1= ruleVerbAction )";
        }
    }
    static final String dfa_82s = "\5\uffff\5\3\10\uffff";
    static final String dfa_83s = "\2\4\2\uffff\1\5\5\4\1\26\1\4\1\26\1\5\1\4\1\6\2\uffff";
    static final String dfa_84s = "\2\62\2\uffff\1\6\5\62\1\57\1\4\1\26\1\61\1\4\1\6\2\uffff";
    static final String dfa_85s = "\2\uffff\1\2\1\1\14\uffff\2\1";
    static final String[] dfa_86s = {
            "\1\1\1\2\7\uffff\1\2\10\uffff\1\2\3\uffff\2\2\3\uffff\1\2\3\uffff\1\2\13\uffff\1\2\1\uffff\2\2",
            "\1\3\1\5\1\2\6\uffff\1\3\1\uffff\1\2\6\uffff\1\3\3\uffff\2\3\3\uffff\1\3\3\uffff\1\3\13\uffff\1\3\1\uffff\1\4\1\3",
            "",
            "",
            "\1\2\1\6",
            "\2\3\20\uffff\1\3\3\uffff\5\3\1\7\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3\5\uffff\1\3\1\uffff\2\3",
            "\2\3\20\uffff\1\3\3\uffff\5\3\1\7\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3\5\uffff\1\3\1\uffff\2\3",
            "\2\3\20\uffff\1\10\3\uffff\7\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\3\1\uffff\2\3",
            "\2\3\20\uffff\1\13\3\uffff\5\3\1\11\1\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\14\1\uffff\1\3\1\12",
            "\2\3\20\uffff\1\13\10\uffff\1\3\5\uffff\1\3\3\uffff\1\3\5\uffff\1\14\1\uffff\2\3",
            "\1\13\30\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\20\53\uffff\1\17",
            "\1\15",
            "\1\21",
            "",
            ""
    };
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final char[] dfa_83 = DFA.unpackEncodedStringToUnsignedChars(dfa_83s);
    static final char[] dfa_84 = DFA.unpackEncodedStringToUnsignedChars(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[][] dfa_86 = unpackEncodedStringArray(dfa_86s);

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_68;
            this.eof = dfa_82;
            this.min = dfa_83;
            this.max = dfa_84;
            this.accept = dfa_85;
            this.special = dfa_73;
            this.transition = dfa_86;
        }
        public String getDescription() {
            return "3635:3: ( ruleWORD )?";
        }
    }
    static final String dfa_87s = "\46\uffff";
    static final String dfa_88s = "\13\uffff\1\4\1\uffff\10\4\3\uffff\1\4\15\uffff";
    static final String dfa_89s = "\1\4\1\26\1\4\2\uffff\1\4\1\5\2\uffff\2\5\1\4\1\5\10\4\1\26\1\4\1\26\1\4\1\26\1\4\1\26\1\5\1\4\1\5\1\4\1\6\1\uffff\1\6\3\uffff";
    static final String dfa_90s = "\1\62\1\57\1\62\2\uffff\1\62\1\61\2\uffff\1\61\1\6\1\62\1\6\10\62\1\57\1\4\1\26\1\62\1\57\1\4\1\26\1\61\1\4\1\61\1\4\1\6\1\uffff\1\6\3\uffff";
    static final String dfa_91s = "\3\uffff\1\3\1\4\2\uffff\1\2\1\1\30\uffff\1\2\1\uffff\1\1\1\2\1\1";
    static final String dfa_92s = "\46\uffff}>";
    static final String[] dfa_93s = {
            "\2\4\7\uffff\1\4\10\uffff\1\2\3\uffff\1\3\1\4\3\uffff\1\1\3\uffff\1\4\13\uffff\1\4\1\uffff\2\4",
            "\1\5\30\uffff\1\4",
            "\1\6\1\7\7\uffff\1\7\10\uffff\1\7\3\uffff\2\7\3\uffff\1\7\3\uffff\1\7\13\uffff\1\7\1\uffff\2\7",
            "",
            "",
            "\1\11\1\10\7\uffff\1\10\10\uffff\1\10\3\uffff\2\10\3\uffff\1\10\3\uffff\1\10\13\uffff\1\10\1\uffff\2\10",
            "\1\13\1\7\52\uffff\1\12",
            "",
            "",
            "\1\15\1\10\52\uffff\1\14",
            "\1\7\1\16",
            "\2\4\20\uffff\1\4\3\uffff\5\4\1\17\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\2\4",
            "\1\10\1\20",
            "\2\4\20\uffff\1\4\3\uffff\5\4\1\21\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\2\4",
            "\2\4\20\uffff\1\4\3\uffff\5\4\1\17\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\2\4",
            "\2\4\20\uffff\1\22\3\uffff\7\4\4\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\2\4",
            "\2\4\20\uffff\1\4\3\uffff\5\4\1\21\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\2\4",
            "\2\4\20\uffff\1\23\3\uffff\7\4\4\uffff\1\4\3\uffff\1\4\5\uffff\1\4\1\uffff\2\4",
            "\2\4\20\uffff\1\26\3\uffff\5\4\1\24\1\4\4\uffff\1\4\3\uffff\1\4\5\uffff\1\27\1\uffff\1\4\1\25",
            "\2\4\20\uffff\1\32\3\uffff\5\4\1\30\1\4\4\uffff\1\4\3\uffff\1\4\5\uffff\1\33\1\uffff\1\4\1\31",
            "\2\4\20\uffff\1\26\10\uffff\1\4\5\uffff\1\4\3\uffff\1\4\5\uffff\1\27\1\uffff\2\4",
            "\1\26\30\uffff\1\27",
            "\1\34",
            "\1\35",
            "\2\4\20\uffff\1\32\10\uffff\1\4\5\uffff\1\4\3\uffff\1\4\5\uffff\1\33\1\uffff\2\4",
            "\1\32\30\uffff\1\33",
            "\1\36",
            "\1\37",
            "\1\41\53\uffff\1\40",
            "\1\34",
            "\1\43\53\uffff\1\42",
            "\1\36",
            "\1\44",
            "",
            "\1\45",
            "",
            "",
            ""
    };

    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final char[] dfa_89 = DFA.unpackEncodedStringToUnsignedChars(dfa_89s);
    static final char[] dfa_90 = DFA.unpackEncodedStringToUnsignedChars(dfa_90s);
    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final short[] dfa_92 = DFA.unpackEncodedString(dfa_92s);
    static final short[][] dfa_93 = unpackEncodedStringArray(dfa_93s);

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = dfa_87;
            this.eof = dfa_88;
            this.min = dfa_89;
            this.max = dfa_90;
            this.accept = dfa_91;
            this.special = dfa_92;
            this.transition = dfa_93;
        }
        public String getDescription() {
            return "3670:3: ( (otherlv_7= 'for' otherlv_8= 'the' ) | otherlv_9= 'the' | otherlv_10= 'on' )?";
        }
    }
    static final String dfa_94s = "\1\3\1\5\1\7\1\uffff\1\10\1\uffff\1\13\6\uffff\1\5\1\uffff\1\7\1\5\1\7";
    static final String dfa_95s = "\3\4\1\uffff\1\4\1\uffff\1\4\2\uffff\2\5\1\uffff\1\5\1\37\1\5\3\37";
    static final String dfa_96s = "\3\62\1\uffff\1\62\1\uffff\1\62\2\uffff\2\61\1\uffff\1\6\1\51\1\6\3\51";
    static final String dfa_97s = "\3\uffff\1\5\1\uffff\1\1\1\uffff\1\2\1\4\2\uffff\1\3\6\uffff";
    static final String[] dfa_98s = {
            "\2\3\20\uffff\1\3\3\uffff\5\3\1\2\1\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\3\1\uffff\1\3\1\1",
            "\2\5\20\uffff\1\4\3\uffff\7\5\4\uffff\1\5\3\uffff\1\5\5\uffff\1\5\1\uffff\2\5",
            "\2\7\20\uffff\1\6\3\uffff\7\7\4\uffff\1\7\3\uffff\1\7\5\uffff\1\7\1\uffff\2\7",
            "",
            "\1\11\1\10\20\uffff\1\10\3\uffff\7\10\4\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\2\10",
            "",
            "\1\12\1\13\20\uffff\1\13\3\uffff\7\13\4\uffff\1\13\3\uffff\1\13\5\uffff\1\13\1\uffff\2\13",
            "",
            "",
            "\1\15\1\10\52\uffff\1\14",
            "\1\17\1\13\52\uffff\1\16",
            "",
            "\1\10\1\20",
            "\1\10\5\uffff\1\5\3\uffff\1\5",
            "\1\13\1\21",
            "\1\13\5\uffff\1\7\3\uffff\1\7",
            "\1\10\5\uffff\1\5\3\uffff\1\5",
            "\1\13\5\uffff\1\7\3\uffff\1\7"
    };
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final char[] dfa_95 = DFA.unpackEncodedStringToUnsignedChars(dfa_95s);
    static final char[] dfa_96 = DFA.unpackEncodedStringToUnsignedChars(dfa_96s);
    static final short[] dfa_97 = DFA.unpackEncodedString(dfa_97s);
    static final short[][] dfa_98 = unpackEncodedStringArray(dfa_98s);

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_68;
            this.eof = dfa_94;
            this.min = dfa_95;
            this.max = dfa_96;
            this.accept = dfa_97;
            this.special = dfa_73;
            this.transition = dfa_98;
        }
        public String getDescription() {
            return "3762:3: (otherlv_19= 'of' | otherlv_20= 'for' | (otherlv_21= 'for' otherlv_22= 'the' ) | (otherlv_23= 'of' otherlv_24= 'the' ) )?";
        }
    }
    static final String dfa_99s = "\103\uffff";
    static final String dfa_100s = "\1\3\1\uffff\1\22\1\uffff\7\22\2\uffff\2\3\3\uffff\1\44\3\3\2\uffff\2\3\3\uffff\1\56\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\5\uffff\2\3\2\uffff\1\71\2\uffff\1\73\1\uffff\1\3\16\uffff";
    static final String dfa_101s = "\1\4\1\uffff\1\4\1\uffff\13\4\1\26\1\6\1\uffff\1\0\3\4\2\26\2\4\2\5\1\37\1\4\1\5\4\4\2\uffff\1\4\1\5\1\4\1\26\1\4\1\5\2\4\1\5\1\uffff\1\4\1\37\1\26\1\4\1\5\1\4\3\5\2\uffff\1\26\1\uffff\1\6\1\uffff\1\5\4\uffff";
    static final String dfa_102s = "\1\62\1\uffff\1\62\1\uffff\13\62\1\26\1\6\1\uffff\1\0\3\62\2\57\2\62\1\61\1\6\1\37\1\62\1\61\1\62\1\4\1\62\1\4\2\uffff\1\62\1\61\1\62\1\57\1\62\1\61\2\62\1\6\1\uffff\1\62\1\37\1\26\1\62\1\6\1\62\2\61\1\6\2\uffff\1\62\1\uffff\1\6\1\uffff\1\6\4\uffff";
    static final String dfa_103s = "\1\uffff\1\1\1\uffff\1\2\15\uffff\1\1\21\uffff\2\1\11\uffff\1\1\11\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1";
    static final String dfa_104s = "\103\uffff}>";
    static final String[] dfa_105s = {
            "\1\3\1\2\1\1\6\uffff\1\3\7\uffff\2\3\3\uffff\7\3\2\uffff\1\3\13\uffff\1\3\1\uffff\2\3",
            "",
            "\1\14\1\21\7\uffff\1\1\7\uffff\1\1\1\13\3\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\16",
            "",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\13\3\uffff\1\24\1\25\3\3\1\23\1\3\2\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\16",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\13\3\uffff\1\24\1\25\3\3\1\23\1\3\2\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\16",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\13\3\uffff\2\21\3\uffff\1\26\3\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\13\3\uffff\2\21\3\uffff\1\26\3\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\13\3\uffff\2\21\3\uffff\1\26\3\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\31\3\uffff\1\24\1\25\3\3\1\30\1\3\2\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\14\1\21\7\uffff\1\21\7\uffff\1\21\1\13\3\uffff\2\21\3\uffff\1\26\3\uffff\1\21\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\32\1\21\7\uffff\1\21\10\uffff\1\21\3\uffff\2\21\3\uffff\1\21\3\uffff\1\21\13\uffff\1\21\1\uffff\2\21",
            "\1\21\1\35\1\34\6\uffff\1\21\1\uffff\1\21\6\uffff\1\21\3\uffff\2\21\3\uffff\1\21\3\uffff\1\21\13\uffff\1\21\1\uffff\1\33\1\21",
            "\1\36\1\21\20\uffff\1\40\3\uffff\5\3\1\37\1\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\16",
            "\2\3\20\uffff\1\41\3\uffff\7\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\2\3",
            "\1\42",
            "\1\43",
            "",
            "\1\uffff",
            "\2\3\20\uffff\1\45\3\uffff\7\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\2\3",
            "\1\46\1\21\7\uffff\1\43\10\uffff\1\47\3\uffff\2\43\3\uffff\1\26\3\uffff\1\43\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\36\1\21\20\uffff\1\40\10\uffff\1\50\5\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\51\30\uffff\1\17",
            "\1\40\30\uffff\1\17",
            "\2\3\20\uffff\1\51\10\uffff\1\3\5\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\2\3",
            "\1\52\1\21\7\uffff\1\43\10\uffff\1\40\3\uffff\1\53\1\25\3\3\1\54\1\3\2\uffff\1\43\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\2\56\52\uffff\1\55",
            "\1\60\1\57",
            "\1\61",
            "\2\56\20\uffff\1\56\3\uffff\5\56\1\62\1\56\2\uffff\1\56\1\uffff\1\56\3\uffff\1\56\5\uffff\1\56\1\uffff\2\56",
            "\1\60\1\34\52\uffff\1\63",
            "\2\3\20\uffff\1\64\3\uffff\7\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\2\3",
            "\1\65",
            "\1\66\1\3\20\uffff\1\3\3\uffff\7\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\3\1\uffff\2\3",
            "\1\65",
            "",
            "",
            "\1\52\1\21\7\uffff\1\44\10\uffff\1\40\3\uffff\1\53\1\25\3\3\1\54\1\3\2\uffff\1\44\1\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\1\60\1\34\10\uffff\1\44\41\uffff\1\63",
            "\1\32\1\44\7\uffff\1\44\10\uffff\1\44\3\uffff\2\44\3\uffff\1\44\3\uffff\1\44\13\uffff\1\44\1\uffff\2\44",
            "\1\40\30\uffff\1\17",
            "\1\32\1\44\7\uffff\1\44\10\uffff\1\44\3\uffff\2\44\3\uffff\1\44\3\uffff\1\44\13\uffff\1\44\1\uffff\2\44",
            "\1\70\1\34\52\uffff\1\67",
            "\1\36\1\21\20\uffff\1\40\10\uffff\1\50\5\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\1\20\1\27",
            "\2\3\20\uffff\1\40\10\uffff\1\3\5\uffff\1\3\3\uffff\1\3\5\uffff\1\17\1\uffff\2\3",
            "\2\71",
            "",
            "\2\71\20\uffff\1\71\3\uffff\5\71\1\62\1\71\2\uffff\1\71\1\uffff\1\71\3\uffff\1\71\5\uffff\1\71\1\uffff\2\71",
            "\1\61",
            "\1\72",
            "\2\73\20\uffff\1\73\3\uffff\7\73\4\uffff\1\73\3\uffff\1\73\5\uffff\1\73\1\uffff\2\73",
            "\1\60\1\34",
            "\1\66\1\3\20\uffff\1\3\3\uffff\7\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\3\1\uffff\2\3",
            "\1\75\53\uffff\1\74",
            "\1\77\1\3\52\uffff\1\76",
            "\1\60\1\100",
            "",
            "",
            "\1\40\10\uffff\1\50\17\uffff\1\17\2\uffff\1\27",
            "",
            "\1\101",
            "",
            "\1\3\1\102",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_99 = DFA.unpackEncodedString(dfa_99s);
    static final short[] dfa_100 = DFA.unpackEncodedString(dfa_100s);
    static final char[] dfa_101 = DFA.unpackEncodedStringToUnsignedChars(dfa_101s);
    static final char[] dfa_102 = DFA.unpackEncodedStringToUnsignedChars(dfa_102s);
    static final short[] dfa_103 = DFA.unpackEncodedString(dfa_103s);
    static final short[] dfa_104 = DFA.unpackEncodedString(dfa_104s);
    static final short[][] dfa_105 = unpackEncodedStringArray(dfa_105s);

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = dfa_99;
            this.eof = dfa_100;
            this.min = dfa_101;
            this.max = dfa_102;
            this.accept = dfa_103;
            this.special = dfa_104;
            this.transition = dfa_105;
        }
        public String getDescription() {
            return "4248:3: ( (lv_argument_2_0= ruleSimpleValue ) )?";
        }
    }
    static final String dfa_106s = "\134\uffff";
    static final String dfa_107s = "\1\3\133\uffff";
    static final String dfa_108s = "\3\4\1\uffff\1\16\1\4\2\17\2\4\1\23\1\20\1\21\3\4\1\uffff\4\4\2\21\32\4\1\17\1\4\2\21\13\4\1\21\1\17\3\4\10\21\1\4\2\21\11\4\1\21\2\4";
    static final String dfa_109s = "\3\62\1\uffff\1\16\1\5\2\22\2\4\1\30\2\22\3\4\1\uffff\1\4\1\30\1\43\1\44\1\22\1\30\1\4\12\42\3\4\2\30\3\4\1\30\1\43\2\4\1\30\2\43\1\17\1\4\1\44\1\30\7\42\1\4\3\42\1\30\1\17\3\30\10\42\1\4\2\30\4\43\6\30\2\43";
    static final String dfa_110s = "\3\uffff\1\2\14\uffff\1\1\113\uffff";
    static final String dfa_111s = "\134\uffff}>";
    static final String[] dfa_112s = {
            "\2\3\7\uffff\1\3\7\uffff\1\3\1\1\3\uffff\1\2\1\3\3\uffff\1\3\3\uffff\1\3\13\uffff\1\3\1\uffff\2\3",
            "\2\3\7\uffff\1\4\10\uffff\1\3\3\uffff\2\3\3\uffff\1\3\3\uffff\1\3\13\uffff\1\3\1\uffff\2\3",
            "\2\3\7\uffff\1\4\10\uffff\1\3\3\uffff\2\3\3\uffff\1\3\3\uffff\1\3\13\uffff\1\3\1\uffff\2\3",
            "",
            "\1\5",
            "\1\6\1\7",
            "\1\10\1\11\1\uffff\1\12",
            "\1\10\1\11\1\uffff\1\12",
            "\1\13",
            "\1\14",
            "\1\15\1\16\2\uffff\1\17\1\20",
            "\1\11\1\uffff\1\12",
            "\1\21\1\12",
            "\1\22",
            "\1\23",
            "\1\24",
            "",
            "\1\25",
            "\1\26\14\uffff\1\27\2\uffff\1\16\2\uffff\1\17\1\20",
            "\1\32\14\uffff\1\43\3\uffff\1\30\1\44\1\17\1\20\1\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\42\1\31",
            "\1\46\14\uffff\1\47\3\uffff\1\50\1\51\1\uffff\1\20\13\uffff\1\45",
            "\1\21\1\12",
            "\1\27\2\uffff\1\16\2\uffff\1\17\1\20",
            "\1\52",
            "\1\53\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\42",
            "\1\32\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\42",
            "\1\56\12\uffff\1\55\1\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\42",
            "\1\57",
            "\1\60",
            "\1\60",
            "\1\46\14\uffff\1\47\3\uffff\1\50\1\51\1\uffff\1\20",
            "\1\61\12\uffff\1\62\1\uffff\1\47\3\uffff\1\50\1\51\1\uffff\1\20",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\64\14\uffff\1\27\2\uffff\1\16\2\uffff\1\17\1\20",
            "\1\75\12\uffff\1\55\1\uffff\1\43\3\uffff\1\76\1\44\1\17\1\20\1\uffff\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\uffff\1\74\1\77",
            "\1\60",
            "\1\100",
            "\1\101\12\uffff\1\55\1\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\104\14\uffff\1\43\3\uffff\1\102\1\44\1\17\1\20\12\uffff\1\103",
            "\1\105\14\uffff\1\43\3\uffff\1\76\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115\1\77",
            "\1\62",
            "\1\116",
            "\1\47\3\uffff\1\50\1\51\1\uffff\1\20\13\uffff\1\117",
            "\1\27\2\uffff\1\16\2\uffff\1\17\1\20",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\56\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\74",
            "\1\120",
            "\1\101\12\uffff\1\55\1\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115",
            "\1\121\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115",
            "\1\105\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\55",
            "\1\122\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\104\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\56\12\uffff\1\55\1\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20\11\uffff\1\115",
            "\1\123",
            "\1\47\3\uffff\1\50\1\51\1\uffff\1\20",
            "\1\47\3\uffff\1\50\1\51\1\uffff\1\20",
            "\1\126\14\uffff\1\43\3\uffff\1\124\1\44\1\17\1\20\12\uffff\1\125",
            "\1\105\14\uffff\1\43\3\uffff\1\76\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115\1\77",
            "\1\75\12\uffff\1\55\1\uffff\1\43\3\uffff\1\76\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115\1\77",
            "\1\131\14\uffff\1\43\3\uffff\1\127\1\44\1\17\1\20\12\uffff\1\130",
            "\1\132\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\126\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\56\12\uffff\1\55\1\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\133\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\131\14\uffff\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\43\3\uffff\1\54\1\44\1\17\1\20",
            "\1\75\12\uffff\1\55\1\uffff\1\43\3\uffff\1\76\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115\1\77",
            "\1\105\14\uffff\1\43\3\uffff\1\76\1\44\1\17\1\20\1\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115\1\77"
    };

    static final short[] dfa_106 = DFA.unpackEncodedString(dfa_106s);
    static final short[] dfa_107 = DFA.unpackEncodedString(dfa_107s);
    static final char[] dfa_108 = DFA.unpackEncodedStringToUnsignedChars(dfa_108s);
    static final char[] dfa_109 = DFA.unpackEncodedStringToUnsignedChars(dfa_109s);
    static final short[] dfa_110 = DFA.unpackEncodedString(dfa_110s);
    static final short[] dfa_111 = DFA.unpackEncodedString(dfa_111s);
    static final short[][] dfa_112 = unpackEncodedStringArray(dfa_112s);

    class DFA131 extends DFA {

        public DFA131(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 131;
            this.eot = dfa_106;
            this.eof = dfa_107;
            this.min = dfa_108;
            this.max = dfa_109;
            this.accept = dfa_110;
            this.special = dfa_111;
            this.transition = dfa_112;
        }
        public String getDescription() {
            return "4286:3: ( (otherlv_4= 'the' | otherlv_5= 'on' ) ( (lv_entity_6_0= ruleDeclarativeEntityDef ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040002003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001980000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001920000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E20010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E20000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001620010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001620000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000005FC000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800200012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000008882C408010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000880C408010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000800C408010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008008408010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002200000000060L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000101A000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006B00090400070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001018000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004800080400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0006200080000060L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000080000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0006200090000060L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000090000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000030012L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0006B0089C602070L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0006B0089C402070L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0006B0089C400070L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0006B009FC400072L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0006B001FC400072L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0006B00090400072L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0006B000B0400072L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00000001FC400062L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x00000001FC400002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0010000000000000L});

}