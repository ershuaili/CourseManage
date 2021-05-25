package com.coursemanage.mapper;

import com.coursemanage.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
@Mapper
public interface StudentMapper {
    /**
     * 获取所有学生信息
     * @return  StudentList
     */
    List<Student> selectAll();
}
