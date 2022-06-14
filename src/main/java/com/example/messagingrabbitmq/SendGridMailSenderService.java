
package com.example.messagingrabbitmq;
import org.springframework.stereotype.Component;

@Component
public class SendGridMailSenderService implements MailSender {
    public void mailToUser(){
        System.out.println("Send mail to user");
    }
}
