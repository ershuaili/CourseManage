package com.cms.controller;


import com.cms.entity.Class;
import com.cms.entity.Student;
import com.cms.mapper.ClassMapper;
import com.cms.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private StudentMapper studentMapper;
    @Autowired
    private ClassMapper classMapper;

    @RequestMapping(value = "/studentManage")
    public String selectAllStu(Model model) {
        List<Student> students = studentMapper.selectAllStu();
        model.addAttribute("stus", students);
        return "admin/studentManage";
    }

    /**
     * 转跳至学生修改界面
     */
    @GetMapping("/stu/{id}")
    public String toStudentUpdate(@PathVariable String id ,Model model){
        //查出来原来的数据
        Student student = studentMapper.selectStu(id);
        model.addAttribute("stu", student);

        //查出班级信息
        List<Class> classes = classMapper.selectAllClass();
        model.addAttribute("class",classes);
        return "admin/update";
    }
}
