package com.cms.service.impl;

import com.cms.entity.Teacher;
import com.cms.mapper.TeacherMapper;
import com.cms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public Teacher selectTea(String teaNo){
        return teacherMapper.selectTea(teaNo);
    }
}
