package com.cms.controller;


import com.cms.entity.Student;
import com.cms.entity.Teacher;
import com.cms.entity.User;
import com.cms.mapper.StudentMapper;
import com.cms.mapper.TeacherMapper;
import com.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 用户登录验证
     *
     * @param username 用户名
     * @param password 用户密码
     * @param model
     * @param session
     * @return main
     */
    @RequestMapping("/login")
    public String queryUserByName(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session) {
        User user = userService.queryUserByName(username);
        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            session.setAttribute("loginUser", username);
            //用户名
            model.addAttribute("userName", username);
            Integer authority = userService.getAuthority(username);
            session.setAttribute("userType", authority);
            //权限码
            model.addAttribute("userType", authority);
            return "redirect:/main";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    /**
     * 获取用户信息
     * @param model
     * @param session
     * @return main
     */
    @RequestMapping(value = "/main")
    public String list(Model model, HttpSession session) {
//        获取登录名
        String name = (String) session.getAttribute("loginUser");
        int userType = (int) session.getAttribute("userType");

        if (userType == 0) {
            //        查用户封存到stu中
            Student student = studentMapper.selectStu(name);
            model.addAttribute("stu", student);
        } else {
            //        查用户封存到tea中
            Teacher teacher = teacherMapper.selectTea(name);
            model.addAttribute("tea", teacher);
        }
        return "main";
    }
}

