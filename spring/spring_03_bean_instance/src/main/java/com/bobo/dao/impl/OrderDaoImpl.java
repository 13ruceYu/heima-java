package com.bobo.dao.impl;

import com.bobo.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao saving...");
    }
}
