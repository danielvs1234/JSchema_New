/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalJSchemaParser;
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;

public class JSchemaParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JSchemaGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JSchemaGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractObjectAccess().getAlternatives(), "rule__AbstractObject__Alternatives");
			builder.put(grammarAccess.getExtendedObjectAccess().getAlternatives_4_0(), "rule__ExtendedObject__Alternatives_4_0");
			builder.put(grammarAccess.getExtendedObjectAccess().getAlternatives_4_1(), "rule__ExtendedObject__Alternatives_4_1");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getAlternatives(), "rule__PrimitiveTypes__Alternatives");
			builder.put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getAlternatives(), "rule__PrimitiveProperties__Alternatives");
			builder.put(grammarAccess.getArrayTypeAccess().getAlternatives(), "rule__ArrayType__Alternatives");
			builder.put(grammarAccess.getFormatTypesAccess().getAlternatives(), "rule__FormatTypes__Alternatives");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
			builder.put(grammarAccess.getMainObjectAccess().getGroup(), "rule__MainObject__Group__0");
			builder.put(grammarAccess.getMainObjectAccess().getGroup_2(), "rule__MainObject__Group_2__0");
			builder.put(grammarAccess.getMainObjectAccess().getGroup_4(), "rule__MainObject__Group_4__0");
			builder.put(grammarAccess.getMainObjectAccess().getGroup_4_1(), "rule__MainObject__Group_4_1__0");
			builder.put(grammarAccess.getPrimitiveObjectAccess().getGroup(), "rule__PrimitiveObject__Group__0");
			builder.put(grammarAccess.getPrimitiveObjectAccess().getGroup_1(), "rule__PrimitiveObject__Group_1__0");
			builder.put(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2(), "rule__PrimitiveObject__Group_1_2__0");
			builder.put(grammarAccess.getExtendedObjectAccess().getGroup(), "rule__ExtendedObject__Group__0");
			builder.put(grammarAccess.getExtendedObjectAccess().getGroup_4(), "rule__ExtendedObject__Group_4__0");
			builder.put(grammarAccess.getExtendedObjectAccess().getGroup_4_0_0(), "rule__ExtendedObject__Group_4_0_0__0");
			builder.put(grammarAccess.getExtendedObjectAccess().getGroup_4_1_0(), "rule__ExtendedObject__Group_4_1_0__0");
			builder.put(grammarAccess.getExtendedObjectAccess().getGroup_4_1_0_1(), "rule__ExtendedObject__Group_4_1_0_1__0");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getGroup_0(), "rule__PrimitiveTypes__Group_0__0");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getGroup_2(), "rule__PrimitiveTypes__Group_2__0");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getGroup_0(), "rule__PrimitiveProperties__Group_0__0");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getGroup_1(), "rule__PrimitiveProperties__Group_1__0");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getGroup_2(), "rule__PrimitiveProperties__Group_2__0");
			builder.put(grammarAccess.getStringLengthAccess().getGroup(), "rule__StringLength__Group__0");
			builder.put(grammarAccess.getIncludesAccess().getGroup(), "rule__Includes__Group__0");
			builder.put(grammarAccess.getIncludesAccess().getGroup_1(), "rule__Includes__Group_1__0");
			builder.put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
			builder.put(grammarAccess.getArrayAccess().getGroup_2(), "rule__Array__Group_2__0");
			builder.put(grammarAccess.getArrayAccess().getGroup_2_1(), "rule__Array__Group_2_1__0");
			builder.put(grammarAccess.getModelAccess().getAbstractObjectAssignment(), "rule__Model__AbstractObjectAssignment");
			builder.put(grammarAccess.getNumberAccess().getNumberAssignment_0(), "rule__Number__NumberAssignment_0");
			builder.put(grammarAccess.getNumberAccess().getDecimalAssignment_1_1(), "rule__Number__DecimalAssignment_1_1");
			builder.put(grammarAccess.getMainObjectAccess().getObjectNameAssignment_0(), "rule__MainObject__ObjectNameAssignment_0");
			builder.put(grammarAccess.getMainObjectAccess().getRootAssignment_1(), "rule__MainObject__RootAssignment_1");
			builder.put(grammarAccess.getMainObjectAccess().getIncludeObjectsAssignment_2_1(), "rule__MainObject__IncludeObjectsAssignment_2_1");
			builder.put(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0(), "rule__MainObject__PropertiesAssignment_4_0");
			builder.put(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1(), "rule__MainObject__PropertiesAssignment_4_1_1");
			builder.put(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0(), "rule__PrimitiveObject__TypeAssignment_0");
			builder.put(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1(), "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1");
			builder.put(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1(), "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1");
			builder.put(grammarAccess.getExtendedObjectAccess().getObjectNameAssignment_0(), "rule__ExtendedObject__ObjectNameAssignment_0");
			builder.put(grammarAccess.getExtendedObjectAccess().getExtendsIDAssignment_2(), "rule__ExtendedObject__ExtendsIDAssignment_2");
			builder.put(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesAssignment_4_0_0_1(), "rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1");
			builder.put(grammarAccess.getExtendedObjectAccess().getPropertiesAssignment_4_0_1(), "rule__ExtendedObject__PropertiesAssignment_4_0_1");
			builder.put(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesAssignment_4_1_0_1_1(), "rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1");
			builder.put(grammarAccess.getExtendedObjectAccess().getPropertiesAssignment_4_1_1(), "rule__ExtendedObject__PropertiesAssignment_4_1_1");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getStringNameAssignment_0_1(), "rule__PrimitiveTypes__StringNameAssignment_0_1");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_2(), "rule__PrimitiveTypes__StringAssignment_0_2");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1(), "rule__PrimitiveTypes__ArrayAssignment_1");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getNumIDAssignment_2_1(), "rule__PrimitiveTypes__NumIDAssignment_2_1");
			builder.put(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_2(), "rule__PrimitiveTypes__NumberAssignment_2_2");
			builder.put(grammarAccess.getIsRootAccess().getStringAssignment(), "rule__IsRoot__StringAssignment");
			builder.put(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment(), "rule__HasProperties__PropertiesAssignment");
			builder.put(grammarAccess.getPropertyAccess().getPropPrimAssignment_0(), "rule__Property__PropPrimAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getPropObjAssignment_1(), "rule__Property__PropObjAssignment_1");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getStringLengthAssignment_0_1(), "rule__PrimitiveProperties__StringLengthAssignment_0_1");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1(), "rule__PrimitiveProperties__PatternStringAssignment_1_1");
			builder.put(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1(), "rule__PrimitiveProperties__StringFormatAssignment_2_1");
			builder.put(grammarAccess.getIncludesAccess().getObjectIDAssignment_0(), "rule__Includes__ObjectIDAssignment_0");
			builder.put(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1(), "rule__Includes__ObjectIDAssignment_1_1");
			builder.put(grammarAccess.getArrayAccess().getArrayNameAssignment_0(), "rule__Array__ArrayNameAssignment_0");
			builder.put(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0(), "rule__Array__PropertiesAssignment_2_0");
			builder.put(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1(), "rule__Array__PropertiesAssignment_2_1_1");
			builder.put(grammarAccess.getArrayAccess().getArrayTypeAssignment_3(), "rule__Array__ArrayTypeAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JSchemaGrammarAccess grammarAccess;

	@Override
	protected InternalJSchemaParser createParser() {
		InternalJSchemaParser result = new InternalJSchemaParser(null);
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

	public JSchemaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JSchemaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
