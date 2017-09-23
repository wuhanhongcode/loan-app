package com.loan.manage.controller.user;


import com.loan.api.user.UserService;
import com.loan.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "sendVerifyCode", produces = "application/json")
    public @ResponseBody Result sendVerifyCode(){
        return userService.sendVerifyCode("");
    }
}
