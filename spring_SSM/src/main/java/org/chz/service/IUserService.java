package org.chz.service;

import org.chz.dto.User;

import java.util.List;

public interface IUserService {
    List<User> queryAll();
    User queryByName(User u);
}
