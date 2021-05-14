package com.example.coursemanage.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.coursemanage.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
public interface UserService extends IService<User> {
    Page pageList(Page page, User user);
}
