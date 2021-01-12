package com.pojo.dao;

import java.util.List;

public interface UserDao {
    public void insert(User user);
    public void delete(int id);
    public void update(User user);

    public User findOne(int id);
    public List<User> findAll();
    public int Count();
}
