package org.nasdanika.amur.lang.causality.render.js;

import org.nasdanika.amur.lang.causality.*;

public class ConditionalRenderer {

  protected static String nl;
  public static synchronized ConditionalRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    ConditionalRenderer result = new ConditionalRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t\t";
  protected final String TEXT_2 = "else ";
  protected final String TEXT_3 = "if (";
  protected final String TEXT_4 = ")";
  protected final String TEXT_5 = " {" + NL + "\t\t\t";
  protected final String TEXT_6 = NL + "\t\t}";
  protected final String TEXT_7 = NL + "\t\tfunction($out) {" + NL + "\t\t\t";
  protected final String TEXT_8 = "return ";
  protected final String TEXT_9 = ".then(function(condition) {" + NL + "\t\t\t\tif (condition) {" + NL + "\t\t\t\t\treturn ";
  protected final String TEXT_10 = ";\t\t" + NL + "\t\t\t\t}";
  protected final String TEXT_11 = NL + NL + "\t\t\t\t";
  protected final String TEXT_12 = " }.bind(this)); ";
  protected final String TEXT_13 = NL + "\t" + NL + "\t\t\t}.bind(this))" + NL + "\t\t}.bind(this)";
  protected final String TEXT_14 = "\t\t" + NL + "}";

	public String render(org.nasdanika.amur.lang.causality.Mode mode, org.eclipse.emf.ecore.EObject eObject)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Conditional conditional = (Conditional) eObject; 
     if (Mode.SYNCHRONOUS.equals(mode)) {
	int pidx = 0;	
	for (ConditionalPart cPart: conditional.getParts()) { 
    stringBuffer.append(TEXT_1);
     if (pidx>0) { 
    stringBuffer.append(TEXT_2);
     } 
     if (cPart.getCondition()!=null) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cPart.getCondition());
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(cPart.getTemplate().toJavaScript(mode));
    stringBuffer.append(TEXT_6);
    
		++pidx; 
	} 

     } else {
	int pidx = 0;	
	for (ConditionalPart cPart: conditional.getParts()) { 
    stringBuffer.append(TEXT_7);
     if (pidx>0) { 
    stringBuffer.append(TEXT_8);
     } 
     if (cPart.getCondition()==null) { 
    stringBuffer.append(cPart.getTemplate().toJavaScript(mode));
     } else { 
    stringBuffer.append(cPart.getCondition());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cPart.getTemplate().toJavaScript(mode));
    stringBuffer.append(TEXT_10);
    
		}
		++pidx; 
	} 

    stringBuffer.append(TEXT_11);
     for (int i=0; i<pidx-1; ++i) { 
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}