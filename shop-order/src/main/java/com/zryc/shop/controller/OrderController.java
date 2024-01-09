package com.zryc.shop.controller;

import com.zryc.shop.pojo.Order;
import com.zryc.shop.pojo.Product;
import com.zryc.shop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/{oid}")
    public Order getOrderById(@PathVariable Integer oid) {
        return orderService.getById(oid);
    }
}
