package com.mitix.mybatis.spring.service;

import com.mitix.mybatis.spring.model.User;

/**
 * @author oldflame-jm
 * @create 2018/2/18
 * ${DESCRIPTION}
 */
public interface IUserService {
    public User queryById(Integer id);
}
