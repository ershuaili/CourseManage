package com.coursemanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coursemanage.entity.Student;
import com.coursemanage.mapper.StudentMapper;
import com.coursemanage.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-20
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
