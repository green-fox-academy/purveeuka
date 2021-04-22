package com.greenfox.messageservice.services;
public class EmailService implements MessageService{

    @Override
    public String sendMessage(String sms, String emailAddress) {
        return "Email sent to: " + emailAddress  + " with Message: " + sms ;
    }
}
