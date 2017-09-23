package com.loan.manage.controller.user;


import com.loan.api.user.UserService;
import com.loan.common.Result;
import com.loan.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 发送验证码
     * @return
     */
    @RequestMapping(value = "sendVerifyCode", produces = "application/json")
    public @ResponseBody Result sendVerifyCode(){
        return userService.sendVerifyCode("");
    }

    /**
     * 用户注册
     * @param phone
     * @param password
     * @param verifyCode
     * @return
     */
    @RequestMapping(value = "sendVerifyCode", produces = "application/json")
    public @ResponseBody Result userRegister(
            @RequestParam("phone") String phone,
            @RequestParam("password") String password,
            @RequestParam("verifyCode") String verifyCode
    ){
        return userService.userRegister(phone,verifyCode,password);
    }

    /**
     * 上传用户信息
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "uploadUserInfo", produces = "application/json")
    public @ResponseBody Result uploadUserInfo(
            @ModelAttribute("userInfo")UserInfo userInfo
            ){
        return userService.uploadPersonInfo(userInfo);
    }

}
