package com.example.websaitw.models;

import javax.persistence.*;
@Entity

public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @ManyToOne
    private User author;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Comment replyTo;

    public Long getId() {
        return id;
    }

    public Comment setId(Long id) {
        this.id = id;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Comment setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Comment setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Post getPost() {
        return new Post();
    }

    public Comment setPost(Post post) {
        this.post = post;
        return this;
    }

    public Comment getReplyTo() {
        return replyTo;
    }

    public Comment setReplyTo(Comment replyTo) {
        this.replyTo = replyTo;
        return this;
    }
}
