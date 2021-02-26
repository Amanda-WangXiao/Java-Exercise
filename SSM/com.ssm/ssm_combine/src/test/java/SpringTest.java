import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SpringTest {


        @Test
        public void run1() {
            ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
            AccountService as = (AccountService) ac.getBean("AccountService");
            as.findAll();
        }

        @Test
        public void run2() throws IOException {
            // 加载配置文件
            InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

            // 创建工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            // 创建sqlSession对象
            SqlSession session = factory.openSession();

            // 获取代理对象
            AccountDao dao = session.getMapper(AccountDao.class);

            // 调用查询的方法
            List<Account> list = dao.findAll();
            for (Account account : list) {
                System.out.println(account);
            }

            // 释放资源
            session.close();
            inputStream.close();
        }

    @Test
    public void run3() throws IOException {
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 创建sqlSession对象
        SqlSession session = factory.openSession();

        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        Account account = new Account();
        account.setId(6);
        account.setUsername("Alice");
        account.setAge(15);

        dao.saveAccount(account);

        session.commit();
        // 释放资源
        session.close();
        inputStream.close();
    }
}
