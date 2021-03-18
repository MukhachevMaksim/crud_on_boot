package com.example.crud_on_boot.service;

import com.example.crud_on_boot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> listUsers();
    void update(long id, User user);
}
