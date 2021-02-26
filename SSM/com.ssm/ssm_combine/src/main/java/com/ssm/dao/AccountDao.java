package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from test.user")
    public List<Account> findAll();

    @Insert("insert into test.user values(#{id},#{username},#{age})")
    public void saveAccount(Account account);
}
