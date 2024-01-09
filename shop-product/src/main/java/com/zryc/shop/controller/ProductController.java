package com.zryc.shop.controller;

import com.zryc.shop.pojo.Product;
import com.zryc.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    /**
     * 查询所有商品
     * */
    @GetMapping("/list")
    public List<Product> list(){
        return productService.list();
    }

    /**
     * 根据id查询商品
     * */
    @GetMapping("/{pid}")
    public Product detail(@PathVariable Integer pid){
        return productService.getById(pid);
    }
}
