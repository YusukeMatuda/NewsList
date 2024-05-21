package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
	@Autowired
	private NewsService newsService;
	

	@GetMapping("/news")
	@CrossOrigin
    public String getNews() {
        return newsService.getNews();
    }
	
	
	
}