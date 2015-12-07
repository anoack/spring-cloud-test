package com.andrenoack.cloud.sentence.controller;

import com.andrenoack.cloud.sentence.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by andre.noack on 04.12.15.
 */
@RestController
public class SentenceController {

	@Autowired
	SentenceService sentenceService;

	@RequestMapping("/")
	public @ResponseBody String getSentence() {
		return
				"<h3>Some sentences</h3><br />"
				+ sentenceService.buildSentence() + "<br />"
						+ sentenceService.buildSentence() + "<br />"
						+ sentenceService.buildSentence() + "<br />"
						+ sentenceService.buildSentence() + "<br />"
						+ sentenceService.buildSentence() + "<br />";
	}


}
