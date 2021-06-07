package com.cms.mapper;

import com.cms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return user
     */
    User selectUserByName(@Param("username") String username);

    /**
     * 查找账号权限码
     * @param username
     * @return int
     */
    int getAuthority(String username);
}
