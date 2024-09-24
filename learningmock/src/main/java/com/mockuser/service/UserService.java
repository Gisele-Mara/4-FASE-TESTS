package com.mockuser.service;

import com.mockuser.entities.User;
import com.mockuser.repository.UserRepository;

public class UserService {

    UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUserService(User user) {
        
        if (userRepository.findByName(user.getName())) {
            return "User already exists.";
        }
        userRepository.addUser(user);
        return "User added successfully.";
    }
    // public static boolean change(User b, String c) {
    //     User a = userRepository.changeUserName(b, c);
    //     System.out.println(a.getName());
    //     return true;
    // }



}
