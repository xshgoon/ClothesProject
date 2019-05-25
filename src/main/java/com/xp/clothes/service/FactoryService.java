package com.xp.clothes.service;



import com.xp.clothes.mapper.FactoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FactoryService {
    @Resource
    private FactoryMapper factoryMapper;

}
