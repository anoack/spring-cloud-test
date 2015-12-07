package com.andrenoack.cloud.words.domain;

/**
 * Created by andre.noack on 07.12.15.
 */
public class Word {

	private String word;

	public Word() {
		super();
	}

	public Word(String word) {
		this();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return getWord();
	}

}
