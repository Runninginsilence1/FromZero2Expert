package com.risk.fromzero2expert.service;

import com.risk.fromzero2expert.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    // 增加并返回试试
    User getById (int id);

    // 更新
    public boolean save(User user);

    // 这里试试直接写一个 注册的方法，不知道 主键可不可绑定上去
    // 增加并返回
    User register(User user);
}
