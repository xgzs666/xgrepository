package com.xg.renting.enity;

import lombok.Data;

@Data
public class User {

    //用户属性：用户ID、用户名、用户密码、用户电话、用户类型
    private int user_id;
    private String user_name;
    private String user_password;
    private int user_telephone;
    private int user_role;

}
