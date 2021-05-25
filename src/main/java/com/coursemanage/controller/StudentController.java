package com.coursemanage.controller;


import com.coursemanage.entity.Student;
import com.coursemanage.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shuai
 * @since 2021-05-22
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    /**
     * 显示所有学生成绩
     */
    @RequestMapping(value = "/selectAll")
    public String selectAll(Model model){
        List<Student> list = studentService.selectAll();
        model.addAttribute("sts",list);
        return "show";
    }
}
