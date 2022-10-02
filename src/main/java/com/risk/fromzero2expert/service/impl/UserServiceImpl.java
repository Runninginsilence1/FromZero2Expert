package com.risk.fromzero2expert.service.impl;

import com.risk.fromzero2expert.dao.UserDao;
import com.risk.fromzero2expert.domain.User;
import com.risk.fromzero2expert.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : [47140]
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return userDao.selectById(id);
    }

    @Override
    public boolean save(User user) {
        return userDao.save(user) > 0;
    }

    @Override
    public User register(User user) {
        if (userDao.save(user) > 0) {
            System.out.println("register 方法里面接受的新用户参数 ->" + user);
            return user;
        }
        return null;
    }

    /**
     * 先考虑在业务层判断这个 异步提交吧
     * @param username 前端传递来的用户名
     * @return 查不到说明唯一，true
     */
    public boolean isUsernameUnique (String username) {
        return userDao.selectByUsername(username) == null;
    }
}
