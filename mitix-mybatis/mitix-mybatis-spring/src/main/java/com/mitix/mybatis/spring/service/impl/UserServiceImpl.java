package com.mitix.mybatis.spring.service.impl;

import com.mitix.mybatis.spring.mapper.UserMapper;
import com.mitix.mybatis.spring.model.User;
import com.mitix.mybatis.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author oldflame-jm
 * @create 2018/2/18
 * ${DESCRIPTION}
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        User user = userMapper.queryById(id);
        System.out.println(user.getCreatetime());
        return user;
    }
}
