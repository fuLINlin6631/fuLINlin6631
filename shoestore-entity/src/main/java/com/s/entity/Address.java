package com.my.db;

public class Address {
  private Long addressid;
  private Long userid;
  private String username;
  private String userphone;
  private String areaidpath;
  private String useraddress;
  private String postalcode;
  private Long isdefault;
  private Long dataflag;
  private java.sql.Date createtime;

  public Long getAddressid() {
    return addressid;
  }

  public void setAddressid(Long addressid) {
    this.addressid = addressid;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserphone() {
    return userphone;
  }

  public void setUserphone(String userphone) {
    this.userphone = userphone;
  }

  public String getAreaidpath() {
    return areaidpath;
  }

  public void setAreaidpath(String areaidpath) {
    this.areaidpath = areaidpath;
  }

  public String getUseraddress() {
    return useraddress;
  }

  public void setUseraddress(String useraddress) {
    this.useraddress = useraddress;
  }

  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }

  public Long getIsdefault() {
    return isdefault;
  }

  public void setIsdefault(Long isdefault) {
    this.isdefault = isdefault;
  }

  public Long getDataflag() {
    return dataflag;
  }

  public void setDataflag(Long dataflag) {
    this.dataflag = dataflag;
  }

  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }
}
