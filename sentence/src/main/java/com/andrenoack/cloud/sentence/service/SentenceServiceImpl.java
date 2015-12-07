package com.andrenoack.cloud.sentence.service;

import com.andrenoack.cloud.sentence.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andre.noack on 07.12.15.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

	@Autowired
	SubjectDao subjectDao;

	@Autowired
	AdjectiveDao adjectiveDao;

	@Autowired
	VerbDao verbDao;

	@Autowired
	NounClient nounClient;


	@Override
	public String buildSentence() {
		return
				subjectDao.getWord() + " "
						+ verbDao.getWord() + " "
						+ adjectiveDao.getWord() + " "
						+ nounClient.getWord() + ".";
	}
}
