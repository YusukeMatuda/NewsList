package com.example.demo;

import java.util.List;

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
    public List<News> getNews() {
        return newsService.getNews();
    }
	
//	@GetMapping("/news/categorization")
//    @CrossOrigin
//    public List<News> getNews(@RequestParam(required = false) String category, @RequestParam(required = false) String source) {
//        if (category != null && source != null) {
//            return newsService.getNewsByCategoryAndSource(category, source);
//        } else if (category != null) {
//            return newsService.getNewsByCategory(category);
//        } else if (source != null) {
//            return newsService.getNewsBySource(source);
//        } else {
//            return newsService.getNews();
//        }
//	}
}