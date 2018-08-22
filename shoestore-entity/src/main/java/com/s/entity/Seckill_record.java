package com.s.entity;

public class Seckill_record {
  private Long recordid;
  private Long seckillid;
  private String phone;
  private Long state;
  private java.sql.Date createtime;

  public Long getRecordid() {
    return recordid;
  }

  public void setRecordid(Long recordid) {
    this.recordid = recordid;
  }

  public Long getSeckillid() {
    return seckillid;
  }

  public void setSeckillid(Long seckillid) {
    this.seckillid = seckillid;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }

  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }
}
