package com.xg.renting.service.impl;

import com.xg.renting.common.Response;
import com.xg.renting.dao.UserMapper;
import com.xg.renting.enity.User;
import com.xg.renting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Response register(User user) {       //注册
        String userName = userMapper.selectNameByUser(user.getUser_name());
        if (userName != null) {
            return Response.createByErrorMessage("用户名存在");      //如果用户名存在，
        }
        int result = userMapper.register(user);
        if (result == 1) {
            return Response.createBySuccessMessage("注册成功");     //用户注册成功
        }
            return Response.createByErrorMessage("注册失败");      //用户注册失败
    }

    @Override
    public Response login(User user) {  //登入
        User ruser = userMapper.login(user);
        if (ruser != null) {
            ruser.setUser_password(null);//密码置空
            return Response.createBySuccess("登入成功", ruser);
        }
        return Response.createByErrorMessage("登入失败");

    }
}
