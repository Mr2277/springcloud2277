package com.eureka.client.eurekaclient.controller;

import com.eureka.client.eurekaclient.bean.Sale;
import com.eureka.client.eurekaclient.service.imp.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleServiceImp serviceImp;
    @RequestMapping("/test")
    public String testService(){
        return serviceImp.test();
    }
    @RequestMapping("/findSale")
    public Sale findSale(@RequestParam("VIPID") String VIPID,@RequestParam("YMD") String YMD){
        Sale sale=serviceImp.findByVIP(VIPID, YMD);
        return sale;
    }
    @RequestMapping("/findSaleList")
    public List<Sale> findSaleList(@RequestParam("VIPID") String VIPID){
        return serviceImp.findManySale(VIPID);
    }
    @RequestMapping("/findByBill")
    public List<?>findByBill(@RequestParam("BILL") String BILL){
        return  serviceImp.findByBill(BILL);
    }

}
