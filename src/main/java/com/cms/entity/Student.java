package com.cms.entity;

import java.time.LocalDate;
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
 * @since 2021-05-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    @TableId("Sno")
    private String sno;

    /**
     * 学生姓名
     */
    @TableField("Sname")
    private String sname;

    /**
     * 学生性别
     */
    @TableField("Ssex")
    private String ssex;

    /**
     * 学生年龄
     */
    @TableField("Sage")
    private LocalDate sage;

    /**
     * 班级编号
     */
    @TableField("Clno")
    private String clno;


}
