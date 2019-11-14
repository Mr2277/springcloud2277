package com.eureka.client.eurekaclient.service.imp;

import com.eureka.client.eurekaclient.dao.SaleDao;
import com.eureka.client.eurekaclient.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SaleServiceImp implements SaleService {
    //@Resource
    @Autowired
    private SaleDao saleDao;
    @Override
    public String test() {
        return "test";
    }

}
