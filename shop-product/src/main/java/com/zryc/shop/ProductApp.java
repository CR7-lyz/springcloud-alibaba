package com.zryc.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zryc.shop.dao")
public class ProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class);
    }
}
