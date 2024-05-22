package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long > {
	List<News> findByTitleContainingIgnoreCase(String keyword);
}
