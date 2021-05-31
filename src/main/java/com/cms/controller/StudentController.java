package com.cms.controller;


import com.cms.entity.Student;
import com.cms.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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
    public ModelAndView getStuInfo(ModelAndView mv, HttpSession session) {
        String stuNo = (String) session.getAttribute("stuNo");
        mv.addObject("userName", stuNo);
        mv.addObject("userType", session.getAttribute("userType"));
        new Student();
        Student student;
        student = studentService.selectStu(stuNo);
        //计算平均分
        double avg = studentService.calStuAverage(stuNo);
        int sumCredit = studentService.calStuCredit(stuNo);
        //学生信息
        mv.addObject("stu", student);
        //平均分
        mv.addObject("avg", avg);
        //总学分
        mv.addObject("sumCredit", sumCredit);
        mv.setViewName("/admin/list");
        return mv;
    }
}
