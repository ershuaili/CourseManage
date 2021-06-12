package com.cms.service.impl;

import com.cms.entity.Class;
import com.cms.entity.Course;
import com.cms.mapper.ClassMapper;
import com.cms.service.ClassServices;
import com.cms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/12 下午 9:35
 */
@Service
public class ClassServiceImpl implements ClassServices {

    @Autowired
    ClassMapper classMapper;

    @Override
    public List<Class> selectAllClass() {
        return classMapper.selectAllClass();
    }

    @Override
    public Class selectClassName(String clno) {
        return classMapper.selectClassName(clno);
    }
}
