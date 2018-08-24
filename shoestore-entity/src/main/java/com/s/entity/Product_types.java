package com.s.entity;

import java.io.Serializable;
import java.util.Date;

public class Product_types implements Serializable {
  private Integer typeid;
  private String typename;
  private Integer superior;
  private Date createtime;
  private Date modifytime;

  public Integer getTypeid() {
    return typeid;
  }

  public void setTypeid(Integer typeid) {
    this.typeid = typeid;
  }

  public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }

  public Integer getSuperior() {
    return superior;
  }

  public void setSuperior(Integer superior) {
    this.superior = superior;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Date getModifytime() {
    return modifytime;
  }

  public void setModifytime(Date modifytime) {
    this.modifytime = modifytime;
  }
}
