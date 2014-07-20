/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.Template;
import org.nasdanika.amur.lang.causality.TemplateElement;
import org.nasdanika.amur.lang.causality.render.js.TemplateRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.TemplateImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends CDOObjectImpl implements Template {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TemplateElement> getElements() {
		return (EList<TemplateElement>)eGet(CausalityPackage.Literals.TEMPLATE__ELEMENTS, true);
	}

	@Override
	public String toJavaScript(Mode mode) {
		return new TemplateRenderer().render(mode, this).trim();
	}

} //TemplateImpl
