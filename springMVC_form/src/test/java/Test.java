import org.chz.dao.IUserDao;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
        IUserDao bean = context.getBean(IUserDao.class);
        System.out.println(bean.queryAll());
    }
}
