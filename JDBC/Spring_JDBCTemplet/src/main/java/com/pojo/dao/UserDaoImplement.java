package com.pojo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImplement implements UserDao {
    @Autowired

    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(User user) {
        String sql = "insert into user(id,name,age) values(?,?,?)";
        jdbcTemplate.update(sql,user.getId(),user.getName(),user.getAge());
        System.out.println("-----Insert Done-----");
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql,id);
        System.out.println("-----Delete Done-----");
    }

    @Override
    public void update(User user) {
        String sql = "update test.user set age=? where id=?";
        jdbcTemplate.update(sql,user.getAge(),user.getId());
        System.out.println("-----Update Done-----");
    }

    @Override
    public User findOne(int id) {
        String sql = "select * from user where id=?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
        System.out.println("-----FindOne Done-----");
        return user;
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> userList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));
        System.out.println("-----FindAll Done-----");
        return userList;
    }

    @Override
    public int Count() {
        String sql = "select count(*) from user";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println("-----Count Done-----");
        return count;
    }


}
