package com.example.codeclan.week15Project.NewsFeed.Repositories.ArticleRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepositoryCustom {
    List<Article> getAllArticlesForDate(String date);


}



