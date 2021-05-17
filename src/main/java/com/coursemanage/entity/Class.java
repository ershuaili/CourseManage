package com.coursemanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Class {

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
