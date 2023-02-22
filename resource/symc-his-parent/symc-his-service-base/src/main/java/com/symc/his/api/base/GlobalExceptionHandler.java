package com.symc.his.api.base;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 全局捕获异常
 * @CreateTime: 2023/2/22 21:11
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@ControllerAdvice(basePackages = "com.symc.his.api.impl")
public class GlobalExceptionHandler {

   @ExceptionHandler(RuntimeException.class)
   @ResponseBody
   public Map<String, Object> errorResult() {
      Map<String, Object> errorResultMap = new HashMap<String, Object>();
      errorResultMap.put("code", "500");
      errorResultMap.put("msg", "系统出现错误!");
      return errorResultMap;
   }
}