/*
 * generated by Xtext 2.9.0
 */
package org.xtext.aic.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.aic.dsl.ide.contentassist.antlr.internal.InternalAiC_DSLParser;
import org.xtext.aic.dsl.services.AiC_DSLGrammarAccess;

public class AiC_DSLParser extends AbstractContentAssistParser {

	@Inject
	private AiC_DSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAiC_DSLParser createParser() {
		InternalAiC_DSLParser result = new InternalAiC_DSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
					put(grammarAccess.getModelAccess().getSensorsAssignment(), "rule__Model__SensorsAssignment");
					put(grammarAccess.getSensorAccess().getNameAssignment_1(), "rule__Sensor__NameAssignment_1");
					put(grammarAccess.getSensorAccess().getValueAssignment_3(), "rule__Sensor__ValueAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAiC_DSLParser typedParser = (InternalAiC_DSLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AiC_DSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AiC_DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
