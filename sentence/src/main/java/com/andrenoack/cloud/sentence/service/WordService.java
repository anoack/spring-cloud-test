package com.andrenoack.cloud.sentence.service;

import com.andrenoack.cloud.sentence.domain.Word;

/**
 * Created by andre.noack on 07.12.15.
 */
public interface WordService {

	public Word getSubject();
	public Word getVerb();
	public Word getAdjective();
	public Word getNoun();
}
