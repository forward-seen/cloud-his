package com.symc.his.api.utils;

import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * token工具
 * @author Forward
 */
@Component
public class TokenUtils {
    @Resource
    private RedisUtil redisUtil;

    public String createToken(String value) {
        String token = UUID.randomUUID().toString().replace("-", "");
        redisUtil.setString(token, value);
        return token;
    }

    public String getTokenValue(String token) {
        return redisUtil.getString(token);
    }
}