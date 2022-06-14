package com.example.messagingrabbitmq;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;



public class GmailSenderService implements MailSender{ 
    private JavaMailSender mailSender;
    public GmailSenderService(JavaMailSender mailSender){
        this.mailSender = mailSender;
    }
    public void mailToUser(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("odds.molamola@gmail.com");
        mailMessage.setTo("aiyaruch1320@hotmail.com");
        mailMessage.setSubject("RabbitMQ");
        mailMessage.setText("Send Mail");
        mailSender.send(mailMessage);
    }
}