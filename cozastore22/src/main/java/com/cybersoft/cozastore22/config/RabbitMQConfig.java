package com.cybersoft.cozastore22.config;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.impl.AMQImpl;
import org.springframework.context.annotation.Bean;

import java.util.Queue;

public class RabbitMQConfig {

    @Bean
    public Queue queue(){
        return new Queue("storage");
    }

    @Bean
}
