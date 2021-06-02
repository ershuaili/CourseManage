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
public class Sc implements Serializable {

    /**
     * 学号
     */
    private String sno;

    /**
     * 课程号
     */
    private String cno;

    /**
     * 成绩
     */
    private Integer grader;

}
