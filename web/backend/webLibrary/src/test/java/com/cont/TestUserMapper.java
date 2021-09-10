package com.cont;

import com.cont.mapper.UserMapper;
import com.cont.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user = new User();
        user.setUserName("han");
        user.setEmail("12723817@qq.com");
        user.setPassword("213131");
        user.setName("sdadsadsa");
        int result = this.userMapper.insert(user);
        System.out.println("result =>" +result);
        System.out.println("id => "+user.getId());
    }
    @Test
    public void TestUpdateById(){
        User user = new User();
        user.setId(1L);
        user.setUserName("sdsadsadsa");
        user.setPassword("1231312321");
        int result = this.userMapper.updateById(user);
        System.out.println(result);
    }
    @Test
    public void TestDeleteById(){
        int result = this.userMapper.deleteById(2L);
        System.out.println("result =>" +result);
    }
}
