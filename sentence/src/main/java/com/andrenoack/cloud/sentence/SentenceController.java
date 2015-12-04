package com.andrenoack.cloud.sentence;

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
	LoadBalancerClient client;

	@RequestMapping("/")
	public @ResponseBody String getSentence() {
		return
				getWord("subject") + " "
						+ getWord("verb") + " "
						+ getWord("adjective") + " "
						+ getWord("noun") + ".";

	}

	public String getWord(String service) {
		ServiceInstance serviceInstance = client.choose(service);
		if (serviceInstance != null) {
			URI uri = serviceInstance.getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}
		return "(" + service + " not found)";
	}
}
