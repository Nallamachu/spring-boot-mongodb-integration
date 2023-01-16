package com.springboot.practice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/*
* https://instantwebtools.net/fake-rest-api
*/
@Configuration
public class WebClientConfiguration {
	
	@Bean
	public WebClient getWebClient() {
		return WebClient.create("https://api.instantwebtools.net/v1");
	}

}
