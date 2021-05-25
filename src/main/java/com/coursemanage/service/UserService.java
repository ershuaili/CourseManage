package com.coursemanage.service;

import com.coursemanage.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
public interface UserService {

    /**
     * 根据姓名查找学生
     * @param userName
     * @return user
     */
    User selectUser(String userName);
}
