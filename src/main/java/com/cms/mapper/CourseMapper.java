package com.cms.mapper;

import com.cms.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Mapper
public interface CourseMapper {
    /**
     * 获取所有课程信息
     * @return courseList
     */
    List<Course> selectCourseList();

    /**
     * 插入课程信息
     * @param course 课程号
     */
    void insertCourse(Course course);

    /**
     * 查询所有课程名
     * @return cName
     */
    List<String> selectCname();

}
