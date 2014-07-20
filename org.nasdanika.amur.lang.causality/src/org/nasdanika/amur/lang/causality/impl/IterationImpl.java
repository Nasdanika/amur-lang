/**
 */
package org.nasdanika.amur.lang.causality.impl;

import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.Iteration;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.Template;
import org.nasdanika.amur.lang.causality.render.js.IterationRenderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.IterationImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.IterationImpl#getIterable <em>Iterable</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.IterationImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.amur.lang.causality.impl.IterationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationImpl extends TemplateElementImpl implements Iteration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return (Template)eGet(CausalityPackage.Literals.ITERATION__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		eSet(CausalityPackage.Literals.ITERATION__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterable() {
		return (String)eGet(CausalityPackage.Literals.ITERATION__ITERABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterable(String newIterable) {
		eSet(CausalityPackage.Literals.ITERATION__ITERABLE, newIterable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return (String)eGet(CausalityPackage.Literals.ITERATION__KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eSet(CausalityPackage.Literals.ITERATION__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(CausalityPackage.Literals.ITERATION__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(CausalityPackage.Literals.ITERATION__VALUE, newValue);
	}

	@Override
	public String toJavaScript(Mode mode) {
		return new IterationRenderer().render(mode, this).trim();
	}
	
	private static AtomicLong counter = new AtomicLong();
	
	private String id = Long.toString(System.currentTimeMillis(), Character.MAX_RADIX)+"_"+Long.toString(counter.incrementAndGet(), Character.MAX_RADIX);

	@Override
	public String getId() {
		return id;
	}

} //IterationImpl
