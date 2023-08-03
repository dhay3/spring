package service;

import dao.UserDaoImpl;
import dto.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

//@Service
public class UserServiceImpl implements IUserService {
    //方法中要new对象直接让spring实现
    private UserDaoImpl userDao;
    //事务是否只读
    @Transactional(readOnly = false,
            propagation = Propagation.REQUIRED,
//            如果sql语句异常和java编译错误会回滚
            rollbackFor ={SQLException.class,ArithmeticException.class} )
    @Override
    public void addUser(User u) {
        userDao.addUser(u);
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
