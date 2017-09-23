package com.loan.tools;

import org.apache.commons.lang.StringUtils;

/**
 * 短信相关工具类
 */
public class SmsTools {

    public static boolean sendMessage(String phone,String message){
        if(StringUtils.isEmpty(phone)){
            return false;
        }

        if(StringUtils.isEmpty(message)){
            return false;
        }

        return true;
    }

}
