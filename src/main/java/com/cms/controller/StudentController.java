package com.cms.controller;

import com.cms.entity.Student;
import com.cms.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

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
    private StudentMapper studentMapper;

    /**
     * 查询学生个人信息
     */
    @RequestMapping(value = "/list")
    public String list(Model model,HttpSession session) {
//        获取登录名
        String stuNo = (String) session.getAttribute("loginUser");
//        查用户封存到stu中
        Student student = studentMapper.selectStu(stuNo);
        model.addAttribute("stu",student);
        return "admin/list";
    }
}
