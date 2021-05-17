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
    private String Tno;

    /**
     * 教师姓名
     */
    private String Tname;

    /**
     * 教师性别
     */
    private String Tsex;

    /**
     * 教师年龄
     */
    private LocalDate Tage;


}
