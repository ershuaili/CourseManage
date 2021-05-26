package com.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/26 下午 6:59
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello,world";
    }
}
