package com.qf.yunyou.entity;


public class TabRoute {

  private long rid;
  private String rname;
  private double price;
  private String routeIntroduce;
  private String rflag;
  private String rdate;
  private String isThemeTour;
  private long count;
  private long cid;
  private String rimage;
  private long sid;
  private String sourceId;


  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }


  public String getRname() {
    return rname;
  }

  public void setRname(String rname) {
    this.rname = rname;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getRouteIntroduce() {
    return routeIntroduce;
  }

  public void setRouteIntroduce(String routeIntroduce) {
    this.routeIntroduce = routeIntroduce;
  }


  public String getRflag() {
    return rflag;
  }

  public void setRflag(String rflag) {
    this.rflag = rflag;
  }


  public String getRdate() {
    return rdate;
  }

  public void setRdate(String rdate) {
    this.rdate = rdate;
  }


  public String getIsThemeTour() {
    return isThemeTour;
  }

  public void setIsThemeTour(String isThemeTour) {
    this.isThemeTour = isThemeTour;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getRimage() {
    return rimage;
  }

  public void setRimage(String rimage) {
    this.rimage = rimage;
  }


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  @Override
  public String toString() {
    return "TabRoute{" +
            "rid=" + rid +
            ", rname='" + rname + '\'' +
            ", price=" + price +
            ", routeIntroduce='" + routeIntroduce + '\'' +
            ", rflag='" + rflag + '\'' +
            ", rdate='" + rdate + '\'' +
            ", isThemeTour='" + isThemeTour + '\'' +
            ", count=" + count +
            ", cid=" + cid +
            ", rimage='" + rimage + '\'' +
            ", sid=" + sid +
            ", sourceId='" + sourceId + '\'' +
            '}';
  }
}
