package com.greenfox.messageservice.configurations;

import com.greenfox.messageservice.services.EmailService;
import com.greenfox.messageservice.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

    private MessageService messageService;

    @Autowired
    public MessageProceeder(MessageService messageService) {
        this.messageService = messageService;
    }

    public void  processSms(String sms, String emailService) {
        System.out.println("Email sent to: " + emailService + " with Message=" + sms);
    }


    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
