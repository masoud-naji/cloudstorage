package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String rootView() {
        return "login";
    }

    @GetMapping("/login")
    public String loginView() {
        return "login";
    }


}
