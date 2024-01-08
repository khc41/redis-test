package com.example.redis.controller;

import com.example.redis.controller.param.RedisParam;
import com.example.redis.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @GetMapping("/redis")
    public String getRedis(@RequestBody RedisParam param) {
        return redisService.getRedis(param);
    }
}
