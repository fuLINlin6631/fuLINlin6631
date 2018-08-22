package com.s.entity;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
  private Integer userid;
  private String username;
  private String userpwd;
  private String useremail;
  private String usersex;
  private Date userbrithday;
  private String usercaddress;
  private String usermphone;
  private String userzcode;
  private String userqq;
  private Integer usertype;
  private Date createtime;
  private Date modifytime;

  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserpwd() {
    return userpwd;
  }

  public void setUserpwd(String userpwd) {
    this.userpwd = userpwd;
  }

  public String getUseremail() {
    return useremail;
  }

  public void setUseremail(String useremail) {
    this.useremail = useremail;
  }

  public String getUsersex() {
    return usersex;
  }

  public void setUsersex(String usersex) {
    this.usersex = usersex;
  }

  public Date getUserbrithday() {
    return userbrithday;
  }

  public void setUserbrithday(Date userbrithday) {
    this.userbrithday = userbrithday;
  }

  public String getUsercaddress() {
    return usercaddress;
  }

  public void setUsercaddress(String usercaddress) {
    this.usercaddress = usercaddress;
  }

  public String getUsermphone() {
    return usermphone;
  }

  public void setUsermphone(String usermphone) {
    this.usermphone = usermphone;
  }

  public String getUserzcode() {
    return userzcode;
  }

  public void setUserzcode(String userzcode) {
    this.userzcode = userzcode;
  }

  public String getUserqq() {
    return userqq;
  }

  public void setUserqq(String userqq) {
    this.userqq = userqq;
  }

  public Integer getUsertype() {
    return usertype;
  }

  public void setUsertype(Integer usertype) {
    this.usertype = usertype;
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
