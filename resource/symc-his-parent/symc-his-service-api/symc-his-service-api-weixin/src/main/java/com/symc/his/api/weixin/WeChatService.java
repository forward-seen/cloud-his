package com.symc.his.api.weixin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 微信服务接口
 * @CreateTime: 2023/2/22 15:11
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
public interface WeChatService {

    @GetMapping("/getWeChat")
    String getWeChat(@RequestParam("a")Integer a);
}