package com.example.codeclan.week15Project.NewsFeed;

import com.example.codeclan.week15Project.NewsFeed.Models.Article;
import com.example.codeclan.week15Project.NewsFeed.Models.Category;
import com.example.codeclan.week15Project.NewsFeed.Repositories.ArticleRepository.ArticleRepository;
import com.example.codeclan.week15Project.NewsFeed.Repositories.CategoryRepository.CategoryRepository;
import com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsFeedApplicationTests {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindAllCategories() {
		List<Category> found = categoryRepository.findAll ( );
		assertEquals (3 , found.size ());
	}

	@Test
	public void canGetAllArticlesForCategory() {
		List<Article> found = categoryRepository.getAllArticlesForCategory(1L);
		assertEquals(1, found.size());
		assertEquals("Ice Hockey 101", found.get(0).getTitle ());
	}

	@Test
	public void canGetAllArticlesForJournalist() {
		List<Article> found = journalistRepository.getAllArticlesForJournalist (2L);
		assertEquals(1, found.size());
		assertEquals("JavaScript for Dimwits", found.get(0).getTitle ());
	}
}
