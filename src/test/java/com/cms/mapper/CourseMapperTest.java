package com.cms.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/05 下午 7:08
 */
class CourseMapperTest {
    @Autowired
    CourseMapper courseMapper;

    @Test
    public void MyTest(){
        List<String> students = courseMapper.selectCname();
        for (String student : students) {
            System.out.println(student);
        }
    }

}