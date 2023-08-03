package dao;

import dto.User;

import java.util.List;
//dao层不用注入到spring
public interface IUserDao {
    List<User> queryAll();
}
