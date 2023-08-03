package dao;

import dto.User;

import java.util.List;

public interface IUserDao {
    List<User> queryAll();
}
