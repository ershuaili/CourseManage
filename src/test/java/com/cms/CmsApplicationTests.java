package com.cms;

import com.cms.entity.Course;
import com.cms.mapper.CourseMapper;
import com.cms.mapper.ScMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CmsApplicationTests {

    @Autowired
    ScMapper scMapper;

    @Test
    public void toTest() {
        List<String> sc = scMapper.getCname();
        System.out.println(sc);
    }


    @Autowired
    CourseMapper courseMapper;

    @Test
    public void myTest() {
        List<Course> courses = courseMapper.selectCourseList();
        for (Course course : courses) {
            System.out.println(course.getCname());
        }
    }

}
