/**
 */
package org.nasdanika.amur.lang.causality.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.ParallelSection;
import org.nasdanika.amur.lang.causality.render.js.FromSynchronousRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelSectionImpl extends SectionImpl implements ParallelSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.PARALLEL_SECTION;
	}

	@Override
	public String toJavaScript(Mode mode) {
		String template = getTemplate().toJavaScript(Mode.PARALLEL);
		return Mode.SYNCHRONOUS.equals(mode) ? new FromSynchronousRenderer().render(mode, template).trim() : template;
	}

} //ParallelSectionImpl
