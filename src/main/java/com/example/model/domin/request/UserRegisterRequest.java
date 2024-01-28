package com.example.model.domin.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author cao
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -8456367840070561891L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
