package com.magic.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitMQConfig {
    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private int port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.virtual-host}")
    private String vhost;

    /**
     * 延迟队列配置
     */
    private static final String DELAY_EXCHANGE = "delayed_message";
    public static final String DELAY_QUEUE = "delayed_message_queue";
    private static final String DELAY_ROUTING_KEY = "message";

    /**
     * 死信队列配置
     */
    private static final String DEAD_LETTER_EXCHANGE = String.format("%s.error", DELAY_EXCHANGE);
    private static final String DEAD_LETTER_QUEUE = String.format("%s.error", DELAY_QUEUE);
    private static final String DEAD_LETTER_ROUTING_KEY = "#";

    /**
     * 配置连接工厂
     */
    @Bean
    public CachingConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(vhost);
        return connectionFactory;
    }

    /**
     * 配置RabbitTemplate
     */
    @Bean
    public RabbitTemplate rabbitTemplate(CachingConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }

    /**
     * 延迟交换机
     */
    @Bean("delayedExchange")
    CustomExchange delayedExchange() {
        Map<String, Object> args = new HashMap<>(1);
        args.put("x-delayed-type", "direct");
        return new CustomExchange(DELAY_EXCHANGE, "x-delayed-message", true, false, args);
    }

    /**
     * 延迟队列
     */
    @Bean("delayedQueue")
    Queue delayedQueue() {
        Map<String, Object> args = new HashMap<>(2);
        //消息过期后，进入到死信交换机
        args.put("x-dead-letter-exchange", DEAD_LETTER_EXCHANGE);
        //消息过期后，进入到死信交换机的路由key
        args.put("x-dead-letter-routing-key", DEAD_LETTER_ROUTING_KEY);
        return QueueBuilder.durable(DELAY_QUEUE).withArguments(args).build();
    }

    /**
     * 死信队列
     */
    @Bean("deadLetterExchange")
    CustomExchange deadLetterExchange() {
        return new CustomExchange(DEAD_LETTER_EXCHANGE, "topic", true, false);
    }

    /**
     * 死信队列
     */
    @Bean("deadLetterQueue")
    Queue deadLetterQueue() {
        return QueueBuilder.durable(DEAD_LETTER_QUEUE).build();
    }

    /**
     * 延迟队列绑定
     */
    @Bean("bindingDelayedQueue")
    Binding bindingDelayedQueue(@Qualifier("delayedQueue") Queue queue, @Qualifier("delayedExchange") CustomExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(DELAY_ROUTING_KEY).noargs();
    }

    /**
     * 死信队列绑定
     */
    @Bean("bindingDeadLetterQueue")
    Binding bindingDeadLetterQueue(@Qualifier("deadLetterQueue") Queue queue, @Qualifier("deadLetterExchange") CustomExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(DEAD_LETTER_ROUTING_KEY).noargs();
    }
}
