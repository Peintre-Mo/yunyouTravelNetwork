package com.qf.yunyou.dao.impl;

import com.qf.yunyou.dao.ITabUserDao;
import com.qf.yunyou.entity.TabUser;
import com.qf.yunyou.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TabUserDaoImpl implements ITabUserDao {

    @Override
    public TabUser selectUserByUsername(String una) {
        String sql = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        TabUser tabUser = null;
        try {
            sql = "select uid,username,name,sex,email from tab_user where username = ?";
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

    @Override
    public int insertUser(TabUser user) {
        String sql = null;
        Connection conn = null;
        PreparedStatement ps = null;
        int rSet = 0;
        TabUser tabUser = null;
        try {
            sql = "INSERT INTO tab_user(username,PASSWORD,NAME,sex,email) VALUES(?,?,?,?,?)";
            //通过单例模式获取链接对象
            conn = DBUtils.getInstance().getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getName());
            ps.setString(4,user.getSex());
            ps.setString(5,user.getEmail());
            rSet = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.closeAll(ps,conn);
        }
        return rSet;
    }

    @Override
    public List<TabUser> selectList() {
        String sql = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        TabUser tabUser = null;
        List list = new ArrayList();
        try {
            sql = "select uid,username,name,sex,email from tab_user";
            //通过单例模式获取链接对象
            conn = DBUtils.getInstance().getConn();
            ps = conn.prepareStatement(sql);
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
                list.add(tabUser);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.closeAll(rSet,ps,conn);
        }
        return list;
    }

    @Override
    public int deleteUserByUsername(String username) {
        String sql = null;
        Connection conn = null;
        PreparedStatement ps = null;
        int rSet = 0;
        TabUser tabUser = null;
        try {
            sql = "UPDATE tab_user SET STATUS = 0 WHERE username = ?";
            //通过单例模式获取链接对象
            conn = DBUtils.getInstance().getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            rSet = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtils.closeAll(ps,conn);
        }
        return rSet;
    }

}
