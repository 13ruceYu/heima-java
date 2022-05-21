package com.bobo.service.impl;

import com.bobo.dao.AccountDao;
import com.bobo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i = 1/0;
        accountDao.inMoney(in, money);
    }
}
