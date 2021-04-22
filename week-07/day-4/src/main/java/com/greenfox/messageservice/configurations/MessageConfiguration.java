package com.greenfox.messageservice.configurations;

import com.greenfox.messageservice.services.EmailService;
import com.greenfox.messageservice.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class MessageConfiguration {

    @Primary
    @Bean
    public MessageService service() {
        return new EmailService();
    }

}
