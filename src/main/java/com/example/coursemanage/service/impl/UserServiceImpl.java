package com.example.coursemanage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.coursemanage.entity.User;
import com.example.coursemanage.mapper.UserMapper;
import com.example.coursemanage.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public Page pageList(Page page, User user) {
        if (page == null) {
            page = new Page();
        }

        QueryWrapper wrapper = new QueryWrapper();
        if (user != null && StringUtils.isNotEmpty(user.getUserID())) {
            //根据user_name字段模糊查找
            wrapper.like("user_name", user.getUserID());
        }

        return super.page(page, wrapper);
    }
}
