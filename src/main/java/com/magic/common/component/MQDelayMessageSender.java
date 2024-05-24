package com.magic.common.component;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MQDelayMessageSender {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public MQDelayMessageSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendDelayedMessage(String exchange, String routingKey, String message, long delay) {
        MessagePostProcessor messagePostProcessor = message1 -> {
            MessageProperties messageProperties = new MessageProperties();
            messageProperties.setHeader("x-delay", delay * 1000);
            return new Message(message1.getBody(), messageProperties);
        };
        rabbitTemplate.convertAndSend(exchange, routingKey, message, messagePostProcessor);
    }
}
