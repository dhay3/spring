package service;

import dao.IUserDao;
import dto.User;

import java.util.List;

public class UserDaoServiceImpl implements IUserDaoService {
    private IUserDao userDao;
    @Override
    public void queryAll() {
        List<User> users = userDao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
