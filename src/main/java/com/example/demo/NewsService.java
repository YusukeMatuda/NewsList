package com.example.demo;
	import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

	@Service
	public class NewsService {
		private static final String NEWS_API_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=12028019416d45b5b54edc8c6f452f5c";
		
		private final RestTemplate restTemplate;

	    public NewsService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    public String getNews() {
	        return restTemplate.getForObject(NEWS_API_URL, String.class);
	    }
	}
