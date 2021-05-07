package com.example.reddit.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;
    private Timestamp timestamp;
    private int score;

    @ManyToOne
    private User user;

    public Post(String title, String url, int score) {
        this.title = title;
        this.url = url;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.score = score;
    }

    public Post() {
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

}