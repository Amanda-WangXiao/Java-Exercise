package com.exercise.controller;

import com.exercise.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/2/2 16:22
 * @GitHub: https://github.com/Amanda-WangXiao
 */
@Controller
@RequestMapping(path = "/params")
public class ParamController {
    @RequestMapping(path = "/test1")
    public String testParam(){
        System.out.println("Start Params Test");
        return "success";
    }

    @RequestMapping(path = "saveAccount")
    public String  saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
}
