package com.my.db;

public class Product_comment {
  private Long commentid;
  private Long productid;
  private Long userid;
  private String commentcontent;
  private Long commentscore;
  private Long supportcount;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp modifytime;

  public Long getCommentid() {
    return commentid;
  }

  public void setCommentid(Long commentid) {
    this.commentid = commentid;
  }

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public String getCommentcontent() {
    return commentcontent;
  }

  public void setCommentcontent(String commentcontent) {
    this.commentcontent = commentcontent;
  }

  public Long getCommentscore() {
    return commentscore;
  }

  public void setCommentscore(Long commentscore) {
    this.commentscore = commentscore;
  }

  public Long getSupportcount() {
    return supportcount;
  }

  public void setSupportcount(Long supportcount) {
    this.supportcount = supportcount;
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
