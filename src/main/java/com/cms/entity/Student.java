package com.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 *
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
