package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class IterationRenderer {

  protected static String nl;
  public static synchronized IterationRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    IterationRenderer result = new IterationRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\tvar ";
  protected final String TEXT_3 = " = ";
  protected final String TEXT_4 = ";\t" + NL + "\tfor (var ";
  protected final String TEXT_5 = " in ";
  protected final String TEXT_6 = ") {" + NL + "\t\tvar ";
  protected final String TEXT_7 = " = ";
  protected final String TEXT_8 = "[";
  protected final String TEXT_9 = "];" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t} ";
  protected final String TEXT_11 = NL + "\tfunction($out) {" + NL + "\t\treturn ";
  protected final String TEXT_12 = ".then(function($iterable) {" + NL + "\t\t\tvar $stepResult = $out;" + NL + "\t\t\tif ($iterable) {" + NL + "\t\t\t\tfor (var $key in $iterable) {" + NL + "\t\t\t\t\t$stepResult = $promiseProvider.all([$key, $iterable[$key], $stepResult]).spread(function(";
  protected final String TEXT_13 = ", ";
  protected final String TEXT_14 = ", $stepResultAccumulator) {" + NL + "\t\t\t\t\t\treturn ";
  protected final String TEXT_15 = "($stepResultAccumulator);" + NL + "\t\t\t\t\t}.bind(this));\t\t\t" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn $stepResult; \t" + NL + "\t\t}.bind(this));" + NL + "\t}.bind(this)\t";
  protected final String TEXT_16 = NL + "\t";
  protected final String TEXT_17 = ".then(function($iterable) {" + NL + "\t\tvar results=[];" + NL + "\t\tif ($iterable) {" + NL + "\t\t\tfor (var $key in $iterable) {" + NL + "\t\t\t\tresults.push($promiseProvider.all([$key, $iterable[$key]]).spread(function(";
  protected final String TEXT_18 = ", ";
  protected final String TEXT_19 = ") {" + NL + "\t\t\t\t\t\treturn ";
  protected final String TEXT_20 = "(\"\");" + NL + "\t\t\t\t}.bind(this)));" + NL + "\t\t\t} \t" + NL + "\t\t}\t\t" + NL + "\t\treturn $promiseProvider.all(results).then(function(res) {" + NL + "\t\t\treturn res.join(\"\");" + NL + "\t\t});\t\t\t" + NL + "\t}.bind(this))";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	Iteration iteration = (Iteration) eObject;
	String iterableVar = "$iterable_"+iteration.getId(); 

    stringBuffer.append(TEXT_1);
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(iterableVar);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(iteration.getIterable());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(iteration.getKey());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(iterableVar);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(iteration.getValue());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(iterableVar);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(iteration.getValue());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(iteration.getTemplate().toJavaScript(mode));
    stringBuffer.append(TEXT_10);
     } else if (Mode.SEQUENTIAL.equals(mode)) { 
    stringBuffer.append(TEXT_11);
    stringBuffer.append( iteration.getIterable() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(iteration.getKey());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(iteration.getValue());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(iteration.getTemplate().toJavaScript(mode));
    stringBuffer.append(TEXT_15);
     } else { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( iteration.getIterable() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( iteration.getKey() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( iteration.getValue() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( iteration.getTemplate().toJavaScript(mode) );
    stringBuffer.append(TEXT_20);
     } 
    return stringBuffer.toString();
  }
}