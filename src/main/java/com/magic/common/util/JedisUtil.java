package com.magic.common.util;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class JedisUtil {
    private final Jedis jedis;

    public JedisUtil(Jedis jedis) {
        this.jedis = jedis;
    }

    public void setValue(String key, String value) {
        jedis.set(key, value);
    }

    public String getValue(String key) {
        return jedis.get(key);
    }
}
