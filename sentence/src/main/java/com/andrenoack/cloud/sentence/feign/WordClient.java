package com.andrenoack.cloud.sentence.feign;

import com.andrenoack.cloud.sentence.domain.Word;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by andre.noack on 07.12.15.
 */
public interface WordClient {

	static final String SUBJECT = "subject";
	static final String VERB = "verb";
	static final String ADJECTIVE = "adjective";
	static final String NOUN = "noun";

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public Word getWord();

}
