package com.coursemanage.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coursemanage.common.CommonResult;
import com.coursemanage.entity.User;
import com.coursemanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author shuai
 * @since 2021-05-14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查找
     *
     * @return
     */
    @RequestMapping("/list")
    CommonResult list(ModelMap modelMap, Page page, @ModelAttribute("user") User user) {

        page = userService.pageList(page, user);
        modelMap.addAttribute("page", page);
        return CommonResult.success(page);
    }

    @RequestMapping("/save")
    CommonResult save(User user) {

        return CommonResult.success(userService.saveOrUpdate(user));

    }


    /**
     * 根据id查
     *
     * @param id
     * @return
     */
    @RequestMapping("/getById")
    CommonResult getById(Integer id) {
        return CommonResult.success(userService.getById(id));
    }

    /**
     * 删除，逻辑删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/del")
    CommonResult del(Integer id) {
        User user = userService.getById(id);
        user.setUserID("0");
        return CommonResult.success(userService.updateById(user));
    }


    /**
     * 批量删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/delByIds")
    CommonResult delByIds(Integer[] id) {
        return CommonResult.success(userService.removeByIds(Arrays.asList(id)));
    }

}

