package com.loan.manage.test;

import com.loan.api.user.UserService;
import com.loan.common.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-context.xml"})
public class AppTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testDubbo(){


        Result result = userService.sendVerifyCode("");
        System.out.println(result.getCode());
        System.out.println(result.getMessage());
    }

}
