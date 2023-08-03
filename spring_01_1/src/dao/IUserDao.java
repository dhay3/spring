package dao;

import dto.User;

public interface IUserDao {
    void addUser(User u);
    void queryUser(User u);
}
