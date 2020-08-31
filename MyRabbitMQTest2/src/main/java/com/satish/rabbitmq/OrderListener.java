package com.satish.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderListener {
		
	@RabbitListener(queues = RabbitMQConfig.Order_QUEUE)
	public void processOrderMessage(Order myorder) {
		System.out.println("OrderListener -- processOrderMessage()");
		
		System.out.println("-----------------------------");
		System.out.println("Order Received: "+myorder);
		System.out.println("-----------------------------");
	}
}
