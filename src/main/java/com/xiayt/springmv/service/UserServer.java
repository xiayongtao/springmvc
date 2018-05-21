package com.xiayt.springmv.service;

/*用户业务*/

import com.xiayt.springmv.dao.IUserDAO;
import com.xiayt.springmv.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServer {

    @Resource(name="mysqlUserDAO")
    IUserDAO userdao;

    public List<User> queryUsers(){
        return userdao.getUsers();
    }

    public User queryUser(int Id){
        return  userdao.getUser(Id);
    }

    public boolean rmUser(int Id){
        return userdao.delete(Id);
    }

    public boolean addUser(User user){
        return userdao.add(user);
    }

    public boolean upUser(User user){
        return  userdao.update(user);
    }
}
