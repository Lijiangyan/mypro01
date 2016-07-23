package com.my.dao.impl;

import com.my.dao.ResultDao;
import com.my.entity.Module;
import com.my.entity.Option;
import com.my.entity.Result;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public class ResultDaoImpl implements ResultDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public Result getResultById(int resultId) {
        Result result = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            result = (Result) session.get(Result.class, resultId);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    @Override
    public Result getResultBySuiteId(int suiteId) {
        Result result = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            result = (Result) session.createQuery("from Result where suite.id = :suiteId")
                    .setParameter("suiteId", suiteId)
                    .uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
