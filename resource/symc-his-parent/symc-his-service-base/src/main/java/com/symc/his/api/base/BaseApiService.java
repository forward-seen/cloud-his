package com.symc.his.api.base;

import com.symc.his.api.constants.HttpConstants;
import com.symc.his.api.utils.BeanUtils;
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

    /**
     * dto 转换do
     *
     * @param DTO
     * @param DO_Class
     * @param <DO>
     * @return
     */
    public static <DO> DO DTO2DO(Object DTO, Class<DO> DO_Class) {
        return BeanUtils.DTO2DO(DTO,DO_Class);
    }

    /**
     * do转换成dto
     * @param DO
     * @param DTO_Class
     * @param <DTO>
     * @return
     */
    public static <DTO> DTO DO2DTO(Object DO, Class<DTO> DTO_Class) {
        return BeanUtils.DO2DTO(DO,DTO_Class);
    }

    /**
     *
     * @param dbCount 访问数据库返回的影响行数
     * @param successMsg
     * @param errorMsg
     * @return
     */
    public BaseResponse<T> setResultDB(int dbCount, T successMsg, String errorMsg) {
        return dbCount > 0 ? setResultSuccess(successMsg) :
            setResultError(errorMsg);
    }
}