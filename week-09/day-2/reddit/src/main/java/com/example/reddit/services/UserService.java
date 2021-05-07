package com.example.reddit.services;

import com.example.reddit.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    void saveUser(User user);

    User findUser(String username, String password);

    User getByUsername(String username);
}