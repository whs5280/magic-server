package com.magic.common.amqp;

import com.magic.config.RabbitMQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

@Slf4j
@RabbitListener(queues = RabbitMQConfig.DELAY_QUEUE)
@Component
public class MQDelayMessageListener {
    @RabbitHandler
    public void consumer(Message message) throws IOException {
        log.info("收到消息：{}", new Date());
        log.info("msgTag：{}", message.getMessageProperties().getDeliveryTag());
        log.info("message：{}", message);
    }
}
