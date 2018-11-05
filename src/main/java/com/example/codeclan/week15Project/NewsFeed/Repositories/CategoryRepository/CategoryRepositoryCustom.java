package com.example.codeclan.week15Project.NewsFeed.Repositories.CategoryRepository;


import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Models.Journalist;

import java.util.List;

public interface CategoryRepositoryCustom {

    List<Article> getAllArticlesForCategory(Long categoryId);


    List<Journalist>getAllJournalistsForCategory(Long Id);

}
