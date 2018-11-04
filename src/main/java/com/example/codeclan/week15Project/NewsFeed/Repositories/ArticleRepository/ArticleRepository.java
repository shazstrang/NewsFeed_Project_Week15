package com.example.codeclan.week15Project.NewsFeed.Repositories.ArticleRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository  extends JpaRepository<Article, Long>, ArticleRepositoryCustom {
}
