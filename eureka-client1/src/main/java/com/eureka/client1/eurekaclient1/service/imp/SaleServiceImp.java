package com.eureka.client1.eurekaclient1.service.imp;

import com.eureka.client1.eurekaclient1.bean.Sale;
import com.eureka.client1.eurekaclient1.dao.SaleDao;
import com.eureka.client1.eurekaclient1.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImp implements SaleService {
    //@Resource
    @Autowired
    private SaleDao saleDao;
    @Override
    public String test() {
        return "test";
    }

    public Sale findByVIP(String VIPID, String YMD) {
        return saleDao.findByName(VIPID, YMD);
    }

    @Override
    public List<Sale> findManySale(String VIPID) {
        return saleDao.findListSale(VIPID);
    }

}
