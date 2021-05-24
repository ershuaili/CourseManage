package com.coursemanage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Class implements Serializable {



    /**
     * 班级号
     */
    private String clno;

    /**
     * 班级专业
     */
    private String cdiscipline;

    /**
     * 班级人数
     */
    private String cnumber;


}
