package com.eureka.client1.eurekaclient1.service;

import com.eureka.client1.eurekaclient1.bean.Sale;

import java.util.List;

public interface SaleService {
    String test();
    Sale findByVIP(String VIPID, String YMD);
    List<Sale>findManySale(String VIPID);
    List<Sale>findByBill(String bill);
}
