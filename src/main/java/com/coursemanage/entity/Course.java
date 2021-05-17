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
public class Course {

    /**
     * 课程号
     */
    @TableField("Cno")
    private String Cno;

    /**
     * 课程名
     */
    @TableField("Cname")
    private String Cname;

    /**
     * 执教老师
     */
    @TableField("Cteacher")
    private String Cteacher;

    /**
     * 学分
     */
    @TableField("Ccredit")
    private String Ccredit;


}
