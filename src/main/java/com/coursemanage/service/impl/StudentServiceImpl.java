package com.coursemanage.service.impl;

import com.coursemanage.entity.Student;
import com.coursemanage.mapper.StudentMapper;
import com.coursemanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    /**
     * 查询所有学生
     * @return UserList
     */
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

}
