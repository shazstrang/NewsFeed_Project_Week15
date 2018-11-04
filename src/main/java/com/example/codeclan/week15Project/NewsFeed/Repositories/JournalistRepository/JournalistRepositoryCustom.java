package com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;

import java.util.List;


public interface JournalistRepositoryCustom {
    List<Article> getAllArticlesForJournalist(Long journalistId);
}
