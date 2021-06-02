package com.cms.controller;


import com.cms.entity.Student;
import com.cms.entity.Teacher;
import com.cms.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class TeacherController {

    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 查询教师个人信息
     */
    @RequestMapping(value = "/mainT")
    public String list(Model model, HttpSession session) {
//        获取登录名
        String teaNo = (String) session.getAttribute("loginUser");
//        查用户封存到stu中
        Teacher teacher = teacherMapper.selectTea(teaNo);
        model.addAttribute("tea",teacher);
        return "main";
    }
}
