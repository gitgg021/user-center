package com.example.model.domin.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class UserSearchRequest implements Serializable {
    private static final long serialVersionUID = -8456367840070561891L;
    private String username;
    private String userAccount;
    private String gender;
    private String phone;
    private String email;
    private Integer userStatus;
    private String userRole;
    private String planetCode;
    private Date updateTime;
    private Date createTime;

}
