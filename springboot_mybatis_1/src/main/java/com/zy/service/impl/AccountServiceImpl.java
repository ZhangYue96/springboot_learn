package com.zy.service.impl;

import com.zy.mappers.AccountDao;
import com.zy.pojo.Account;
import com.zy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.selectAll();
    }
}
