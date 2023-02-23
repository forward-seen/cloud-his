package com.symc.his.api.order;

import com.symc.his.api.base.BaseResponse;
import com.symc.his.api.order.dto.req.UserReqDTO;
import com.symc.his.api.order.dto.resp.UserRespDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @CreateTime: 2023/2/22 15:32
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
public interface OrderService {

    /**
     * 测试demo
     * @param a
     * @return
     */
    @GetMapping("/orderToWeChat")
    String orderToWeChat(@RequestParam("a") Integer a);

    /**
     * JSON测试
     * @param a
     * @return
     */
    @GetMapping("/orderToWeChatJson")
    BaseResponse<String> orderToWeChatJson(@RequestParam("a") Integer a);

    /**
     * 全局异常拦截测试
     * @param a
     * @return
     */
    @GetMapping("/orderToWeChatException")
    BaseResponse<String> orderToWeChatException(@RequestParam("a") Integer a);

    /**
     * DTO response测试
     * @param userReqDTO
     * @return
     */
    @PostMapping("/updateUser")
    BaseResponse<UserRespDTO> updateUserDTO(@RequestBody UserReqDTO userReqDTO);

    /**
     * 测试nacos config
     * @return
     */
    @RequestMapping("/getTestConfig")
    String getTestConfig();
}