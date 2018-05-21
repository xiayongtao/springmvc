package com.xiayt.springmv.dao;

import com.xiayt.springmv.entity.User;

import java.util.List;

public interface IUserDAO {
    List<User> getUsers();

    User getUser(int Id);

    boolean add(User user);

    boolean delete(int Id);

    boolean update(User user);
}
