package com.s.entity;

public class Spec {
  private String specid;
  private String specname;
  private String superior;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public String getSpecid() {
    return specid;
  }

  public void setSpecid(String specid) {
    this.specid = specid;
  }

  public String getSpecname() {
    return specname;
  }

  public void setSpecname(String specname) {
    this.specname = specname;
  }

  public String getSuperior() {
    return superior;
  }

  public void setSuperior(String superior) {
    this.superior = superior;
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
