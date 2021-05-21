package com.coursemanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coursemanage.entity.Course;
import com.coursemanage.mapper.CourseMapper;
import com.coursemanage.service.CourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}
