package com.bobo.service;


import com.bobo.domain.Account;

public interface AccountService {
    public void save();

    Account findById(Integer id);
}
