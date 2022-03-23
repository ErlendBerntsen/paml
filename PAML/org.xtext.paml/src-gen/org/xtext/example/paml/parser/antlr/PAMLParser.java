/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.paml.parser.antlr.internal.InternalPAMLParser;
import org.xtext.example.paml.services.PAMLGrammarAccess;

public class PAMLParser extends AbstractAntlrParser {

	@Inject
	private PAMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPAMLParser createParser(XtextTokenStream stream) {
		return new InternalPAMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "PAML";
	}

	public PAMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PAMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
