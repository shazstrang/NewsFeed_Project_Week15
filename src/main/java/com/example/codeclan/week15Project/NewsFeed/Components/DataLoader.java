package com.example.codeclan.week15Project.NewsFeed.Components;


import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Models.Category;
import com.example.codeclan.week15Project.NewsFeed.Models.Journalist;
import com.example.codeclan.week15Project.NewsFeed.Repositories.ArticleRepository.ArticleRepository;
import com.example.codeclan.week15Project.NewsFeed.Repositories.CategoryRepository.CategoryRepository;
import com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Journalist journalist1 = new Journalist("Princess Rogers");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist("Carol Wilder");
        journalistRepository.save(journalist2);

        Journalist journalist3 = new Journalist("Sam Jellyman");
        journalistRepository.save(journalist3);

        Category category1 = new Category("Sports");
        categoryRepository.save(category1);

        Category category2 = new Category("Wicca");
        categoryRepository.save(category2);

        Category category3 = new Category("Music");
        categoryRepository.save(category3);

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Article article1 = new Article(df.parse("2018/11/01 22:30:12"), journalist1, category1, "Ice Hockey 101", "The news about ice hockey...");
        articleRepository.save(article1);

        Article article2 = new Article(df.parse("2018/05/05 14:20:00"), journalist2, category3, "JavaScript for Dimwits", "Dont even think about it...");
        articleRepository.save(article2);
    }
}
