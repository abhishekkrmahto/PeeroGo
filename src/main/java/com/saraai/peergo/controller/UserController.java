package com.saraai.peergo.controller;

import com.saraai.peergo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User>users = new ArrayList<>();

        User user1 = new User();
        user1.setFirstName("Abhisek");
        user1.setLastName("Mahto");
        user1.setEmail("avishek@gmail.com");
        user1.setPassword("Abhishek@2025");

        User user2 = new User();
        user2.setFirstName("Abhisek");
        user2.setLastName("Mahto");
        user2.setEmail("avishek@gmail.com");
        user2.setPassword("Abhishek@2025");

        users.add(user1);
        users.add(user2);

        return users;
    }
}
