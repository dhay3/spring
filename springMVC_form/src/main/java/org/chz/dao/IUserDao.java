package org.chz.dao;

import org.chz.dto.User;

import java.util.List;

public interface IUserDao {
    List<User> queryAll();
}
