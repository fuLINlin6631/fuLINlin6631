package com.s.entity;

import java.io.Serializable;

public class Spec implements Serializable {
  private Integer specid;
  private String specname;
  private Integer superior;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public String getSpecname() {
    return specname;
  }

  public void setSpecname(String specname) {
    this.specname = specname;
  }

  public Integer getSpecid() {
    return specid;
  }

  public void setSpecid(Integer specid) {
    this.specid = specid;
  }

  public Integer getSuperior() {
    return superior;
  }

  public void setSuperior(Integer superior) {
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
