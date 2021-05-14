package com.example.coursemanage.service.impl;

import com.example.coursemanage.entity.Student;
import com.example.coursemanage.mapper.StudentMapper;
import com.example.coursemanage.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
