package com.s.entity;

public class Product {
  private Long productid;
  private String productname;
  private String producttitle;
  private Long producttapprice;
  private Long productagio;
  private Long brandid;
  private Long productstock;
  private Long typeid;
  private String producturl;
  private String productalbum;
  private String productstatus;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
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

  public Long getProducttapprice() {
    return producttapprice;
  }

  public void setProducttapprice(Long producttapprice) {
    this.producttapprice = producttapprice;
  }

  public Long getProductagio() {
    return productagio;
  }

  public void setProductagio(Long productagio) {
    this.productagio = productagio;
  }

  public Long getBrandid() {
    return brandid;
  }

  public void setBrandid(Long brandid) {
    this.brandid = brandid;
  }

  public Long getProductstock() {
    return productstock;
  }

  public void setProductstock(Long productstock) {
    this.productstock = productstock;
  }

  public Long getTypeid() {
    return typeid;
  }

  public void setTypeid(Long typeid) {
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
