package com.cxp.webservice.impl;

import com.cxp.pojo.Order;
import com.cxp.webservice.OrderWS;

import javax.jws.WebService;

@WebService
public class OrderWSImpl implements OrderWS {
    @Override
    public Order OrderWS(int id) {
        System.out.println("server getOrderById()" + id);
        return new Order(id, "001", "飞机", 1000000);
    }
}
