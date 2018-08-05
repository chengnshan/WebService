package com.cxp.webservice;

import com.cxp.pojo.Order;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderWS {
    @WebMethod
    public Order OrderWS(int id);
}
