package com.example.coursemanage.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     */
    @TableId("studentID")
    private String studentID;

    /**
     * 学生账户密码
     */
    private String pass;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private Boolean sex;

    /**
     * 学生年龄
     */
    private LocalDate age;


}
