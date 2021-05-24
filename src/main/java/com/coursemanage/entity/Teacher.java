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

public class Teacher implements Serializable {

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
