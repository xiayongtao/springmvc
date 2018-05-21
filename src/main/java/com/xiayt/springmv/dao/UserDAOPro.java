package com.xiayt.springmv.dao;


import com.xiayt.springmv.entity.User;
import org.springframework.stereotype.Repository;
import utils.JDBCUtil;

import java.util.List;

@Repository("mysqlUserDAO")
public class UserDAOPro implements IUserDAO {

    public List<User> getUsers() {

        List<User> ures = JDBCUtil.queryForList("select id,name,birthday,address,phone from user", User.class);
        System.out.println(ures);
        return ures;
    }

    public User getUser(int Id) {
        return JDBCUtil.queryForObject("select id,name,birthday,address,phone from user where id=?", User.class, Id);
    }

    public boolean add(User user) {
        return JDBCUtil.update("insert into user(name,birthday,address,phone) values(?,?,?,?)", user.getName(), user.getBirthday(), user.getAddress(), user.getPhone()) > 0;
    }

    public boolean delete(int Id) {
        return JDBCUtil.update("delete from user where id=?", Id) > 0;
    }

    public boolean update(User user) {
        return JDBCUtil.update("update user set name=?,birthday=?,address=?,phone=? where id=?", user.getName(), user.getBirthday(), user.getAddress(), user.getPhone(), user.getId()) > 0;
    }
}
