package com.s.entity;

public class Orders {
  private Long orderno;
  private Long userid;
  private Long orderstatus;
  private Long priductprice;
  private Long ordertotalprice;
  private Long orderfreight;
  private Long orderealtotalprice;
  private String orderremarks;
  private String username;
  private String useraddress;
  private String userphone;
  private Long expressid;
  private String expressno;
  private Long ispay;
  private Long isrefund;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public Long getOrderno() {
    return orderno;
  }

  public void setOrderno(Long orderno) {
    this.orderno = orderno;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public Long getOrderstatus() {
    return orderstatus;
  }

  public void setOrderstatus(Long orderstatus) {
    this.orderstatus = orderstatus;
  }

  public Long getPriductprice() {
    return priductprice;
  }

  public void setPriductprice(Long priductprice) {
    this.priductprice = priductprice;
  }

  public Long getOrdertotalprice() {
    return ordertotalprice;
  }

  public void setOrdertotalprice(Long ordertotalprice) {
    this.ordertotalprice = ordertotalprice;
  }

  public Long getOrderfreight() {
    return orderfreight;
  }

  public void setOrderfreight(Long orderfreight) {
    this.orderfreight = orderfreight;
  }

  public Long getOrderealtotalprice() {
    return orderealtotalprice;
  }

  public void setOrderealtotalprice(Long orderealtotalprice) {
    this.orderealtotalprice = orderealtotalprice;
  }

  public String getOrderremarks() {
    return orderremarks;
  }

  public void setOrderremarks(String orderremarks) {
    this.orderremarks = orderremarks;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUseraddress() {
    return useraddress;
  }

  public void setUseraddress(String useraddress) {
    this.useraddress = useraddress;
  }

  public String getUserphone() {
    return userphone;
  }

  public void setUserphone(String userphone) {
    this.userphone = userphone;
  }

  public Long getExpressid() {
    return expressid;
  }

  public void setExpressid(Long expressid) {
    this.expressid = expressid;
  }

  public String getExpressno() {
    return expressno;
  }

  public void setExpressno(String expressno) {
    this.expressno = expressno;
  }

  public Long getIspay() {
    return ispay;
  }

  public void setIspay(Long ispay) {
    this.ispay = ispay;
  }

  public Long getIsrefund() {
    return isrefund;
  }

  public void setIsrefund(Long isrefund) {
    this.isrefund = isrefund;
  }

  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }

  public java.sql.Timestamp getModifytime() {
    return modifytime;
  }

  public void setModifytime(java.sql.Timestamp modifytime) {
    this.modifytime = modifytime;
  }
}
