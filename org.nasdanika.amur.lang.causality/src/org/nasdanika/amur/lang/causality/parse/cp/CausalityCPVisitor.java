// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\CausalityCP.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.cp;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CausalityCPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CausalityCPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(@NotNull CausalityCPParser.TemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#conditionalMainPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalMainPart(@NotNull CausalityCPParser.ConditionalMainPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull CausalityCPParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(@NotNull CausalityCPParser.InterpolationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull CausalityCPParser.SectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(@NotNull CausalityCPParser.IterationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#evaluation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation(@NotNull CausalityCPParser.EvaluationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(@NotNull CausalityCPParser.TranslationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#sequentialSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialSection(@NotNull CausalityCPParser.SequentialSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#synchronousSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronousSection(@NotNull CausalityCPParser.SynchronousSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#conditionalElseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElseIfPart(@NotNull CausalityCPParser.ConditionalElseIfPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#parallelSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelSection(@NotNull CausalityCPParser.ParallelSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(@NotNull CausalityCPParser.WhenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull CausalityCPParser.ConditionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CausalityCPParser#conditionalElsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElsePart(@NotNull CausalityCPParser.ConditionalElsePartContext ctx);
}