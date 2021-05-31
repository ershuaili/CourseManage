package com.cms.mapper;

import com.cms.entity.Course;
import com.cms.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Mapper
public interface StudentMapper {

    /**
     * 通过学号查询某个学生信息
     * @param stuNo
     * @return stu
     */
    Student selectStu(String stuNo);

    /**
     * 查询所有学生信息
     * @return stuList
     */
    List<Student> selectAllStu();

    /**
     * 返回一个学生所有课程成绩的总和
     * @param stuNo
     * @return SumCourse
     */
    int calStuSum(String stuNo);

    /**
     * 返回一个学生有成绩的课程数
     * @param stuNo
     * @return NumClass
     */
    int getScoreNum(String stuNo);

    /**
     * 计算某个学生已修学分
     * @param stuNo
     * @return course
     */
    int calStuCredit(String stuNo);

    /**
     * 查找学生有成绩的所有课程
     * @param stuNo
     * @return course
     */
    List<Course> queryAllCourse(String stuNo);

    /**
     * 查找学生所有成绩
     * @param stuNo
     * @return course
     */
    List<Course> queryAllScore(String stuNo);

    /**
     * 分页查找学生成绩
     * @param scoreList
     * @param pageNum
     * @param offset
     * @return course
     */
    List<Course> querySomeScore(List<Course> scoreList, int pageNum, int offset);


}
