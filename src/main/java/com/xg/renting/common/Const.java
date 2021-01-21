package com.xg.renting.common;

public class Const {

    //当前用户
    public static final String CURRENT_USER = "currentUser";

    public interface Role{
        int CUSTOMER = 1; //普通用户
        int MERCHANT = 2;//商户
        int ADMIN = 3;  //管理员

    }

}
