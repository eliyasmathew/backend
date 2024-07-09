package com.coke.masterdata.service;

import com.coke.masterdata.model.User;
import org.springframework.stereotype.Service;

@Service
public class MasterdataService {
    public User getData() {
        User user = new User();
        user.setName("John Doe");
        user.setUsername("johndoe");
        user.setEmail("johndoe222@mail.com");
        return user;
    }
}
