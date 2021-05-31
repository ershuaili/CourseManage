package com.cms.service;

import com.cms.entity.Student;
import org.springframework.cglib.core.ClassInfo;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
public interface CourseService {
    /**
     * 查询某个班级号是否存在，如果存在就不能插入
     * @param classNo
     * @return null
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
     * @return null
     */
    int isExistStuNo(String stuNo);

    /**
     * 插入学生信息
     * @param student
     */
    void insertStudentInfo(Student student);

    /**
     * 查询所有的班级号，以便学生信息插入
     * @return
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
     * 分页显示学生信息
     * @param studentList
     * @param pageNum
     * @param offset
     * @return StuList
     */
    List<Student> querySomeStudent(List<Student> studentList, int pageNum, int offset);

}
