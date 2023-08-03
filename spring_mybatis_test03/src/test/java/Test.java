import dao.IUserDao;
import dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        IUserDao bean = context.getBean(IUserDao.class);
//        MapperScannerConfigurer会在ioc容器中生成对应接口的实体类name是接口的名字
//        IUserDao bean = (IUserDao) context.getBean("IUserDao");
        List<User> users = bean.queryAll();
        for (User user : users) {
            System.out.println(user);
        }

//        IAccountDao bean = context.getBean(IAccountDao.class);
//        IAccountDao bean = (IAccountDao) context.getBean("IAccountDao");
//        List<Account> accounts = bean.queryAll();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
//        UserService service = (UserService)context.getBean("service");
//        service.queryAll();
    }
}
