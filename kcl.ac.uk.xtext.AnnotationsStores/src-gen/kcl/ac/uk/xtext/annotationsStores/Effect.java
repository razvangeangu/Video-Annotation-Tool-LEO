/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.annotationsStores;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.xtext.annotationsStores.Effect#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject
{
  /**
   * Returns the value of the '<em><b>Affected By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affected By</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affected By</em>' attribute.
   * @see #setAffectedBy(String)
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresPackage#getEffect_AffectedBy()
   * @model
   * @generated
   */
  String getAffectedBy();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.annotationsStores.Effect#getAffectedBy <em>Affected By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Affected By</em>' attribute.
   * @see #getAffectedBy()
   * @generated
   */
  void setAffectedBy(String value);

} // Effect