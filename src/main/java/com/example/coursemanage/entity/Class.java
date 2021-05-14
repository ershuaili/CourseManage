package com.example.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级号
     */
    @TableId("classId")
    private Integer classId;

    /**
     * 班级人数
     */
    private Integer number;

    /**
     * 班级专业
     */
    private String profession;


}
