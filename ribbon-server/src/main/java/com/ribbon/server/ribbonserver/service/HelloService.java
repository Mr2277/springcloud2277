package com.ribbon.server.ribbonserver.service;

import com.eureka.client.eurekaclient.bean.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public List<Sale> hiService(String name) {
        List<Sale> list= restTemplate.getForObject("http://EUREKA-CLIENT/sale/findByBill?BILL="+name,List.class);
        return list;
         //restTemplate.getForObject("http://EUREKA-CLIENT/sale/findByBill?BILL="+name,String.class);
    }
}
