package com.qf.yunyou.dao;

import com.qf.yunyou.entity.TabUser;

import java.util.List;

public interface ITabUserDao {
    //查询用户是否存在
    TabUser selectUserByUsername(String username);

    //存用户
    int insertUser(TabUser user);

    //查看所有用户
    List<TabUser> selectList();

    //删除用户
    int deleteUserByUsername(String username);
}
