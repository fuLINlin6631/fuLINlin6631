package com.my.db;

public class Coupons {
  private Long couponid;
  private String couponno;
  private String coupontype;
  private Long couponface;
  private Long couponconsume;
  private java.sql.Date starttime;
  private java.sql.Date endtime;
  private Long couponstatus;
  private String explain;

  public Long getCouponid() {
    return couponid;
  }

  public void setCouponid(Long couponid) {
    this.couponid = couponid;
  }

  public String getCouponno() {
    return couponno;
  }

  public void setCouponno(String couponno) {
    this.couponno = couponno;
  }

  public String getCoupontype() {
    return coupontype;
  }

  public void setCoupontype(String coupontype) {
    this.coupontype = coupontype;
  }

  public Long getCouponface() {
    return couponface;
  }

  public void setCouponface(Long couponface) {
    this.couponface = couponface;
  }

  public Long getCouponconsume() {
    return couponconsume;
  }

  public void setCouponconsume(Long couponconsume) {
    this.couponconsume = couponconsume;
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

  public Long getCouponstatus() {
    return couponstatus;
  }

  public void setCouponstatus(Long couponstatus) {
    this.couponstatus = couponstatus;
  }

  public String getExplain() {
    return explain;
  }

  public void setExplain(String explain) {
    this.explain = explain;
  }
}
