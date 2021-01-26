import com.mybatis.UserDao;
import org.junit.Test;
import com.mybatis.dao.entity.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/1/15 13:52
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class AddUserTest {
    public UserDao userDao = null;

    @Test
    public void addUserByEntityTest() {
        User user = new User();
        user.setId(6);
        user.setUsername("Alice");
        user.setAge(15);

        userDao = new UserDao();
        int count = userDao.addUserByEntity(user);
        System.out.println("affected rows: "+count);

    }

    @Test
    public void addUserByMap(){
        var mapParameter = new HashMap<String,Object>();
        mapParameter.put("id",6);
        mapParameter.put("username","Alice");
        mapParameter.put("age",15);

        userDao = new UserDao();
        int count = userDao.addUserByMap(mapParameter);
        System.out.println("affected rows: "+count);
    }

    @Test
    public void addUserDynamicTest(){
        User user = new User();
        user.setId(6);
        user.setUsername("Alice");
        user.setAge(15);

        userDao = new UserDao();
        int count = userDao.addUserDynamic(user);
        System.out.println("affected rows: "+count);
    }

    @Test
    public void addUserByListTest(){
        var userlist = new ArrayList<User>();
        User user1 = new User(6,"Alice",15);
        User user2 = new User(7,"Tom",16);
        User user3 = new User(8,"Jackson",17);
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);

        userDao = new UserDao();
        int count = userDao.addUserByList(userlist);
        System.out.println("affected rows: "+count);
    }

    @Test
    public void deleteUserByIDTest(){
        int id = 7;
        userDao = new UserDao();
        int count = userDao.deleteUserByID(id);
        System.out.println("affected rows: "+count);
    }

    @Test
    public void updateUserByEntityTest(){
        User user = new User();
        user.setId(7);
        user.setUsername("TTT");
        user.setAge(100);

        userDao = new UserDao();
        int count = userDao.updateUserByEntity(user);
        System.out.println("affected rows: "+count);
    }

    @Test
    public void queryUserByIDTest(){
        int id = 6;
        userDao = new UserDao();
        User user = userDao.queryUserByID(id);
        System.out.println(user);
    }
}
