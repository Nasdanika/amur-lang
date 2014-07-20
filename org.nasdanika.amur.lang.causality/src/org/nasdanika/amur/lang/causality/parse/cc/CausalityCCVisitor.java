// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\CausalityCC.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.cc;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CausalityCCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CausalityCCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(@NotNull CausalityCCParser.TemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#conditionalMainPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalMainPart(@NotNull CausalityCCParser.ConditionalMainPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull CausalityCCParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(@NotNull CausalityCCParser.InterpolationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull CausalityCCParser.SectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(@NotNull CausalityCCParser.IterationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#evaluation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation(@NotNull CausalityCCParser.EvaluationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(@NotNull CausalityCCParser.TranslationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#sequentialSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialSection(@NotNull CausalityCCParser.SequentialSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#synchronousSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronousSection(@NotNull CausalityCCParser.SynchronousSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#conditionalElseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElseIfPart(@NotNull CausalityCCParser.ConditionalElseIfPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#parallelSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelSection(@NotNull CausalityCCParser.ParallelSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(@NotNull CausalityCCParser.WhenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull CausalityCCParser.ConditionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCCParser#conditionalElsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElsePart(@NotNull CausalityCCParser.ConditionalElsePartContext ctx);
}