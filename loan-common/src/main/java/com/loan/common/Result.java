package com.loan.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable{

    public final static int SUCCESS = 1;
    public final static int FAIL = 0;

    private Integer code;
    private String message;
    private Object data;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
