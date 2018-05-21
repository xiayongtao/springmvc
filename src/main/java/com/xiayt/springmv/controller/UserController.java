package com.xiayt.springmv.controller;

import com.xiayt.springmv.entity.User;
import com.xiayt.springmv.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import utils.JsonUtil;

@Controller
@RequestMapping(path = "/user")

public class UserController {

    @Autowired
    UserServer userServer;

    @RequestMapping(path = "/user")
    public String index(Model model) {

        model.addAttribute("list", userServer.queryUsers());
        return "user/user";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        userServer.rmUser(id);
        return "redirect:/user/user";
    }

    @RequestMapping("/add")
    public String add() {
        return "user/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user) {
        userServer.addUser(user);
        return "redirect:/user/user";
    }

    @RequestMapping(value = "/users")
    public ModelAndView users() {

        ModelAndView view = new ModelAndView(new MappingJackson2JsonView());
        view.addObject(userServer.queryUsers());
        return view;
    }

    @RequestMapping(value = "/usersJson",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String usersJson() {
        return JsonUtil.getJson(userServer.queryUsers());
    }
}
