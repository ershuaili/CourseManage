package com.cms.service;

import com.cms.entity.Class;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/12 下午 9:33
 */
public interface ClassServices {

    /**
     * 查询所有课程名
     * @return classList
     */
    List<Class> selectAllClass();

    /**
     * 通过学号查询某个学生信息
     * @param clno 班级编号
     * @return class
     */
    Class selectClassName(String clno);

}
