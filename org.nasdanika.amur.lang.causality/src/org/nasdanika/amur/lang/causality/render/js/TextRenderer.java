package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class TextRenderer {

  protected static String nl;
  public static synchronized TextRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    TextRenderer result = new TextRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\tif (typeof $out.write == \"function\") {" + NL + "\t\t$out.write(\"";
  protected final String TEXT_2 = "\");" + NL + "\t} else {" + NL + "\t\t$out+=\"";
  protected final String TEXT_3 = "\";" + NL + "\t}";
  protected final String TEXT_4 = NL + "\tfunction($out) {" + NL + "\t\tif (typeof $out.write == \"function\") {" + NL + "\t\t\t$out.write(\"";
  protected final String TEXT_5 = "\");" + NL + "\t\t} else {" + NL + "\t\t\t$out+=\"";
  protected final String TEXT_6 = "\";" + NL + "\t\t}" + NL + "\t\treturn $out;" + NL + "\t}.bind(this)";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((Text) eObject).getValue()));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((Text) eObject).getValue()));
    stringBuffer.append(TEXT_3);
     } else { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((Text) eObject).getValue()));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(((Text) eObject).getValue()));
    stringBuffer.append(TEXT_6);
     } 
    return stringBuffer.toString();
  }
}