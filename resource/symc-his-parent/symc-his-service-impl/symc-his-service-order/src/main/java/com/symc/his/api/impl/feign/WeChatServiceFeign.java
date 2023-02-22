package com.symc.his.api.impl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 微信服务接口Feign
 * @CreateTime: 2023/2/22 15:41
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@FeignClient("his-weixin")
public interface WeChatServiceFeign {

    @GetMapping("/getWeChat")
    String getWeChat(@RequestParam("a")Integer a);
}