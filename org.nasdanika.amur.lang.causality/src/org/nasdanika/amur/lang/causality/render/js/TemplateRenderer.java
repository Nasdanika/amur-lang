package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;
import java.util.Collection;
import java.util.List;

public class TemplateRenderer {

  protected static String nl;
  public static synchronized TemplateRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplateRenderer result = new TemplateRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "\t";
  protected final String TEXT_2 = NL + "\t\t";
  protected final String TEXT_3 = NL + "\t";
  protected final String TEXT_4 = NL + "\tfunction($out) {" + NL + "\t\treturn $promiseProvider.when($out)";
  protected final String TEXT_5 = ".then(";
  protected final String TEXT_6 = ")";
  protected final String TEXT_7 = ";" + NL + "\t}.bind(this)";
  protected final String TEXT_8 = NL + "\tfunction ($out) {" + NL + "\t\treturn $promiseProvider.all([" + NL + "\t\t";
  protected final String TEXT_9 = NL + "\t\t\t";
  protected final String TEXT_10 = ", ";
  protected final String TEXT_11 = "$promiseProvider.when(\"\").then(";
  protected final String TEXT_12 = ")" + NL + "\t\t";
  protected final String TEXT_13 = NL + "\t\t]).then(function(results) {" + NL + "\t\t\tif (typeof $out.write == \"function\") {" + NL + "\t\t\t\t$out.write(results.join(\"\"));" + NL + "\t\t\t} else {" + NL + "\t\t\t\t$out+=results.join(\"\");" + NL + "\t\t\t}\t\t" + NL + "\t\t\treturn $out;" + NL + "\t\t});" + NL + "\t}.bind(this)\t";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_1);
     for (TemplateElement part: ((Template) eObject).getElements()) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( part.toJavaScript(mode) );
    stringBuffer.append(TEXT_3);
     } 
     } else if (Mode.SEQUENTIAL.equals(mode)) { 
    stringBuffer.append(TEXT_4);
     for (TemplateElement part: ((Template) eObject).getElements()) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(part.toJavaScript(mode));
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
     } else { 
    stringBuffer.append(TEXT_8);
     for (int i=0; i < ((Template) eObject).getElements().size(); ++i) { 
    stringBuffer.append(TEXT_9);
     if (i>0) { 
    stringBuffer.append(TEXT_10);
     } 
    stringBuffer.append(TEXT_11);
    stringBuffer.append( ((Template) eObject).getElements().get(i).toJavaScript(mode) );
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
     } 
    return stringBuffer.toString();
  }
}