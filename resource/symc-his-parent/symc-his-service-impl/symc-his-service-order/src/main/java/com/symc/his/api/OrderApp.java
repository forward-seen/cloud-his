package com.symc.his.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 订单服务启动类
 * 要保证扫包扫到feign包下@EnableFeignClients
 * @CreateTime: 2023/2/22 15:50
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.symc.his.api.impl.mapper")
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class);
    }
}