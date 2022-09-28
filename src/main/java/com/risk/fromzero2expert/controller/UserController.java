package com.risk.fromzero2expert.controller;

import com.risk.fromzero2expert.domain.User;
import com.risk.fromzero2expert.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author : [47140]
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User register(User user){
        return userService.register(user);
    }

}
