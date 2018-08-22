package com.my.db;

public class Order_details {
  private Long detailsid;
  private Long orderid;
  private Long productid;
  private Long productcount;
  private String productname;
  private String productimg;
  private Long productprice;

  public Long getDetailsid() {
    return detailsid;
  }

  public void setDetailsid(Long detailsid) {
    this.detailsid = detailsid;
  }

  public Long getOrderid() {
    return orderid;
  }

  public void setOrderid(Long orderid) {
    this.orderid = orderid;
  }

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public Long getProductcount() {
    return productcount;
  }

  public void setProductcount(Long productcount) {
    this.productcount = productcount;
  }

  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }

  public String getProductimg() {
    return productimg;
  }

  public void setProductimg(String productimg) {
    this.productimg = productimg;
  }

  public Long getProductprice() {
    return productprice;
  }

  public void setProductprice(Long productprice) {
    this.productprice = productprice;
  }
}
