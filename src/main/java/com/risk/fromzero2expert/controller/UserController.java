package com.risk.fromzero2expert.controller;

import com.risk.fromzero2expert.domain.User;
import com.risk.fromzero2expert.service.UserService;
import com.risk.fromzero2expert.util.UtilClass;
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

    // 先用get模拟一下异步提交，看看可不可以实现
    // rest的话应该就是路径里面包含数据
    @GetMapping("/axios")
    public String axiosTest1(@RequestParam String username){
        // 为了实现简单所以在后台完成字符串的拼接
        if (!userService.isUsernameUnique(username)) {
            return "Username is not Unique, please change another Username.";
        }

        if (UtilClass.isSensitive(username)) {
            return "不要命了是吧😅";
        }
        return "";
    }
}
