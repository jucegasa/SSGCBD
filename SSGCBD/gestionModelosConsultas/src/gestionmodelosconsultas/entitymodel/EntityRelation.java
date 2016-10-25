/**
 */
package gestionmodelosconsultas.entitymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getAtributteForeingKeySource <em>Atributte Foreing Key Source</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getAtributtePrimaryKeyTarget <em>Atributte Primary Key Target</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTheFactoryEntity <em>The Factory Entity</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getSource <em>Source</em>}</li>
 *   <li>{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation()
 * @model
 * @generated
 */
public interface EntityRelation extends ModelElementEntity {
	/**
	 * Returns the value of the '<em><b>Atributte Foreing Key Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributte Foreing Key Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributte Foreing Key Source</em>' attribute.
	 * @see #setAtributteForeingKeySource(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_AtributteForeingKeySource()
	 * @model
	 * @generated
	 */
	String getAtributteForeingKeySource();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getAtributteForeingKeySource <em>Atributte Foreing Key Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributte Foreing Key Source</em>' attribute.
	 * @see #getAtributteForeingKeySource()
	 * @generated
	 */
	void setAtributteForeingKeySource(String value);

	/**
	 * Returns the value of the '<em><b>Atributte Primary Key Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributte Primary Key Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributte Primary Key Target</em>' attribute.
	 * @see #setAtributtePrimaryKeyTarget(String)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_AtributtePrimaryKeyTarget()
	 * @model
	 * @generated
	 */
	String getAtributtePrimaryKeyTarget();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getAtributtePrimaryKeyTarget <em>Atributte Primary Key Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributte Primary Key Target</em>' attribute.
	 * @see #getAtributtePrimaryKeyTarget()
	 * @generated
	 */
	void setAtributtePrimaryKeyTarget(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source</b></em>' attribute.
	 * The default value is <code>"many_to_one"</code>.
	 * The literals are from the enumeration {@link gestionmodelosconsultas.entitymodel.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.Multiplicity
	 * @see #setMultiplicitySource(Multiplicity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_MultiplicitySource()
	 * @model default="many_to_one"
	 * @generated
	 */
	Multiplicity getMultiplicitySource();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicitySource <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.Multiplicity
	 * @see #getMultiplicitySource()
	 * @generated
	 */
	void setMultiplicitySource(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target</b></em>' attribute.
	 * The default value is <code>"one_to_many"</code>.
	 * The literals are from the enumeration {@link gestionmodelosconsultas.entitymodel.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.Multiplicity
	 * @see #setMultiplicityTarget(Multiplicity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_MultiplicityTarget()
	 * @model default="one_to_many"
	 * @generated
	 */
	Multiplicity getMultiplicityTarget();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getMultiplicityTarget <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target</em>' attribute.
	 * @see gestionmodelosconsultas.entitymodel.Multiplicity
	 * @see #getMultiplicityTarget()
	 * @generated
	 */
	void setMultiplicityTarget(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>The Factory Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntityRelation <em>List Entity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Factory Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Factory Entity</em>' container reference.
	 * @see #setTheFactoryEntity(DiagramEntity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_TheFactoryEntity()
	 * @see gestionmodelosconsultas.entitymodel.DiagramEntity#getListEntityRelation
	 * @model opposite="listEntityRelation"
	 * @generated
	 */
	DiagramEntity getTheFactoryEntity();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTheFactoryEntity <em>The Factory Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Factory Entity</em>' container reference.
	 * @see #getTheFactoryEntity()
	 * @generated
	 */
	void setTheFactoryEntity(DiagramEntity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see gestionmodelosconsultas.entitymodel.EntitymodelPackage#getEntityRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.entitymodel.EntityRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

} // EntityRelation
