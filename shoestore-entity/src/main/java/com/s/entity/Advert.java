package com.my.db;

public class Advert {
  private Long advertid;
  private Long positionsid;
  private String advertname;
  private String adverturl;
  private String advertimg;
  private java.sql.Date createtime;

  public Long getAdvertid() {
    return advertid;
  }

  public void setAdvertid(Long advertid) {
    this.advertid = advertid;
  }

  public Long getPositionsid() {
    return positionsid;
  }

  public void setPositionsid(Long positionsid) {
    this.positionsid = positionsid;
  }

  public String getAdvertname() {
    return advertname;
  }

  public void setAdvertname(String advertname) {
    this.advertname = advertname;
  }

  public String getAdverturl() {
    return adverturl;
  }

  public void setAdverturl(String adverturl) {
    this.adverturl = adverturl;
  }

  public String getAdvertimg() {
    return advertimg;
  }

  public void setAdvertimg(String advertimg) {
    this.advertimg = advertimg;
  }

  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }
}
