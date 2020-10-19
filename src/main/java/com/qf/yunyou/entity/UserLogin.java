package com.qf.yunyou.entity;

public class UserLogin {
    String name;
    String accountnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "name='" + name + '\'' +
                ", accountnum='" + accountnum + '\'' +
                '}';
    }
}
