package com.cms.service;

import com.cms.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
public interface UserService {
    /**
     * 通过用户名获取用户
     *
     * @param username
     * @return user
     */
    User queryUserByName(String username);
}
