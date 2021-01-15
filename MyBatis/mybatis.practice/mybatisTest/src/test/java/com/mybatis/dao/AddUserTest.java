package com.mybatis.dao;

import java.io.IOException;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/1/15 13:52
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class AddUserTest {
    public UserDao userDao = null;

    @org.junit.Test
    public void addusertest() throws IOException {
        userDao = new UserDao();
        userDao.init();
        int rowcount = userDao.addUser();
        System.out.println(rowcount);
    }
}
