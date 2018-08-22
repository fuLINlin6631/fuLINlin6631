package com.my.db;

public class Seckill {
  private Long seckillid;
  private Long productid;
  private Long price;
  private Long productstock;
  private java.sql.Date starttime;
  private java.sql.Date endtime;
  private java.sql.Date createtime;

  public Long getSeckillid() {
    return seckillid;
  }

  public void setSeckillid(Long seckillid) {
    this.seckillid = seckillid;
  }

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getProductstock() {
    return productstock;
  }

  public void setProductstock(Long productstock) {
    this.productstock = productstock;
  }

  public java.sql.Date getStarttime() {
    return starttime;
  }

  public void setStarttime(java.sql.Date starttime) {
    this.starttime = starttime;
  }

  public java.sql.Date getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Date endtime) {
    this.endtime = endtime;
  }

  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }
}
