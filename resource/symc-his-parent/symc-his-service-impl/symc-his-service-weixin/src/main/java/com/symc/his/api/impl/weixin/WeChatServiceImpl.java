package com.symc.his.api.impl.weixin;

import com.symc.his.api.weixin.WeChatService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2023/2/22 15:19
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@RestController
public class WeChatServiceImpl implements WeChatService {
    @Override public String getWeChat(Integer a) {
        return "WeChat: a = " + a;
    }
}