package com.satish.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMyRabbitMQTest implements CommandLineRunner{

	@Autowired
	HelloSender helloSender;
	
	public static void main(String[] args) {
		SpringApplication.run(StartMyRabbitMQTest.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyRabbitMQTest Application Launched...");
			
		helloSender.sendHelloMessage("Hello Guys, How are you ?");
		System.out.println("Done1");
		
		helloSender.sendHelloMessage("We are learning RabbitMQ !!!");
		System.out.println("Done2");
	}
	
}
