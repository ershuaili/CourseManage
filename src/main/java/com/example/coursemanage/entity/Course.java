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
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程号
     */
    @TableId("courseId")
    private Integer courseId;

    /**
     * 课程名
     */
    private String name;

    /**
     * 学分
     */
    private Integer score;


}
