package com.example.leave.request.Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;
    //create user
    @PostMapping("/create/{id}")
    public User createUser(@PathVariable Long id)
    {
       return service.createUser(id);
    }

    //create manager
    @PostMapping("manager/create/{id}")
    public User createManager(@PathVariable Long id)
    {
        return service.createManager(id);
    }
   //get user by id
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id)
    {
       return service.getUserById(id);
    }
   //get manager by id
    @GetMapping("/manager/{id}")
    public User getManager(@PathVariable Long id)
    {
       return service.getManagerById(id);
    }
    //remove user
    @DeleteMapping("/{id}")
    public String removeManager(@PathVariable Long id)
    {
       service.removeUser(id);
       return "User deactivated";
    }
}
