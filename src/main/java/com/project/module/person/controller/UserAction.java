package com.project.module.person.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserAction {
    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        System.out.println("test");
        return "/jsp/a";
    }
}