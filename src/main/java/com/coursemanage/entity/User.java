package com.coursemanage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author shuai
 * @since 2021-05-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户类别
     */
    private String level;

}
