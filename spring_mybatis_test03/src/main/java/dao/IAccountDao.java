package dao;

import dto.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> queryAll();
}
