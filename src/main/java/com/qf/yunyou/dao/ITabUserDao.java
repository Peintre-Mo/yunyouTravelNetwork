package com.qf.yunyou.dao;

import com.qf.yunyou.entity.TabUser;

public interface ITabUserDao {
    TabUser selectUserByUsername(String username);
}
