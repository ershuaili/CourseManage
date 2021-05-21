package com.coursemanage.entity;

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
public class Teacher {

    /**
     * 教工号
     */
    private String tno;

    /**
     * 教师姓名
     */
    private String tname;

    /**
     * 教师性别
     */
    private String tsex;

    /**
     * 教师年龄
     */
    private LocalDate tage;


}
