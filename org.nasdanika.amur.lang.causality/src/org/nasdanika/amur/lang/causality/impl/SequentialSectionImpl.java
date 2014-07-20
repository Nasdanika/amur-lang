/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.SequentialSection;
import org.nasdanika.amur.lang.causality.render.js.FromSynchronousRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SequentialSectionImpl extends SectionImpl implements SequentialSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.SEQUENTIAL_SECTION;
	}

	@Override
	public String toJavaScript(Mode mode) {
		String template = getTemplate().toJavaScript(Mode.SEQUENTIAL);
		return Mode.SYNCHRONOUS.equals(mode) ? new FromSynchronousRenderer().render(mode, template).trim() : template;
	}

} //SequentialSectionImpl
