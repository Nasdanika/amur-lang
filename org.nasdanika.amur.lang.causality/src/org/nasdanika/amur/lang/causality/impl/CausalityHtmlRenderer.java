package org.nasdanika.amur.lang.causality.impl;

import java.io.File;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.common.HtmlRenderer;
import org.nasdanika.common.ImageManager;

import org.nasdanika.amur.lang.Language;

public class CausalityHtmlRenderer implements HtmlRenderer<CausalitySource> {

	@Override
	public String renderHtml(
			CausalitySource obj, 
			File resourceContainer,
			ImageManager imageManager, 
			AdapterFactory adapterFactory,
			Map<Object, Object> context)
			throws Exception {
		if (obj.isBlank()) {
			return "";
		}
		StringBuilder sb = new StringBuilder("<table width='100%' class='standard' border='0' cellspacing='1' cellpadding='3'>");
		if (obj.getLanguage()!=null) {
			sb.append("<tr class='standard'><th colspan='2' class='standard'>");
			sb.append(genLangLabel(obj.getLanguage(), adapterFactory, imageManager));
			sb.append("</th></tr>");
		}
		if (obj.getMode()!=null) {
			sb.append("<tr class='standard'><td class='standard'><B>Mode</B></td><td class='standard'>");
			sb.append(obj.getMode());
			sb.append("</td></tr>");
		}
		if (obj.getOutputExpression()!=null && obj.getOutputExpression().trim().length()>0) {
			sb.append("<tr class='standard'><td class='standard'><B>Output expression</B></td><td class='standard'>");
			sb.append(StringEscapeUtils.escapeHtml4(obj.getOutputExpression()));
			sb.append("</td></tr>");			
		}
		if (obj.getReturnExpression()!=null && obj.getReturnExpression().trim().length()>0) {
			sb.append("<tr class='standard'><td class='standard'><B>Return expression</B></td><td class='standard'>");
			sb.append(StringEscapeUtils.escapeHtml4(obj.getReturnExpression()));
			sb.append("</td></tr>");			
		}
		if (obj.getText()!=null && obj.getText().trim().length()>0) {
			sb.append("<tr class='standard'><td colspan='2' class='standard'><pre>");
			sb.append(StringEscapeUtils.escapeHtml4(obj.getText()));
			sb.append("</pre></td></tr>");			
		}
		sb.append("</table>");
		return sb.toString();
	}
	
    private String genLangLabel(Language<?> lang, AdapterFactory adapterFactory, ImageManager imageManager) throws Exception {
    	if (adapterFactory!=null) {
    		Object adapter = adapterFactory.adapt(lang, IItemLabelProvider.class);
    		if (adapter instanceof IItemLabelProvider) {
    			Object imageObject = ((IItemLabelProvider) adapter).getImage(lang);
    	    	StringBuilder sb = new StringBuilder();
    			if (imageObject!=null) {
    				String imagePath = imageManager.saveImage(imageObject, lang.eClass().getName());
    				if (imagePath!=null) {
	    				sb.append("<img src=\""+imagePath+"\" border=\"0\"> ");
    				}
    			}
    			
    			String text = ((IItemLabelProvider) adapter).getText(lang);
    			if (text==null) {
    				text = lang.getName();
    			}
    			
    			if (text!=null) {
    				sb.append(StringEscapeUtils.escapeHtml4(text));
    			}
    			
    			return sb.toString();
    		}
    	} 
    	return lang.getName()==null ? "" : StringEscapeUtils.escapeHtml4(lang.getName());
    }    
	

	@Override
	public boolean accept(CausalitySource candidate) {
		return true;
	}

	@Override
	public Class<CausalitySource> getRendereeType() {
		return CausalitySource.class;
	}

	@Override
	public int compareTo(HtmlRenderer<CausalitySource> o) {
		return hashCode() - o.hashCode();
	}

}
