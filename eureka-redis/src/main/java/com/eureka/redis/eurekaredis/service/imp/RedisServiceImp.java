package com.eureka.redis.eurekaredis.service.imp;

import com.eureka.redis.eurekaredis.bean.Sale;
import com.eureka.redis.eurekaredis.service.redisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedisServiceImp implements redisService {
    @Autowired
    @Qualifier("MyRedisTemplate")
    private RedisTemplate redisTemplate;
    @Autowired

    private JdbcTemplate jdbcTemplate;
    private List<Sale>list=new ArrayList<>();
    @Override
    public List<Sale> writeToRedis() {
        //System.out.println("serviceRedis");
        list=jdbcTemplate.query("select * from sale where BILL='63600116060600001'",new BeanPropertyRowMapper<>(Sale.class));
        redisTemplate.opsForList().rightPushAll("select * from sale where BILL='63600116060600001'",list);
        return list;
    }
    public List<Sale>readFromRedis(){
      // redisTemplate.opsForList().range("select * from sale where BILL='63600116060600001'",0,-1);
       list= redisTemplate.opsForList().range("select * from sale where BILL='63600116060600001'",0,-1);
       System.out.println(list.size());
       //System.out.println(list.size());
        //Sale sale=list.get(0);
        //System.out.println(sale.getBILL());
        return list;
    }
}
