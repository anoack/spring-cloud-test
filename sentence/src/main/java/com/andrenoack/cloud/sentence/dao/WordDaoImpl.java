package com.andrenoack.cloud.sentence.dao;

import com.andrenoack.cloud.sentence.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by andre.noack on 07.12.15.
 */
public abstract class WordDaoImpl implements WordDao{

	@Autowired
	LoadBalancerClient client;

	public abstract String getPartOfSpeech();

	@Override
	public Word getWord() {
		ServiceInstance serviceInstance = client.choose(getPartOfSpeech());
		if (serviceInstance != null) {
			URI uri = serviceInstance.getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, Word.class);
			}
		}
		return onError(getPartOfSpeech());
	}


	private Word onError(String serviceName) {
		return new Word ("(" + serviceName + " not found)");
	}
}
