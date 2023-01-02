package com.finalProject.blogDataService.model;

import java.time.LocalDate;

public class Post {

    private Integer id;

    private String title;

    private LocalDate date;

    private String section;

    private Integer userId;


    public Post() {
    }

    public Post(String title, LocalDate date, String section, Integer userId) {
        setTitle(title);
        setDate(date);
        setSection(section);
        setUserId(userId);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
