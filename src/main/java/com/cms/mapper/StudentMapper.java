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
     * @param stuNo 学生编号
     * @return stu
     */
    Student selectStu(String stuNo);

    /**
     * 查询所有学生信息
     * @return stuList
     */
    List<Student> selectAllStu();

    /**
     * 保存学生信息
     */
    void save();
}
