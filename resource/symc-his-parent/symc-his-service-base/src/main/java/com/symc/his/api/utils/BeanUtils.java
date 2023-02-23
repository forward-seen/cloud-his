package com.symc.his.api.utils;

/**
 * @Description: DO与DTO转换工具
 * @CreateTime: 2023/2/22 21:27
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
public class BeanUtils<DTO, DO> {

    /**
     * dot 转换为Do 工具类
     */
    public static <DO> DO DTO2DO(Object DTO, Class<DO> classDO) {
        if (DTO == null) {
            return null;
        }
        if (classDO == null) {
            return null;
        }
        try {
            DO newInstance = classDO.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(DTO, newInstance);
            // Dto转换Do
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * do 转换为Dto 工具类
     */
    public static <DTO> DTO DO2DTO(Object DO, Class<DTO> classDTO) {
        if (DO == null) {
            return null;
        }
        if (classDTO == null) {
            return null;
        }
        try {
            DTO newInstance = classDTO.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(DO, newInstance);
            // Dto转换Do
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }

}