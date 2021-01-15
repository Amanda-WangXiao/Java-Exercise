package com.mybatis.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/1/14 13:50
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class UserDao {

    private SqlSession sqlSession = null;

    public void init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("MyBatis-Config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        sqlSession = sqlSessionFactory.openSession();
    }

    public int addUser(){
        int rowCount = sqlSession.insert("com.mybatis.dao.UserDao.addUser");
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }
}
