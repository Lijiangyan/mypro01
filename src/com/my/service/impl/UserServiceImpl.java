package com.my.service.impl;

import com.my.dao.UserDao;
import com.my.entity.User;
import com.my.service.UserService;

/**
 * Created by LJ on 16/7/20.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public User register(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User login(String loginName, String loginPswd) {
        return userDao.getUserByLoginNameAndLoginPswd(loginName, loginPswd);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
