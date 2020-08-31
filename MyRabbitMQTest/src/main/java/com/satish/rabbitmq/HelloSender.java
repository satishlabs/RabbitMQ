package com.satish.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloSender {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendHelloMessage(String msg) {
		String routingKey = RabbitMQConfig.Hello_QUEUE;
		rabbitTemplate.convertAndSend(routingKey, msg);
	}
}
