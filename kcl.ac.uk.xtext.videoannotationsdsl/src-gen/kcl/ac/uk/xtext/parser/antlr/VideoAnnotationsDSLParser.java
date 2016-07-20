/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.parser.antlr;

import com.google.inject.Inject;
import kcl.ac.uk.xtext.parser.antlr.internal.InternalVideoAnnotationsDSLParser;
import kcl.ac.uk.xtext.services.VideoAnnotationsDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class VideoAnnotationsDSLParser extends AbstractAntlrParser {

	@Inject
	private VideoAnnotationsDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalVideoAnnotationsDSLParser createParser(XtextTokenStream stream) {
		return new InternalVideoAnnotationsDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AnnotatedVideo";
	}

	public VideoAnnotationsDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VideoAnnotationsDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}