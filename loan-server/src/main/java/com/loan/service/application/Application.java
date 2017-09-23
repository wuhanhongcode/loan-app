package com.loan.service.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目启动类
 */
public class Application {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:/spring/spring-context.xml"});
        context.start();
        System.in.read();
        System.out.println("系统启动成功..........");
    }
}
