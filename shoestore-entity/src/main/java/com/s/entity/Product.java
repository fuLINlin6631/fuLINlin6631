package com.s.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
  private Integer productid;
  private String productname;
  private String producttitle;
  private Integer producttapprice;
  private Integer productagio;
  private Integer brandid;
  private Integer productstock;
  private Integer typeid;
  private String producturl;
  private String productalbum;
  private String productstatus;
  private Date createtime;
  private Date modifytime;

  public Integer getProductid() {
    return productid;
  }

  public void setProductid(Integer productid) {
    this.productid = productid;
  }

  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }

  public String getProducttitle() {
    return producttitle;
  }

  public void setProducttitle(String producttitle) {
    this.producttitle = producttitle;
  }

  public Integer getProducttapprice() {
    return producttapprice;
  }

  public void setProducttapprice(Integer producttapprice) {
    this.producttapprice = producttapprice;
  }

  public Integer getProductagio() {
    return productagio;
  }

  public void setProductagio(Integer productagio) {
    this.productagio = productagio;
  }

  public Integer getBrandid() {
    return brandid;
  }

  public void setBrandid(Integer brandid) {
    this.brandid = brandid;
  }

  public Integer getProductstock() {
    return productstock;
  }

  public void setProductstock(Integer productstock) {
    this.productstock = productstock;
  }

  public Integer getTypeid() {
    return typeid;
  }

  public void setTypeid(Integer typeid) {
    this.typeid = typeid;
  }

  public String getProducturl() {
    return producturl;
  }

  public void setProducturl(String producturl) {
    this.producturl = producturl;
  }

  public String getProductalbum() {
    return productalbum;
  }

  public void setProductalbum(String productalbum) {
    this.productalbum = productalbum;
  }

  public String getProductstatus() {
    return productstatus;
  }

  public void setProductstatus(String productstatus) {
    this.productstatus = productstatus;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Date getModifytime() {
    return modifytime;
  }

  public void setModifytime(Date modifytime) {
    this.modifytime = modifytime;
  }
}
