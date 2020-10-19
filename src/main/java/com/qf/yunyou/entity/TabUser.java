package com.qf.yunyou.entity;


public class TabUser {

  private long uid;
  private String username;
  private String password;
  private String name;
  private String birthday;
  private String sex;
  private String telephone;
  private String email;
  private String status;
  private String code;

  public TabUser() {
  }

  public TabUser(String username, String password, String name, String sex, String email) {
    this.username = username;
    this.password = password;
    this.name = name;
    this.sex = sex;
    this.email = email;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String  getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "TabUser{" +
            "uid=" + uid +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", name='" + name + '\'' +
            ", birthday=" + birthday +
            ", sex='" + sex + '\'' +
            ", telephone='" + telephone + '\'' +
            ", email='" + email + '\'' +
            ", status='" + status + '\'' +
            ", code='" + code + '\'' +
            '}';
  }
}
