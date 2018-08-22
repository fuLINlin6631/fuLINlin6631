package com.my.db;

public class Carts {
  private Long cartid;
  private Long userid;
  private Long productid;
  private Long productcount;

  public Long getCartid() {
    return cartid;
  }

  public void setCartid(Long cartid) {
    this.cartid = cartid;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public Long getProductcount() {
    return productcount;
  }

  public void setProductcount(Long productcount) {
    this.productcount = productcount;
  }
}
