package com.example.reddit.services;

import com.example.reddit.models.DTO.PostDTO;
import com.example.reddit.models.Post;
import com.example.reddit.models.User;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PostService {

    List<PostDTO> getAllPosts();

    boolean savePost(Post post, User user);

    boolean savePost(Post post);

    Post createPost(String title, String url);

    Post getPostById(Long id);

    Post upVotePost(Long id);

    Post downVotePost(Long id);

    void updatePost(Post post);

   void deletePost(Long id);
}
