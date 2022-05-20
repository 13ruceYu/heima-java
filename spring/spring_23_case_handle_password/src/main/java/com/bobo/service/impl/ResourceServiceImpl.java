package com.bobo.service.impl;

import com.bobo.dao.ResourceDao;
import com.bobo.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourceDao.readResources(url, password);
    }
}
