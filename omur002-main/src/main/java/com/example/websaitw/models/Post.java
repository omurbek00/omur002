package com.example.websaitw.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons, full_text;
    private  int views;
    @ManyToOne
    private User createdBy;

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

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }
    public String getFull_text(){
        return full_text;

    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Post(){

    }
    public Post(String title, String anons, String full_text){
        this.title= title;
        this.anons= anons;
        this.full_text=full_text;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public Post setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getDescription() {
        return anons;
    }

    public Post setDescription(String anons) {
        this.anons = anons;
        return this;
    }
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", anons='" + anons + '\'' +
                ", full_text='" + full_text + '\'' +
                '}';
    }

}
