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
 * 工厂模块接口
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
    @GetMapping("/getFactory")
    @ResponseBody
    public List<Factory> listFactory(){
        return factoryService.listFactory();
    }

    @GetMapping("/index")
    public String getUrl(){
        return "html/index";
    }
}
