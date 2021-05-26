package com.cms.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教工号
     */
    @TableId("Tno")
    private String tno;

    /**
     * 教师姓名
     */
    @TableField("Tname")
    private String tname;

    /**
     * 教师性别
     */
    @TableField("Tsex")
    private String tsex;

    /**
     * 教师年龄
     */
    @TableField("Tage")
    private LocalDate tage;


}
