package com.my.db;

public class Product_types {
  private Long typeid;
  private String typename;
  private Long superior;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public Long getTypeid() {
    return typeid;
  }

  public void setTypeid(Long typeid) {
    this.typeid = typeid;
  }

  public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }

  public Long getSuperior() {
    return superior;
  }

  public void setSuperior(Long superior) {
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
