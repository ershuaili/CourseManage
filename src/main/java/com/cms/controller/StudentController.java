package com.cms.controller;


import com.cms.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    StudentMapper studentMapper;
    @RequestMapping(value = "/studentManage")
    public String selectAllStu(){

        return "redirect:/studentManage.html";
    }
}
