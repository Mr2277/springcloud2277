package com.eureka.client.eurekaclient.controller;

import com.eureka.client.eurekaclient.service.imp.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleServiceImp serviceImp;
    @RequestMapping("/test")
    public String testService(){
        return serviceImp.test();
    }

}
