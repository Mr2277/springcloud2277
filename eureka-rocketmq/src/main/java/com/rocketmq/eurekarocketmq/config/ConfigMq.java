package com.rocketmq.eurekarocketmq.config;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMq {
    @Value("${namesrvAddr}")
    private String namesrvAddr;

    @Value("${consumerGroup}")
    private String consumerGroup;

    @Value("${topic}")
    private String topic;

    @Value("${tag}")
    private String tag;

    @Value("${instanceName}")
    private String instanceName;

    @Value("${producerGroup}")
    private String producerGroup;
    @Bean
    public DefaultMQProducer defaultMQProducer() throws MQClientException {
        DefaultMQProducer defaultMQProducer=new DefaultMQProducer();
        defaultMQProducer.setProducerGroup(producerGroup);
        defaultMQProducer.setNamesrvAddr(namesrvAddr);
        defaultMQProducer.setInstanceName(instanceName);
        defaultMQProducer.setVipChannelEnabled(false);
        defaultMQProducer.start();
        return defaultMQProducer;
    }
}
