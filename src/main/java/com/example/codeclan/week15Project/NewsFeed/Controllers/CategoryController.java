package com.example.codeclan.week15Project.NewsFeed.Controllers;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Repositories.CategoryRepository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(value = "/{categoryId}/articles")
    public List<Article> getArticlesForCategory(@PathVariable Long categoryId) {
        return categoryRepository.getAllArticlesForCategory(categoryId);
    }



}
