package com.xg.renting.service;

import com.xg.renting.common.Response;
import com.xg.renting.enity.User;

public interface UserService {

    Response register(User user);
    Response login(User user);
}
