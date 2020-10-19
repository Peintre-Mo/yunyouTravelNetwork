package com.qf.yunyou.entity;


public class TabFavorite {

  private long rid;
  private java.sql.Date date;
  private long uid;


  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  @Override
  public String toString() {
    return "TabFavorite{" +
            "rid=" + rid +
            ", date=" + date +
            ", uid=" + uid +
            '}';
  }
}
