package com.cms.service.impl;

import com.cms.entity.User;
import com.cms.mapper.UserMapper;
import com.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String username) {
        return userMapper.selectUserByName(username);
    }

    @Override
    public int getAuthority(String username){
        return userMapper.getAuthority(username);
    }
}
