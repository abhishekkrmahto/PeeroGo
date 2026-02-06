package com.saraai.peergo.controller;

import com.saraai.peergo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User>users = new ArrayList<>();

        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Abhisek");
        user1.setLastName("Mahto");
        user1.setEmail("avishek@gmail.com");
        user1.setPassword("Abhishek@2025");

        User user2 = new User();
        user2.setId(2);
        user2.setFirstName("Abhisek");
        user2.setLastName("Mahto");
        user2.setEmail("avishek@gmail.com");
        user2.setPassword("Abhishek@2025");

        users.add(user1);
        users.add(user2);

        return users;
    }



    @GetMapping("/users/{userId}")
    public User getUsersById(@PathVariable("userId")Integer id){
        List<User>users = new ArrayList<>();

        User user1 = new User();
        user1.setId(id);
        user1.setFirstName("Abhisek");
        user1.setLastName("Mahto");
        user1.setEmail("avishek@gmail.com");
        user1.setPassword("Abhishek@2025");

        return user1;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        User newUser = new User();
        newUser.setId(user.getId());
        newUser.setPassword((user.getPassword()));
        newUser.setEmail(user.getEmail());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        return  newUser;
    }



    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setId(12);
        newUser.setFirstName("Abhishek");
        newUser.setLastName("Mahto");
        newUser.setEmail("avishek12@gmail.com");
        newUser.setPassword("My password");
        if (user.getFirstName() != null) {
            newUser.setFirstName(user.getFirstName());
        }
        if (user.getLastName() != null) {
            newUser.setLastName(user.getLastName());
        }
        if (user.getEmail() != null) {
            newUser.setEmail(user.getEmail());
        }
        if (user.getPassword() != null) {
            newUser.setPassword(user.getPassword());
        }
        return newUser;
    }


    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        return "user id "+id+" deleted successfully";
    }
}
