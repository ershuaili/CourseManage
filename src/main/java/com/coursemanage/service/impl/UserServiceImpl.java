package com.coursemanage.service.impl;

import com.coursemanage.entity.User;
import com.coursemanage.mapper.UserMapper;
import com.coursemanage.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
