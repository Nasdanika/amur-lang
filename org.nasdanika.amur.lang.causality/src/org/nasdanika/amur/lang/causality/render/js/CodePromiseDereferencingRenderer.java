package org.nasdanika.amur.lang.causality.render.js;

public class CodePromiseDereferencingRenderer {

  protected static String nl;
  public static synchronized CodePromiseDereferencingRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    CodePromiseDereferencingRenderer result = new CodePromiseDereferencingRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

	public String render(String promise, String varName, String property, String tail)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}