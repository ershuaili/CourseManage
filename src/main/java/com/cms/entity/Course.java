package com.cms.entity;

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
 * @since 2021-05-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程号
     */
    @TableField("Cno")
    private String cno;

    /**
     * 课程名
     */
    @TableField("Cname")
    private String cname;

    /**
     * 执教老师
     */
    @TableField("Cteacher")
    private String cteacher;

    /**
     * 学分
     */
    @TableField("Ccredit")
    private String ccredit;


}
