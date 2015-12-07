package com.andrenoack.cloud.sentence.dao;

import com.andrenoack.cloud.sentence.domain.Word;

/**
 * Created by andre.noack on 07.12.15.
 */
public interface WordDao {

	static final String SUBJECT = "subject";
	static final String VERB = "verb";
	static final String ADJECTIVE = "adjective";
	static final String NOUN = "noun";

	Word getWord();
}
