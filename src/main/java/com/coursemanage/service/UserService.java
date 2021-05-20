package com.coursemanage.service;

import com.coursemanage.entity.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/20 下午 7:13
 */
public interface UserService {

    User queryUserByName(String name);
}
