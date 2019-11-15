package com.eureka.client.eurekaclient.service;

import com.eureka.client.eurekaclient.bean.Sale;

import java.util.List;

public interface SaleService {
    String test();
    Sale findByVIP(String VIPID,String YMD);
    List<Sale>findManySale(String VIPID);
}
