package com.example.redis.service;

import com.example.redis.controller.param.RedisParam;

public interface RedisService {
    String getRedis(RedisParam param);

    String getRedisWithCacheManager(RedisParam param);
}
