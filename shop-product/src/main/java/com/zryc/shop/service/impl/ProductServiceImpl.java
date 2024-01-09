package com.zryc.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zryc.shop.dao.ProductMapper;
import com.zryc.shop.service.IProductService;
import com.zryc.shop.pojo.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
