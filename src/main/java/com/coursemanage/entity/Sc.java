package com.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author shuai
 * @since 2021-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Sc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    @TableField("Sno")
    private String Sno;

    /**
     * 课程号
     */
    @TableField("Cno")
    private String Cno;

    /**
     * 成绩
     */
    @TableField("Grader")
    private Integer Grader;


}