/**
 */
package ru.spbau.luchikhin.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.spbau.luchikhin.graph.NoConnection#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.spbau.luchikhin.graph.GraphPackage#getNoConnection()
 * @model
 * @generated
 */
public interface NoConnection extends EObject
{
  /**
   * Returns the value of the '<em><b>Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' attribute.
   * @see #setConnection(String)
   * @see ru.spbau.luchikhin.graph.GraphPackage#getNoConnection_Connection()
   * @model
   * @generated
   */
  String getConnection();

  /**
   * Sets the value of the '{@link ru.spbau.luchikhin.graph.NoConnection#getConnection <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' attribute.
   * @see #getConnection()
   * @generated
   */
  void setConnection(String value);

} // NoConnection
