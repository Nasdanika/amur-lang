package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class ToSynchronousRenderer {

  protected static String nl;
  public static synchronized ToSynchronousRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    ToSynchronousRenderer result = new ToSynchronousRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "\t";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL + "\tfunction($out) {" + NL + "\t\t";
  protected final String TEXT_4 = ";" + NL + "\t\treturn $out;" + NL + "\t}.bind(this)";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, String template)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( template );
    stringBuffer.append(TEXT_2);
     } else { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( template );
    stringBuffer.append(TEXT_4);
     } 
    return stringBuffer.toString();
  }
}