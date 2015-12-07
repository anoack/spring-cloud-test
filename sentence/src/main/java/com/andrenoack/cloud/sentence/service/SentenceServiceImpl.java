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

	@Autowired WordService wordService;


	@Override
	public String buildSentence() {
		return
				wordService.getSubject() + " "
						+ wordService.getVerb() + " "
						+ wordService.getAdjective() + " "
						+ wordService.getNoun() + ".";
	}
}
