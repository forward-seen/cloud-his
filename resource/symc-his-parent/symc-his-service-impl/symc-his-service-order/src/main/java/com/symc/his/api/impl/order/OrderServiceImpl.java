package com.symc.his.api.impl.order;

import com.symc.his.api.base.BaseApiService;
import com.symc.his.api.base.BaseResponse;
import com.symc.his.api.impl.entity.UserDO;
import com.symc.his.api.impl.feign.WeChatServiceFeign;
import com.symc.his.api.impl.mapper.UserMapper;
import com.symc.his.api.order.OrderService;
import com.symc.his.api.order.dto.req.UserReqDTO;
import com.symc.his.api.order.dto.resp.UserRespDTO;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2023/2/22 15:38
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@RestController
public class OrderServiceImpl extends BaseApiService implements OrderService {

    @Resource
    private WeChatServiceFeign weChatServiceFeign;

    @Resource
    private UserMapper userMapper;

    @Value("${symc.app-name}")
    private String appName ;

    @Override public String orderToWeChat(Integer a) {
        //feign远程调用微信接口
        return weChatServiceFeign.getWeChat(a);
    }

    @Override public BaseResponse<String> orderToWeChatJson(Integer a) {
        return setResultSuccess(weChatServiceFeign.getWeChat(a));
    }

    @Override public BaseResponse<String> orderToWeChatException(Integer a) {
        int b = 1 / 0;
        return setResultSuccess(weChatServiceFeign.getWeChat(a));
    }

    @Override public BaseResponse<UserRespDTO> updateUserDTO(UserReqDTO userReqDTO) {
//        1. 验证参数
//        2.userReqDto
//        3.userReqDto属性赋值userDo
//        4.查询db数据
//        5.userDo转userDto
        UserDO user = DTO2DO(userReqDTO, UserDO.class);
        int i = userMapper.updateById(user);
        if (i <= 0) {
            return setResultError("修改失败！");
        }
        Integer userId = user.getUserId();
        UserDO getUserDO = userMapper.selectById(userId);
        if (getUserDO == null) {
            return setResultError("查询数据为空");
        }
        UserRespDTO userRespDTO = DO2DTO(getUserDO, UserRespDTO.class);
        return setResultSuccess(userRespDTO);
    }

    @Override public String getTestConfig() {
        return appName;
    }
}