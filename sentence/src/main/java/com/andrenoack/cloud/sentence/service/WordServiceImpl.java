package com.andrenoack.cloud.sentence.service;

import com.andrenoack.cloud.sentence.domain.Word;
import com.andrenoack.cloud.sentence.feign.AdjectiveClient;
import com.andrenoack.cloud.sentence.feign.NounClient;
import com.andrenoack.cloud.sentence.feign.SubjectClient;
import com.andrenoack.cloud.sentence.feign.VerbClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andre.noack on 07.12.15.
 */
@Service
public class WordServiceImpl implements WordService {

	@Autowired
	SubjectClient subjectClient;

	@Autowired
	AdjectiveClient adjectiveClient;

	@Autowired
	VerbClient verbClient;

	@Autowired
	NounClient nounClient;

	@Override
	@HystrixCommand (fallbackMethod = "fallback")
	public Word getSubject() {
		return subjectClient.getWord();
	}

	@Override
	@HystrixCommand (fallbackMethod = "fallback")
	public Word getVerb() {
		return verbClient.getWord();
	}

	@Override
	@HystrixCommand (fallbackMethod = "fallback")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}

	@Override
	@HystrixCommand (fallbackMethod = "fallback")
	public Word getNoun() {
		return nounClient.getWord();
	}

	public Word fallback() {
		return new Word("ouch");
	}
}
