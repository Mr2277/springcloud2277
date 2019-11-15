package com.eureka.client.eurekaclient.service;

import com.eureka.client.eurekaclient.bean.Sale;

public interface SaleService {
    String test();
    Sale findByVIP(String VIPID,String YMD);
}
