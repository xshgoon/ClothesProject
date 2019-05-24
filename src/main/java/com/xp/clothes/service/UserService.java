package com.xp.clothes.service;

import com.xp.clothes.bean.Userxp;
import com.xp.clothes.mapper.UserxpMapper;
import com.xp.clothes.util.PasswordUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: youchuang.shi
 * @since: 2019/5/24 14:48
 * @history: 1.2019/5/24 created by youchuang.shi
 */
@Service
public class UserService {
    @Resource
    private UserxpMapper userxpMapper;

    /**
     * 用户注册接口
     *
     * @param user
     * @return
     */
    public String rejester(Userxp user) {
        if (user != null) {
            if(checkUser(user.getUsername())){
                return "用户名已存在！";
            }else{
                user.setPassword(PasswordUtil.md5(user.getUsername(), user.getPassword()));
                userxpMapper.insertSelective(user);
                return "注册成功！";
            }
        }else{
            return "注册失败！";
        }

    }

    /**
     * 校验用户名是否重复
     *
     * @param userName
     * @return
     */
    public Boolean checkUser(String userName) {
        List<Userxp> userxps = userxpMapper.checkUser(userName);
        if (userxps != null && userxps.size() > 0) {
           return false;
        }else {
            return true;
        }
    }
}
