package com.symc.his.api.impl.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description: User实体类
 * @CreateTime: 2023/2/22 15:32
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@Data
@TableName("test_user")
public class UserDO {
    @TableId
    private Integer userId;
    private String userName;
    private String userPwd;
    private Integer userAge;
    private String userAddres;
    private Integer userIntegral;
}