package com.example.reddit.services;

import com.example.reddit.models.Post;
import com.example.reddit.models.User;
import com.example.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUser(String username, String password) {
        return userRepository.findUserByUsernameAndPassword(username, password);
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }


}