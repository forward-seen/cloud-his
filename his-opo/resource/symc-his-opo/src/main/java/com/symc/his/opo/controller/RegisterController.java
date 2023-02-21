package com.symc.his.opo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2023/2/18 23:20
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    @GetMapping("/test")
    public String testApp(){
        return "测试OPO模块响应";
    }
}