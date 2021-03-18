package it.polito.tdp.alien;

import java.util.ArrayList;

public class WordEnhanced {
	
	private String word;
	private ArrayList<String> translation;
	
	public WordEnhanced() {
		translation = new ArrayList<>();
	}
	
	/**
	 * @return the translation
	 */
	public String getTranslation() {
		String s = "";
		for(String t:translation) {
			s+= t +" ";
		}
		return s;
	}

	/**
	 * @param translation the translation to set
	 */
	public void setTranslation(String translation) {
		this.translation.add(translation);
	}

}
