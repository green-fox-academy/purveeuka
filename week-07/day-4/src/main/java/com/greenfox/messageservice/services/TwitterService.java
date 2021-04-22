package com.greenfox.messageservice.services;
import org.springframework.stereotype.Service;

@Service
public class TwitterService implements  MessageService{

    @Override
    public String sendMessage() {
        return "Twitted: ";
    }
}
