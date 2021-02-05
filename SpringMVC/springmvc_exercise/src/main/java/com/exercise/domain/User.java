package com.exercise.domain;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/2/3 16:10
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class User {
    private String password;
    private int age;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                "password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
