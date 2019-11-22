package com.eureka.redis.eurekaredis.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;

@Component
public class Sale implements Serializable {
   public Date YMD;
   public String  REGION;
   public String FORMATS;
   public String STORES;
   public String STORENAME;
   public String  BILL;
   public String VIPID;
   public String  VIP_AGE;
   public String VIP_SEX;
   public String SHOPID;
   public String SHOPNAME;
   public String  DEPTID;
   public String DEPTNAME;
   public String  CLASSID3;
   public String NAME_CLASS3;
   public String CLASSID4;
   public String NAME_CLASS4;
   public String  CLASSID5;
   public String NAME_CLASS5;
   public String STANDARDS;
   public String UNIT_SALE;
   public String TIME_DEF;
   public String PRICE_COM ;
   public String PRICE_MUST;
   public String PRICE_SALECHG;
   public String NUM_SALE;
   public String VALUE_SALE;
   public String VALUE_SALE_AFTERDISC;
   public String ISRTN;

   public Date getYMD() {
      return YMD;
   }

   public void setYMD(Date YMD) {
      this.YMD = YMD;
   }

   public String getREGION() {
      return REGION;
   }

   public void setREGION(String REGION) {
      this.REGION = REGION;
   }

   public String getFORMATS() {
      return FORMATS;
   }

   public void setFORMATS(String FORMATS) {
      this.FORMATS = FORMATS;
   }

   public String getSTORES() {
      return STORES;
   }

   public void setSTORES(String STORES) {
      this.STORES = STORES;
   }

   public String getSTORENAME() {
      return STORENAME;
   }

   public void setSTORENAME(String STORENAME) {
      this.STORENAME = STORENAME;
   }

   public String getBILL() {
      return BILL;
   }

   public void setBILL(String BILL) {
      this.BILL = BILL;
   }

   public String getVIPID() {
      return VIPID;
   }

   public void setVIPID(String VIPID) {
      this.VIPID = VIPID;
   }

   public String getVIP_AGE() {
      return VIP_AGE;
   }

   public void setVIP_AGE(String VIP_AGE) {
      this.VIP_AGE = VIP_AGE;
   }

   public String getVIP_SEX() {
      return VIP_SEX;
   }

   public void setVIP_SEX(String VIP_SEX) {
      this.VIP_SEX = VIP_SEX;
   }

   public String getSHOPID() {
      return SHOPID;
   }

   public void setSHOPID(String SHOPID) {
      this.SHOPID = SHOPID;
   }

   public String getSHOPNAME() {
      return SHOPNAME;
   }

   public void setSHOPNAME(String SHOPNAME) {
      this.SHOPNAME = SHOPNAME;
   }

   public String getDEPTID() {
      return DEPTID;
   }

   public void setDEPTID(String DEPTID) {
      this.DEPTID = DEPTID;
   }

   public String getDEPTNAME() {
      return DEPTNAME;
   }

   public void setDEPTNAME(String DEPTNAME) {
      this.DEPTNAME = DEPTNAME;
   }

   public String getCLASSID3() {
      return CLASSID3;
   }

   public void setCLASSID3(String CLASSID3) {
      this.CLASSID3 = CLASSID3;
   }

   public String getNAME_CLASS3() {
      return NAME_CLASS3;
   }

   public void setNAME_CLASS3(String NAME_CLASS3) {
      this.NAME_CLASS3 = NAME_CLASS3;
   }

   public String getCLASSID4() {
      return CLASSID4;
   }

   public void setCLASSID4(String CLASSID4) {
      this.CLASSID4 = CLASSID4;
   }

   public String getNAME_CLASS4() {
      return NAME_CLASS4;
   }

   public void setNAME_CLASS4(String NAME_CLASS4) {
      this.NAME_CLASS4 = NAME_CLASS4;
   }

   public String getCLASSID5() {
      return CLASSID5;
   }

   public void setCLASSID5(String CLASSID5) {
      this.CLASSID5 = CLASSID5;
   }

   public String getNAME_CLASS5() {
      return NAME_CLASS5;
   }

   public void setNAME_CLASS5(String NAME_CLASS5) {
      this.NAME_CLASS5 = NAME_CLASS5;
   }

   public String getSTANDARDS() {
      return STANDARDS;
   }

   public void setSTANDARDS(String STANDARDS) {
      this.STANDARDS = STANDARDS;
   }

   public String getUNIT_SALE() {
      return UNIT_SALE;
   }

   public void setUNIT_SALE(String UNIT_SALE) {
      this.UNIT_SALE = UNIT_SALE;
   }

   public String getTIME_DEF() {
      return TIME_DEF;
   }

   public void setTIME_DEF(String TIME_DEF) {
      this.TIME_DEF = TIME_DEF;
   }

   public String getPRICE_COM() {
      return PRICE_COM;
   }

   public void setPRICE_COM(String PRICE_COM) {
      this.PRICE_COM = PRICE_COM;
   }

   public String getPRICE_MUST() {
      return PRICE_MUST;
   }

   public void setPRICE_MUST(String PRICE_MUST) {
      this.PRICE_MUST = PRICE_MUST;
   }

   public String getPRICE_SALECHG() {
      return PRICE_SALECHG;
   }

   public void setPRICE_SALECHG(String PRICE_SALECHG) {
      this.PRICE_SALECHG = PRICE_SALECHG;
   }

   public String getNUM_SALE() {
      return NUM_SALE;
   }

   public void setNUM_SALE(String NUM_SALE) {
      this.NUM_SALE = NUM_SALE;
   }

   public String getVALUE_SALE() {
      return VALUE_SALE;
   }

   public void setVALUE_SALE(String VALUE_SALE) {
      this.VALUE_SALE = VALUE_SALE;
   }

   public String getVALUE_SALE_AFTERDISC() {
      return VALUE_SALE_AFTERDISC;
   }

   public void setVALUE_SALE_AFTERDISC(String VALUE_SALE_AFTERDISC) {
      this.VALUE_SALE_AFTERDISC = VALUE_SALE_AFTERDISC;
   }

   public String getISRTN() {
      return ISRTN;
   }

   public void setISRTN(String ISRTN) {
      this.ISRTN = ISRTN;
   }
}
