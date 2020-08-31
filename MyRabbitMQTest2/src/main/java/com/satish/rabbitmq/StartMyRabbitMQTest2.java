package com.satish.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMyRabbitMQTest2 implements CommandLineRunner{

	@Autowired
	HelloSender helloSender;
	
	@Autowired
	OrderSender orderSender;
	
	public static void main(String[] args) {
		SpringApplication.run(StartMyRabbitMQTest2.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyRabbitMQTest Application Launched...");
			
		helloSender.sendHelloMessage("Hello Guys, How are you ?");
		System.out.println("Done1");
		
		helloSender.sendHelloMessage("We are learning RabbitMQ !!!");
		System.out.println("Done2");
		
		System.out.println("--------------------------------------------");
		Order order = new Order(11, "31-08-2020", 99, 5, 2020.0, "New");
		orderSender.sendOrder(order);
		System.out.println("Done3");
	}
	
}
