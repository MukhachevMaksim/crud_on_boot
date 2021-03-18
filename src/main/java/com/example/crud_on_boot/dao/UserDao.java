package com.example.crud_on_boot.dao;

import com.example.crud_on_boot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> listUsers();
    void update(long id, User user);
}
