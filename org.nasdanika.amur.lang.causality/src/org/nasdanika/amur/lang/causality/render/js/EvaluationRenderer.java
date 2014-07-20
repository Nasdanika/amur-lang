package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class EvaluationRenderer {

  protected static String nl;
  public static synchronized EvaluationRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    EvaluationRenderer result = new EvaluationRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "\t";
  protected final String TEXT_2 = NL + "\tfunction($out) {" + NL + "\t\t";
  protected final String TEXT_3 = NL + "\t\treturn $out;" + NL + "\t}.bind(this)";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( ((Evaluation) eObject).getCode() );
     } else { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( ((Evaluation) eObject).getCode() );
    stringBuffer.append(TEXT_3);
     } 
    return stringBuffer.toString();
  }
}