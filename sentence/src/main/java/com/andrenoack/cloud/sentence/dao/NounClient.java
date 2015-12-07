package com.andrenoack.cloud.sentence.dao;

import com.andrenoack.cloud.sentence.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by andre.noack on 07.12.15.
 */
@FeignClient(WordDao.NOUN)
public interface NounClient {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	Word getWord();
}
