package org.service;

import org.dao.IUserDao;
import org.dao.UserDaoImpl;
import org.dto.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    //接口不能有get
    private IUserDao userDao;

    public void queryAll() {
        List<User> users = userDao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
