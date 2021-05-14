package com.example.coursemanage.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    private String id;

    /**
     * 管理员登陆密码
     */
    private String pass;

    /**
     * 管理员姓名
     */
    private String name;

    /**
     * 管理员年龄
     */
    private LocalDate age;

    /**
     * 管理员性别
     */
    private Boolean sex;


}
