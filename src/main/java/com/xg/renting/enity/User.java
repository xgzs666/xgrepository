package com.xg.renting.enity;

import lombok.Data;

@Data
public class User {

    //用户属性：用户ID、用户名、用户密码、用户类型
    private int user_id;
    private String user_name;
    private String user_password;
    private int user_role;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
