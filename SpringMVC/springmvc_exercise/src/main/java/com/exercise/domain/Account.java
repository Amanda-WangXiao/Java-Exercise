package com.exercise.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/2/3 10:36
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class Account implements Serializable {
    private String username;
    private double money;
    private User user;
    private Date date;
    private List<User> userList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", user=" + user +
                ", date=" + date +
                ", userList=" + userList +
                '}';
    }
}
