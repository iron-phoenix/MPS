/**
 */
package ru.spbau.luchikhin.graph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.spbau.luchikhin.graph.GraphPackage;
import ru.spbau.luchikhin.graph.NoConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.spbau.luchikhin.graph.impl.NoConnectionImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoConnectionImpl extends MinimalEObjectImpl.Container implements NoConnection
{
  /**
   * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected static final String CONNECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected String connection = CONNECTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoConnectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraphPackage.Literals.NO_CONNECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnection()
  {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnection(String newConnection)
  {
    String oldConnection = connection;
    connection = newConnection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NO_CONNECTION__CONNECTION, oldConnection, connection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraphPackage.NO_CONNECTION__CONNECTION:
        return getConnection();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphPackage.NO_CONNECTION__CONNECTION:
        setConnection((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraphPackage.NO_CONNECTION__CONNECTION:
        setConnection(CONNECTION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraphPackage.NO_CONNECTION__CONNECTION:
        return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (connection: ");
    result.append(connection);
    result.append(')');
    return result.toString();
  }

} //NoConnectionImpl
