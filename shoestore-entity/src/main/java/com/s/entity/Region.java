package com.s.entity;

public class Region {
  private Long regionid;
  private String regionname;
  private String regionkey;
  private Long regiontype;
  private Long superior;
  private java.sql.Date createtime;

  public Long getRegionid() {
    return regionid;
  }

  public void setRegionid(Long regionid) {
    this.regionid = regionid;
  }

  public String getRegionname() {
    return regionname;
  }

  public void setRegionname(String regionname) {
    this.regionname = regionname;
  }

  public String getRegionkey() {
    return regionkey;
  }

  public void setRegionkey(String regionkey) {
    this.regionkey = regionkey;
  }

  public Long getRegiontype() {
    return regiontype;
  }

  public void setRegiontype(Long regiontype) {
    this.regiontype = regiontype;
  }

  public Long getSuperior() {
    return superior;
  }

  public void setSuperior(Long superior) {
    this.superior = superior;
  }

  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }
}
