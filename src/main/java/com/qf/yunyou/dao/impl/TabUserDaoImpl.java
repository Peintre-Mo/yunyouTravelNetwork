package com.qf.yunyou.dao.impl;

import com.qf.yunyou.dao.ITabUserDao;
import com.qf.yunyou.entity.TabUser;
import com.qf.yunyou.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TabUserDaoImpl implements ITabUserDao {

    @Override
    public TabUser selectUserByUsername(String una) {
        String sql = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        TabUser tabUser = null;
        try {
            sql = "select uid,username,name,sex,email from tab_user where username  = ?";
            //通过单例模式获取链接对象
            conn = DBUtils.getInstance().getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,una);
            rSet = ps.executeQuery();
            while (rSet.next()){
                int uid = rSet.getInt(1);
                String username = rSet.getString(2);
                String name = rSet.getString(3);
                String sex = rSet.getString(4);
                String email = rSet.getString(5);
                tabUser = new TabUser();
                tabUser.setUid(uid);
                tabUser.setUsername(username);
                tabUser.setName(name);
                tabUser.setSex(sex);
                tabUser.setEmail(email);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.closeAll(rSet,ps,conn);
        }
        return tabUser;
    }
}
