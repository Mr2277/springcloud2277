package com.eureka.redis.eurekaredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class EurekaRedisApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaRedisApplication.class, args);
    }

}
