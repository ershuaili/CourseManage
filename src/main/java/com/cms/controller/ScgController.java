package com.cms.controller;


import com.cms.entity.Scg;
import com.cms.mapper.ScgMapper;
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
public class ScgController {

    @Autowired
    private ScgMapper scgMapper;

    @RequestMapping(value = "/scManage")
    public String selectAllSc(Model model) {
        List<Scg> scgs = scgMapper.selectScgList();
        List<String> strings = scgMapper.selectCname();
        model.addAttribute("scgs", scgs);
        model.addAttribute("cnames", strings);
        return "redirect:/admin/scManage";
    }

}
