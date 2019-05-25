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
     * 注册接口
     *
     * @param user
     * @return
     */
    public Boolean rejester(Userxp user) {
        if (user != null) {
            if (checkUser(user.getUsername())) {
                user.setPassword(PasswordUtil.md5(user.getUsername(), user.getPassword()));
                userxpMapper.insertSelective(user);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param user
     * @return
     */
    public Userxp login(Userxp user) {
        if (user != null) {
            user.setPassword(PasswordUtil.md5(user.getUsername(), user.getPassword()));
            return userxpMapper.queryUser(user);
        }
        return null;
    }


    /**
     * 校验接口
     *
     * @param userName
     * @return
     */
    public Boolean checkUser(String userName) {
        if (userName == null) {
            return false;
        }
        int count = userxpMapper.checkUser(userName);
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    public List<Userxp> test() {
        return userxpMapper.selectByExample(null);
    }

}
