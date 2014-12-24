/**
 */
package ru.spbau.luchikhin.graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.spbau.luchikhin.graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "graph";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.spbau.ru/luchikhin/Graph";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "graph";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraphPackage eINSTANCE = ru.spbau.luchikhin.graph.impl.GraphPackageImpl.init();

  /**
   * The meta object id for the '{@link ru.spbau.luchikhin.graph.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.spbau.luchikhin.graph.impl.ModelImpl
   * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NODES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ru.spbau.luchikhin.graph.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.spbau.luchikhin.graph.impl.NodeImpl
   * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getNode()
   * @generated
   */
  int NODE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CONNECTIONS = 1;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ru.spbau.luchikhin.graph.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.spbau.luchikhin.graph.impl.ConnectionImpl
   * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 2;

  /**
   * The feature id for the '<em><b>Connection</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__CONNECTION = 0;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ru.spbau.luchikhin.graph.impl.NoConnectionImpl <em>No Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.spbau.luchikhin.graph.impl.NoConnectionImpl
   * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getNoConnection()
   * @generated
   */
  int NO_CONNECTION = 3;

  /**
   * The feature id for the '<em><b>Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_CONNECTION__CONNECTION = 0;

  /**
   * The number of structural features of the '<em>No Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_CONNECTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link ru.spbau.luchikhin.graph.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see ru.spbau.luchikhin.graph.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link ru.spbau.luchikhin.graph.Model#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see ru.spbau.luchikhin.graph.Model#getNodes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Nodes();

  /**
   * Returns the meta object for class '{@link ru.spbau.luchikhin.graph.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see ru.spbau.luchikhin.graph.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link ru.spbau.luchikhin.graph.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.spbau.luchikhin.graph.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the containment reference '{@link ru.spbau.luchikhin.graph.Node#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Connections</em>'.
   * @see ru.spbau.luchikhin.graph.Node#getConnections()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Connections();

  /**
   * Returns the meta object for class '{@link ru.spbau.luchikhin.graph.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection</em>'.
   * @see ru.spbau.luchikhin.graph.Connection
   * @generated
   */
  EClass getConnection();

  /**
   * Returns the meta object for the reference list '{@link ru.spbau.luchikhin.graph.Connection#getConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Connection</em>'.
   * @see ru.spbau.luchikhin.graph.Connection#getConnection()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Connection();

  /**
   * Returns the meta object for class '{@link ru.spbau.luchikhin.graph.NoConnection <em>No Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Connection</em>'.
   * @see ru.spbau.luchikhin.graph.NoConnection
   * @generated
   */
  EClass getNoConnection();

  /**
   * Returns the meta object for the attribute '{@link ru.spbau.luchikhin.graph.NoConnection#getConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connection</em>'.
   * @see ru.spbau.luchikhin.graph.NoConnection#getConnection()
   * @see #getNoConnection()
   * @generated
   */
  EAttribute getNoConnection_Connection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GraphFactory getGraphFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ru.spbau.luchikhin.graph.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.spbau.luchikhin.graph.impl.ModelImpl
     * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NODES = eINSTANCE.getModel_Nodes();

    /**
     * The meta object literal for the '{@link ru.spbau.luchikhin.graph.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.spbau.luchikhin.graph.impl.NodeImpl
     * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__CONNECTIONS = eINSTANCE.getNode_Connections();

    /**
     * The meta object literal for the '{@link ru.spbau.luchikhin.graph.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.spbau.luchikhin.graph.impl.ConnectionImpl
     * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getConnection()
     * @generated
     */
    EClass CONNECTION = eINSTANCE.getConnection();

    /**
     * The meta object literal for the '<em><b>Connection</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__CONNECTION = eINSTANCE.getConnection_Connection();

    /**
     * The meta object literal for the '{@link ru.spbau.luchikhin.graph.impl.NoConnectionImpl <em>No Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.spbau.luchikhin.graph.impl.NoConnectionImpl
     * @see ru.spbau.luchikhin.graph.impl.GraphPackageImpl#getNoConnection()
     * @generated
     */
    EClass NO_CONNECTION = eINSTANCE.getNoConnection();

    /**
     * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NO_CONNECTION__CONNECTION = eINSTANCE.getNoConnection_Connection();

  }

} //GraphPackage
