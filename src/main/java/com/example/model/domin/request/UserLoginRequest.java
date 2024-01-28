package com.example.model.domin.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author cao
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -8456367840070561891L;

    private String userAccount;

    private String userPassword;

}
