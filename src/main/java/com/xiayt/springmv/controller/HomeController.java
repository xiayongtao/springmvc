package com.xiayt.springmv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/home")

public class HomeController {
    @RequestMapping(path = "/index")
     public String index(Model model){

        model.addAttribute("message","Hello SpringMVC");
        return "index";
     }
}
