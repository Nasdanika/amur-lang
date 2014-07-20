// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\PromiseDereferencing.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.promisedereferencing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PromiseDereferencingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PromiseDereferencingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PromiseDereferencingParser#propertyDereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDereference(@NotNull PromiseDereferencingParser.PropertyDereferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PromiseDereferencingParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(@NotNull PromiseDereferencingParser.TranslationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PromiseDereferencingParser#translationUnitCompact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnitCompact(@NotNull PromiseDereferencingParser.TranslationUnitCompactContext ctx);

	/**
	 * Visit a parse tree produced by {@link PromiseDereferencingParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull PromiseDereferencingParser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PromiseDereferencingParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(@NotNull PromiseDereferencingParser.CodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PromiseDereferencingParser#dereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(@NotNull PromiseDereferencingParser.DereferenceContext ctx);
}