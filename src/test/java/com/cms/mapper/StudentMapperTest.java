package com.cms.mapper;

import com.cms.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/06/01 下午 11:00
 */
class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void MyTest(){
        Collection<Student> students = studentMapper.selectAllStu();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}