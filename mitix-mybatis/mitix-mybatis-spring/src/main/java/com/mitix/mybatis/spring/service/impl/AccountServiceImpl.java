package com.mitix.mybatis.spring.service.impl;

import com.mitix.mybatis.spring.mapper.AccountMapper;
import com.mitix.mybatis.spring.model.Account;
import com.mitix.mybatis.spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oldflame-jm
 * @create 2018/9/1
 * ${DESCRIPTION}
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper mapper;

    @Override
    public void queryCut() {
        List<Account> accounts = mapper.queryCut(0);
        for (Account account : accounts) {
            System.out.println(account.getCut());
        }
    }
}
