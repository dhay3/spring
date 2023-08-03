package dao;

import dto.User;

//@Repository
public class UserDaoImpl implements IUserDao {
    @Override
    public void addUser(User u) {
        System.out.println(u);
    }

    @Override
    public void queryUser(User u) {

    }
}
