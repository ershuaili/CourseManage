package com.coursemanage.controller;

import com.coursemanage.entity.User;
import com.coursemanage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/19 下午 10:01
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }

    public User queryUserById(){
        return userMapper.queryUserById("122");
    }
}
