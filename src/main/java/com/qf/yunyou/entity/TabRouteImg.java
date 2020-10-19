package com.qf.yunyou.entity;


import com.qf.yunyou.utils.AnnotationUtils;

public class TabRouteImg {

  private long rgid;
  private long rid;

  @AnnotationUtils("big_pic")
  private String bigPic;

  @AnnotationUtils("small_pic")
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

}
