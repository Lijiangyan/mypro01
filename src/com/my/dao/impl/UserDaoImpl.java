package com.my.dao.impl;

import com.my.dao.UserDao;
import com.my.entity.User;
import com.my.util.MD5Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by LJ on 16/7/20.
 */
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;


    @Override
    public User saveUser(User user) {

        User tempUser = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            String encrypt = MD5Util.toMD5(user.getLoginPswd());
            user.setLoginPswd(encrypt);
            session.save(user);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return user;
    }

    @Override
    public User getUserByLoginNameAndLoginPswd(String loginName, String loginPswd) {

        User user = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            String loginPswdEncrypt = MD5Util.toMD5(loginPswd);
            user = (User) session.createQuery("from User where loginName = :loginName and loginPswd = :loginPswdEncrypt")
                    .setParameter("loginName", loginName)
                    .setParameter("loginPswdEncrypt", loginPswdEncrypt)
                    .uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return user;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
