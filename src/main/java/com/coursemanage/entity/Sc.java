package com.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author shuai
 * @since 2021-05-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sc {

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
