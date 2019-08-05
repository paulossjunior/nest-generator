/*
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import prodest.es.gov.br.dsl.ide.contentassist.antlr.internal.InternalNestDslParser;
import prodest.es.gov.br.dsl.services.NestDslGrammarAccess;

public class NestDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NestDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NestDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getDtoTypeAccess().getAlternatives(), "rule__DtoType__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
			builder.put(grammarAccess.getOneArgumentRelationAccess().getArgumentAlternatives_0_0(), "rule__OneArgumentRelation__ArgumentAlternatives_0_0");
			builder.put(grammarAccess.getMultipleArgumentRelationAccess().getArgumentAlternatives_0_0(), "rule__MultipleArgumentRelation__ArgumentAlternatives_0_0");
			builder.put(grammarAccess.getMethodAccess().getVerbAlternatives_0_0(), "rule__Method__VerbAlternatives_0_0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getDtoAccess().getGroup(), "rule__Dto__Group__0");
			builder.put(grammarAccess.getDtoAccess().getGroup_2(), "rule__Dto__Group_2__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getDtoPropertyAccess().getGroup(), "rule__DtoProperty__Group__0");
			builder.put(grammarAccess.getOneArgumentRelationAccess().getGroup(), "rule__OneArgumentRelation__Group__0");
			builder.put(grammarAccess.getMultipleArgumentRelationAccess().getGroup(), "rule__MultipleArgumentRelation__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
			builder.put(grammarAccess.getMethodArgAccess().getGroup(), "rule__MethodArg__Group__0");
			builder.put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getPropertiesAssignment_4(), "rule__Entity__PropertiesAssignment_4");
			builder.put(grammarAccess.getEntityAccess().getMethodsAssignment_5(), "rule__Entity__MethodsAssignment_5");
			builder.put(grammarAccess.getDtoAccess().getNameAssignment_1(), "rule__Dto__NameAssignment_1");
			builder.put(grammarAccess.getDtoAccess().getSuperTypeAssignment_2_1(), "rule__Dto__SuperTypeAssignment_2_1");
			builder.put(grammarAccess.getDtoAccess().getPropertiesAssignment_4(), "rule__Dto__PropertiesAssignment_4");
			builder.put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
			builder.put(grammarAccess.getPropertyAccess().getRelationAssignment_0(), "rule__Property__RelationAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
			builder.put(grammarAccess.getPropertyAccess().getTypeAssignment_3(), "rule__Property__TypeAssignment_3");
			builder.put(grammarAccess.getPropertyAccess().getArrayAssignment_4(), "rule__Property__ArrayAssignment_4");
			builder.put(grammarAccess.getDtoPropertyAccess().getNameAssignment_0(), "rule__DtoProperty__NameAssignment_0");
			builder.put(grammarAccess.getDtoPropertyAccess().getTypeAssignment_2(), "rule__DtoProperty__TypeAssignment_2");
			builder.put(grammarAccess.getDtoPropertyAccess().getArrayAssignment_3(), "rule__DtoProperty__ArrayAssignment_3");
			builder.put(grammarAccess.getRelationAccess().getOneArgumentAssignment_0(), "rule__Relation__OneArgumentAssignment_0");
			builder.put(grammarAccess.getRelationAccess().getMultipleArgumentAssignment_1(), "rule__Relation__MultipleArgumentAssignment_1");
			builder.put(grammarAccess.getOneArgumentRelationAccess().getArgumentAssignment_0(), "rule__OneArgumentRelation__ArgumentAssignment_0");
			builder.put(grammarAccess.getOneArgumentRelationAccess().getTypeAssignment_1(), "rule__OneArgumentRelation__TypeAssignment_1");
			builder.put(grammarAccess.getMultipleArgumentRelationAccess().getArgumentAssignment_0(), "rule__MultipleArgumentRelation__ArgumentAssignment_0");
			builder.put(grammarAccess.getMultipleArgumentRelationAccess().getTypeAssignment_1(), "rule__MultipleArgumentRelation__TypeAssignment_1");
			builder.put(grammarAccess.getMultipleArgumentRelationAccess().getSecondArgumentAssignment_3(), "rule__MultipleArgumentRelation__SecondArgumentAssignment_3");
			builder.put(grammarAccess.getMethodAccess().getVerbAssignment_0(), "rule__Method__VerbAssignment_0");
			builder.put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
			builder.put(grammarAccess.getMethodAccess().getArgsAssignment_3_0(), "rule__Method__ArgsAssignment_3_0");
			builder.put(grammarAccess.getMethodAccess().getReturnTypeAssignment_5(), "rule__Method__ReturnTypeAssignment_5");
			builder.put(grammarAccess.getMethodAccess().getArrayAssignment_6(), "rule__Method__ArrayAssignment_6");
			builder.put(grammarAccess.getMethodArgAccess().getNameAssignment_0(), "rule__MethodArg__NameAssignment_0");
			builder.put(grammarAccess.getMethodArgAccess().getTypeAssignment_2(), "rule__MethodArg__TypeAssignment_2");
			builder.put(grammarAccess.getMethodArgAccess().getArrayAssignment_3(), "rule__MethodArg__ArrayAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NestDslGrammarAccess grammarAccess;

	@Override
	protected InternalNestDslParser createParser() {
		InternalNestDslParser result = new InternalNestDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public NestDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NestDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
