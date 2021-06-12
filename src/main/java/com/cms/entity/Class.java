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
public class Class implements Serializable {

    /**
     * 班级名字
     */
    private String cname;
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
