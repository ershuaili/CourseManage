package com.coursemanage.mapper;

import com.coursemanage.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户查找用户
     * @param userName
     * @return user
     */
    User selectUser(String userName);
}
