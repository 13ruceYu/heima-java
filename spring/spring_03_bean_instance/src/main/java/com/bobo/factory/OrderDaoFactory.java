package com.bobo.factory;

import com.bobo.dao.OrderDao;
import com.bobo.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
