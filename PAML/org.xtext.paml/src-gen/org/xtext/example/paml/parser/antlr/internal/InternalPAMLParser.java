package org.xtext.example.paml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.paml.services.PAMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPAMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CODE", "RULE_ID", "RULE_STRING", "RULE_TEST", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<paml>'", "'</paml>'", "'<meta'", "'lang'", "'='", "'listStyle'", "'listRotation'", "'startComment'", "'/>'", "'<task'", "'title'", "'description'", "'>'", "'</task>'", "'numbers'", "'letters'", "'roman'", "'alternating'", "'same'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_TEST=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_CODE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPAMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPAMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPAMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPAML.g"; }



     	private PAMLGrammarAccess grammarAccess;

        public InternalPAMLParser(TokenStream input, PAMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PAML";
       	}

       	@Override
       	protected PAMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePAML"
    // InternalPAML.g:65:1: entryRulePAML returns [EObject current=null] : iv_rulePAML= rulePAML EOF ;
    public final EObject entryRulePAML() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAML = null;


        try {
            // InternalPAML.g:65:45: (iv_rulePAML= rulePAML EOF )
            // InternalPAML.g:66:2: iv_rulePAML= rulePAML EOF
            {
             newCompositeNode(grammarAccess.getPAMLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAML=rulePAML();

            state._fsp--;

             current =iv_rulePAML; 
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
    // $ANTLR end "entryRulePAML"


    // $ANTLR start "rulePAML"
    // InternalPAML.g:72:1: rulePAML returns [EObject current=null] : (otherlv_0= '<paml>' ( (lv_metaInformation_1_0= ruleMeta ) ) ( (lv_precode_2_0= RULE_CODE ) )? ( (lv_tasks_3_0= ruleTask ) )+ ( (lv_postcode_4_0= RULE_CODE ) )? otherlv_5= '</paml>' ) ;
    public final EObject rulePAML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_precode_2_0=null;
        Token lv_postcode_4_0=null;
        Token otherlv_5=null;
        EObject lv_metaInformation_1_0 = null;

        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalPAML.g:78:2: ( (otherlv_0= '<paml>' ( (lv_metaInformation_1_0= ruleMeta ) ) ( (lv_precode_2_0= RULE_CODE ) )? ( (lv_tasks_3_0= ruleTask ) )+ ( (lv_postcode_4_0= RULE_CODE ) )? otherlv_5= '</paml>' ) )
            // InternalPAML.g:79:2: (otherlv_0= '<paml>' ( (lv_metaInformation_1_0= ruleMeta ) ) ( (lv_precode_2_0= RULE_CODE ) )? ( (lv_tasks_3_0= ruleTask ) )+ ( (lv_postcode_4_0= RULE_CODE ) )? otherlv_5= '</paml>' )
            {
            // InternalPAML.g:79:2: (otherlv_0= '<paml>' ( (lv_metaInformation_1_0= ruleMeta ) ) ( (lv_precode_2_0= RULE_CODE ) )? ( (lv_tasks_3_0= ruleTask ) )+ ( (lv_postcode_4_0= RULE_CODE ) )? otherlv_5= '</paml>' )
            // InternalPAML.g:80:3: otherlv_0= '<paml>' ( (lv_metaInformation_1_0= ruleMeta ) ) ( (lv_precode_2_0= RULE_CODE ) )? ( (lv_tasks_3_0= ruleTask ) )+ ( (lv_postcode_4_0= RULE_CODE ) )? otherlv_5= '</paml>'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPAMLAccess().getPamlKeyword_0());
            		
            // InternalPAML.g:84:3: ( (lv_metaInformation_1_0= ruleMeta ) )
            // InternalPAML.g:85:4: (lv_metaInformation_1_0= ruleMeta )
            {
            // InternalPAML.g:85:4: (lv_metaInformation_1_0= ruleMeta )
            // InternalPAML.g:86:5: lv_metaInformation_1_0= ruleMeta
            {

            					newCompositeNode(grammarAccess.getPAMLAccess().getMetaInformationMetaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_metaInformation_1_0=ruleMeta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPAMLRule());
            					}
            					set(
            						current,
            						"metaInformation",
            						lv_metaInformation_1_0,
            						"org.xtext.example.paml.PAML.Meta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPAML.g:103:3: ( (lv_precode_2_0= RULE_CODE ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CODE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPAML.g:104:4: (lv_precode_2_0= RULE_CODE )
                    {
                    // InternalPAML.g:104:4: (lv_precode_2_0= RULE_CODE )
                    // InternalPAML.g:105:5: lv_precode_2_0= RULE_CODE
                    {
                    lv_precode_2_0=(Token)match(input,RULE_CODE,FOLLOW_4); 

                    					newLeafNode(lv_precode_2_0, grammarAccess.getPAMLAccess().getPrecodeCODETerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPAMLRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"precode",
                    						lv_precode_2_0,
                    						"org.xtext.example.paml.PAML.CODE");
                    				

                    }


                    }
                    break;

            }

            // InternalPAML.g:121:3: ( (lv_tasks_3_0= ruleTask ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPAML.g:122:4: (lv_tasks_3_0= ruleTask )
            	    {
            	    // InternalPAML.g:122:4: (lv_tasks_3_0= ruleTask )
            	    // InternalPAML.g:123:5: lv_tasks_3_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getPAMLAccess().getTasksTaskParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tasks_3_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPAMLRule());
            	    					}
            	    					set(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_3_0,
            	    						"org.xtext.example.paml.PAML.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalPAML.g:140:3: ( (lv_postcode_4_0= RULE_CODE ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CODE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPAML.g:141:4: (lv_postcode_4_0= RULE_CODE )
                    {
                    // InternalPAML.g:141:4: (lv_postcode_4_0= RULE_CODE )
                    // InternalPAML.g:142:5: lv_postcode_4_0= RULE_CODE
                    {
                    lv_postcode_4_0=(Token)match(input,RULE_CODE,FOLLOW_6); 

                    					newLeafNode(lv_postcode_4_0, grammarAccess.getPAMLAccess().getPostcodeCODETerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPAMLRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"postcode",
                    						lv_postcode_4_0,
                    						"org.xtext.example.paml.PAML.CODE");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPAMLAccess().getPamlKeyword_5());
            		

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
    // $ANTLR end "rulePAML"


    // $ANTLR start "entryRuleMeta"
    // InternalPAML.g:166:1: entryRuleMeta returns [EObject current=null] : iv_ruleMeta= ruleMeta EOF ;
    public final EObject entryRuleMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeta = null;


        try {
            // InternalPAML.g:166:45: (iv_ruleMeta= ruleMeta EOF )
            // InternalPAML.g:167:2: iv_ruleMeta= ruleMeta EOF
            {
             newCompositeNode(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeta=ruleMeta();

            state._fsp--;

             current =iv_ruleMeta; 
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
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // InternalPAML.g:173:1: ruleMeta returns [EObject current=null] : (otherlv_0= '<meta' (otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) ) ) (otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) ) ) (otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) ) ) otherlv_13= '/>' ) ;
    public final EObject ruleMeta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_string_12_0=null;
        Token otherlv_13=null;
        Enumerator lv_listStyle_6_0 = null;

        Enumerator lv_listRotation_9_0 = null;



        	enterRule();

        try {
            // InternalPAML.g:179:2: ( (otherlv_0= '<meta' (otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) ) ) (otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) ) ) (otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) ) ) otherlv_13= '/>' ) )
            // InternalPAML.g:180:2: (otherlv_0= '<meta' (otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) ) ) (otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) ) ) (otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) ) ) otherlv_13= '/>' )
            {
            // InternalPAML.g:180:2: (otherlv_0= '<meta' (otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) ) ) (otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) ) ) (otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) ) ) otherlv_13= '/>' )
            // InternalPAML.g:181:3: otherlv_0= '<meta' (otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) ) ) (otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) ) ) (otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) ) ) otherlv_13= '/>'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaAccess().getMetaKeyword_0());
            		
            // InternalPAML.g:185:3: (otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPAML.g:186:4: otherlv_1= 'lang' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getMetaAccess().getLangKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalPAML.g:194:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalPAML.g:195:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalPAML.g:195:5: (lv_name_3_0= RULE_ID )
                    // InternalPAML.g:196:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getMetaAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPAML.g:213:3: (otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) ) )
            // InternalPAML.g:214:4: otherlv_4= 'listStyle' otherlv_5= '=' ( (lv_listStyle_6_0= ruleListStyle ) )
            {
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            				newLeafNode(otherlv_4, grammarAccess.getMetaAccess().getListStyleKeyword_2_0());
            			
            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            				newLeafNode(otherlv_5, grammarAccess.getMetaAccess().getEqualsSignKeyword_2_1());
            			
            // InternalPAML.g:222:4: ( (lv_listStyle_6_0= ruleListStyle ) )
            // InternalPAML.g:223:5: (lv_listStyle_6_0= ruleListStyle )
            {
            // InternalPAML.g:223:5: (lv_listStyle_6_0= ruleListStyle )
            // InternalPAML.g:224:6: lv_listStyle_6_0= ruleListStyle
            {

            						newCompositeNode(grammarAccess.getMetaAccess().getListStyleListStyleEnumRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_12);
            lv_listStyle_6_0=ruleListStyle();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMetaRule());
            						}
            						set(
            							current,
            							"listStyle",
            							lv_listStyle_6_0,
            							"org.xtext.example.paml.PAML.ListStyle");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPAML.g:242:3: (otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) ) )
            // InternalPAML.g:243:4: otherlv_7= 'listRotation' otherlv_8= '=' ( (lv_listRotation_9_0= ruleListRotation ) )
            {
            otherlv_7=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_7, grammarAccess.getMetaAccess().getListRotationKeyword_3_0());
            			
            otherlv_8=(Token)match(input,17,FOLLOW_13); 

            				newLeafNode(otherlv_8, grammarAccess.getMetaAccess().getEqualsSignKeyword_3_1());
            			
            // InternalPAML.g:251:4: ( (lv_listRotation_9_0= ruleListRotation ) )
            // InternalPAML.g:252:5: (lv_listRotation_9_0= ruleListRotation )
            {
            // InternalPAML.g:252:5: (lv_listRotation_9_0= ruleListRotation )
            // InternalPAML.g:253:6: lv_listRotation_9_0= ruleListRotation
            {

            						newCompositeNode(grammarAccess.getMetaAccess().getListRotationListRotationEnumRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_listRotation_9_0=ruleListRotation();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMetaRule());
            						}
            						set(
            							current,
            							"listRotation",
            							lv_listRotation_9_0,
            							"org.xtext.example.paml.PAML.ListRotation");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPAML.g:271:3: (otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) ) )
            // InternalPAML.g:272:4: otherlv_10= 'startComment' otherlv_11= '=' ( (lv_string_12_0= RULE_STRING ) )
            {
            otherlv_10=(Token)match(input,20,FOLLOW_8); 

            				newLeafNode(otherlv_10, grammarAccess.getMetaAccess().getStartCommentKeyword_4_0());
            			
            otherlv_11=(Token)match(input,17,FOLLOW_15); 

            				newLeafNode(otherlv_11, grammarAccess.getMetaAccess().getEqualsSignKeyword_4_1());
            			
            // InternalPAML.g:280:4: ( (lv_string_12_0= RULE_STRING ) )
            // InternalPAML.g:281:5: (lv_string_12_0= RULE_STRING )
            {
            // InternalPAML.g:281:5: (lv_string_12_0= RULE_STRING )
            // InternalPAML.g:282:6: lv_string_12_0= RULE_STRING
            {
            lv_string_12_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            						newLeafNode(lv_string_12_0, grammarAccess.getMetaAccess().getStringSTRINGTerminalRuleCall_4_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMetaRule());
            						}
            						setWithLastConsumed(
            							current,
            							"string",
            							lv_string_12_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMetaAccess().getSolidusGreaterThanSignKeyword_5());
            		

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
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleTask"
    // InternalPAML.g:307:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalPAML.g:307:45: (iv_ruleTask= ruleTask EOF )
            // InternalPAML.g:308:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalPAML.g:314:1: ruleTask returns [EObject current=null] : (otherlv_0= '<task' (otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) ) ) otherlv_7= '>' ( (lv_code_8_0= RULE_CODE ) )? ( (lv_test_9_0= RULE_TEST ) )? ( (lv_subtasks_10_0= ruleTask ) )* otherlv_11= '</task>' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_string_6_0=null;
        Token otherlv_7=null;
        Token lv_code_8_0=null;
        Token lv_test_9_0=null;
        Token otherlv_11=null;
        EObject lv_subtasks_10_0 = null;



        	enterRule();

        try {
            // InternalPAML.g:320:2: ( (otherlv_0= '<task' (otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) ) ) otherlv_7= '>' ( (lv_code_8_0= RULE_CODE ) )? ( (lv_test_9_0= RULE_TEST ) )? ( (lv_subtasks_10_0= ruleTask ) )* otherlv_11= '</task>' ) )
            // InternalPAML.g:321:2: (otherlv_0= '<task' (otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) ) ) otherlv_7= '>' ( (lv_code_8_0= RULE_CODE ) )? ( (lv_test_9_0= RULE_TEST ) )? ( (lv_subtasks_10_0= ruleTask ) )* otherlv_11= '</task>' )
            {
            // InternalPAML.g:321:2: (otherlv_0= '<task' (otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) ) ) otherlv_7= '>' ( (lv_code_8_0= RULE_CODE ) )? ( (lv_test_9_0= RULE_TEST ) )? ( (lv_subtasks_10_0= ruleTask ) )* otherlv_11= '</task>' )
            // InternalPAML.g:322:3: otherlv_0= '<task' (otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) ) ) otherlv_7= '>' ( (lv_code_8_0= RULE_CODE ) )? ( (lv_test_9_0= RULE_TEST ) )? ( (lv_subtasks_10_0= ruleTask ) )* otherlv_11= '</task>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalPAML.g:326:3: (otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPAML.g:327:4: otherlv_1= 'title' otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTitleKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalPAML.g:335:4: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPAML.g:336:5: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPAML.g:336:5: (lv_string_3_0= RULE_STRING )
                    // InternalPAML.g:337:6: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_string_3_0, grammarAccess.getTaskAccess().getStringSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPAML.g:354:3: (otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) ) )
            // InternalPAML.g:355:4: otherlv_4= 'description' otherlv_5= '=' ( (lv_string_6_0= RULE_STRING ) )
            {
            otherlv_4=(Token)match(input,24,FOLLOW_8); 

            				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDescriptionKeyword_2_0());
            			
            otherlv_5=(Token)match(input,17,FOLLOW_15); 

            				newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1());
            			
            // InternalPAML.g:363:4: ( (lv_string_6_0= RULE_STRING ) )
            // InternalPAML.g:364:5: (lv_string_6_0= RULE_STRING )
            {
            // InternalPAML.g:364:5: (lv_string_6_0= RULE_STRING )
            // InternalPAML.g:365:6: lv_string_6_0= RULE_STRING
            {
            lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            						newLeafNode(lv_string_6_0, grammarAccess.getTaskAccess().getStringSTRINGTerminalRuleCall_2_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTaskRule());
            						}
            						setWithLastConsumed(
            							current,
            							"string",
            							lv_string_6_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPAML.g:386:3: ( (lv_code_8_0= RULE_CODE ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CODE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPAML.g:387:4: (lv_code_8_0= RULE_CODE )
                    {
                    // InternalPAML.g:387:4: (lv_code_8_0= RULE_CODE )
                    // InternalPAML.g:388:5: lv_code_8_0= RULE_CODE
                    {
                    lv_code_8_0=(Token)match(input,RULE_CODE,FOLLOW_20); 

                    					newLeafNode(lv_code_8_0, grammarAccess.getTaskAccess().getCodeCODETerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code",
                    						lv_code_8_0,
                    						"org.xtext.example.paml.PAML.CODE");
                    				

                    }


                    }
                    break;

            }

            // InternalPAML.g:404:3: ( (lv_test_9_0= RULE_TEST ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TEST) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPAML.g:405:4: (lv_test_9_0= RULE_TEST )
                    {
                    // InternalPAML.g:405:4: (lv_test_9_0= RULE_TEST )
                    // InternalPAML.g:406:5: lv_test_9_0= RULE_TEST
                    {
                    lv_test_9_0=(Token)match(input,RULE_TEST,FOLLOW_21); 

                    					newLeafNode(lv_test_9_0, grammarAccess.getTaskAccess().getTestTESTTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"test",
                    						lv_test_9_0,
                    						"org.xtext.example.paml.PAML.TEST");
                    				

                    }


                    }
                    break;

            }

            // InternalPAML.g:422:3: ( (lv_subtasks_10_0= ruleTask ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPAML.g:423:4: (lv_subtasks_10_0= ruleTask )
            	    {
            	    // InternalPAML.g:423:4: (lv_subtasks_10_0= ruleTask )
            	    // InternalPAML.g:424:5: lv_subtasks_10_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getSubtasksTaskParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_subtasks_10_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
            	    					}
            	    					set(
            	    						current,
            	    						"subtasks",
            	    						lv_subtasks_10_0,
            	    						"org.xtext.example.paml.PAML.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getTaskKeyword_7());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "ruleListStyle"
    // InternalPAML.g:449:1: ruleListStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'numbers' ) | (enumLiteral_1= 'letters' ) | (enumLiteral_2= 'roman' ) ) ;
    public final Enumerator ruleListStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPAML.g:455:2: ( ( (enumLiteral_0= 'numbers' ) | (enumLiteral_1= 'letters' ) | (enumLiteral_2= 'roman' ) ) )
            // InternalPAML.g:456:2: ( (enumLiteral_0= 'numbers' ) | (enumLiteral_1= 'letters' ) | (enumLiteral_2= 'roman' ) )
            {
            // InternalPAML.g:456:2: ( (enumLiteral_0= 'numbers' ) | (enumLiteral_1= 'letters' ) | (enumLiteral_2= 'roman' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPAML.g:457:3: (enumLiteral_0= 'numbers' )
                    {
                    // InternalPAML.g:457:3: (enumLiteral_0= 'numbers' )
                    // InternalPAML.g:458:4: enumLiteral_0= 'numbers'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getListStyleAccess().getNUMBERSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getListStyleAccess().getNUMBERSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPAML.g:465:3: (enumLiteral_1= 'letters' )
                    {
                    // InternalPAML.g:465:3: (enumLiteral_1= 'letters' )
                    // InternalPAML.g:466:4: enumLiteral_1= 'letters'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getListStyleAccess().getLETTERSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getListStyleAccess().getLETTERSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPAML.g:473:3: (enumLiteral_2= 'roman' )
                    {
                    // InternalPAML.g:473:3: (enumLiteral_2= 'roman' )
                    // InternalPAML.g:474:4: enumLiteral_2= 'roman'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getListStyleAccess().getROMANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getListStyleAccess().getROMANEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleListStyle"


    // $ANTLR start "ruleListRotation"
    // InternalPAML.g:484:1: ruleListRotation returns [Enumerator current=null] : ( (enumLiteral_0= 'alternating' ) | (enumLiteral_1= 'same' ) ) ;
    public final Enumerator ruleListRotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPAML.g:490:2: ( ( (enumLiteral_0= 'alternating' ) | (enumLiteral_1= 'same' ) ) )
            // InternalPAML.g:491:2: ( (enumLiteral_0= 'alternating' ) | (enumLiteral_1= 'same' ) )
            {
            // InternalPAML.g:491:2: ( (enumLiteral_0= 'alternating' ) | (enumLiteral_1= 'same' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPAML.g:492:3: (enumLiteral_0= 'alternating' )
                    {
                    // InternalPAML.g:492:3: (enumLiteral_0= 'alternating' )
                    // InternalPAML.g:493:4: enumLiteral_0= 'alternating'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getListRotationAccess().getALTERNATINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getListRotationAccess().getALTERNATINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPAML.g:500:3: (enumLiteral_1= 'same' )
                    {
                    // InternalPAML.g:500:3: (enumLiteral_1= 'same' )
                    // InternalPAML.g:501:4: enumLiteral_1= 'same'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getListRotationAccess().getSAMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getListRotationAccess().getSAMEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleListRotation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004400090L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004400010L});

}