package com.eureka.redis.eurekaredis.controller;

import com.eureka.redis.eurekaredis.bean.Sale;
import com.eureka.redis.eurekaredis.service.imp.RedisServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class redisController {
    @Autowired
    private RedisServiceImp redisServiceImp;
    @RequestMapping("/write")
    public List<Sale> writeToRedis(){
        return redisServiceImp.writeToRedis();
    }
    @RequestMapping("/read")
    public List<Sale>readFromRedis(){
        return  redisServiceImp.readFromRedis();

    }
}
