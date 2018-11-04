package com.example.codeclan.week15Project.NewsFeed.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Content")
    private String content;

    @Column(name = "Date")
    private Date date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "JournalistId", nullable = false)
    private Journalist journalist;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CategoryId", nullable = false)
    private Category category;

    public Article(Date date, Journalist journalist, Category category, String title, String content) {
        this.date = date;
        this.journalist = journalist;
        this.category = category;
        this.title = title;
        this.content = content;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}