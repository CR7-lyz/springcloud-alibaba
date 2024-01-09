package com.zryc.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zryc.shop.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
