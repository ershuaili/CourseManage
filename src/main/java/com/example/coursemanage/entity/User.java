package com.example.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableField("Passworld")
    private String Passworld;

    /**
     * 用户类别
     */
    @TableField("Jurisdiction")
    private String Jurisdiction;


}
