package com.example.reddit.services;

import com.example.reddit.models.DTO.PostDTO;
import com.example.reddit.models.Post;
import com.example.reddit.models.User;
import com.example.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll().stream()
                .map(PostDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public boolean savePost(Post post, User user) {
        if (user == null) {
            postRepository.save(post);
            return true;
        }

        post.setUser(user);
        postRepository.save(post);
        return true;
    }

    @Override
    public boolean savePost(Post post) {
        postRepository.save(post);
        return true;
    }

    @Override
    public Post createPost(String title, String url) {
        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setUrl(url);
        return newPost;
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findPostById(id);
    }

    @Override
    public Post upVotePost(Long id) {
        Post post = getPostById(id);
        post.setScore(post.getScore() + 1);
        return post;
    }

    @Override
    public Post downVotePost(Long id) {
        Post post = getPostById(id);
        post.setScore(post.getScore() - 1);
        return post;
    }

    @Override
    public void updatePost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
