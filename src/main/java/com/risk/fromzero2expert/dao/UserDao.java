package com.risk.fromzero2expert.dao;

import com.risk.fromzero2expert.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import javax.annotation.processing.Generated;

/**
 * 使用注解配置dao
 */
@Mapper
public interface UserDao {

    // 注册需要的就是增加的功能
    // 加一个查询的api测试
    @Insert("insert into `user` (username, password) values (#{username}, md5(#{password}))")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int save(User user);

    @Select("select * from `user` where id = #{id}")
    User selectById (int id);

    // 任务六的新业务： 通过 username 来查询
    @Select("select * from `user` where username = #{username}")
    User selectByUsername(String username);
}
