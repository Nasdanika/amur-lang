package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class WhenRenderer {

  protected static String nl;
  public static synchronized WhenRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    WhenRenderer result = new WhenRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "\tvar ";
  protected final String TEXT_2 = " = ";
  protected final String TEXT_3 = ";" + NL + "\t";
  protected final String TEXT_4 = NL + "\tfunction($out) {" + NL + "\t\treturn ";
  protected final String TEXT_5 = ".then(function(";
  protected final String TEXT_6 = ") {" + NL + "\t\t\treturn $promiseProvider.when($out).then(";
  protected final String TEXT_7 = ");" + NL + "\t\t}.bind(this))\t\t" + NL + "\t}.bind(this)";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     When when = (When) eObject; 
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( when.getVariable() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(when.getExpression());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(when.getTemplate().toJavaScript(mode));
     } else { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( when.getExpression() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( when.getVariable() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( when.getTemplate().toJavaScript(mode) );
    stringBuffer.append(TEXT_7);
     } 
    return stringBuffer.toString();
  }
}