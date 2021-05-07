package com.example.reddit.models.DTO;

import com.example.reddit.models.Post;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
public class PostDTO {

    private Long id;

    private String title;
    private String url;
    private Timestamp timestamp;
    private int score;
    private String owner;

    public PostDTO(Post post, String username) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.url = post.getUrl();
        this.timestamp = post.getTimestamp();
        this.score = post.getScore();
        this.owner = username;
    }

    public PostDTO(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.url = post.getUrl();
        this.timestamp = post.getTimestamp();
        this.score = post.getScore();

        if (post.getUser() == null) {
            this.owner = null;
        } else {
            this.owner = post.getUser().getUsername();
        }
    }
}