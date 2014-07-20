// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\CausalityAP.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.ap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CausalityAPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CausalityAPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(@NotNull CausalityAPParser.TemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#conditionalMainPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalMainPart(@NotNull CausalityAPParser.ConditionalMainPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull CausalityAPParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(@NotNull CausalityAPParser.InterpolationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull CausalityAPParser.SectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(@NotNull CausalityAPParser.IterationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#evaluation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation(@NotNull CausalityAPParser.EvaluationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(@NotNull CausalityAPParser.TranslationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#sequentialSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialSection(@NotNull CausalityAPParser.SequentialSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#synchronousSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronousSection(@NotNull CausalityAPParser.SynchronousSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#conditionalElseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElseIfPart(@NotNull CausalityAPParser.ConditionalElseIfPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#parallelSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelSection(@NotNull CausalityAPParser.ParallelSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(@NotNull CausalityAPParser.WhenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull CausalityAPParser.ConditionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityAPParser#conditionalElsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElsePart(@NotNull CausalityAPParser.ConditionalElsePartContext ctx);
}