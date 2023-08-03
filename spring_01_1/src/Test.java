import dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        UserServiceImpl service = (UserServiceImpl) context.getBean("userService");
        service.addUser((User) context.getBean("user"));

    }
}
