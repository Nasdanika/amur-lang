/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.SynchronousSection;
import org.nasdanika.amur.lang.causality.render.js.ToSynchronousRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SynchronousSectionImpl extends SectionImpl implements SynchronousSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.SYNCHRONOUS_SECTION;
	}

	@Override
	public String toJavaScript(Mode mode) {
		String template = getTemplate().toJavaScript(Mode.SYNCHRONOUS);
		return Mode.SYNCHRONOUS.equals(mode) ? template : new ToSynchronousRenderer().render(mode, template).trim();
	}

} //SynchronousSectionImpl
