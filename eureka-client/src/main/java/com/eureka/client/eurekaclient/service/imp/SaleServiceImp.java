package com.eureka.client.eurekaclient.service.imp;

import com.eureka.client.eurekaclient.bean.Sale;
import com.eureka.client.eurekaclient.dao.SaleDao;
import com.eureka.client.eurekaclient.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
    public Sale findByVIP(String VIPID, String YMD) {
        return saleDao.findByName(VIPID, YMD);
    }

    @Override
    public List<Sale> findManySale(String VIPID) {
        return saleDao.findListSale(VIPID);
    }
    @Override
    public List<Sale> findByBill(String bill) {
        return saleDao.findListByBill(bill);
    }


}
