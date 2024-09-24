package com.mockuser.repository;

import com.mockuser.entities.User;

public interface UserRepository {
    void addUser(User user);
    User changeUserName(User u,  String name);
    boolean findByName (String name);

}
