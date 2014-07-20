
grammar CausalityCP;

@header {
package org.nasdanika.amur.lang.causality.parse.cp;
}

translationUnit: template EOF;

template: (section | conditional | iteration | text | interpolation | evaluation | when )*;

text: TEXT+;

interpolation: Interpolation;

evaluation: Evaluation+;

section: parallelSection | sequentialSection | synchronousSection;

parallelSection: ParallelSectionStart template SectionEnd;

sequentialSection: SequentialSectionStart template SectionEnd;

synchronousSection: SynchronousSectionStart template SectionEnd;

conditional: conditionalMainPart conditionalElseIfPart* conditionalElsePart?  ConditionalEnd;

conditionalMainPart: ConditionalStart template;

conditionalElseIfPart: ElseIf template;

conditionalElsePart: Else template;

iteration: IterationStart template IterationEnd;

when: WhenStart template WhenEnd;

IterationEnd: '{%~%}';

Else: '{%??%}';

ConditionalEnd: '{%?%}';

WhenEnd: '{%:%}';

SectionEnd: '{%@%}';

ParallelSectionStart: '{%@parallel%}';

SynchronousSectionStart: '{%@synchronous%}';

SequentialSectionStart: '{%@sequential%}';
                   
Comment: '{%--' .*? '--%}' -> skip;

Interpolation: '{%=' .*? '%}';

IterationStart: '{%~' .*? '%}';

WhenStart: '{%:' .*? '%}';

ElseIf: '{%??' .*? '%}';

ConditionalStart: '{%?' .*? '%}';

Evaluation: '{%' .*? '%}';

TEXT : .+?;

