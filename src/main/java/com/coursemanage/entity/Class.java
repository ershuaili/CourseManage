package com.coursemanage.entity;

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
 * @since 2021-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级号
     */
    @TableId("Clno")
    private String Clno;

    /**
     * 班级专业
     */
    @TableField("Cdiscipline")
    private String Cdiscipline;

    /**
     * 班级人数
     */
    @TableField("Cnumber")
    private String Cnumber;


}
