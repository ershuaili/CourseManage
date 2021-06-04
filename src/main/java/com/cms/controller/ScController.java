package com.cms.controller;


import com.cms.entity.Sc;
import com.cms.mapper.ScMapper;
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
public class ScController {

    @Autowired
    private ScMapper scMapper;

    @RequestMapping(value = "/scManage")
    public String selectAllSc(Model model){
        List<Sc> scs = scMapper.selectScList();
        model.addAttribute("scs", scs);
        return "/admin/scManage";
    }
}
