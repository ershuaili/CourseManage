package com.cms.controller;


import com.cms.mapper.ScMapper;
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
public class ScController {

    @Autowired
    ScMapper scMapper;

    @RequestMapping(value = "/scManage")
    public String selectAllSc(){
        return "redirect:/scManage.html";
    }
}
