package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	
	public Word(String alienWord) {
		// TODO Auto-generated constructor stub
		this.alienWord= alienWord;
	}
	


	/**
	 * @return the alienWord
	 */
	public String getAlienWord() {
		return alienWord;
	}


	/**
	 * @return the translation
	 */
	public String getTranslation() {
		return translation;
	}

	/**
	 * @param translation the translation to set
	 */
	public void setTranslation(String translation) {
		this.translation = translation;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	
	
	
	

}
