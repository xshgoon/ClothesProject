package com.xp.clothes.service;

import com.xp.clothes.bean.Factory;
import com.xp.clothes.mapper.FactoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FactoryService {
    @Resource
    private FactoryMapper factoryMapper;

    public List<Factory> listFactory(){
        return factoryMapper.selectByExample(null);
    }

}
