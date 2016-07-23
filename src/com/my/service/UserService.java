package com.my.service;

import com.my.entity.User;

/**
 * Created by LJ on 16/7/20.
 */
public interface UserService {
    User register(User user);
    User login(String loginName, String loginPswd);
}
