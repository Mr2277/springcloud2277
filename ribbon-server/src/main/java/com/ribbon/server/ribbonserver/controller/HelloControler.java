package com.ribbon.server.ribbonserver.controller;

import com.ribbon.server.ribbonserver.bean.Sale;
import com.ribbon.server.ribbonserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class HelloControler {
    @Autowired
    HelloService helloService;

    @RequestMapping (value = "/findByBill")
    public List<Sale> hi(@RequestParam("BILL") String BILL) {
        return helloService.hiService( BILL );
    }
}
