package com.example.redis.service;

import com.example.redis.controller.param.RedisParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public String getRedis(RedisParam param) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        String result = (String) operations.get(param.getKey());
        if (!StringUtils.hasText(result)) {
            operations.set(param.getKey(), param.getValue(), 10, TimeUnit.MINUTES);
            result = param.getValue();
        }
        return result;
    }
}
