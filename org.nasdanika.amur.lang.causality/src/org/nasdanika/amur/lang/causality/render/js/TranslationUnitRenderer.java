package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class TranslationUnitRenderer {

  protected static String nl;
  public static synchronized TranslationUnitRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    TranslationUnitRenderer result = new TranslationUnitRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "\tvar $interpolators = {" + NL + "\t" + NL + "\t\t/* Exports function through $facade.$exportCallback, if it is a function. */" + NL + "\t\t\"function\": function(val) {" + NL + "\t\t\tif (typeof $facade.$exportCallback == 'function') {" + NL + "\t\t\t\treturn $facade.$exportCallback(val);" + NL + "\t\t\t}" + NL + "\t\t\treturn val; // Do nothing otherwise." + NL + "\t\t}" + NL + "\t};" + NL;
  protected final String TEXT_3 = "\t" + NL + "\t";
  protected final String TEXT_4 = "var $out = ";
  protected final String TEXT_5 = ";";
  protected final String TEXT_6 = " \t" + NL + "" + NL + "\t";
  protected final String TEXT_7 = NL + "\t\t";
  protected final String TEXT_8 = NL + "\t";
  protected final String TEXT_9 = NL + NL + "\tvar $result = $out;" + NL + "\treturn ";
  protected final String TEXT_10 = ";";
  protected final String TEXT_11 = NL + "\tvar $templateContext = {};" + NL + "\tvar $result = $promiseProvider.when(";
  protected final String TEXT_12 = ")";
  protected final String TEXT_13 = ".then(";
  protected final String TEXT_14 = ")";
  protected final String TEXT_15 = ";" + NL + "\treturn ";
  protected final String TEXT_16 = ";";
  protected final String TEXT_17 = NL + "\tvar $result = $promiseProvider.all([";
  protected final String TEXT_18 = "," + NL + "\t";
  protected final String TEXT_19 = NL + "\t\t";
  protected final String TEXT_20 = ", ";
  protected final String TEXT_21 = NL + "\t";
  protected final String TEXT_22 = NL + "\t]).then(function(results) {" + NL + "\t\tif (typeof results[0].write == \"function\") {" + NL + "\t\t\tresults[0].write(results.slice(1).join(\"\"));" + NL + "\t\t\treturn results[0];" + NL + "\t\t}" + NL + "\t\treturn results.join(\"\");" + NL + "\t});" + NL + "\treturn ";
  protected final String TEXT_23 = ";\t";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.nasdanika.amur.lang.causality.TranslationUnit translationUnit, String outputExpression, String returnExpression)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     
	if (outputExpression == null || outputExpression.trim().length()==0) { 
		outputExpression = "\"\""; 
	}
	if (returnExpression == null || returnExpression.trim().length()==0) { 
		returnExpression = "$result"; 
	}

    stringBuffer.append(TEXT_2);
     if (Mode.SYNCHRONOUS.equals(mode)) { 
    stringBuffer.append(TEXT_3);
     if (!"$out".equals(outputExpression)) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputExpression);
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
     for (TemplateElement part: translationUnit.getElements()) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( part.toJavaScript(mode) );
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(returnExpression);
    stringBuffer.append(TEXT_10);
     } else if (Mode.SEQUENTIAL.equals(mode)) { 
    stringBuffer.append(TEXT_11);
    stringBuffer.append(outputExpression);
    stringBuffer.append(TEXT_12);
     for (TemplateElement part: translationUnit.getElements()) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(part.toJavaScript(mode));
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
    stringBuffer.append(returnExpression);
    stringBuffer.append(TEXT_16);
     } else { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(outputExpression);
    stringBuffer.append(TEXT_18);
     for (int i=0; i < translationUnit.getElements().size(); ++i) { 
    stringBuffer.append(TEXT_19);
     if (i>0) { 
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append( translationUnit.getElements().get(i).toJavaScript(mode) );
    stringBuffer.append(TEXT_21);
     } 
    stringBuffer.append(TEXT_22);
    stringBuffer.append(returnExpression);
    stringBuffer.append(TEXT_23);
     } 
    return stringBuffer.toString();
  }
}