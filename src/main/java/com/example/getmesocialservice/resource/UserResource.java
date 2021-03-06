package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser() {

       return userService.getUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
         return userService.saveUser(user);
    }


    @GetMapping("/allUsers")
    public List<User> getAllUser() {

        return userService.getAllUser();
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userId){

        return userService.getUserById(userId);
    }


    @PutMapping("/user1/{userId}")
    public User updateUser(@PathVariable("userId") int userId,@RequestBody User user){

        return userService.updateUserById(userId,user);
    }


    @DeleteMapping("/user2")
    public User deleteUser(@RequestParam(name = "userId") int userId){

        return userService.deleteUser(userId);
    }





}
