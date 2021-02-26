package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/AccountService")
public class AccountController {

      @Autowired
      private AccountService accountService;
//    public List<Account> findAll(){
//        System.out.println("findAll");
//        return null;
//    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println(" ---MVC--- findAll");
        List<Account> accountList = accountService.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        model.addAttribute("accountList",accountList);
        return "findAll";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account){
        System.out.println(" ---MVC--- saveAccount");
        accountService.saveAccount(account);
        System.out.println(" ---MVC--- Save Successfully");
    }
}
