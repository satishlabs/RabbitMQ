package com.satish.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloListener {
		
	@RabbitListener(queues = RabbitMQConfig.Hello_QUEUE)
	public void processHelloMessage(String mymsg) {
		System.out.println("HelloListener -- processHelloMessage()");
		
		System.out.println("-----------------------------");
		System.out.println("Hello Message Received: "+mymsg);
		System.out.println("-----------------------------");
	}
}
