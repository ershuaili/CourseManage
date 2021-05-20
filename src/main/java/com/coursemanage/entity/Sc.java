package com.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2021-05-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    @TableField("Sno")
    private String sno;

    /**
     * 课程号
     */
    @TableField("Cno")
    private String cno;

    /**
     * 成绩
     */
    @TableField("Grader")
    private Integer grader;


}
