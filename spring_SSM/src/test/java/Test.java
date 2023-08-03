import org.chz.dao.IUserDao;
import org.chz.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Test {
   @org.junit.Test
   public void init(){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
//        IUserDao bean = context.getBean(IUserDao.class);
//       UserServiceImpl bean = (UserServiceImpl)context.getBean("service");
      IUserDao bean = (IUserDao) context.getBean("IUserDao");
        List<User> users = bean.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
//       System.out.println("------");
//       User zz = bean.queryByName(new User("zz", "123"));
//       System.out.println(zz);
   }
}
