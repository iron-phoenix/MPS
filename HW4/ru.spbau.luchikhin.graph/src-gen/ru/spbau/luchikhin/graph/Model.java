/**
 */
package ru.spbau.luchikhin.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.spbau.luchikhin.graph.Model#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.spbau.luchikhin.graph.GraphPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link ru.spbau.luchikhin.graph.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see ru.spbau.luchikhin.graph.GraphPackage#getModel_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

} // Model
