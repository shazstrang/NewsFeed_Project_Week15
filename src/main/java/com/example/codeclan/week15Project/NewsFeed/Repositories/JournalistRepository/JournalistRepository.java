package com.example.codeclan.week15Project.NewsFeed.Repositories.JournalistRepository;

import com.example.codeclan.week15Project.NewsFeed.Models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {
}
