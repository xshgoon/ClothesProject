package com.xp.clothes.controller;


import com.xp.clothes.bean.Factory;
import com.xp.clothes.service.FactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: 工厂模块接口
 * @author: youchuang.shi
 * @since: 2019/5/24 14:36
 * @history: 1.2019/5/24 created by youchuang.shi
 */

@Controller
@RequestMapping("/factory")
public class FactoryController {
    @Resource
    private FactoryService factoryService;

    /**
     * 测试方法
     * @return 跳转首页
     */
    @GetMapping("/index")
    public String getUrl(){
        return "html/index";
    }

    @GetMapping("/plant")
    public String getPlant(){
        return "html/plant";
    }

    @GetMapping("/order")
    public String getOrder(){
        return "html/order";
    }

    @GetMapping("/personage")
    public String getPersonage(){
        return "html/personage";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "html/about";
    }
}
