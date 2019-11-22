package com.eureka.client.eurekaclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
@RestController
@MapperScan(basePackages ="com.eureka.client.eurekaclient.dao")
public class EurekaClientApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(EurekaClientApplication.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
    @Autowired
    DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
         System.out.println(dataSource.getClass().getName());
         System.out.println("DATASOURCE="+dataSource);
    }
}
