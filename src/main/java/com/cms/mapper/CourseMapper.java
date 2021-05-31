package com.cms.mapper;

import com.cms.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cglib.core.ClassInfo;

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
public interface CourseMapper {

    /**
     * 查询某个班级号是否存在，如果存在就不能插入
     * @param classNo
     * @return classNo
     */
    int isExistClassNo(String classNo);

    /**
     * 插入班级信息
     * @param cla
     */
    void insertClassInfo(ClassInfo cla);

    /**
     * 查询某个学号是否存在，如果存在就不能插入
     * @param stuNo
     * @return stuNo
     */
    int isExistStuNo(String stuNo);

    /**
     * 插入学生信息
     * @param student
     */
    void insertStudentInfo(Student student);

    /**
     * 查询所有的班级号，以便学生信息插入
     * @return list
     */
    List<String> queryAllClassNo();

    /**
     * 班级人数加一
     * @param classNo
     */
    void updateClassNum(String classNo);

    /**
     * 按照学号删除学生信息
     * @param stuNo
     */
    void deleteStuByNo(String stuNo);

    /**
     * 班级人数减一
     * @param classNo
     */
    void updateClassNumM(String classNo);

    /**
     * 根据学号删除成绩表
     * @param stuNo
     */
    void deleteScoreByNo(String stuNo);

    /**
     * 查询所有学生信息
     * @return list
     */
    List<Student> queryAllStudent();

    /**
     * 通过学号找班级号
     * @param stuNo
     * @return class
     */
    String queryClassNoByStuNo(String stuNo);

}
