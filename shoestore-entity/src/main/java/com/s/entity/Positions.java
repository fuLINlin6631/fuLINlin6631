package com.s.entity;

import java.io.Serializable;

public class Positions implements Serializable {
  private Integer positionsid;
  private String positionsname;
  private Integer positionwidth;
  private Integer positionheight;

  public Integer getPositionsid() {
    return positionsid;
  }

  public void setPositionsid(Integer positionsid) {
    this.positionsid = positionsid;
  }

  public String getPositionsname() {
    return positionsname;
  }

  public void setPositionsname(String positionsname) {
    this.positionsname = positionsname;
  }

  public Integer getPositionwidth() {
    return positionwidth;
  }

  public void setPositionwidth(Integer positionwidth) {
    this.positionwidth = positionwidth;
  }

  public Integer getPositionheight() {
    return positionheight;
  }

  public void setPositionheight(Integer positionheight) {
    this.positionheight = positionheight;
  }
}
