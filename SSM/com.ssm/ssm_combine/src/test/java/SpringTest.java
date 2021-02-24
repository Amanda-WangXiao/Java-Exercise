import com.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
        @Test
        public void run1() {
            ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
            AccountService as = (AccountService) ac.getBean("AccountService");
            as.findAll();
        }

}
