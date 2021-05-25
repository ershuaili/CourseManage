package com.coursemanage.service.impl;

import com.coursemanage.entity.Student;
import com.coursemanage.entity.User;
import com.coursemanage.mapper.UserMapper;
import com.coursemanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUser(String userName){
        return userMapper.selectUser("1");
    }

}
