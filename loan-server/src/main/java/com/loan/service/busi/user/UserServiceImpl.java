package com.loan.service.busi.user;

import com.loan.api.user.UserService;
import com.loan.common.Result;
import com.loan.entity.User;
import com.loan.service.mapper.UserMapper;
import com.loan.tools.SmsTools;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public Result userRegister(String phone, String verifyCode, String password) {

        if(StringUtils.isEmpty(phone)){
            return new Result(Result.FAIL,"电话号码为空");
        }

        if(StringUtils.isEmpty(password)){
            return new Result(Result.FAIL,"密码为空");
        }

        User user = new User();
        user.setPhone(phone);
        user.setPassword(password);
        user.setToken("token gen");
        user.setVerifyCode(verifyCode);

        int insertCount = userMapper.insert(user);

        return insertCount > 0 ? new Result(Result.SUCCESS,"注册成功") : new Result(Result.FAIL,"注册失败");
    }

    public Result sendVerifyCode(String phone) {

        if (StringUtils.isEmpty(phone)){
            return new Result(Result.FAIL,"电话号码为空");
        }
        String verifyCode = "";

        String message = "";

        boolean sendFlag = SmsTools.sendMessage(phone,message);

        Result result;

        if(sendFlag){
            result = new Result(Result.SUCCESS,"验证码发送成功");
            result.setMessage(verifyCode);
        }else{
            result = new Result(Result.FAIL,"验证码发送失败");
        }
        return result;
    }
}
