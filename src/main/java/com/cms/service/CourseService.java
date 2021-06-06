package com.cms.service;

import com.cms.entity.Course;
import org.springframework.cglib.core.ClassInfo;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
public interface CourseService {
    /**
     * 插入课程信息
     * @param course 课程号
     */
    void insertCourse(Course course);

    /**
     * 获取所有课程信息
     * @return courseList
     */
    List<Course> selectCourseList();

    /**
     * 查询所有课程名
     * @return cName
     */
    List<String> selectCname();
}
