package com.example.codeclan.week15Project.NewsFeed.Controllers;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Models.Category;
import com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/journalists")

public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;

    @GetMapping(value = "/{journalistId}/articles")
    public List<Article> getArticlesForJournalist(@PathVariable Long journalistId) {
        return journalistRepository.getAllArticlesForJournalist(journalistId);
    }

    @GetMapping(value = "/{journalistId}/categories")
    public List<Category> getCategoriesForJournalist(@PathVariable Long journalistId) {
        return journalistRepository.getAllCategoriesForJournalist(journalistId);
    }




}
