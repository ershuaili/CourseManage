package com.coursemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shuai
 */
@MapperScan("com.coursemanage.mapper")
@SpringBootApplication
public class CourseManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseManageApplication.class, args);
    }

}
