package com.satish.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class RabbitMQConfig {
	public static final String Hello_QUEUE = "myhello-queue";
	public static final String Hello_EXCHANGE = "myhello-exchange";
	
	@Bean(name = "myHelloExchange")
	Exchange createHelloExchange() {
		return ExchangeBuilder.topicExchange(Hello_EXCHANGE).build();
	}
	
	@Bean(name = "myHelloQueue")
	Queue createHelloQueue() {
		return QueueBuilder.durable(Hello_QUEUE).build();
	}
	
	Binding helloBinding(Queue myHelloQueue, TopicExchange myhelloExchange) {
		return BindingBuilder.bind(myHelloQueue).to(myhelloExchange).with(Hello_QUEUE);
	}
}
