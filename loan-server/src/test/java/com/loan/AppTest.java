package com.loan;

import com.loan.entity.User;
import com.loan.service.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-context.xml"})
public class AppTest  {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserAdd(){
        User user = new User();
        user.setPhone("15087002406");
        user.setPassword("123456");
        user.setToken("123456");

        userMapper.insert(user);
    }
}
