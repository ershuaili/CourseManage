package com.cms.controller;


import com.cms.entity.Course;
import com.cms.mapper.CourseMapper;
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
public class CourseController {

    @Autowired
    private CourseMapper courseMapper;

    @RequestMapping(value = "/courseManage")
    public String selectAllCourse(Model model) {
        List<Course> courses = courseMapper.selectCourseList();
        model.addAttribute("courses", courses);
        return "/admin/courseManage";
    }

}
