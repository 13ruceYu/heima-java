package com.bobo.dao.impl;

import com.bobo.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public Boolean readResources(String url, String password) {
        return password.equals("root");
    }
}
