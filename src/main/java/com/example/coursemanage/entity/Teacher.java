package com.example.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * Teacher实体类
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教工号
     */
    @TableId("teacherID")
    private String teacherID;

    /**
     * 教师登陆密码
     */
    private String pass;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 教师性别
     */
    private Boolean sex;

    /**
     * 教师年龄
     */
    private LocalDate age;


}
