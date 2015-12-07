package com.andrenoack.cloud.sentence.service;

import com.andrenoack.cloud.sentence.dao.AdjectiveDao;
import com.andrenoack.cloud.sentence.dao.NounDao;
import com.andrenoack.cloud.sentence.dao.SubjectDao;
import com.andrenoack.cloud.sentence.dao.VerbDao;
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
	NounDao nounDao;


	@Override
	public String buildSentence() {
		return
				subjectDao.getWord() + " "
						+ adjectiveDao.getWord() + " "
						+ verbDao.getWord() + " "
						+ nounDao.getWord() + ".";
	}
}
