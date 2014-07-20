package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class InterpolationRenderer {

  protected static String nl;
  public static synchronized InterpolationRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    InterpolationRenderer result = new InterpolationRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "\tif (typeof $out.write == \"function\") {" + NL + "\t\t$out.write(";
  protected final String TEXT_2 = ");" + NL + "\t} else {" + NL + "\t\t$out+=";
  protected final String TEXT_3 = ";" + NL + "\t}";
  protected final String TEXT_4 = NL + "\tfunction($out) {" + NL + "\t\treturn ";
  protected final String TEXT_5 = ".then(function($interpolationResult) {" + NL + "\t\t\tvar $interpolator = $interpolators[typeof $interpolationResult];" + NL + "\t\t\tif (typeof $interpolator == 'function') {" + NL + "\t\t\t\t$interpolationResult = $interpolator($interpolationResult);" + NL + "\t\t\t}" + NL + "\t\t\tif (typeof $out.write == \"function\") {" + NL + "\t\t\t\t$out.write($interpolationResult);" + NL + "\t\t\t} else {" + NL + "\t\t\t\t$out+=$interpolationResult;" + NL + "\t\t\t}" + NL + "\t\t\treturn $out;" + NL + "\t\t}.bind(this));" + NL + "\t}.bind(this)";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( ((Interpolation) eObject).getExpression() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( ((Interpolation) eObject).getExpression() );
    stringBuffer.append(TEXT_3);
     } else { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( ((Interpolation) eObject).getExpression() );
    stringBuffer.append(TEXT_5);
     } 
    return stringBuffer.toString();
  }
}