package test.service;

import test.dao.UserDao;

public class UserService {
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String queryById(){
        return userDao.queryById();
    }
}
