package com.mybatis.dao.entity;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/1/14 13:47
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class User {
    private int id;
    private String username;
    private int age;

    public User() {
    }

    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
