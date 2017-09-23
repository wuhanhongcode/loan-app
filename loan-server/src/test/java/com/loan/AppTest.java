package com.loan;

import com.loan.entity.User;
import com.loan.service.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-context.xml"})
public class AppTest  {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JedisPool jedisPool;

    @Test
    public void testUserAdd(){
        User user = new User();
        user.setPhone("15087002406");
        user.setPassword("123456");
        user.setToken("123456");

        userMapper.insert(user);
    }

    @Test
    public void testRedis(){
        Jedis jedis = jedisPool.getResource();

        String result = jedis.set("foo","123456");
        System.out.println(result);
    }
}
