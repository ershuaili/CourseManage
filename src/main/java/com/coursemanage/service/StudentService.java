package com.coursemanage.service;

import com.coursemanage.entity.Student;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
public interface StudentService {
    /**
     * 查询所有用户
     * @return StudentList
     */
    List<Student> selectAll();
}
