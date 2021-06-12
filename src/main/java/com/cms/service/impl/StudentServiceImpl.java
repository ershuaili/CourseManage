package com.cms.service.impl;

import com.cms.entity.Student;
import com.cms.mapper.StudentMapper;
import com.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectStu(String stuNo) {
        return studentMapper.selectStu(stuNo);
    }

    @Override
    public List<Student> selectAllStu() {
        return studentMapper.selectAllStu();
    }

    @Override
    public void save() {

    }
}
