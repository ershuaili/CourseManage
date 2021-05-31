package com.cms.controller;


import com.cms.entity.User;
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

    @RequestMapping("/user/login")
    public String queryUserByName(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session) {
        User user = userService.queryUserByName(username);
        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            session.setAttribute("loginUser",username);
            //用户名
            model.addAttribute("userName", username);
            Integer authority = userService.getAuthority(username);
            session.setAttribute("userType", authority);
            //权限码
            model.addAttribute("userType", authority);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }
}

