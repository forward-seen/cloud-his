package com.symc.his.api.base;

import com.symc.his.api.constants.HttpConstants;
import lombok.Data;

/**
 * @Description: 微服务接口实现该接口可以使用传递参数可以直接封装统一返回结果集
 * @CreateTime: 2023/2/22 21:26
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
@Data
public class BaseApiService<T> {

    public BaseResponse<T> setResultError(Integer code, String msg) {
        return setResult(code, msg, null);
    }

    /**
     * 返回错误，可以传msg
     *
     * @param msg
     * @return
     */
    public BaseResponse<T> setResultError(String msg) {
        return setResult(HttpConstants.RES_CODE_500, msg, null);
    }

    /**
     * 返回失败，没有data值
     *
     * @return
     */
    public BaseResponse<T> setResultError() {
        return setResult(HttpConstants.RES_CODE_500, HttpConstants.RES_CODE_500_VALUE, null);
    }

    /***
     * 返回成功，可以传data值
     * @param data
     * @return
     */
    public BaseResponse<T> setResultSuccess(T data) {
        return setResult(HttpConstants.RES_CODE_200, HttpConstants.RES_CODE_200_VALUE, data);
    }

    /**
     * 返回成功，没有data值
     *
     * @return
     */
    public BaseResponse<T> setResultSuccess() {
        return setResult(HttpConstants.RES_CODE_200, HttpConstants.RES_CODE_200_VALUE, null);
    }

    /**
     * 通用封装 通用封装
     *
     * @param code
     * @param msg
     * @param data
     * @return
     */

    public BaseResponse<T> setResult(Integer code, String msg, T data) {
        return new BaseResponse<T>(code, msg, data);
    }

}