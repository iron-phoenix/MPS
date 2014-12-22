/**
 */
package ru.spbau.luchikhin.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.spbau.luchikhin.graph.Connection#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.spbau.luchikhin.graph.GraphPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject
{
  /**
   * Returns the value of the '<em><b>Connection</b></em>' reference list.
   * The list contents are of type {@link ru.spbau.luchikhin.graph.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' reference list.
   * @see ru.spbau.luchikhin.graph.GraphPackage#getConnection_Connection()
   * @model
   * @generated
   */
  EList<Node> getConnection();

} // Connection
