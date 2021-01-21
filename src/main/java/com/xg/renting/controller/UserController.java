package com.xg.renting.controller;

import com.xg.renting.common.Const;
import com.xg.renting.common.Response;
import com.xg.renting.enity.User;
import com.xg.renting.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@Api(value = "User",description = "用户")
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired //自动注入
    private UserService userService;  //类似与类的实例化


    @ApiOperation(value = "注册")
    @PostMapping(value = "register")
    public Response register(@RequestBody User user) {
         return  userService.register(user);
    }


    @ApiOperation(value = "登入")
    @PostMapping(value = "login")
    public Response login(@RequestBody User user, HttpSession session){
        User user1 = (User) userService.login(user).getData();
        session.setAttribute(Const.CURRENT_USER,user1);//把登入用户放在‘当前用户’里
        session.setMaxInactiveInterval(30);
        return userService.login(user);
    }

    @ApiOperation(value = "退出登入")
    @PostMapping(value = "logout")
    public Response login(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return Response.createBySuccessMessage("退出登入");
    }





}
