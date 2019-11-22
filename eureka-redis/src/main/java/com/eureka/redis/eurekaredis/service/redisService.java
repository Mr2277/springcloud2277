package com.eureka.redis.eurekaredis.service;

import com.eureka.redis.eurekaredis.bean.Sale;

import java.util.List;

public interface redisService {
    List<Sale> writeToRedis();
}
