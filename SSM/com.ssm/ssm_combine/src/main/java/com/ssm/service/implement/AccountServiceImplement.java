package com.ssm.service.implement;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("AccountService")
public class AccountServiceImplement implements AccountService {
    public List<Account> findAll(){
        System.out.println("findAll");
        return null;
    }

    public void saveAccount(Account account){
        System.out.println("saveAccount");
    }
}
