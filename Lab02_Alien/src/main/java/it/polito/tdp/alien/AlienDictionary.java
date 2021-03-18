package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<WordEnhanced> lista;
	
	

	
	public AlienDictionary() {
		lista = new ArrayList<>();
		
	}
	
	public void addWord(String alienWord, String translation) {
		
		for(WordEnhanced w:lista) {
			if(w.getAlienWord().equals(alienWord)) {
				lista.get(lista.indexOf(w)).setTranslation(translation);
				return;
			}
		}
		lista.add(new WordEnhanced(alienWord, translation));
	}
	
	public String translateWord(String alienWord) {
		
		for(WordEnhanced w : lista) {
			if(w.getAlienWord().equals(alienWord))
				return w.getTranslation();
		}
		
		return null;
	}
	
	public void cancella() {
		lista.clear();
		
	}

}
