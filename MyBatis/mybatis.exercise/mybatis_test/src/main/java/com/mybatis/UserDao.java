package com.mybatis;



import com.mybatis.dao.entity.User;
import com.mybatis.util.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/1/14 13:50
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class UserDao {

    private SqlSession sqlSession = null;

//    public void init() throws IOException {
//        InputStream inputStream = Resources.getResourceAsStream("MyBatis-Config.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        sqlSession = sqlSessionFactory.openSession();
//    }

    public int addUserByEntity(User user){
        sqlSession = MySqlSessionFactory.getSqlSession();
        int rowCount = sqlSession.insert("com.mybatis.dao.UserDao.addUserByEntity",user);
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }

    public int addUserByMap(Map mapParameter){
        sqlSession = MySqlSessionFactory.getSqlSession();
        int rowCount = sqlSession.insert("com.mybatis.dao.UserDao.addUserByMap",mapParameter);
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }

    public int addUserDynamic(User user){
        sqlSession = MySqlSessionFactory.getSqlSession();
        int rowCount = sqlSession.insert("com.mybatis.dao.UserDao.addUserDynamic",user);
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }

    public int addUserByList(List userlist){
        sqlSession = MySqlSessionFactory.getSqlSession();
        int rowCount = sqlSession.insert("com.mybatis.dao.UserDao.addUserByList",userlist);
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }

    public int deleteUserByID(int id){
        sqlSession = MySqlSessionFactory.getSqlSession();
        int rowCount = sqlSession.delete("com.mybatis.dao.UserDao.deleteUserByID",id);
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }

    public int updateUserByEntity(User user){
        sqlSession = MySqlSessionFactory.getSqlSession();
        int rowCount = sqlSession.update("com.mybatis.dao.UserDao.updateUserByEntity",user);
        sqlSession.commit();
        sqlSession.close();
        return rowCount;
    }

    public User queryUserByID(int id){
        sqlSession = MySqlSessionFactory.getSqlSession();
        User user = sqlSession.selectOne("com.mybatis.dao.UserDao.queryUserByID",id);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }
}
