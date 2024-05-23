package com.magic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class JedisConfig {
    @Value("${spring.data.redis.host}")
    private String host;

    @Value("${spring.data.redis.port}")
    private int port;

    @Value("${spring.data.redis.password}")
    private String password;

    @Value("${spring.data.redis.database:1}")
    private int database;

    @Bean
    public Jedis jedis() {
        Jedis redis = new Jedis(host, port);
        redis.auth(password);
        redis.select(database);
        return redis;
    }
}
