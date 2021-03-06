package com.qianfeng.fxmall.goods.bean;


public class WxbGoodSku {

  private String skuId;
  private String skuName;
  private String skuCost;
  private String skuPrice;
  private String skuPmoney;
  private String goodId;
  private long orderNo;
  private String serviceMoney;


private WxbGood good;

  public WxbGood getGood() {
    return good;
  }

  public void setGood(WxbGood good) {
    this.good = good;
  }

  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public String getSkuCost() {
    return skuCost;
  }

  public void setSkuCost(String skuCost) {
    this.skuCost = skuCost;
  }

  public String getSkuPrice() {
    return skuPrice;
  }

  public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
  }

  public String getSkuPmoney() {
    return skuPmoney;
  }

  public void setSkuPmoney(String skuPmoney) {
    this.skuPmoney = skuPmoney;
  }

  public String getGoodId() {
    return goodId;
  }

  public void setGoodId(String goodId) {
    this.goodId = goodId;
  }

  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }

  public String getServiceMoney() {
    return serviceMoney;
  }

  public void setServiceMoney(String serviceMoney) {
    this.serviceMoney = serviceMoney;
  }

  public WxbGoodSku(String skuId, String skuName, String skuCost,
                      String skuPrice, String skuPmoney, String goodId,
                      long orderNo, String serviceMoney) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuCost = skuCost;
        this.skuPrice = skuPrice;
        this.skuPmoney = skuPmoney;
        this.goodId = goodId;
        this.orderNo = orderNo;
        this.serviceMoney = serviceMoney;
    }
    public  WxbGoodSku(){

  }


  @Override
  public String toString() {
    return "WxbGoodSku{" +
            "skuId='" + skuId + '\'' +
            ", skuName='" + skuName + '\'' +
            ", skuCost='" + skuCost + '\'' +
            ", skuPrice='" + skuPrice + '\'' +
            ", skuPmoney='" + skuPmoney + '\'' +
            ", goodId='" + goodId + '\'' +
            ", orderNo=" + orderNo +
            ", serviceMoney='" + serviceMoney + '\'' +
            ", good=" + good +
            '}';
  }
}
