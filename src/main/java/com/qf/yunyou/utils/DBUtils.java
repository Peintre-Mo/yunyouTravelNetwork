package com.qf.yunyou.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static volatile DBUtils instance = null;
    private static DataSource ds;
    public static final String DB_PROPERTIES_NAME = "db.properties";

    static {
        /**
         * 创建druid连接池
         */
        try {
            //是返回一个读取指定资源的输入流
            InputStream ra = DBUtils.class.getClassLoader().getResourceAsStream(DB_PROPERTIES_NAME);
            Properties properties = new Properties();
            //是从输入流中读取属性列表
            properties.load(ra);
            //获取连接池对象
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            System.out.println("创建数据库连接池失败");
        }
    }

    private DBUtils() {

    }

    //这是单例模式，一般用于比较大，复杂的对象，只初始化一次，
    // 应该还有一个private的构造函数，使得不能用new来实例化对象，
    // 只能调用getInstance方法来得到对象，
    // 而getInstance保证了每次调用都返回相同的对象。
    public static DBUtils getInstance() {
        if (instance == null) {
            synchronized (DBUtils.class) {
                if (instance == null) {
                    instance = new DBUtils();
                }
            }
        }
        return instance;
    }

    /**
     * 获取连接的操作
     *
     *
     */
    public Connection getConn() {
        Connection connection = null;
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //释放资源
    public static void closeAll(AutoCloseable ... closeables){
        for (AutoCloseable closeable:closeables) {
            if(closeable != null){
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
