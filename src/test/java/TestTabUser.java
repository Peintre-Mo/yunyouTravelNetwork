
import com.qf.yunyou.dao.impl.TabUserDaoImpl;
import com.qf.yunyou.entity.TabUser;

public class TestTabUser {
    public static void main(String[] args) {
        TabUserDaoImpl tabUserDao = new TabUserDaoImpl();
        TabUser tabUser = tabUserDao.selectUserByUsername("zs");
        System.out.println(tabUser.toString());
    }
}
