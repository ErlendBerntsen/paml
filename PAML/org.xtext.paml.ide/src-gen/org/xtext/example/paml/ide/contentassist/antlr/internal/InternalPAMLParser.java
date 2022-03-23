package org.xtext.example.paml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.paml.services.PAMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPAMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CODE", "RULE_ID", "RULE_STRING", "RULE_TEST", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'numbers'", "'letters'", "'roman'", "'alternating'", "'same'", "'<paml>'", "'</paml>'", "'<meta'", "'/>'", "'lang'", "'='", "'listStyle'", "'listRotation'", "'startComment'", "'<task'", "'>'", "'</task>'", "'title'", "'description'"
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

    	public void setGrammarAccess(PAMLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePAML"
    // InternalPAML.g:53:1: entryRulePAML : rulePAML EOF ;
    public final void entryRulePAML() throws RecognitionException {
        try {
            // InternalPAML.g:54:1: ( rulePAML EOF )
            // InternalPAML.g:55:1: rulePAML EOF
            {
             before(grammarAccess.getPAMLRule()); 
            pushFollow(FOLLOW_1);
            rulePAML();

            state._fsp--;

             after(grammarAccess.getPAMLRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePAML"


    // $ANTLR start "rulePAML"
    // InternalPAML.g:62:1: rulePAML : ( ( rule__PAML__Group__0 ) ) ;
    public final void rulePAML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:66:2: ( ( ( rule__PAML__Group__0 ) ) )
            // InternalPAML.g:67:2: ( ( rule__PAML__Group__0 ) )
            {
            // InternalPAML.g:67:2: ( ( rule__PAML__Group__0 ) )
            // InternalPAML.g:68:3: ( rule__PAML__Group__0 )
            {
             before(grammarAccess.getPAMLAccess().getGroup()); 
            // InternalPAML.g:69:3: ( rule__PAML__Group__0 )
            // InternalPAML.g:69:4: rule__PAML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PAML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPAMLAccess().getGroup()); 

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
    // $ANTLR end "rulePAML"


    // $ANTLR start "entryRuleMeta"
    // InternalPAML.g:78:1: entryRuleMeta : ruleMeta EOF ;
    public final void entryRuleMeta() throws RecognitionException {
        try {
            // InternalPAML.g:79:1: ( ruleMeta EOF )
            // InternalPAML.g:80:1: ruleMeta EOF
            {
             before(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_1);
            ruleMeta();

            state._fsp--;

             after(grammarAccess.getMetaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // InternalPAML.g:87:1: ruleMeta : ( ( rule__Meta__Group__0 ) ) ;
    public final void ruleMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:91:2: ( ( ( rule__Meta__Group__0 ) ) )
            // InternalPAML.g:92:2: ( ( rule__Meta__Group__0 ) )
            {
            // InternalPAML.g:92:2: ( ( rule__Meta__Group__0 ) )
            // InternalPAML.g:93:3: ( rule__Meta__Group__0 )
            {
             before(grammarAccess.getMetaAccess().getGroup()); 
            // InternalPAML.g:94:3: ( rule__Meta__Group__0 )
            // InternalPAML.g:94:4: rule__Meta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getGroup()); 

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
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleTask"
    // InternalPAML.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalPAML.g:104:1: ( ruleTask EOF )
            // InternalPAML.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalPAML.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalPAML.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalPAML.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalPAML.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalPAML.g:119:3: ( rule__Task__Group__0 )
            // InternalPAML.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "ruleListStyle"
    // InternalPAML.g:128:1: ruleListStyle : ( ( rule__ListStyle__Alternatives ) ) ;
    public final void ruleListStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:132:1: ( ( ( rule__ListStyle__Alternatives ) ) )
            // InternalPAML.g:133:2: ( ( rule__ListStyle__Alternatives ) )
            {
            // InternalPAML.g:133:2: ( ( rule__ListStyle__Alternatives ) )
            // InternalPAML.g:134:3: ( rule__ListStyle__Alternatives )
            {
             before(grammarAccess.getListStyleAccess().getAlternatives()); 
            // InternalPAML.g:135:3: ( rule__ListStyle__Alternatives )
            // InternalPAML.g:135:4: rule__ListStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListStyleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleListStyle"


    // $ANTLR start "ruleListRotation"
    // InternalPAML.g:144:1: ruleListRotation : ( ( rule__ListRotation__Alternatives ) ) ;
    public final void ruleListRotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:148:1: ( ( ( rule__ListRotation__Alternatives ) ) )
            // InternalPAML.g:149:2: ( ( rule__ListRotation__Alternatives ) )
            {
            // InternalPAML.g:149:2: ( ( rule__ListRotation__Alternatives ) )
            // InternalPAML.g:150:3: ( rule__ListRotation__Alternatives )
            {
             before(grammarAccess.getListRotationAccess().getAlternatives()); 
            // InternalPAML.g:151:3: ( rule__ListRotation__Alternatives )
            // InternalPAML.g:151:4: rule__ListRotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListRotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListRotationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleListRotation"


    // $ANTLR start "rule__ListStyle__Alternatives"
    // InternalPAML.g:159:1: rule__ListStyle__Alternatives : ( ( ( 'numbers' ) ) | ( ( 'letters' ) ) | ( ( 'roman' ) ) );
    public final void rule__ListStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:163:1: ( ( ( 'numbers' ) ) | ( ( 'letters' ) ) | ( ( 'roman' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPAML.g:164:2: ( ( 'numbers' ) )
                    {
                    // InternalPAML.g:164:2: ( ( 'numbers' ) )
                    // InternalPAML.g:165:3: ( 'numbers' )
                    {
                     before(grammarAccess.getListStyleAccess().getNUMBERSEnumLiteralDeclaration_0()); 
                    // InternalPAML.g:166:3: ( 'numbers' )
                    // InternalPAML.g:166:4: 'numbers'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getListStyleAccess().getNUMBERSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPAML.g:170:2: ( ( 'letters' ) )
                    {
                    // InternalPAML.g:170:2: ( ( 'letters' ) )
                    // InternalPAML.g:171:3: ( 'letters' )
                    {
                     before(grammarAccess.getListStyleAccess().getLETTERSEnumLiteralDeclaration_1()); 
                    // InternalPAML.g:172:3: ( 'letters' )
                    // InternalPAML.g:172:4: 'letters'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getListStyleAccess().getLETTERSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPAML.g:176:2: ( ( 'roman' ) )
                    {
                    // InternalPAML.g:176:2: ( ( 'roman' ) )
                    // InternalPAML.g:177:3: ( 'roman' )
                    {
                     before(grammarAccess.getListStyleAccess().getROMANEnumLiteralDeclaration_2()); 
                    // InternalPAML.g:178:3: ( 'roman' )
                    // InternalPAML.g:178:4: 'roman'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getListStyleAccess().getROMANEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ListStyle__Alternatives"


    // $ANTLR start "rule__ListRotation__Alternatives"
    // InternalPAML.g:186:1: rule__ListRotation__Alternatives : ( ( ( 'alternating' ) ) | ( ( 'same' ) ) );
    public final void rule__ListRotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:190:1: ( ( ( 'alternating' ) ) | ( ( 'same' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPAML.g:191:2: ( ( 'alternating' ) )
                    {
                    // InternalPAML.g:191:2: ( ( 'alternating' ) )
                    // InternalPAML.g:192:3: ( 'alternating' )
                    {
                     before(grammarAccess.getListRotationAccess().getALTERNATINGEnumLiteralDeclaration_0()); 
                    // InternalPAML.g:193:3: ( 'alternating' )
                    // InternalPAML.g:193:4: 'alternating'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getListRotationAccess().getALTERNATINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPAML.g:197:2: ( ( 'same' ) )
                    {
                    // InternalPAML.g:197:2: ( ( 'same' ) )
                    // InternalPAML.g:198:3: ( 'same' )
                    {
                     before(grammarAccess.getListRotationAccess().getSAMEEnumLiteralDeclaration_1()); 
                    // InternalPAML.g:199:3: ( 'same' )
                    // InternalPAML.g:199:4: 'same'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getListRotationAccess().getSAMEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ListRotation__Alternatives"


    // $ANTLR start "rule__PAML__Group__0"
    // InternalPAML.g:207:1: rule__PAML__Group__0 : rule__PAML__Group__0__Impl rule__PAML__Group__1 ;
    public final void rule__PAML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:211:1: ( rule__PAML__Group__0__Impl rule__PAML__Group__1 )
            // InternalPAML.g:212:2: rule__PAML__Group__0__Impl rule__PAML__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PAML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAML__Group__1();

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
    // $ANTLR end "rule__PAML__Group__0"


    // $ANTLR start "rule__PAML__Group__0__Impl"
    // InternalPAML.g:219:1: rule__PAML__Group__0__Impl : ( '<paml>' ) ;
    public final void rule__PAML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:223:1: ( ( '<paml>' ) )
            // InternalPAML.g:224:1: ( '<paml>' )
            {
            // InternalPAML.g:224:1: ( '<paml>' )
            // InternalPAML.g:225:2: '<paml>'
            {
             before(grammarAccess.getPAMLAccess().getPamlKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPAMLAccess().getPamlKeyword_0()); 

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
    // $ANTLR end "rule__PAML__Group__0__Impl"


    // $ANTLR start "rule__PAML__Group__1"
    // InternalPAML.g:234:1: rule__PAML__Group__1 : rule__PAML__Group__1__Impl rule__PAML__Group__2 ;
    public final void rule__PAML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:238:1: ( rule__PAML__Group__1__Impl rule__PAML__Group__2 )
            // InternalPAML.g:239:2: rule__PAML__Group__1__Impl rule__PAML__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PAML__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAML__Group__2();

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
    // $ANTLR end "rule__PAML__Group__1"


    // $ANTLR start "rule__PAML__Group__1__Impl"
    // InternalPAML.g:246:1: rule__PAML__Group__1__Impl : ( ( rule__PAML__MetaInformationAssignment_1 ) ) ;
    public final void rule__PAML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:250:1: ( ( ( rule__PAML__MetaInformationAssignment_1 ) ) )
            // InternalPAML.g:251:1: ( ( rule__PAML__MetaInformationAssignment_1 ) )
            {
            // InternalPAML.g:251:1: ( ( rule__PAML__MetaInformationAssignment_1 ) )
            // InternalPAML.g:252:2: ( rule__PAML__MetaInformationAssignment_1 )
            {
             before(grammarAccess.getPAMLAccess().getMetaInformationAssignment_1()); 
            // InternalPAML.g:253:2: ( rule__PAML__MetaInformationAssignment_1 )
            // InternalPAML.g:253:3: rule__PAML__MetaInformationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PAML__MetaInformationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPAMLAccess().getMetaInformationAssignment_1()); 

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
    // $ANTLR end "rule__PAML__Group__1__Impl"


    // $ANTLR start "rule__PAML__Group__2"
    // InternalPAML.g:261:1: rule__PAML__Group__2 : rule__PAML__Group__2__Impl rule__PAML__Group__3 ;
    public final void rule__PAML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:265:1: ( rule__PAML__Group__2__Impl rule__PAML__Group__3 )
            // InternalPAML.g:266:2: rule__PAML__Group__2__Impl rule__PAML__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PAML__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAML__Group__3();

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
    // $ANTLR end "rule__PAML__Group__2"


    // $ANTLR start "rule__PAML__Group__2__Impl"
    // InternalPAML.g:273:1: rule__PAML__Group__2__Impl : ( ( rule__PAML__PrecodeAssignment_2 )? ) ;
    public final void rule__PAML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:277:1: ( ( ( rule__PAML__PrecodeAssignment_2 )? ) )
            // InternalPAML.g:278:1: ( ( rule__PAML__PrecodeAssignment_2 )? )
            {
            // InternalPAML.g:278:1: ( ( rule__PAML__PrecodeAssignment_2 )? )
            // InternalPAML.g:279:2: ( rule__PAML__PrecodeAssignment_2 )?
            {
             before(grammarAccess.getPAMLAccess().getPrecodeAssignment_2()); 
            // InternalPAML.g:280:2: ( rule__PAML__PrecodeAssignment_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CODE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPAML.g:280:3: rule__PAML__PrecodeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PAML__PrecodeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPAMLAccess().getPrecodeAssignment_2()); 

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
    // $ANTLR end "rule__PAML__Group__2__Impl"


    // $ANTLR start "rule__PAML__Group__3"
    // InternalPAML.g:288:1: rule__PAML__Group__3 : rule__PAML__Group__3__Impl rule__PAML__Group__4 ;
    public final void rule__PAML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:292:1: ( rule__PAML__Group__3__Impl rule__PAML__Group__4 )
            // InternalPAML.g:293:2: rule__PAML__Group__3__Impl rule__PAML__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PAML__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAML__Group__4();

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
    // $ANTLR end "rule__PAML__Group__3"


    // $ANTLR start "rule__PAML__Group__3__Impl"
    // InternalPAML.g:300:1: rule__PAML__Group__3__Impl : ( ( ( rule__PAML__TasksAssignment_3 ) ) ( ( rule__PAML__TasksAssignment_3 )* ) ) ;
    public final void rule__PAML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:304:1: ( ( ( ( rule__PAML__TasksAssignment_3 ) ) ( ( rule__PAML__TasksAssignment_3 )* ) ) )
            // InternalPAML.g:305:1: ( ( ( rule__PAML__TasksAssignment_3 ) ) ( ( rule__PAML__TasksAssignment_3 )* ) )
            {
            // InternalPAML.g:305:1: ( ( ( rule__PAML__TasksAssignment_3 ) ) ( ( rule__PAML__TasksAssignment_3 )* ) )
            // InternalPAML.g:306:2: ( ( rule__PAML__TasksAssignment_3 ) ) ( ( rule__PAML__TasksAssignment_3 )* )
            {
            // InternalPAML.g:306:2: ( ( rule__PAML__TasksAssignment_3 ) )
            // InternalPAML.g:307:3: ( rule__PAML__TasksAssignment_3 )
            {
             before(grammarAccess.getPAMLAccess().getTasksAssignment_3()); 
            // InternalPAML.g:308:3: ( rule__PAML__TasksAssignment_3 )
            // InternalPAML.g:308:4: rule__PAML__TasksAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__PAML__TasksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPAMLAccess().getTasksAssignment_3()); 

            }

            // InternalPAML.g:311:2: ( ( rule__PAML__TasksAssignment_3 )* )
            // InternalPAML.g:312:3: ( rule__PAML__TasksAssignment_3 )*
            {
             before(grammarAccess.getPAMLAccess().getTasksAssignment_3()); 
            // InternalPAML.g:313:3: ( rule__PAML__TasksAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPAML.g:313:4: rule__PAML__TasksAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PAML__TasksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPAMLAccess().getTasksAssignment_3()); 

            }


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
    // $ANTLR end "rule__PAML__Group__3__Impl"


    // $ANTLR start "rule__PAML__Group__4"
    // InternalPAML.g:322:1: rule__PAML__Group__4 : rule__PAML__Group__4__Impl rule__PAML__Group__5 ;
    public final void rule__PAML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:326:1: ( rule__PAML__Group__4__Impl rule__PAML__Group__5 )
            // InternalPAML.g:327:2: rule__PAML__Group__4__Impl rule__PAML__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__PAML__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAML__Group__5();

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
    // $ANTLR end "rule__PAML__Group__4"


    // $ANTLR start "rule__PAML__Group__4__Impl"
    // InternalPAML.g:334:1: rule__PAML__Group__4__Impl : ( ( rule__PAML__PostcodeAssignment_4 )? ) ;
    public final void rule__PAML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:338:1: ( ( ( rule__PAML__PostcodeAssignment_4 )? ) )
            // InternalPAML.g:339:1: ( ( rule__PAML__PostcodeAssignment_4 )? )
            {
            // InternalPAML.g:339:1: ( ( rule__PAML__PostcodeAssignment_4 )? )
            // InternalPAML.g:340:2: ( rule__PAML__PostcodeAssignment_4 )?
            {
             before(grammarAccess.getPAMLAccess().getPostcodeAssignment_4()); 
            // InternalPAML.g:341:2: ( rule__PAML__PostcodeAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CODE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPAML.g:341:3: rule__PAML__PostcodeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PAML__PostcodeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPAMLAccess().getPostcodeAssignment_4()); 

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
    // $ANTLR end "rule__PAML__Group__4__Impl"


    // $ANTLR start "rule__PAML__Group__5"
    // InternalPAML.g:349:1: rule__PAML__Group__5 : rule__PAML__Group__5__Impl ;
    public final void rule__PAML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:353:1: ( rule__PAML__Group__5__Impl )
            // InternalPAML.g:354:2: rule__PAML__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PAML__Group__5__Impl();

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
    // $ANTLR end "rule__PAML__Group__5"


    // $ANTLR start "rule__PAML__Group__5__Impl"
    // InternalPAML.g:360:1: rule__PAML__Group__5__Impl : ( '</paml>' ) ;
    public final void rule__PAML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:364:1: ( ( '</paml>' ) )
            // InternalPAML.g:365:1: ( '</paml>' )
            {
            // InternalPAML.g:365:1: ( '</paml>' )
            // InternalPAML.g:366:2: '</paml>'
            {
             before(grammarAccess.getPAMLAccess().getPamlKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPAMLAccess().getPamlKeyword_5()); 

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
    // $ANTLR end "rule__PAML__Group__5__Impl"


    // $ANTLR start "rule__Meta__Group__0"
    // InternalPAML.g:376:1: rule__Meta__Group__0 : rule__Meta__Group__0__Impl rule__Meta__Group__1 ;
    public final void rule__Meta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:380:1: ( rule__Meta__Group__0__Impl rule__Meta__Group__1 )
            // InternalPAML.g:381:2: rule__Meta__Group__0__Impl rule__Meta__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__1();

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
    // $ANTLR end "rule__Meta__Group__0"


    // $ANTLR start "rule__Meta__Group__0__Impl"
    // InternalPAML.g:388:1: rule__Meta__Group__0__Impl : ( '<meta' ) ;
    public final void rule__Meta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:392:1: ( ( '<meta' ) )
            // InternalPAML.g:393:1: ( '<meta' )
            {
            // InternalPAML.g:393:1: ( '<meta' )
            // InternalPAML.g:394:2: '<meta'
            {
             before(grammarAccess.getMetaAccess().getMetaKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getMetaKeyword_0()); 

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
    // $ANTLR end "rule__Meta__Group__0__Impl"


    // $ANTLR start "rule__Meta__Group__1"
    // InternalPAML.g:403:1: rule__Meta__Group__1 : rule__Meta__Group__1__Impl rule__Meta__Group__2 ;
    public final void rule__Meta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:407:1: ( rule__Meta__Group__1__Impl rule__Meta__Group__2 )
            // InternalPAML.g:408:2: rule__Meta__Group__1__Impl rule__Meta__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Meta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__2();

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
    // $ANTLR end "rule__Meta__Group__1"


    // $ANTLR start "rule__Meta__Group__1__Impl"
    // InternalPAML.g:415:1: rule__Meta__Group__1__Impl : ( ( rule__Meta__Group_1__0 )? ) ;
    public final void rule__Meta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:419:1: ( ( ( rule__Meta__Group_1__0 )? ) )
            // InternalPAML.g:420:1: ( ( rule__Meta__Group_1__0 )? )
            {
            // InternalPAML.g:420:1: ( ( rule__Meta__Group_1__0 )? )
            // InternalPAML.g:421:2: ( rule__Meta__Group_1__0 )?
            {
             before(grammarAccess.getMetaAccess().getGroup_1()); 
            // InternalPAML.g:422:2: ( rule__Meta__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPAML.g:422:3: rule__Meta__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meta__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Meta__Group__1__Impl"


    // $ANTLR start "rule__Meta__Group__2"
    // InternalPAML.g:430:1: rule__Meta__Group__2 : rule__Meta__Group__2__Impl rule__Meta__Group__3 ;
    public final void rule__Meta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:434:1: ( rule__Meta__Group__2__Impl rule__Meta__Group__3 )
            // InternalPAML.g:435:2: rule__Meta__Group__2__Impl rule__Meta__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Meta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__3();

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
    // $ANTLR end "rule__Meta__Group__2"


    // $ANTLR start "rule__Meta__Group__2__Impl"
    // InternalPAML.g:442:1: rule__Meta__Group__2__Impl : ( ( rule__Meta__Group_2__0 ) ) ;
    public final void rule__Meta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:446:1: ( ( ( rule__Meta__Group_2__0 ) ) )
            // InternalPAML.g:447:1: ( ( rule__Meta__Group_2__0 ) )
            {
            // InternalPAML.g:447:1: ( ( rule__Meta__Group_2__0 ) )
            // InternalPAML.g:448:2: ( rule__Meta__Group_2__0 )
            {
             before(grammarAccess.getMetaAccess().getGroup_2()); 
            // InternalPAML.g:449:2: ( rule__Meta__Group_2__0 )
            // InternalPAML.g:449:3: rule__Meta__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Meta__Group__2__Impl"


    // $ANTLR start "rule__Meta__Group__3"
    // InternalPAML.g:457:1: rule__Meta__Group__3 : rule__Meta__Group__3__Impl rule__Meta__Group__4 ;
    public final void rule__Meta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:461:1: ( rule__Meta__Group__3__Impl rule__Meta__Group__4 )
            // InternalPAML.g:462:2: rule__Meta__Group__3__Impl rule__Meta__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Meta__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__4();

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
    // $ANTLR end "rule__Meta__Group__3"


    // $ANTLR start "rule__Meta__Group__3__Impl"
    // InternalPAML.g:469:1: rule__Meta__Group__3__Impl : ( ( rule__Meta__Group_3__0 ) ) ;
    public final void rule__Meta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:473:1: ( ( ( rule__Meta__Group_3__0 ) ) )
            // InternalPAML.g:474:1: ( ( rule__Meta__Group_3__0 ) )
            {
            // InternalPAML.g:474:1: ( ( rule__Meta__Group_3__0 ) )
            // InternalPAML.g:475:2: ( rule__Meta__Group_3__0 )
            {
             before(grammarAccess.getMetaAccess().getGroup_3()); 
            // InternalPAML.g:476:2: ( rule__Meta__Group_3__0 )
            // InternalPAML.g:476:3: rule__Meta__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Meta__Group__3__Impl"


    // $ANTLR start "rule__Meta__Group__4"
    // InternalPAML.g:484:1: rule__Meta__Group__4 : rule__Meta__Group__4__Impl rule__Meta__Group__5 ;
    public final void rule__Meta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:488:1: ( rule__Meta__Group__4__Impl rule__Meta__Group__5 )
            // InternalPAML.g:489:2: rule__Meta__Group__4__Impl rule__Meta__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Meta__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__5();

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
    // $ANTLR end "rule__Meta__Group__4"


    // $ANTLR start "rule__Meta__Group__4__Impl"
    // InternalPAML.g:496:1: rule__Meta__Group__4__Impl : ( ( rule__Meta__Group_4__0 ) ) ;
    public final void rule__Meta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:500:1: ( ( ( rule__Meta__Group_4__0 ) ) )
            // InternalPAML.g:501:1: ( ( rule__Meta__Group_4__0 ) )
            {
            // InternalPAML.g:501:1: ( ( rule__Meta__Group_4__0 ) )
            // InternalPAML.g:502:2: ( rule__Meta__Group_4__0 )
            {
             before(grammarAccess.getMetaAccess().getGroup_4()); 
            // InternalPAML.g:503:2: ( rule__Meta__Group_4__0 )
            // InternalPAML.g:503:3: rule__Meta__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Meta__Group__4__Impl"


    // $ANTLR start "rule__Meta__Group__5"
    // InternalPAML.g:511:1: rule__Meta__Group__5 : rule__Meta__Group__5__Impl ;
    public final void rule__Meta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:515:1: ( rule__Meta__Group__5__Impl )
            // InternalPAML.g:516:2: rule__Meta__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group__5__Impl();

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
    // $ANTLR end "rule__Meta__Group__5"


    // $ANTLR start "rule__Meta__Group__5__Impl"
    // InternalPAML.g:522:1: rule__Meta__Group__5__Impl : ( '/>' ) ;
    public final void rule__Meta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:526:1: ( ( '/>' ) )
            // InternalPAML.g:527:1: ( '/>' )
            {
            // InternalPAML.g:527:1: ( '/>' )
            // InternalPAML.g:528:2: '/>'
            {
             before(grammarAccess.getMetaAccess().getSolidusGreaterThanSignKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getSolidusGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__Meta__Group__5__Impl"


    // $ANTLR start "rule__Meta__Group_1__0"
    // InternalPAML.g:538:1: rule__Meta__Group_1__0 : rule__Meta__Group_1__0__Impl rule__Meta__Group_1__1 ;
    public final void rule__Meta__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:542:1: ( rule__Meta__Group_1__0__Impl rule__Meta__Group_1__1 )
            // InternalPAML.g:543:2: rule__Meta__Group_1__0__Impl rule__Meta__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Meta__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_1__1();

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
    // $ANTLR end "rule__Meta__Group_1__0"


    // $ANTLR start "rule__Meta__Group_1__0__Impl"
    // InternalPAML.g:550:1: rule__Meta__Group_1__0__Impl : ( 'lang' ) ;
    public final void rule__Meta__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:554:1: ( ( 'lang' ) )
            // InternalPAML.g:555:1: ( 'lang' )
            {
            // InternalPAML.g:555:1: ( 'lang' )
            // InternalPAML.g:556:2: 'lang'
            {
             before(grammarAccess.getMetaAccess().getLangKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getLangKeyword_1_0()); 

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
    // $ANTLR end "rule__Meta__Group_1__0__Impl"


    // $ANTLR start "rule__Meta__Group_1__1"
    // InternalPAML.g:565:1: rule__Meta__Group_1__1 : rule__Meta__Group_1__1__Impl rule__Meta__Group_1__2 ;
    public final void rule__Meta__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:569:1: ( rule__Meta__Group_1__1__Impl rule__Meta__Group_1__2 )
            // InternalPAML.g:570:2: rule__Meta__Group_1__1__Impl rule__Meta__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Meta__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_1__2();

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
    // $ANTLR end "rule__Meta__Group_1__1"


    // $ANTLR start "rule__Meta__Group_1__1__Impl"
    // InternalPAML.g:577:1: rule__Meta__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Meta__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:581:1: ( ( '=' ) )
            // InternalPAML.g:582:1: ( '=' )
            {
            // InternalPAML.g:582:1: ( '=' )
            // InternalPAML.g:583:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Meta__Group_1__1__Impl"


    // $ANTLR start "rule__Meta__Group_1__2"
    // InternalPAML.g:592:1: rule__Meta__Group_1__2 : rule__Meta__Group_1__2__Impl ;
    public final void rule__Meta__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:596:1: ( rule__Meta__Group_1__2__Impl )
            // InternalPAML.g:597:2: rule__Meta__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_1__2__Impl();

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
    // $ANTLR end "rule__Meta__Group_1__2"


    // $ANTLR start "rule__Meta__Group_1__2__Impl"
    // InternalPAML.g:603:1: rule__Meta__Group_1__2__Impl : ( ( rule__Meta__NameAssignment_1_2 ) ) ;
    public final void rule__Meta__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:607:1: ( ( ( rule__Meta__NameAssignment_1_2 ) ) )
            // InternalPAML.g:608:1: ( ( rule__Meta__NameAssignment_1_2 ) )
            {
            // InternalPAML.g:608:1: ( ( rule__Meta__NameAssignment_1_2 ) )
            // InternalPAML.g:609:2: ( rule__Meta__NameAssignment_1_2 )
            {
             before(grammarAccess.getMetaAccess().getNameAssignment_1_2()); 
            // InternalPAML.g:610:2: ( rule__Meta__NameAssignment_1_2 )
            // InternalPAML.g:610:3: rule__Meta__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Meta__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getNameAssignment_1_2()); 

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
    // $ANTLR end "rule__Meta__Group_1__2__Impl"


    // $ANTLR start "rule__Meta__Group_2__0"
    // InternalPAML.g:619:1: rule__Meta__Group_2__0 : rule__Meta__Group_2__0__Impl rule__Meta__Group_2__1 ;
    public final void rule__Meta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:623:1: ( rule__Meta__Group_2__0__Impl rule__Meta__Group_2__1 )
            // InternalPAML.g:624:2: rule__Meta__Group_2__0__Impl rule__Meta__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Meta__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_2__1();

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
    // $ANTLR end "rule__Meta__Group_2__0"


    // $ANTLR start "rule__Meta__Group_2__0__Impl"
    // InternalPAML.g:631:1: rule__Meta__Group_2__0__Impl : ( 'listStyle' ) ;
    public final void rule__Meta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:635:1: ( ( 'listStyle' ) )
            // InternalPAML.g:636:1: ( 'listStyle' )
            {
            // InternalPAML.g:636:1: ( 'listStyle' )
            // InternalPAML.g:637:2: 'listStyle'
            {
             before(grammarAccess.getMetaAccess().getListStyleKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getListStyleKeyword_2_0()); 

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
    // $ANTLR end "rule__Meta__Group_2__0__Impl"


    // $ANTLR start "rule__Meta__Group_2__1"
    // InternalPAML.g:646:1: rule__Meta__Group_2__1 : rule__Meta__Group_2__1__Impl rule__Meta__Group_2__2 ;
    public final void rule__Meta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:650:1: ( rule__Meta__Group_2__1__Impl rule__Meta__Group_2__2 )
            // InternalPAML.g:651:2: rule__Meta__Group_2__1__Impl rule__Meta__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Meta__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_2__2();

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
    // $ANTLR end "rule__Meta__Group_2__1"


    // $ANTLR start "rule__Meta__Group_2__1__Impl"
    // InternalPAML.g:658:1: rule__Meta__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Meta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:662:1: ( ( '=' ) )
            // InternalPAML.g:663:1: ( '=' )
            {
            // InternalPAML.g:663:1: ( '=' )
            // InternalPAML.g:664:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Meta__Group_2__1__Impl"


    // $ANTLR start "rule__Meta__Group_2__2"
    // InternalPAML.g:673:1: rule__Meta__Group_2__2 : rule__Meta__Group_2__2__Impl ;
    public final void rule__Meta__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:677:1: ( rule__Meta__Group_2__2__Impl )
            // InternalPAML.g:678:2: rule__Meta__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_2__2__Impl();

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
    // $ANTLR end "rule__Meta__Group_2__2"


    // $ANTLR start "rule__Meta__Group_2__2__Impl"
    // InternalPAML.g:684:1: rule__Meta__Group_2__2__Impl : ( ( rule__Meta__ListStyleAssignment_2_2 ) ) ;
    public final void rule__Meta__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:688:1: ( ( ( rule__Meta__ListStyleAssignment_2_2 ) ) )
            // InternalPAML.g:689:1: ( ( rule__Meta__ListStyleAssignment_2_2 ) )
            {
            // InternalPAML.g:689:1: ( ( rule__Meta__ListStyleAssignment_2_2 ) )
            // InternalPAML.g:690:2: ( rule__Meta__ListStyleAssignment_2_2 )
            {
             before(grammarAccess.getMetaAccess().getListStyleAssignment_2_2()); 
            // InternalPAML.g:691:2: ( rule__Meta__ListStyleAssignment_2_2 )
            // InternalPAML.g:691:3: rule__Meta__ListStyleAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Meta__ListStyleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getListStyleAssignment_2_2()); 

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
    // $ANTLR end "rule__Meta__Group_2__2__Impl"


    // $ANTLR start "rule__Meta__Group_3__0"
    // InternalPAML.g:700:1: rule__Meta__Group_3__0 : rule__Meta__Group_3__0__Impl rule__Meta__Group_3__1 ;
    public final void rule__Meta__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:704:1: ( rule__Meta__Group_3__0__Impl rule__Meta__Group_3__1 )
            // InternalPAML.g:705:2: rule__Meta__Group_3__0__Impl rule__Meta__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Meta__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_3__1();

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
    // $ANTLR end "rule__Meta__Group_3__0"


    // $ANTLR start "rule__Meta__Group_3__0__Impl"
    // InternalPAML.g:712:1: rule__Meta__Group_3__0__Impl : ( 'listRotation' ) ;
    public final void rule__Meta__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:716:1: ( ( 'listRotation' ) )
            // InternalPAML.g:717:1: ( 'listRotation' )
            {
            // InternalPAML.g:717:1: ( 'listRotation' )
            // InternalPAML.g:718:2: 'listRotation'
            {
             before(grammarAccess.getMetaAccess().getListRotationKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getListRotationKeyword_3_0()); 

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
    // $ANTLR end "rule__Meta__Group_3__0__Impl"


    // $ANTLR start "rule__Meta__Group_3__1"
    // InternalPAML.g:727:1: rule__Meta__Group_3__1 : rule__Meta__Group_3__1__Impl rule__Meta__Group_3__2 ;
    public final void rule__Meta__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:731:1: ( rule__Meta__Group_3__1__Impl rule__Meta__Group_3__2 )
            // InternalPAML.g:732:2: rule__Meta__Group_3__1__Impl rule__Meta__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Meta__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_3__2();

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
    // $ANTLR end "rule__Meta__Group_3__1"


    // $ANTLR start "rule__Meta__Group_3__1__Impl"
    // InternalPAML.g:739:1: rule__Meta__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Meta__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:743:1: ( ( '=' ) )
            // InternalPAML.g:744:1: ( '=' )
            {
            // InternalPAML.g:744:1: ( '=' )
            // InternalPAML.g:745:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Meta__Group_3__1__Impl"


    // $ANTLR start "rule__Meta__Group_3__2"
    // InternalPAML.g:754:1: rule__Meta__Group_3__2 : rule__Meta__Group_3__2__Impl ;
    public final void rule__Meta__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:758:1: ( rule__Meta__Group_3__2__Impl )
            // InternalPAML.g:759:2: rule__Meta__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_3__2__Impl();

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
    // $ANTLR end "rule__Meta__Group_3__2"


    // $ANTLR start "rule__Meta__Group_3__2__Impl"
    // InternalPAML.g:765:1: rule__Meta__Group_3__2__Impl : ( ( rule__Meta__ListRotationAssignment_3_2 ) ) ;
    public final void rule__Meta__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:769:1: ( ( ( rule__Meta__ListRotationAssignment_3_2 ) ) )
            // InternalPAML.g:770:1: ( ( rule__Meta__ListRotationAssignment_3_2 ) )
            {
            // InternalPAML.g:770:1: ( ( rule__Meta__ListRotationAssignment_3_2 ) )
            // InternalPAML.g:771:2: ( rule__Meta__ListRotationAssignment_3_2 )
            {
             before(grammarAccess.getMetaAccess().getListRotationAssignment_3_2()); 
            // InternalPAML.g:772:2: ( rule__Meta__ListRotationAssignment_3_2 )
            // InternalPAML.g:772:3: rule__Meta__ListRotationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Meta__ListRotationAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getListRotationAssignment_3_2()); 

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
    // $ANTLR end "rule__Meta__Group_3__2__Impl"


    // $ANTLR start "rule__Meta__Group_4__0"
    // InternalPAML.g:781:1: rule__Meta__Group_4__0 : rule__Meta__Group_4__0__Impl rule__Meta__Group_4__1 ;
    public final void rule__Meta__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:785:1: ( rule__Meta__Group_4__0__Impl rule__Meta__Group_4__1 )
            // InternalPAML.g:786:2: rule__Meta__Group_4__0__Impl rule__Meta__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Meta__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_4__1();

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
    // $ANTLR end "rule__Meta__Group_4__0"


    // $ANTLR start "rule__Meta__Group_4__0__Impl"
    // InternalPAML.g:793:1: rule__Meta__Group_4__0__Impl : ( 'startComment' ) ;
    public final void rule__Meta__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:797:1: ( ( 'startComment' ) )
            // InternalPAML.g:798:1: ( 'startComment' )
            {
            // InternalPAML.g:798:1: ( 'startComment' )
            // InternalPAML.g:799:2: 'startComment'
            {
             before(grammarAccess.getMetaAccess().getStartCommentKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getStartCommentKeyword_4_0()); 

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
    // $ANTLR end "rule__Meta__Group_4__0__Impl"


    // $ANTLR start "rule__Meta__Group_4__1"
    // InternalPAML.g:808:1: rule__Meta__Group_4__1 : rule__Meta__Group_4__1__Impl rule__Meta__Group_4__2 ;
    public final void rule__Meta__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:812:1: ( rule__Meta__Group_4__1__Impl rule__Meta__Group_4__2 )
            // InternalPAML.g:813:2: rule__Meta__Group_4__1__Impl rule__Meta__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__Meta__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group_4__2();

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
    // $ANTLR end "rule__Meta__Group_4__1"


    // $ANTLR start "rule__Meta__Group_4__1__Impl"
    // InternalPAML.g:820:1: rule__Meta__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Meta__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:824:1: ( ( '=' ) )
            // InternalPAML.g:825:1: ( '=' )
            {
            // InternalPAML.g:825:1: ( '=' )
            // InternalPAML.g:826:2: '='
            {
             before(grammarAccess.getMetaAccess().getEqualsSignKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Meta__Group_4__1__Impl"


    // $ANTLR start "rule__Meta__Group_4__2"
    // InternalPAML.g:835:1: rule__Meta__Group_4__2 : rule__Meta__Group_4__2__Impl ;
    public final void rule__Meta__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:839:1: ( rule__Meta__Group_4__2__Impl )
            // InternalPAML.g:840:2: rule__Meta__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group_4__2__Impl();

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
    // $ANTLR end "rule__Meta__Group_4__2"


    // $ANTLR start "rule__Meta__Group_4__2__Impl"
    // InternalPAML.g:846:1: rule__Meta__Group_4__2__Impl : ( ( rule__Meta__StringAssignment_4_2 ) ) ;
    public final void rule__Meta__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:850:1: ( ( ( rule__Meta__StringAssignment_4_2 ) ) )
            // InternalPAML.g:851:1: ( ( rule__Meta__StringAssignment_4_2 ) )
            {
            // InternalPAML.g:851:1: ( ( rule__Meta__StringAssignment_4_2 ) )
            // InternalPAML.g:852:2: ( rule__Meta__StringAssignment_4_2 )
            {
             before(grammarAccess.getMetaAccess().getStringAssignment_4_2()); 
            // InternalPAML.g:853:2: ( rule__Meta__StringAssignment_4_2 )
            // InternalPAML.g:853:3: rule__Meta__StringAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Meta__StringAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getStringAssignment_4_2()); 

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
    // $ANTLR end "rule__Meta__Group_4__2__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalPAML.g:862:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:866:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalPAML.g:867:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalPAML.g:874:1: rule__Task__Group__0__Impl : ( '<task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:878:1: ( ( '<task' ) )
            // InternalPAML.g:879:1: ( '<task' )
            {
            // InternalPAML.g:879:1: ( '<task' )
            // InternalPAML.g:880:2: '<task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalPAML.g:889:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:893:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalPAML.g:894:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalPAML.g:901:1: rule__Task__Group__1__Impl : ( ( rule__Task__Group_1__0 )? ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:905:1: ( ( ( rule__Task__Group_1__0 )? ) )
            // InternalPAML.g:906:1: ( ( rule__Task__Group_1__0 )? )
            {
            // InternalPAML.g:906:1: ( ( rule__Task__Group_1__0 )? )
            // InternalPAML.g:907:2: ( rule__Task__Group_1__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_1()); 
            // InternalPAML.g:908:2: ( rule__Task__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPAML.g:908:3: rule__Task__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalPAML.g:916:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:920:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalPAML.g:921:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalPAML.g:928:1: rule__Task__Group__2__Impl : ( ( rule__Task__Group_2__0 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:932:1: ( ( ( rule__Task__Group_2__0 ) ) )
            // InternalPAML.g:933:1: ( ( rule__Task__Group_2__0 ) )
            {
            // InternalPAML.g:933:1: ( ( rule__Task__Group_2__0 ) )
            // InternalPAML.g:934:2: ( rule__Task__Group_2__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup_2()); 
            // InternalPAML.g:935:2: ( rule__Task__Group_2__0 )
            // InternalPAML.g:935:3: rule__Task__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalPAML.g:943:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:947:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalPAML.g:948:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

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
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalPAML.g:955:1: rule__Task__Group__3__Impl : ( '>' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:959:1: ( ( '>' ) )
            // InternalPAML.g:960:1: ( '>' )
            {
            // InternalPAML.g:960:1: ( '>' )
            // InternalPAML.g:961:2: '>'
            {
             before(grammarAccess.getTaskAccess().getGreaterThanSignKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalPAML.g:970:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:974:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalPAML.g:975:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

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
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalPAML.g:982:1: rule__Task__Group__4__Impl : ( ( rule__Task__CodeAssignment_4 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:986:1: ( ( ( rule__Task__CodeAssignment_4 )? ) )
            // InternalPAML.g:987:1: ( ( rule__Task__CodeAssignment_4 )? )
            {
            // InternalPAML.g:987:1: ( ( rule__Task__CodeAssignment_4 )? )
            // InternalPAML.g:988:2: ( rule__Task__CodeAssignment_4 )?
            {
             before(grammarAccess.getTaskAccess().getCodeAssignment_4()); 
            // InternalPAML.g:989:2: ( rule__Task__CodeAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CODE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPAML.g:989:3: rule__Task__CodeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__CodeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getCodeAssignment_4()); 

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
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalPAML.g:997:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1001:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalPAML.g:1002:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

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
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalPAML.g:1009:1: rule__Task__Group__5__Impl : ( ( rule__Task__TestAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1013:1: ( ( ( rule__Task__TestAssignment_5 )? ) )
            // InternalPAML.g:1014:1: ( ( rule__Task__TestAssignment_5 )? )
            {
            // InternalPAML.g:1014:1: ( ( rule__Task__TestAssignment_5 )? )
            // InternalPAML.g:1015:2: ( rule__Task__TestAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getTestAssignment_5()); 
            // InternalPAML.g:1016:2: ( rule__Task__TestAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_TEST) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPAML.g:1016:3: rule__Task__TestAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TestAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTestAssignment_5()); 

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
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalPAML.g:1024:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1028:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalPAML.g:1029:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

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
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalPAML.g:1036:1: rule__Task__Group__6__Impl : ( ( rule__Task__SubtasksAssignment_6 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1040:1: ( ( ( rule__Task__SubtasksAssignment_6 )* ) )
            // InternalPAML.g:1041:1: ( ( rule__Task__SubtasksAssignment_6 )* )
            {
            // InternalPAML.g:1041:1: ( ( rule__Task__SubtasksAssignment_6 )* )
            // InternalPAML.g:1042:2: ( rule__Task__SubtasksAssignment_6 )*
            {
             before(grammarAccess.getTaskAccess().getSubtasksAssignment_6()); 
            // InternalPAML.g:1043:2: ( rule__Task__SubtasksAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPAML.g:1043:3: rule__Task__SubtasksAssignment_6
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Task__SubtasksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getSubtasksAssignment_6()); 

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
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalPAML.g:1051:1: rule__Task__Group__7 : rule__Task__Group__7__Impl ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1055:1: ( rule__Task__Group__7__Impl )
            // InternalPAML.g:1056:2: rule__Task__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__7__Impl();

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
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalPAML.g:1062:1: rule__Task__Group__7__Impl : ( '</task>' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1066:1: ( ( '</task>' ) )
            // InternalPAML.g:1067:1: ( '</task>' )
            {
            // InternalPAML.g:1067:1: ( '</task>' )
            // InternalPAML.g:1068:2: '</task>'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_7()); 

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
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group_1__0"
    // InternalPAML.g:1078:1: rule__Task__Group_1__0 : rule__Task__Group_1__0__Impl rule__Task__Group_1__1 ;
    public final void rule__Task__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1082:1: ( rule__Task__Group_1__0__Impl rule__Task__Group_1__1 )
            // InternalPAML.g:1083:2: rule__Task__Group_1__0__Impl rule__Task__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_1__1();

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
    // $ANTLR end "rule__Task__Group_1__0"


    // $ANTLR start "rule__Task__Group_1__0__Impl"
    // InternalPAML.g:1090:1: rule__Task__Group_1__0__Impl : ( 'title' ) ;
    public final void rule__Task__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1094:1: ( ( 'title' ) )
            // InternalPAML.g:1095:1: ( 'title' )
            {
            // InternalPAML.g:1095:1: ( 'title' )
            // InternalPAML.g:1096:2: 'title'
            {
             before(grammarAccess.getTaskAccess().getTitleKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTitleKeyword_1_0()); 

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
    // $ANTLR end "rule__Task__Group_1__0__Impl"


    // $ANTLR start "rule__Task__Group_1__1"
    // InternalPAML.g:1105:1: rule__Task__Group_1__1 : rule__Task__Group_1__1__Impl rule__Task__Group_1__2 ;
    public final void rule__Task__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1109:1: ( rule__Task__Group_1__1__Impl rule__Task__Group_1__2 )
            // InternalPAML.g:1110:2: rule__Task__Group_1__1__Impl rule__Task__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_1__2();

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
    // $ANTLR end "rule__Task__Group_1__1"


    // $ANTLR start "rule__Task__Group_1__1__Impl"
    // InternalPAML.g:1117:1: rule__Task__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Task__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1121:1: ( ( '=' ) )
            // InternalPAML.g:1122:1: ( '=' )
            {
            // InternalPAML.g:1122:1: ( '=' )
            // InternalPAML.g:1123:2: '='
            {
             before(grammarAccess.getTaskAccess().getEqualsSignKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Task__Group_1__1__Impl"


    // $ANTLR start "rule__Task__Group_1__2"
    // InternalPAML.g:1132:1: rule__Task__Group_1__2 : rule__Task__Group_1__2__Impl ;
    public final void rule__Task__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1136:1: ( rule__Task__Group_1__2__Impl )
            // InternalPAML.g:1137:2: rule__Task__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_1__2__Impl();

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
    // $ANTLR end "rule__Task__Group_1__2"


    // $ANTLR start "rule__Task__Group_1__2__Impl"
    // InternalPAML.g:1143:1: rule__Task__Group_1__2__Impl : ( ( rule__Task__StringAssignment_1_2 ) ) ;
    public final void rule__Task__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1147:1: ( ( ( rule__Task__StringAssignment_1_2 ) ) )
            // InternalPAML.g:1148:1: ( ( rule__Task__StringAssignment_1_2 ) )
            {
            // InternalPAML.g:1148:1: ( ( rule__Task__StringAssignment_1_2 ) )
            // InternalPAML.g:1149:2: ( rule__Task__StringAssignment_1_2 )
            {
             before(grammarAccess.getTaskAccess().getStringAssignment_1_2()); 
            // InternalPAML.g:1150:2: ( rule__Task__StringAssignment_1_2 )
            // InternalPAML.g:1150:3: rule__Task__StringAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__StringAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStringAssignment_1_2()); 

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
    // $ANTLR end "rule__Task__Group_1__2__Impl"


    // $ANTLR start "rule__Task__Group_2__0"
    // InternalPAML.g:1159:1: rule__Task__Group_2__0 : rule__Task__Group_2__0__Impl rule__Task__Group_2__1 ;
    public final void rule__Task__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1163:1: ( rule__Task__Group_2__0__Impl rule__Task__Group_2__1 )
            // InternalPAML.g:1164:2: rule__Task__Group_2__0__Impl rule__Task__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2__1();

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
    // $ANTLR end "rule__Task__Group_2__0"


    // $ANTLR start "rule__Task__Group_2__0__Impl"
    // InternalPAML.g:1171:1: rule__Task__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Task__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1175:1: ( ( 'description' ) )
            // InternalPAML.g:1176:1: ( 'description' )
            {
            // InternalPAML.g:1176:1: ( 'description' )
            // InternalPAML.g:1177:2: 'description'
            {
             before(grammarAccess.getTaskAccess().getDescriptionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDescriptionKeyword_2_0()); 

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
    // $ANTLR end "rule__Task__Group_2__0__Impl"


    // $ANTLR start "rule__Task__Group_2__1"
    // InternalPAML.g:1186:1: rule__Task__Group_2__1 : rule__Task__Group_2__1__Impl rule__Task__Group_2__2 ;
    public final void rule__Task__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1190:1: ( rule__Task__Group_2__1__Impl rule__Task__Group_2__2 )
            // InternalPAML.g:1191:2: rule__Task__Group_2__1__Impl rule__Task__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2__2();

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
    // $ANTLR end "rule__Task__Group_2__1"


    // $ANTLR start "rule__Task__Group_2__1__Impl"
    // InternalPAML.g:1198:1: rule__Task__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Task__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1202:1: ( ( '=' ) )
            // InternalPAML.g:1203:1: ( '=' )
            {
            // InternalPAML.g:1203:1: ( '=' )
            // InternalPAML.g:1204:2: '='
            {
             before(grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Task__Group_2__1__Impl"


    // $ANTLR start "rule__Task__Group_2__2"
    // InternalPAML.g:1213:1: rule__Task__Group_2__2 : rule__Task__Group_2__2__Impl ;
    public final void rule__Task__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1217:1: ( rule__Task__Group_2__2__Impl )
            // InternalPAML.g:1218:2: rule__Task__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_2__2__Impl();

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
    // $ANTLR end "rule__Task__Group_2__2"


    // $ANTLR start "rule__Task__Group_2__2__Impl"
    // InternalPAML.g:1224:1: rule__Task__Group_2__2__Impl : ( ( rule__Task__StringAssignment_2_2 ) ) ;
    public final void rule__Task__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1228:1: ( ( ( rule__Task__StringAssignment_2_2 ) ) )
            // InternalPAML.g:1229:1: ( ( rule__Task__StringAssignment_2_2 ) )
            {
            // InternalPAML.g:1229:1: ( ( rule__Task__StringAssignment_2_2 ) )
            // InternalPAML.g:1230:2: ( rule__Task__StringAssignment_2_2 )
            {
             before(grammarAccess.getTaskAccess().getStringAssignment_2_2()); 
            // InternalPAML.g:1231:2: ( rule__Task__StringAssignment_2_2 )
            // InternalPAML.g:1231:3: rule__Task__StringAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__StringAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStringAssignment_2_2()); 

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
    // $ANTLR end "rule__Task__Group_2__2__Impl"


    // $ANTLR start "rule__PAML__MetaInformationAssignment_1"
    // InternalPAML.g:1240:1: rule__PAML__MetaInformationAssignment_1 : ( ruleMeta ) ;
    public final void rule__PAML__MetaInformationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1244:1: ( ( ruleMeta ) )
            // InternalPAML.g:1245:2: ( ruleMeta )
            {
            // InternalPAML.g:1245:2: ( ruleMeta )
            // InternalPAML.g:1246:3: ruleMeta
            {
             before(grammarAccess.getPAMLAccess().getMetaInformationMetaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMeta();

            state._fsp--;

             after(grammarAccess.getPAMLAccess().getMetaInformationMetaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PAML__MetaInformationAssignment_1"


    // $ANTLR start "rule__PAML__PrecodeAssignment_2"
    // InternalPAML.g:1255:1: rule__PAML__PrecodeAssignment_2 : ( RULE_CODE ) ;
    public final void rule__PAML__PrecodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1259:1: ( ( RULE_CODE ) )
            // InternalPAML.g:1260:2: ( RULE_CODE )
            {
            // InternalPAML.g:1260:2: ( RULE_CODE )
            // InternalPAML.g:1261:3: RULE_CODE
            {
             before(grammarAccess.getPAMLAccess().getPrecodeCODETerminalRuleCall_2_0()); 
            match(input,RULE_CODE,FOLLOW_2); 
             after(grammarAccess.getPAMLAccess().getPrecodeCODETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PAML__PrecodeAssignment_2"


    // $ANTLR start "rule__PAML__TasksAssignment_3"
    // InternalPAML.g:1270:1: rule__PAML__TasksAssignment_3 : ( ruleTask ) ;
    public final void rule__PAML__TasksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1274:1: ( ( ruleTask ) )
            // InternalPAML.g:1275:2: ( ruleTask )
            {
            // InternalPAML.g:1275:2: ( ruleTask )
            // InternalPAML.g:1276:3: ruleTask
            {
             before(grammarAccess.getPAMLAccess().getTasksTaskParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPAMLAccess().getTasksTaskParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PAML__TasksAssignment_3"


    // $ANTLR start "rule__PAML__PostcodeAssignment_4"
    // InternalPAML.g:1285:1: rule__PAML__PostcodeAssignment_4 : ( RULE_CODE ) ;
    public final void rule__PAML__PostcodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1289:1: ( ( RULE_CODE ) )
            // InternalPAML.g:1290:2: ( RULE_CODE )
            {
            // InternalPAML.g:1290:2: ( RULE_CODE )
            // InternalPAML.g:1291:3: RULE_CODE
            {
             before(grammarAccess.getPAMLAccess().getPostcodeCODETerminalRuleCall_4_0()); 
            match(input,RULE_CODE,FOLLOW_2); 
             after(grammarAccess.getPAMLAccess().getPostcodeCODETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__PAML__PostcodeAssignment_4"


    // $ANTLR start "rule__Meta__NameAssignment_1_2"
    // InternalPAML.g:1300:1: rule__Meta__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Meta__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1304:1: ( ( RULE_ID ) )
            // InternalPAML.g:1305:2: ( RULE_ID )
            {
            // InternalPAML.g:1305:2: ( RULE_ID )
            // InternalPAML.g:1306:3: RULE_ID
            {
             before(grammarAccess.getMetaAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getNameIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Meta__NameAssignment_1_2"


    // $ANTLR start "rule__Meta__ListStyleAssignment_2_2"
    // InternalPAML.g:1315:1: rule__Meta__ListStyleAssignment_2_2 : ( ruleListStyle ) ;
    public final void rule__Meta__ListStyleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1319:1: ( ( ruleListStyle ) )
            // InternalPAML.g:1320:2: ( ruleListStyle )
            {
            // InternalPAML.g:1320:2: ( ruleListStyle )
            // InternalPAML.g:1321:3: ruleListStyle
            {
             before(grammarAccess.getMetaAccess().getListStyleListStyleEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListStyle();

            state._fsp--;

             after(grammarAccess.getMetaAccess().getListStyleListStyleEnumRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Meta__ListStyleAssignment_2_2"


    // $ANTLR start "rule__Meta__ListRotationAssignment_3_2"
    // InternalPAML.g:1330:1: rule__Meta__ListRotationAssignment_3_2 : ( ruleListRotation ) ;
    public final void rule__Meta__ListRotationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1334:1: ( ( ruleListRotation ) )
            // InternalPAML.g:1335:2: ( ruleListRotation )
            {
            // InternalPAML.g:1335:2: ( ruleListRotation )
            // InternalPAML.g:1336:3: ruleListRotation
            {
             before(grammarAccess.getMetaAccess().getListRotationListRotationEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListRotation();

            state._fsp--;

             after(grammarAccess.getMetaAccess().getListRotationListRotationEnumRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Meta__ListRotationAssignment_3_2"


    // $ANTLR start "rule__Meta__StringAssignment_4_2"
    // InternalPAML.g:1345:1: rule__Meta__StringAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Meta__StringAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1349:1: ( ( RULE_STRING ) )
            // InternalPAML.g:1350:2: ( RULE_STRING )
            {
            // InternalPAML.g:1350:2: ( RULE_STRING )
            // InternalPAML.g:1351:3: RULE_STRING
            {
             before(grammarAccess.getMetaAccess().getStringSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaAccess().getStringSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Meta__StringAssignment_4_2"


    // $ANTLR start "rule__Task__StringAssignment_1_2"
    // InternalPAML.g:1360:1: rule__Task__StringAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Task__StringAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1364:1: ( ( RULE_STRING ) )
            // InternalPAML.g:1365:2: ( RULE_STRING )
            {
            // InternalPAML.g:1365:2: ( RULE_STRING )
            // InternalPAML.g:1366:3: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getStringSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStringSTRINGTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Task__StringAssignment_1_2"


    // $ANTLR start "rule__Task__StringAssignment_2_2"
    // InternalPAML.g:1375:1: rule__Task__StringAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Task__StringAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1379:1: ( ( RULE_STRING ) )
            // InternalPAML.g:1380:2: ( RULE_STRING )
            {
            // InternalPAML.g:1380:2: ( RULE_STRING )
            // InternalPAML.g:1381:3: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getStringSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStringSTRINGTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Task__StringAssignment_2_2"


    // $ANTLR start "rule__Task__CodeAssignment_4"
    // InternalPAML.g:1390:1: rule__Task__CodeAssignment_4 : ( RULE_CODE ) ;
    public final void rule__Task__CodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1394:1: ( ( RULE_CODE ) )
            // InternalPAML.g:1395:2: ( RULE_CODE )
            {
            // InternalPAML.g:1395:2: ( RULE_CODE )
            // InternalPAML.g:1396:3: RULE_CODE
            {
             before(grammarAccess.getTaskAccess().getCodeCODETerminalRuleCall_4_0()); 
            match(input,RULE_CODE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCodeCODETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Task__CodeAssignment_4"


    // $ANTLR start "rule__Task__TestAssignment_5"
    // InternalPAML.g:1405:1: rule__Task__TestAssignment_5 : ( RULE_TEST ) ;
    public final void rule__Task__TestAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1409:1: ( ( RULE_TEST ) )
            // InternalPAML.g:1410:2: ( RULE_TEST )
            {
            // InternalPAML.g:1410:2: ( RULE_TEST )
            // InternalPAML.g:1411:3: RULE_TEST
            {
             before(grammarAccess.getTaskAccess().getTestTESTTerminalRuleCall_5_0()); 
            match(input,RULE_TEST,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTestTESTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Task__TestAssignment_5"


    // $ANTLR start "rule__Task__SubtasksAssignment_6"
    // InternalPAML.g:1420:1: rule__Task__SubtasksAssignment_6 : ( ruleTask ) ;
    public final void rule__Task__SubtasksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPAML.g:1424:1: ( ( ruleTask ) )
            // InternalPAML.g:1425:2: ( ruleTask )
            {
            // InternalPAML.g:1425:2: ( ruleTask )
            // InternalPAML.g:1426:3: ruleTask
            {
             before(grammarAccess.getTaskAccess().getSubtasksTaskParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSubtasksTaskParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Task__SubtasksAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000028000090L});

}