package com.andrenoack.cloud.sentence.dao;

import org.springframework.stereotype.Component;

/**
 * Created by andre.noack on 07.12.15.
 */
@Component
public class NounDao extends WordDaoImpl {

	@Override
	public String getPartOfSpeech() {
		return NOUN;
	}
}
