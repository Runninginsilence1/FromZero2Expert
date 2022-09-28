package com.risk.fromzero2expert;

import com.risk.fromzero2expert.domain.User;
import com.risk.fromzero2expert.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FromZero2ExpertApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        // 看看主键有没有问题
        User user = new User();
        user.setUsername("fourth");
        user.setPassword("shock");
        userService.register(user);
    }

    @Test
    void userControllerTest() {
        
    }

}
