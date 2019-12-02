package com.rocketmq.eurekarocketmq.produce;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Producer {
    @Autowired
    private DefaultMQProducer defaultMQProducer;
    public DefaultMQProducer getDefaultMQProducer(){
        return defaultMQProducer;
    }
    public void test(){
        System.out.println(defaultMQProducer.getProducerGroup());
        //defaultMQProducer.send("hello");
    }
}
