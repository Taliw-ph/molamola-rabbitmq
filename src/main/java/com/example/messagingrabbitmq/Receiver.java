package com.example.messagingrabbitmq;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	public Receiver(MailSender mailSenderService) { 
		this.mailSenderService =  mailSenderService; 
	}

	private MailSender mailSenderService;

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(String message) {
		System.out.println("Received <" + message + ">");
		mailSenderService.mailToUser();
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}
}
