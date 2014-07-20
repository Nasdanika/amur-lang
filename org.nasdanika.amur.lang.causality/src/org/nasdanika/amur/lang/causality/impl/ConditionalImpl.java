/**
 */
package org.nasdanika.amur.lang.causality.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Conditional;
import org.nasdanika.amur.lang.causality.ConditionalPart;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.render.js.ConditionalRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.ConditionalImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends TemplateElementImpl implements Conditional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConditionalPart> getParts() {
		return (EList<ConditionalPart>)eGet(CausalityPackage.Literals.CONDITIONAL__PARTS, true);
	}

	@Override
	public String toJavaScript(Mode mode) {
		if (Mode.SYNCHRONOUS.equals(mode)) {
			return new ConditionalRenderer().render(mode, this).trim();
		}
		List<ConditionalPart> rParts = new ArrayList<>(getParts());
		Collections.reverse(rParts);
		String fBody = null;
		for (ConditionalPart p: rParts) {
			fBody = p.toJavaScript(mode, fBody);
		}
		return 	"function($out) {" +
				System.lineSeparator() + 
				fBody +
				System.lineSeparator() +
				"}.bind(this)";
	}
	
} //ConditionalImpl
