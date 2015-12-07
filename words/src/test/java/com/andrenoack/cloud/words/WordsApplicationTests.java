package com.andrenoack.cloud.words;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WordsApplication.class)
@WebAppConfiguration
public class WordsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
