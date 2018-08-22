package com.s.entity;

public class Product_spec {
  private Long pspecid;
  private Long specid;
  private Long superior;
  private Long productid;
  private Long price;
  private Long stock;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public Long getPspecid() {
    return pspecid;
  }

  public void setPspecid(Long pspecid) {
    this.pspecid = pspecid;
  }

  public Long getSpecid() {
    return specid;
  }

  public void setSpecid(Long specid) {
    this.specid = specid;
  }

  public Long getSuperior() {
    return superior;
  }

  public void setSuperior(Long superior) {
    this.superior = superior;
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

  public Long getStock() {
    return stock;
  }

  public void setStock(Long stock) {
    this.stock = stock;
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
