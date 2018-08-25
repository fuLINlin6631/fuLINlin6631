package com.s.entity;

import java.io.Serializable;

public class Brands implements Serializable {
  private Long brandid;
  private String brandname;
  private String brandimg;
  private String branddesc;
  private Long dataflag;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public Long getBrandid() {
    return brandid;
  }

  public void setBrandid(Long brandid) {
    this.brandid = brandid;
  }

  public String getBrandname() {
    return brandname;
  }

  public void setBrandname(String brandname) {
    this.brandname = brandname;
  }

  public String getBrandimg() {
    return brandimg;
  }

  public void setBrandimg(String brandimg) {
    this.brandimg = brandimg;
  }

  public String getBranddesc() {
    return branddesc;
  }

  public void setBranddesc(String branddesc) {
    this.branddesc = branddesc;
  }

  public Long getDataflag() {
    return dataflag;
  }

  public void setDataflag(Long dataflag) {
    this.dataflag = dataflag;
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
