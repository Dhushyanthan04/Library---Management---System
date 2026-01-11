package com.library.library.service;

import com.library.library.model.User;
import com.library.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService
{
    @Autowired
    private UserRepository userRepo;
//--------------------------------------------------------------------------------
    public List<User> getUsers()
    {
        return userRepo.findAll();
    }
//---------------------------------------------------------------------------------
    public void addUser(User user)
    {
        userRepo.save(user);
    }
//-----------------------------------------------------------------------------------
    public void deleteAllUsers()
    {
        userRepo.deleteAll();

    }
}
