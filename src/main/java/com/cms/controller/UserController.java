package com.cms.controller;


import com.cms.entity.User;
import com.cms.service.UserService;
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
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String queryUserByName(String username, String password, Model model, HttpSession session) {
        User user = userService.queryUserByName(username);
        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            session.setAttribute("msg", "登录成功");
            return "main";
        } else {
            model.addAttribute("loginMsg", "用户名或密码错误");
            return "index";
        }
    }

}
