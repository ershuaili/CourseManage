package com.cms;

import com.cms.entity.Student;
import com.cms.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsApplicationTests {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void toTest(){
        Student student = studentMapper.selectStu("1");
        System.out.println(student.getSname());
    }

}
