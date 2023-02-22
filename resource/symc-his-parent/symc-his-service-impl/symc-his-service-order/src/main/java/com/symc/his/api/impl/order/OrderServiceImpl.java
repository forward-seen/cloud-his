package com.symc.his.api.impl.order;

import com.symc.his.api.impl.feign.WeChatServiceFeign;
import com.symc.his.api.order.OrderService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2023/2/22 15:38
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@RestController
public class OrderServiceImpl implements OrderService {

    @Resource
    private WeChatServiceFeign weChatServiceFeign;

    @Override public String orderToWeChat(Integer a) {
        //feign远程调用微信接口
        return weChatServiceFeign.getWeChat(a);
    }
}