package com.cms.service.impl;

import com.cms.entity.Course;
import com.cms.mapper.CourseMapper;
import com.cms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
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
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    /**
     * 获取所有课程信息
     * @return courseList
     */
    @Override
    public List<Course> selectCourseList() {
        return courseMapper.selectCourseList();
    }

    /**
     * 插入课程信息
     * @param course 课程
     */
    @Override
    public void insertCourse(Course course) {

        courseMapper.insertCourse(course);
    }
}
