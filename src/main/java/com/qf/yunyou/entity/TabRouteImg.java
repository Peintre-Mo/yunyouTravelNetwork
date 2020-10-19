package com.qf.yunyou.entity;


public class TabRouteImg {

  private long rgid;
  private long rid;
  private String bigPic;
  private String smallPic;


  public long getRgid() {
    return rgid;
  }

  public void setRgid(long rgid) {
    this.rgid = rgid;
  }


  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }


  public String getBigPic() {
    return bigPic;
  }

  public void setBigPic(String bigPic) {
    this.bigPic = bigPic;
  }


  public String getSmallPic() {
    return smallPic;
  }

  public void setSmallPic(String smallPic) {
    this.smallPic = smallPic;
  }

  @Override
  public String toString() {
    return "TabRouteImg{" +
            "rgid=" + rgid +
            ", rid=" + rid +
            ", bigPic='" + bigPic + '\'' +
            ", smallPic='" + smallPic + '\'' +
            '}';
  }
}
