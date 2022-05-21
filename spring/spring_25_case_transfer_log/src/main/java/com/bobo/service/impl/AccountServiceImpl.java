package com.bobo.service.impl;

import com.bobo.dao.AccountDao;
import com.bobo.dao.LogDao;
import com.bobo.service.AccountService;
import com.bobo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String in, String out, Double money) throws IOException {
        try {
            accountDao.inMoney(in, money);
            int i = 1/0;
            accountDao.outMoney(out, money);
        } finally {
            logService.log(in, out, money); // 保证其一定运行
        }
    }
}
