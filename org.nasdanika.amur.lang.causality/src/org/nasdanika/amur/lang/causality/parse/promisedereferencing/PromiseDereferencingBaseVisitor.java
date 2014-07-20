// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\PromiseDereferencing.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.promisedereferencing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PromiseDereferencingVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PromiseDereferencingBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PromiseDereferencingVisitor<T> {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitPropertyDereference(@NotNull PromiseDereferencingParser.PropertyDereferenceContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitTranslationUnit(@NotNull PromiseDereferencingParser.TranslationUnitContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitTranslationUnitCompact(@NotNull PromiseDereferencingParser.TranslationUnitCompactContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitProperty(@NotNull PromiseDereferencingParser.PropertyContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitCode(@NotNull PromiseDereferencingParser.CodeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitDereference(@NotNull PromiseDereferencingParser.DereferenceContext ctx) { return visitChildren(ctx); }
}