package com.ssm.controller;

import com.ssm.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/AccountService")
public class AccountController {

    @RequestMapping("/findAll")
    public List<Account> findAll(){
        System.out.println("findAll");
        return null;
    }

//    public void saveAccount(Account account){
//        System.out.println("saveAccount");
//    }
}
