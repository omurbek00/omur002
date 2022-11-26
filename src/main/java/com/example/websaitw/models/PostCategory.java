package com.example.websaitw.models;

import javax.persistence.Id;

public class PostCategory {
    @Id
    public String category;

    public PostCategory() {
    }

    public PostCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public PostCategory setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return category;
    }
}


