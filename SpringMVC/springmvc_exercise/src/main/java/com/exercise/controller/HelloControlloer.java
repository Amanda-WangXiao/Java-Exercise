package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/2/2 10:46
 * @GitHub: https://github.com/Amanda-WangXiao
 */
@Controller
public class HelloControlloer {
    @RequestMapping(path = "/printhello")
    public String printHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
