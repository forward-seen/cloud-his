package com.symc.his.api.order;

import com.symc.api.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @CreateTime: 2023/2/22 15:32
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
public interface OrderService {

    @GetMapping("/orderToWeChat")
    String orderToWeChat(@RequestParam("a") Integer a);

    @GetMapping("/orderToWeChatJson")
    BaseResponse<String> orderToWeChatJson(@RequestParam("a") Integer a);
}