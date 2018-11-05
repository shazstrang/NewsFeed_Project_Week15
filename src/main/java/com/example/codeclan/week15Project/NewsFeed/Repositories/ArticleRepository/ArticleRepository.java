package com.example.codeclan.week15Project.NewsFeed.Repositories.ArticleRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository  extends JpaRepository<Article, Long>, ArticleRepositoryCustom {

    List<Article> getAllArticlesForDate(String date);

}
