package ru.spbau.luchikhin.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ru.spbau.luchikhin.graph.Connection;
import ru.spbau.luchikhin.graph.GraphPackage;
import ru.spbau.luchikhin.graph.Model;
import ru.spbau.luchikhin.graph.NoConnection;
import ru.spbau.luchikhin.graph.Node;
import ru.spbau.luchikhin.services.GraphGrammarAccess;

@SuppressWarnings("all")
public class GraphSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraphGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GraphPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GraphPackage.CONNECTION:
				if(context == grammarAccess.getConnectionRule()) {
					sequence_Connection(context, (Connection) semanticObject); 
					return; 
				}
				else break;
			case GraphPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GraphPackage.NO_CONNECTION:
				if(context == grammarAccess.getNoConnectionRule()) {
					sequence_NoConnection(context, (NoConnection) semanticObject); 
					return; 
				}
				else break;
			case GraphPackage.NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (connection+=[Node|ID] connection+=[Node|ID]*)
	 */
	protected void sequence_Connection(EObject context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     node+=Node*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     connection='isolated'
	 */
	protected void sequence_NoConnection(EObject context, NoConnection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GraphPackage.Literals.NO_CONNECTION__CONNECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraphPackage.Literals.NO_CONNECTION__CONNECTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoConnectionAccess().getConnectionIsolatedKeyword_0(), semanticObject.getConnection());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (connections=Connection | connections=NoConnection))
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
