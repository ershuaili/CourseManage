package com.example.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
    @TableField("Password")
    private String Password;

    /**
     * 用户类别
     */
    @TableField("Jurisdiction")
    private String Jurisdiction;


}
