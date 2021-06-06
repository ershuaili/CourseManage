package com.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/05 下午 6:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scg implements Serializable {

    /**
     * 学号
     */
    private String sno;

    /**
     * 学生名
     */
    private String sname;

    /**
     * 课程名
     */
    private String cname;

    /**
     * 成绩
     */
    private Integer grader;

}

