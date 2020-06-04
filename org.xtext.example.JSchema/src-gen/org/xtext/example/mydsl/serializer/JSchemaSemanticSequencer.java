/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.jSchema.Array;
import org.xtext.example.mydsl.jSchema.Includes;
import org.xtext.example.mydsl.jSchema.IsRoot;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.Model;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.PrimitiveProperties;
import org.xtext.example.mydsl.jSchema.PrimitiveTypes;
import org.xtext.example.mydsl.jSchema.Property;
import org.xtext.example.mydsl.jSchema.hasProperties;
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;

@SuppressWarnings("all")
public class JSchemaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JSchemaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JSchemaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JSchemaPackage.ARRAY:
				sequence_Array(context, (Array) semanticObject); 
				return; 
			case JSchemaPackage.INCLUDES:
				sequence_Includes(context, (Includes) semanticObject); 
				return; 
			case JSchemaPackage.IS_ROOT:
				sequence_IsRoot(context, (IsRoot) semanticObject); 
				return; 
			case JSchemaPackage.MAIN_OBJECT:
				sequence_MainObject(context, (MainObject) semanticObject); 
				return; 
			case JSchemaPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case JSchemaPackage.NUMBER:
				sequence_Number(context, (org.xtext.example.mydsl.jSchema.Number) semanticObject); 
				return; 
			case JSchemaPackage.PRIMITIVE_OBJECT:
				sequence_PrimitiveObject(context, (PrimitiveObject) semanticObject); 
				return; 
			case JSchemaPackage.PRIMITIVE_PROPERTIES:
				sequence_PrimitiveProperties(context, (PrimitiveProperties) semanticObject); 
				return; 
			case JSchemaPackage.PRIMITIVE_TYPES:
				sequence_PrimitiveTypes(context, (PrimitiveTypes) semanticObject); 
				return; 
			case JSchemaPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case JSchemaPackage.HAS_PROPERTIES:
				sequence_hasProperties(context, (hasProperties) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Array returns Array
	 *
	 * Constraint:
	 *     (arrayName=ID (properties+=Property properties+=Property*)? arrayType=ArrayType?)
	 */
	protected void sequence_Array(ISerializationContext context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Includes returns Includes
	 *
	 * Constraint:
	 *     (objectID+=STRING objectID+=STRING*)
	 */
	protected void sequence_Includes(ISerializationContext context, Includes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IsRoot returns IsRoot
	 *
	 * Constraint:
	 *     string='root'
	 */
	protected void sequence_IsRoot(ISerializationContext context, IsRoot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JSchemaPackage.Literals.IS_ROOT__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JSchemaPackage.Literals.IS_ROOT__STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsRootAccess().getStringRootKeyword_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractObject returns MainObject
	 *     MainObject returns MainObject
	 *
	 * Constraint:
	 *     (objectName=ID root=IsRoot? includeObjects=Includes? (properties+=hasProperties properties+=hasProperties*)?)
	 */
	protected void sequence_MainObject(ISerializationContext context, MainObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     AbstractObject+=AbstractObject+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Number returns Number
	 *
	 * Constraint:
	 *     (number=INT decimal=INT?)
	 */
	protected void sequence_Number(ISerializationContext context, org.xtext.example.mydsl.jSchema.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractObject returns PrimitiveObject
	 *     PrimitiveObject returns PrimitiveObject
	 *
	 * Constraint:
	 *     (type=PrimitiveTypes (primitiveProperties+=PrimitiveProperties primitiveProperties+=PrimitiveProperties*)?)
	 */
	protected void sequence_PrimitiveObject(ISerializationContext context, PrimitiveObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimitiveProperties returns PrimitiveProperties
	 *
	 * Constraint:
	 *     (stringLength=StringLength | patternString=STRING | stringFormat=FormatTypes)
	 */
	protected void sequence_PrimitiveProperties(ISerializationContext context, PrimitiveProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimitiveTypes returns PrimitiveTypes
	 *
	 * Constraint:
	 *     (string=STRING | array=Array | number=Number)
	 */
	protected void sequence_PrimitiveTypes(ISerializationContext context, PrimitiveTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (propPrim=PrimitiveObject | propObj=MainObject)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     hasProperties returns hasProperties
	 *
	 * Constraint:
	 *     properties=Property
	 */
	protected void sequence_hasProperties(ISerializationContext context, hasProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JSchemaPackage.Literals.HAS_PROPERTIES__PROPERTIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JSchemaPackage.Literals.HAS_PROPERTIES__PROPERTIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0(), semanticObject.getProperties());
		feeder.finish();
	}
	
	
}