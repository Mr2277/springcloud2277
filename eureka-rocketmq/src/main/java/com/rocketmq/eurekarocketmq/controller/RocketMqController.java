package com.rocketmq.eurekarocketmq.controller;

import com.rocketmq.eurekarocketmq.produce.Producer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rocketmq")
public class RocketMqController {
    @Autowired
    private Producer producer;
    @RequestMapping("/test")
    public String test() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        Message message=new Message("MyTopic","MyTag","hello".getBytes());
        SendResult sendResult=producer.getDefaultMQProducer().send(message);
        if(SendStatus.SEND_OK.equals(sendResult.getSendStatus())){
            System.out.println(sendResult.getMessageQueue());
            System.out.println(sendResult.getMsgId());
            System.out.println(sendResult.getOffsetMsgId());
            System.out.println(sendResult.getRegionId());
            List<MessageQueue>list=new ArrayList<>();
            list =producer.getDefaultMQProducer().fetchPublishMessageQueues("MyTopic");
            System.out.println(list.size());
            for(MessageQueue messageQueue:list){

                System.out.println(messageQueue.getBrokerName()+messageQueue.getQueueId());
            }

        }
        return null;
    }
}
