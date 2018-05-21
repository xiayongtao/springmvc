package com.xiayt.springmv.dao;

import com.xiayt.springmv.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 用户数据访问
 */
@Repository
public class UserDAO implements IUserDAO {
    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "test1", new Date(),"test1", "46464646"));
        users.add(new User(2, "test2", new Date(),"test2", "46464646"));
        users.add(new User(3, "test3", new Date(),"test3", "46464646"));
        users.add(new User(4, "test4", new Date(),"test4", "46464646"));
        users.add(new User(5, "test5", new Date(),"test5", "46464646"));
    }

    public List<User> getUsers() {
        System.out.println(users);
        return users;
    }

    public User getUser(int Id) {
        for (User user : users) {
            if (user.getId() == Id) {
                return user;
            }
        }
        return null;
    }

    public boolean add(User user) {
        if (user.getId() <= 0) {
            User lastUser = getUser(users.size());
            System.out.println("id:" + lastUser.getName());
            user.setId(lastUser.getId() + 1);
        }



        users.add(user);
        return true;
    }

    public boolean delete(int Id) {
        users.remove(getUser(Id));
        return true;
    }

    public boolean update(User user) {
        User oldUser = getUser(user.getId());
        oldUser.setName(user.getName());
        oldUser.setPhone(user.getPhone());
        oldUser.setAddress(user.getAddress());
        return true;
    }

}
