/**
 */
package ru.spbau.luchikhin.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.spbau.luchikhin.graph.Node#getName <em>Name</em>}</li>
 *   <li>{@link ru.spbau.luchikhin.graph.Node#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.spbau.luchikhin.graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.spbau.luchikhin.graph.GraphPackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.spbau.luchikhin.graph.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Connections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connections</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connections</em>' containment reference.
   * @see #setConnections(EObject)
   * @see ru.spbau.luchikhin.graph.GraphPackage#getNode_Connections()
   * @model containment="true"
   * @generated
   */
  EObject getConnections();

  /**
   * Sets the value of the '{@link ru.spbau.luchikhin.graph.Node#getConnections <em>Connections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connections</em>' containment reference.
   * @see #getConnections()
   * @generated
   */
  void setConnections(EObject value);

} // Node
