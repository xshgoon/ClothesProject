package com.xp.clothes.controller;

import com.xp.clothes.bean.Userxp;
import com.xp.clothes.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * 注册接口
     *
     * @param user
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public Object register(@RequestBody Userxp user) {
        Map<String, Object> rs = new HashMap<>();
        if (!userService.rejester(user)) {
            rs.put("errorMsg", "用户名已存在！");
        }
        return rs;
    }

    @PostMapping("/login")
    @ResponseBody
    public Object login(@RequestBody Userxp user, HttpSession session) {
        Map<String, Object> rs = new HashMap<>();
        user = userService.login(user);
        if (user != null) {
            session.setAttribute("USER", user);
        }else{
            rs.put("errorMsg","用户名或密码有误！");
        }
        return rs;
    }

    @GetMapping("/test")
    @ResponseBody
    public List<Userxp> test() {
        return userService.test();
    }

}
