package it.polito.tdp.alien;

import java.util.ArrayList;

public class WordEnhanced {
	
	private String word;
	private ArrayList<String> translation;
	
	public WordEnhanced(String alien, String first) {
		this.word=alien;
		translation = new ArrayList<>();
		translation.add(first);
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

	public Object getAlienWord() {
		// TODO Auto-generated method stub
		return word;
	}

}
