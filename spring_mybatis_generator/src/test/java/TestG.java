import org.chz.dao.UserMapper;
import org.chz.entity.User;
import org.chz.entity.UserExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestG {
    private ApplicationContext context;
    private UserMapper userMapper;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("conf/spring-config.xml");
        userMapper = context.getBean(UserMapper.class);

    }

    @Test
    public void query() {
        UserExample userExample = new UserExample();
        //条件支持链式
        userExample.createCriteria().andUsernameEqualTo("小").andIdBetween(41, 45);
        List<User> users = userMapper.selectByExample(userExample);
        //不推荐在generator生成的类中修改
        users.forEach(System.out::println);
    }

    @Test
    public void insert() {
        UserExample userExample = new UserExample();
        User user = new User();
        user.setUsername("习近平");
        user.setSex("女");
        userMapper.insert(user);
    }
}
