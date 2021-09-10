package com.cont.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cont.mapper.UserMapper;
import com.cont.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean login(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",username).eq("password",password);
        User user = this.userMapper.selectOne(queryWrapper);
        if (user !=null ){
            return true;
        }else {
            return false;
        }

    }
}
