package com.symc.his.api.order.dto.resp;

import lombok.Data;

/**
 * @Description: 数据传输对象 响应包
 * @CreateTime: 2023/2/23 14:50
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@Data
public class UserRespDTO {
    private String userName;
    private Integer userAge;
    private String userAddres;
    private Integer userIntegral;
}