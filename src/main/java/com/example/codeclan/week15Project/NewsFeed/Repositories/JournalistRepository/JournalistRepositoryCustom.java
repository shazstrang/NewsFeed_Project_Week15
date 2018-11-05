package com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Models.Category;

import java.util.List;

public interface JournalistRepositoryCustom {

    List<Category> getAllCategoriesForJournalist(Long journalistId);

    List<Article> getAllArticlesForJournalist(Long journalistId);
}
