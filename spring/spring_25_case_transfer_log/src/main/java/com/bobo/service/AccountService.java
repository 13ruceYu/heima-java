package com.bobo.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String in, String out, Double money) throws IOException;
}
