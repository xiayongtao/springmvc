package com.xiayt.springmv.controller;

import com.xiayt.springmv.entity.User;
import com.xiayt.springmv.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utils.AjaxState;

import java.util.List;

@RestController
@RequestMapping(path = "/emps")
public class EmpController extends BaseController {

    @Autowired
    UserServer userServer;
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<User> getEmps(){
        return userServer.queryUsers();
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public User getEmp(@PathVariable int id){
        return userServer.queryUser(id);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public boolean addEmp(@RequestBody User user){
        return userServer.addUser(user);
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    public boolean updateEmp(@RequestBody User user){
        return userServer.upUser(user);
    }

    @RequestMapping(path = "", method = RequestMethod.PATCH)
    public boolean patchEmp(@RequestBody User user){
        return userServer.upUser(user);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public AjaxState rmEmp(@PathVariable int id){

        Boolean rest= userServer.rmUser(id);
        return new AjaxState(rest?"success":"error",id,rest?"删除成功":"删除失败");
    }
}
