package com.bobo.service.impl;

import com.bobo.dao.AccountDao;
import com.bobo.domain.Account;
import com.bobo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
