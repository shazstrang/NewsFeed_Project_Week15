package com.example.codeclan.week15Project.NewsFeed.Repositories.CategoryRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>, CategoryRepositoryCustom {
}
