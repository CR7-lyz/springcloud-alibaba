package com.zryc.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zryc.shop.dao.OrderMapper;
import com.zryc.shop.pojo.Order;
import com.zryc.shop.service.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
