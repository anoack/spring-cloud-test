package com.andrenoack.cloud.noun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NounApplication.class)
@WebAppConfiguration
public class NounApplicationTests {

	@Test
	public void contextLoads() {
	}

}
