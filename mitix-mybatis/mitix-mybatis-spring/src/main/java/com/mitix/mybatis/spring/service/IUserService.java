package com.mitix.mybatis.spring.service;

import com.mitix.mybatis.spring.model.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author oldflame-jm
 * @create 2018/2/18
 * ${DESCRIPTION}
 */

public interface IUserService {
    public User queryById(Integer id);
}
