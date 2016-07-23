package com.my.dao;

import com.my.entity.User;

/**
 * Created by LJ on 16/7/20.
 */
public interface UserDao {
    User saveUser(User user);
    User getUserByLoginNameAndLoginPswd(String loginName, String loginPswd);
}
