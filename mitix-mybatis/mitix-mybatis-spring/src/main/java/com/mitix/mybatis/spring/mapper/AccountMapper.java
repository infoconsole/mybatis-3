package com.mitix.mybatis.spring.mapper;

import com.mitix.mybatis.spring.model.Account;

import java.util.List;

/**
 * @author oldflame-jm
 * @create 2018/9/1
 * ${DESCRIPTION}
 */
public interface AccountMapper {
    public List<Account> queryCut(Integer cut);
}
