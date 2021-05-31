package com.cms.controller;


import com.cms.entity.Student;
import com.cms.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author shuai
 * @since 2021-05-26
 */
@Controller
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    /**
     * 查询学生个人信息
     */
    @RequestMapping(value = "/list")
    public String list(Model model){
        List<Student> students = studentService.selectAllStu();
        model.addAttribute("stus",students);
        return "admin/list";
    }
}
