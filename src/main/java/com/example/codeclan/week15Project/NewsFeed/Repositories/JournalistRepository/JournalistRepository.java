package com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Models.Category;
import com.example.codeclan.week15Project.NewsFeed.Models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {
    List<Category> getAllCategoriesForJournalist(Long journalistId);

}
