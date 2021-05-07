package com.example.reddit.controllers;

import com.example.reddit.models.DTO.PostDTO;
import com.example.reddit.models.DTO.UserDTO;
import com.example.reddit.models.Post;
import com.example.reddit.models.User;
import com.example.reddit.services.PostService;
import com.example.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class PostController {

    private final PostService postService;
    private final UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/posts")
    public ResponseEntity<List<PostDTO>> getPosts() {
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

    @PostMapping("/posts")
    public ResponseEntity<PostDTO> addPost(@RequestBody Post post,
                                            @RequestHeader(value = "username", required = false) String headerValue) {

        PostDTO newPost = new PostDTO(post, headerValue);
        postService.savePost(post, userService.getByUsername(headerValue));

        return new ResponseEntity<>(newPost, HttpStatus.OK);
    }

    @PutMapping("/posts/{id}/upvote")
    public ResponseEntity<PostDTO> upvotePost(@PathVariable Long id) {
        Post upvotePost = postService.upVotePost(id);
        postService.savePost(upvotePost);

        return new ResponseEntity<>(new PostDTO(upvotePost), HttpStatus.OK);
    }

    @PutMapping("/posts/{id}/downvote")
    public ResponseEntity<PostDTO> downVotePost(@PathVariable Long id) {
        Post downVotePost = postService.downVotePost(id);
        postService.savePost(downVotePost);

        return new ResponseEntity<>(new PostDTO(downVotePost), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {

        if (userService.getByUsername(user.getUsername()) == null) {
            User newUser = new User(user.getUsername(), user.getPassword());
            userService.saveUser(newUser);
            return new ResponseEntity<>(new UserDTO(user.getUsername()), HttpStatus.OK);
        }

        return new ResponseEntity<>("", HttpStatus.CONFLICT);
    }

    @PostMapping("/users/login")
    public ResponseEntity<?> loginUser(@RequestBody User loginUser) {
        User user = userService.findUser(loginUser.getUsername(), loginUser.getPassword());
        if (user == null) {
            return new ResponseEntity<>("", HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(new UserDTO(user.getUsername()), HttpStatus.OK);
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<PostDTO> delete(@PathVariable Long id,
                                          @RequestHeader(value = "username", required = false) String userName) {
        Post postToDelete = postService.getPostById(id);
        if (postService.getPostById(id) != null && userName.equals(postToDelete.getUser().getUsername())) {
            postService.downVotePost(id);
            postService.deletePost(id);

            return new ResponseEntity<>(new PostDTO(postToDelete), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/posts/{id}")
    public ResponseEntity<PostDTO> updatePost(@RequestBody Post post,
                                              @PathVariable Long id,
                                              @RequestHeader(value = "username", required = false) String userName) {

        if (postService.getPostById(id) != null) {
            Post postToUpdate = postService.getPostById(id);

            if (userName.equals(postToUpdate.getUser().getUsername())) {
                postToUpdate.setTitle(post.getTitle());
                postToUpdate.setUrl(post.getUrl());
                postToUpdate.setTimestamp(new Timestamp(System.currentTimeMillis()));
                postService.updatePost(postToUpdate);
            }

            return new ResponseEntity<>(new PostDTO(postToUpdate), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}