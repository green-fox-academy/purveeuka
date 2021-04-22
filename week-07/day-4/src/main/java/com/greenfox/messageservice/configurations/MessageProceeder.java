package com.greenfox.messageservice.configurations;

import com.greenfox.messageservice.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

    private MessageService messageService;

    @Autowired
    public MessageProceeder(@Qualifier("tweet") MessageService messageService) {
        this.messageService = messageService;
    }

    public void processSms(String sms, String address) {
        System.out.println(messageService.sendMessage(sms, address));
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
