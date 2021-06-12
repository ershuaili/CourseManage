package com.cms.service;

import com.cms.entity.Student;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
public interface StudentService {
    /**
     * 通过学号查询某个学生信息
     * @param stuNo 学生编号
     * @return stu
     */
    Student selectStu(String stuNo);

    /**
     * 查询所有学生信息
     * @return list
     */
    List<Student> selectAllStu();

    /**
     * 保存学生信息
     */
    void save();

}
