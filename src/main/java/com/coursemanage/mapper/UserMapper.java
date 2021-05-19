package com.coursemanage.mapper;

import com.coursemanage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/19 下午 9:41
 */

@Mapper
@Repository
public interface UserMapper {
    /**
     * 遍历 user
     * @return userList
     */
    List<User> queryUserList();

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
    User queryUserById(String id);
}
