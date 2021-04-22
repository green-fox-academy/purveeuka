package com.greenfox.messageservice;

import com.greenfox.messageservice.configurations.MessageProceeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageServiceApplication implements CommandLineRunner {


    private final MessageProceeder messageProceeder;

    @Autowired
    public MessageServiceApplication(MessageProceeder messageProceeder) {
        this.messageProceeder = messageProceeder;
    }

    public static void main(String[] args) {
        SpringApplication.run(MessageServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messageProceeder.processSms("Hi Barba! How are you?","office@greenfox.com" );
    }
}
