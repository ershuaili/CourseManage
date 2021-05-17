package com.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
public class Student {

    /**
     * 学号
     */
    @TableId("Sno")
    private String Sno;

    /**
     * 学生姓名
     */
    @TableField("Sname")
    private String Sname;

    /**
     * 学生性别
     */
    @TableField("Ssex")
    private String Ssex;

    /**
     * 学生年龄
     */
    @TableField("Sage")
    private LocalDate Sage;

    /**
     * 班级编号
     */
    @TableField("Clno")
    private String Clno;


}
