import org.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        UserServiceImpl bean = (UserServiceImpl)context.getBean("service");
        bean.queryAll();
    }
}
