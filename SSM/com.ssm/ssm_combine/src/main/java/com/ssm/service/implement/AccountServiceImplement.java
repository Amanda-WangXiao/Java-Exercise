package com.ssm.service.implement;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("AccountService")
public class AccountServiceImplement implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll(){
        System.out.println(" ---Spring--- findAll");
        return accountDao.findAll();
    }

    public void saveAccount(Account account){
        System.out.println(" ---Spring--- saveAccount");
        accountDao.saveAccount(account);
        System.out.println(" ---Spring--- Save Successfully");
        
    }
}
