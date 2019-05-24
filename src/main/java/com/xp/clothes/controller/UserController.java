package com.xp.clothes.controller;

import com.xp.clothes.bean.Userxp;
import com.xp.clothes.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Description: 用户模块接口
 * @author: youchuang.shi
 * @since: 2019/5/24 14:36
 * @history: 1.2019/5/24 created by youchuang.shi
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/rejister")
    @ResponseBody
    public String register(Userxp user){
        return userService.rejester(user);
    }


}
