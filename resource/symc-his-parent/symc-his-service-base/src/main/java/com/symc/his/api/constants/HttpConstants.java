package com.symc.his.api.constants;

/**
 * @Description: HTTP协议相关常量，包括状态码、状态详细
 * 1**服务器收到请求，需要请求者继续执行操作
 * 2**操作被成功接收并处理
 * 3**重定向，需要进一步的操作以完成请求
 * 4**客户端错误，请求包含语法错误或无法完成请求
 * 5**服务器错误，服务器在处理请求的过程中发生了错误
 * @CreateTime: 2023/2/22 21:27
 * @Version:
 * @Since: 1.8
 * @Author: 辛凤文 forward.seen@foxmail.com
 */
public interface HttpConstants {
    // 响应请求成功
    String RES_CODE_200_VALUE = "success";
    // 系统错误
    String RES_CODE_500_VALUE = "fail";
//    // 响应请求成功code
//    Integer RES_CODE_200 = 200;
//    // 系统错误
//    Integer RES_CODE_500 = 500;

    /**
     * CODE: 100
     * DESC: 继续
     * DETAIL: 请求者应当继续提出请求。服务器返回此代码表示已收到请求的第一部分，正在等待其余部分
     */
    Integer RES_CODE_100 = 100;

    /**
     * CODE: 101
     * DESC: 切换协议
     * DETAIL: 请求者已要求服务器切换协议，服务器已确认并准备切换
     */
    Integer RES_CODE_101 = 101;

    /**
     * CODE: 200
     * DESC: 成功
     * DETAIL: 服务器已成功处理了请求。通常，这表示服务器提供了请求的网页
     */
    Integer RES_CODE_200 = 200;

    /**
     * CODE: 201
     * DESC: 已创建
     * DETAIL: 请求成功并且服务器创建了新的资源
     */
    Integer RES_CODE_201 = 201;

    /**
     * CODE: 202
     * DESC: 已接受
     * DETAIL: 服务器已接受请求，但尚未处理
     */
    Integer RES_CODE_202 = 202;

    /**
     * CODE: 203
     * DESC: 非授权信息
     * DETAIL: 服务器已成功处理了请求，但返回的信息可能来自另一来源
     */
    Integer RES_CODE_203 = 203;

    /**
     * CODE: 204
     * DESC: 无内容
     * DETAIL: 服务器成功处理了请求，但没有返回任何内容
     */
    Integer RES_CODE_204 = 204;

    /**
     * CODE: 205
     * DESC: 重置内容
     * DETAIL: 服务器成功处理了请求，但没有返回任何内容
     */
    Integer RES_CODE_205 = 205;

    /**
     * CODE: 206
     * DESC: 部分内容
     * DETAIL: 服务器成功处理了部分 GET 请求
     */
    Integer RES_CODE_206 = 206;

    /**
     * CODE: 300
     * DESC: 多种选择
     * DETAIL: 针对请求，服务器可执行多种操作。服务器可根据请求者 (user agent) 选择一项操作，或提供操作列表供请求者选择。
     */
    Integer RES_CODE_300 = 300;

    /**
     * CODE: 301
     * DESC: 永久移动
     * DETAIL: 请求的网页已永久移动到新位置。服务器返回此响应(对 GET 或 HEAD 请求的响应)时，会自动将请求者转到新位置。
     */
    Integer RES_CODE_301 = 301;

    /**
     * CODE: 302
     * DESC: 临时移动
     * DETAIL: 服务器目前从不同位置的网页响应请求，但请求者应继续使用原有位置来进行以后的请求。
     */
    Integer RES_CODE_302 = 302;

    /**
     * CODE: 303
     * DESC: 查看其他位置
     * DETAIL: 请求者应当对不同的位置使用单独的 GET 请求来检索响应时，服务器返回此代码。
     */
    Integer RES_CODE_303 = 303;

    /**
     * CODE: 304
     * DESC: 未修改
     * DETAIL: 自从上次请求后，请求的网页未修改过。服务器返回此响应时，不会返回网页内容。
     */
    Integer RES_CODE_304 = 304;

    /**
     * CODE: 305
     * DESC: 使用代理
     * DETAIL: 请求者只能使用代理访问请求的网页。如果服务器返回此响应，还表示请求者应使用代理。
     */
    Integer RES_CODE_305 = 305;

    /**
     * CODE: 307
     * DESC: 临时重定向
     * DETAIL: 服务器目前从不同位置的网页响应请求，但请求者应继续使用原有位置来进行以后的请求
     */
    Integer RES_CODE_307 = 307;

    /**
     * CODE: 400
     * DESC: 错误请求
     * DETAIL: 服务器不理解请求的语法。
     */
    Integer RES_CODE_400 = 400;

    /**
     * CODE: 401
     * DESC: 未授权
     * DETAIL: 请求要求身份验证。 对于需要登录的网页，服务器可能返回此响应。
     */
    Integer RES_CODE_401 = 401;

    /**
     * CODE: 403
     * DESC: 禁止
     * DETAIL: 服务器拒绝请求。
     */
    Integer RES_CODE_403 = 403;

    /**
     * CODE: 404
     * DESC: 未找到
     * DETAIL: 服务器找不到请求的网页。
     */
    Integer RES_CODE_404 = 404;

    /**
     * CODE: 405
     * DESC: 方法禁用
     * DETAIL: 禁用请求中指定的方法。
     */
    Integer RES_CODE_405 = 405;

    /**
     * CODE: 406
     * DESC: 不接受
     * DETAIL: 无法使用请求的内容特性响应请求的网页。
     */
    Integer RES_CODE_406 = 406;

    /**
     * CODE: 407
     * DESC: 需要代理授权
     * DETAIL: 此状态代码与 401(未授权)类似，但指定请求者应当授权使用代理。
     */
    Integer RES_CODE_407 = 407;

    /**
     * CODE: 408
     * DESC: 请求超时
     * DETAIL: 服务器等候请求时发生超时
     */
    Integer RES_CODE_408 = 408;

    /**
     * CODE: 409
     * DESC: 冲突
     * DETAIL: 服务器在完成请求时发生冲突。服务器必须在响应中包含有关冲突的信息。
     */
    Integer RES_CODE_409 = 409;

    /**
     * CODE: 410
     * DESC: 已删除
     * DETAIL: 如果请求的资源已永久删除，服务器就会返回此响应。
     */
    Integer RES_CODE_410 = 410;

    /**
     * CODE: 411
     * DESC: 需要有效长度
     * DETAIL: 服务器不接受不含有效内容长度标头字段的请求。
     */
    Integer RES_CODE_411 = 411;

    /**
     * CODE: 412
     * DESC: 未满足前提条件
     * DETAIL: 服务器未满足请求者在请求中设置的其中一个前提条件。
     */
    Integer RES_CODE_412 = 412;

    /**
     * CODE: 413
     * DESC: 请求实体过大
     * DETAIL: 服务器无法处理请求，因为请求实体过大，超出服务器的处理能力。
     */
    Integer RES_CODE_413 = 413;

    /**
     * CODE: 414
     * DESC: 请求的 URI 过长
     * DETAIL: 请求的 URI(通常为网址)过长，服务器无法处理。
     */
    Integer RES_CODE_414 = 414;

    /**
     * CODE: 415
     * DESC: 不支持的媒体类型
     * DETAIL: 请求的格式不受请求页面的支持。
     */
    Integer RES_CODE_415 = 415;

    /**
     * CODE: 416
     * DESC: 请求范围不符合要求
     * DETAIL: 如果页面无法提供请求的范围，则服务器会返回此状态代码。
     */
    Integer RES_CODE_416 = 416;

    /**
     * CODE: 417
     * DESC: 未满足期望值
     * DETAIL: 服务器未满足"期望"请求标头字段的要求
     */
    Integer RES_CODE_417 = 417;

    /**
     * CODE: 500
     * DESC: 服务器内部错误
     * DETAIL: 服务器遇到错误，无法完成请求。
     */
    Integer RES_CODE_500 = 500;

    /**
     * CODE: 501
     * DESC: 尚未实施
     * DETAIL: 服务器不具备完成请求的功能。例如，服务器无法识别请求方法时可能会返回此代码。
     */
    Integer RES_CODE_501 = 501;

    /**
     * CODE: 502
     * DESC: 错误网关
     * DETAIL: 服务器作为网关或代理，从上游服务器收到无效响应。
     */
    Integer RES_CODE_502 = 502;

    /**
     * CODE: 503
     * DESC: 服务不可用
     * DETAIL: 服务器目前无法使用(由于超载或停机维护)。通常，这只是暂时状态。
     */
    Integer RES_CODE_503 = 503;

    /**
     * CODE: 504
     * DESC: 网关超时
     * DETAIL: 服务器作为网关或代理，但是没有及时从上游服务器收到请求。
     */
    Integer RES_CODE_504 = 504;

    /**
     * CODE: 505
     * DESC: HTTP版本不受支持
     * DETAIL: 服务器不支持请求中所用的 HTTP 协议版本。
     */
    Integer RES_CODE_505 = 505;

}