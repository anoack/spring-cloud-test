package com.andrenoack.cloud.sentence.service;

import com.andrenoack.cloud.sentence.feign.AdjectiveClient;
import com.andrenoack.cloud.sentence.feign.NounClient;
import com.andrenoack.cloud.sentence.feign.SubjectClient;
import com.andrenoack.cloud.sentence.feign.VerbClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andre.noack on 07.12.15.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

	@Autowired
	SubjectClient subjectClient;

	@Autowired
	AdjectiveClient adjectiveClient;

	@Autowired
	VerbClient verbClient;

	@Autowired
	NounClient nounClient;


	@Override
	public String buildSentence() {
		return
				subjectClient.getWord() + " "
						+ verbClient.getWord() + " "
						+ adjectiveClient.getWord() + " "
						+ nounClient.getWord() + ".";
	}
}
