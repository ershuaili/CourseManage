package com.coursemanage.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/14 下午 9:09
 */

@RestControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler
    public CommonResult exceptionHandler(HttpServletRequest request, Exception ex) {
        ex.printStackTrace();
        if (ex instanceof NoHandlerFoundException) {
            return CommonResult.nohandler();
        }
        return CommonResult.failed(ex.getMessage());
    }


}