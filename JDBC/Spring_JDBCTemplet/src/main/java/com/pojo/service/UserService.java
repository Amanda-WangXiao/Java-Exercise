package com.pojo.service;

import com.pojo.dao.User;

import java.util.List;

public interface UserService {
    public void insert(User user);
    public void delete(int id);
    public void update(User user);

    public User findOne(int id);
    public List<User> findAll();
    public int Count();
}
