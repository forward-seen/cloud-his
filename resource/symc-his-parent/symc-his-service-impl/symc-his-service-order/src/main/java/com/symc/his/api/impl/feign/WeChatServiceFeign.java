package com.symc.his.api.impl.feign;

import com.symc.his.api.weixin.WeChatService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description: 微信服务接口Feign
 * @CreateTime: 2023/2/22 15:41
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@FeignClient("his-weixin")
public interface WeChatServiceFeign extends WeChatService {
}