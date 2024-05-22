package com.example.demo;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

	@Service
	public class NewsService {
		private static final String NEWS_API_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=12028019416d45b5b54edc8c6f452f5c";
		
		private final RestTemplate restTemplate;

	    public NewsService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    public List<News> getNews() {
	        News[] newsArray = restTemplate.getForObject(NEWS_API_URL, News[].class);
	        return Arrays.asList(newsArray);
	    }

//	    public List<News> getNewsByCategory(String category) {
//	        String url = NEWS_API_URL + "&category=" + category;
//	        News[] newsArray = restTemplate.getForObject(url, News[].class);
//	        return Arrays.asList(newsArray);
//	    }
//
//	    public List<News> getNewsBySource(String source) {
//	        String url = NEWS_API_URL + "&sources=" + source;
//	        News[] newsArray = restTemplate.getForObject(url, News[].class);
//	        return Arrays.asList(newsArray);
//	    }
//
//	    public List<News> getNewsByCategoryAndSource(String category, String source) {
//	        String url = NEWS_API_URL + "&category=" + category + "&sources=" + source;
//	        News[] newsArray = restTemplate.getForObject(url, News[].class);
//	        return Arrays.asList(newsArray);
//	    }
	    
//	    public List<News> getAllNews() {
//	        List<News> allNews = new ArrayList<>();
//	        int page = 1; // 最初のページからスタート
//	        int totalPages = getTotalPages(); // 総ページ数を取得
//
//	        while (page <= totalPages) {
//	            String url = NEWS_API_URL + "&page=" + page;
//	            NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
//	            if (response != null && response.get() != null) {
//	                allNews.addAll(response.getArticles());
//	            }
//	            page++;
//	        }
//
//	        return allNews;
//	    }
//
//	    private int getTotalPages() {
//	        String firstPageUrl = NEWS_API_URL + "&page=1";
//	        NewsResponse firstPageResponse = restTemplate.getForObject(firstPageUrl, NewsResponse.class);
//	        if (firstPageResponse != null) {
//	            int totalResults = firstPageResponse.getTotalResults();
//	            int pageSize = firstPageResponse.getPageSize();
//	            return (totalResults + pageSize - 1) / pageSize; // 総ページ数を計算します
//	        }
//	        return 0;
//	    }
	}
