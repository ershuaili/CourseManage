package com.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {

    /**
     * 课程号
     */
    private String cno;

    /**
     * 课程名
     */
    private String cname;

    /**
     * 执教老师
     */
    private String cteacher;

    /**
     * 学分
     */
    private String ccredit;


}
