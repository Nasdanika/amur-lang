/**
 */
package org.nasdanika.amur.lang.causality.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.ConditionalPart;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.ConditionalPartImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.ConditionalPartImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalPartImpl extends CDOObjectImpl implements ConditionalPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.CONDITIONAL_PART;
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
	public String getCondition() {
		return (String)eGet(CausalityPackage.Literals.CONDITIONAL_PART__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		eSet(CausalityPackage.Literals.CONDITIONAL_PART__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return (Template)eGet(CausalityPackage.Literals.CONDITIONAL_PART__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		eSet(CausalityPackage.Literals.CONDITIONAL_PART__TEMPLATE, newTemplate);
	}
		
	private static AtomicInteger counter = new AtomicInteger();
	
	private static String genConditionName() {
		return "$condition_"+Long.toString(System.currentTimeMillis(), Character.MAX_RADIX)+"_"+Integer.toString(counter.incrementAndGet(), Character.MAX_RADIX);
	}	

	@Override
	public String toJavaScript(Mode mode, String next) {
		if (getCondition()==null || getCondition().trim().length()==0) {
			return "return $promiseProvider.when($out).then("+getTemplate().toJavaScript(mode)+");";
		}
		
		String cnd = genConditionName();
		
		return "return "+getCondition()+".then(function("+cnd+") { if ("+cnd+") { return $promiseProvider.when($out).then("+getTemplate().toJavaScript(mode)+"); } "+(next==null ? "return $out;" : next)+"}.bind(this));";
	}

} //ConditionalPartImpl
