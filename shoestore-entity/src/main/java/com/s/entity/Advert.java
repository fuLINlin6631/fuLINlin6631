package com.s.entity;

import java.io.Serializable;
import java.util.Date;

public class Advert implements Serializable {
  private Integer advertid;
  private Integer positionsid;
  private String advertname;
  private String adverturl;
  private String advertimg;
  private Date createtime;

  public Integer getAdvertid() {
    return advertid;
  }

  public void setAdvertid(Integer advertid) {
    this.advertid = advertid;
  }

  public Integer getPositionsid() {
    return positionsid;
  }

  public void setPositionsid(Integer positionsid) {
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

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }
}
