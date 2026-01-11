package com.library.library.controller;

import com.library.library.model.User;
import com.library.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;
//----------------------------------------------------------------------------
    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return userService.getUsers();
    }
//--------------------------------------------------------------------------
    @PostMapping("/users")
    public String addUser (@RequestBody User user) {
        userService.addUser(user);
        return "User added Suceesfully..!!";
    }
//---------------------------------------------------------------------------------------
    @DeleteMapping("/users/clear")
    public String deleteAllUsers()
    {
        userService.deleteAllUsers();
        return "all users cleard...:)";
    }
}
