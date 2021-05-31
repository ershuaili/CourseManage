package com.cms.service;

import com.cms.entity.Course;
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
     * @param stuNo
     * @return stu
     */
    Student selectStu(String stuNo);

    /**
     * 查询所有学生信息
     * @return list
     */
    List<Student> selectAllStu();

    /**
     * 计算某个学生的平均分
     * @param stuNo
     * @return avg
     */
    double calStuAverage(String stuNo);

    /**
     * 计算某个学生已修学分
     * @param stuNo
     * @return credit
     */
    int calStuCredit(String stuNo);

    /**
     * 查找学生有成绩的所有课程
     * @param stuNo
     * @return list
     */
    List<Course> queryAllCourse(String stuNo);

    /**
     * 分页查找学生课程
     * @param courseList
     * @param pageNum
     * @param offset
     * @return course
     */
    List<Course> querySomeCourse(List<Course> courseList, int pageNum, int offset);

    /**
     * 查找学生的所有成绩
     * @param stuNo
     * @return course
     */
    List<Course> queryAllScore(String stuNo);

    /**
     * 分页查找学生成绩
     * @param scoreList
     * @param pageNum
     * @param offset
     * @return listCourse
     */
    List<Course> querySomeScore(List<Course> scoreList, int pageNum, int offset);

}
