package com.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/1/19 14:37
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class MySqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("MyBatis-Config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
