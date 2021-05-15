package com.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * User实体类
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableId("UserID")
    private String UserID;

    /**
     * 用户密码
     */
    @TableField("Password")
    private String Password;

    /**
     * 用户类别
     */
    @TableField("Jurisdiction")
    private String Jurisdiction;


}
