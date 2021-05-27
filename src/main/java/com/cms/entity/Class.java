package com.cms.entity;


import lombok.Data;

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
