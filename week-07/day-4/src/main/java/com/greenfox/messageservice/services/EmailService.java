package com.greenfox.messageservice.services;
public class EmailService implements MessageService{

    private MessageService messageService;

    @Override
    public String sendMessage() {
        return "Email sent to: ";
    }
}
