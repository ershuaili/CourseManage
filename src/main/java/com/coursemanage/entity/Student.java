package com.coursemanage.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
@Data
public class Student implements Serializable {

    /**
     * 学号
     */
    private String sno;

    /**
     * 学生姓名
     */
    private String sname;

    /**
     * 学生性别
     */
    private String ssex;

    /**
     * 学生年龄
     */
    private LocalDate sage;

    /**
     * 班级编号
     */
    private String clno;


}
