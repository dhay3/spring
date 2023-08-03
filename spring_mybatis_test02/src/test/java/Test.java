import dao.IUserDao;
import dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
        //按类型匹配,当前类型唯一能拿到值,拿到的是mapperFactoryBean产生的类不是接口
//        IUserDao bean = context.getBean(IUserDao.class);
        IUserDao bean = (IUserDao) context.getBean("IUserDao");
//        IUserDao bean = (IUserDao) context.getBean("userMapper");
//        IUserDao bean = (IUserDao) context.getBean("mapperInterface");不能拿到值
        List<User> users = bean.queryAll();
        for (User user : users) {
            System.out.println(user);
        }

//        UserDaoServiceImpl service = (UserDaoServiceImpl)context.getBean("service");
//        service.queryAll();
    }
}
