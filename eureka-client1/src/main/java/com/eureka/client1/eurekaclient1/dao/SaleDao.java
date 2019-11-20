package com.eureka.client1.eurekaclient1.dao;

import com.eureka.client1.eurekaclient1.bean.Sale;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface SaleDao {
    @Select("select * from sale where VIPID=#{VIPID} and YMD =#{YMD}")
    @Results({
            @Result(property = "YMD", column = "YMD"),
            @Result(property = "REGION", column = "REGION"),
            @Result(property = "FORMATS", column = "FORMATS"),
            @Result(property = "STORES", column = "STORES"),
            @Result(property = "STORENAME", column = "STORENAME"),
            @Result(property = "BILL", column = "BILL"),
            @Result(property = "VIPID", column = "VIPID"),
            @Result(property = "VIP_AGE", column = "VIP_AGE"),
            @Result(property = "VIP_SEX", column = "VIP_SEX"),
            @Result(property = "SHOPID", column = "SHOPID"),
            @Result(property = "SHOPNAME", column = "SHOPNAME"),
            @Result(property = "DEPTID", column = "DEPTID"),
            @Result(property = "DEPTNAME", column = "DEPTNAME"),
            @Result(property = "CLASSID3", column = "CLASSID3"),
            @Result(property = "NAME_CLASS3", column = "NAME_CLASS3"),
            @Result(property = "CLASSID4", column = "CLASSID4"),
            @Result(property = "NAME_CLASS4", column = "NAME_CLASS4"),
            @Result(property = "CLASSID5", column = "CLASSID5"),
            @Result(property = "NAME_CLASS5", column = "NAME_CLASS5"),
            @Result(property = "STANDARDS", column = "STANDARDS"),
            @Result(property = "UNIT_SALE", column = "UNIT_SALE"),
            @Result(property = "TIME_DEF", column = "TIME_DEF"),
            @Result(property = "PRICE_COM", column = "PRICE_COM"),
            @Result(property = "PRICE_MUST", column = "PRICE_MUST"),
            @Result(property = "PRICE_SALECHG", column = "PRICE_SALECHG"),
            @Result(property = "NUM_SALE", column = "NUM_SALE"),
            @Result(property = "VALUE_SALE", column = "VALUE_SALE"),
            @Result(property = "VALUE_SALE_AFTERDISC", column = "VALUE_SALE_AFTERDISC"),
            @Result(property = "ISRTN", column = "ISRTN"),

    })
    Sale findByName(@Param("VIPID") String VIPID, @Param("YMD") String YMD);
    @Select("select * from sale where VIPID =#{VIPID} ")
    List<Sale>findListSale(@Param("VIPID") String VIPID);
    @Select("select * from sale where BILL=#{BILL}")
    List<Sale>findListByBill(@Param("BILL") String BILL);

}
