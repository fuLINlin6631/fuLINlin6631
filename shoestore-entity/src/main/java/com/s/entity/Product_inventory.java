package com.my.db;

public class Product_inventory {
  private Long inventoryid;
  private Long productid;
  private Long inventorycount;
  private Long inventoryprice;
  private Long inventorysubtotal;
  private Long stockold;
  private Long stocknew;
  private Long direction;
  private Long type;
  private java.sql.Timestamp createtime;

  public Long getInventoryid() {
    return inventoryid;
  }

  public void setInventoryid(Long inventoryid) {
    this.inventoryid = inventoryid;
  }

  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public Long getInventorycount() {
    return inventorycount;
  }

  public void setInventorycount(Long inventorycount) {
    this.inventorycount = inventorycount;
  }

  public Long getInventoryprice() {
    return inventoryprice;
  }

  public void setInventoryprice(Long inventoryprice) {
    this.inventoryprice = inventoryprice;
  }

  public Long getInventorysubtotal() {
    return inventorysubtotal;
  }

  public void setInventorysubtotal(Long inventorysubtotal) {
    this.inventorysubtotal = inventorysubtotal;
  }

  public Long getStockold() {
    return stockold;
  }

  public void setStockold(Long stockold) {
    this.stockold = stockold;
  }

  public Long getStocknew() {
    return stocknew;
  }

  public void setStocknew(Long stocknew) {
    this.stocknew = stocknew;
  }

  public Long getDirection() {
    return direction;
  }

  public void setDirection(Long direction) {
    this.direction = direction;
  }

  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }
}
