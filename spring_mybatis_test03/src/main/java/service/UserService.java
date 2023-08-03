package service;

import dao.IUserDao;
import dto.User;

import java.util.List;

//@Service("service")
public class UserService {
//    @Autowired
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void queryAll() {
        List<User> users = userDao.queryAll();
        users.forEach(System.out::println);
    }

}
