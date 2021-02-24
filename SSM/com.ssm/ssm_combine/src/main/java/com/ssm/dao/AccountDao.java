package com.ssm.dao;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
