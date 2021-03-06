/*
 * generated by Xtext
 */
package ru.spbau.luchikhin.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import ru.spbau.luchikhin.graph.Node
import org.eclipse.emf.ecore.EObject
import ru.spbau.luchikhin.graph.NoConnection
import ru.spbau.luchikhin.graph.Connection

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GraphGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('Graph.java',
			resource.allContents
				.filter(typeof(Node))
				.map[compile]
				.join('\n'))
	}
	
	def compile(Node n) '''
		class «n.name» {
			public List<Class> getDependencies() {
				return «n.connections.compileConnection»;
			}
		}
	'''
	
	def compileConnection(EObject object) {
		if (object instanceof Connection) {
			return compile(object as Connection);
		}
		
		if (object instanceof NoConnection) {
			return compile(object as NoConnection);
		}
	}
	
	def compile(NoConnection _) '''Collections.emptyList()'''
	
	def compile(Connection connections) '''
		Arrays.asList(«connections.connection.map[it | it.name + ".class"].join(', ')»)'''
}
