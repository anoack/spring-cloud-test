package com.andrenoack.cloud.words.controller;

import com.andrenoack.cloud.words.domain.Word;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andre.noack on 07.12.15.
 */
@RestController
public class WordController {
	@Value("${words}") String words;

	@RequestMapping("/")
	public @ResponseBody
	Word getWord() {
		String[] wordArray = words.split(",");
		int i = (int)Math.round(Math.random() * (wordArray.length - 1));
		return new Word(wordArray[i]);
	}


}
