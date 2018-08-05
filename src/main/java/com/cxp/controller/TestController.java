package com.cxp.controller;

import com.alibaba.fastjson.JSONObject;
import com.cxp.pojo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getOrderByid(Integer id, String name, Double price) {
		Order order = new Order(id, "test", name, price);
		System.out.println(order);
		return JSONObject.toJSONString(order);
	}

	@RequestMapping(value = "/testOrder_anno")
	@ResponseBody
	public String getOrderObject_Anno(@RequestBody Order order) {
		System.out.println(order);
		return JSONObject.toJSONString(order);
	}
	
	@RequestMapping(value = "/testOrder_noAnno")
	@ResponseBody
	public String getOrderObject(Order order) {
		System.out.println(order);
		return JSONObject.toJSONString(order);
	}
}
