package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> lista;
	//Map<String,Word> mappa;
	

	
	public AlienDictionary() {
		lista = new ArrayList<>();
		//mappa = new HashMap<>();
	}
	
	public void addWord(String alienWord, String translation) {
		Word n = new Word(alienWord, translation);
		
		if(lista.contains(n)) {
			lista.get(lista.indexOf(n)).setTranslation(translation);
			return;
		}
		lista.add(n);
	}
	
	public String translateWord(String alienWord) {
		
		for(Word w : lista) {
			if(w.getAlienWord().equals(alienWord))
				return w.getTranslation();
		}
		
		return null;
	}
	
	public void cancella() {
		lista.clear();
		//mappa.clear();
	}

}
