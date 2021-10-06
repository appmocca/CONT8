package com.cont.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cont.mapper.UserMapper;
import com.cont.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import java.util.*;

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
    public List<User> getUserList(String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",username);
        List<User> users = this.userMapper.selectList(queryWrapper);
        if (users.isEmpty()){
            return null;
        }
        return users;
    }

    public boolean userAdd(String username,String password,String name, String email){
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setName(name);
        user.setEmail(email);
        int insert = this.userMapper.insert(user);
        if (insert == 1){
            return true;
        }
        return false;
    }


}
