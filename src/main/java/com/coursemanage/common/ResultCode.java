package com.coursemanage.common;

import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/14 下午 9:06
 */
@Getter
public enum ResultCode {
    NOHANDLER(404, "请求地址错误"),
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    NOTOKEN(401, "未登录或登录已超时"),
    NOPERMISS(403, "无操作权限"),
    ;

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}