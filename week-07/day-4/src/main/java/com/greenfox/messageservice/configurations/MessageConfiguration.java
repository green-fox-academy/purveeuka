package com.greenfox.messageservice.configurations;
import com.greenfox.messageservice.services.EmailService;
import com.greenfox.messageservice.services.MessageService;
import com.greenfox.messageservice.services.TwitterService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Qualifier("email")
    @Bean
    public MessageService sendEmail() {
        return new EmailService();
    }

    @Qualifier("tweet")
    @Bean
    public MessageService sendTweet() {
        return new TwitterService();
    }
}
