package com.andrenoack.cloud.sentence.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by andre.noack on 07.12.15.
 */
@FeignClient(WordClient.ADJECTIVE)
public interface AdjectiveClient extends WordClient {}
