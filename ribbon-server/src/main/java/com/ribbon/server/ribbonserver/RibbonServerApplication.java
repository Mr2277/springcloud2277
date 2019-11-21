package com.ribbon.server.ribbonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class RibbonServerApplication {
    public static ApplicationContext context;

    public static void main(String[] args) {
        context=new  SpringApplicationBuilder(RibbonServerApplication.class).web(true).run(args);
        //springClientFactory=context.getBean(SpringClientFactory.class);
        //ribbonLoadBalancerClient=context.getBean(RibbonLoadBalancerClient.class);
        //SpringApplication.run(RibbonServerApplication.class, args);
       // ApplicationContext context=new Spring
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
