package com.my.dao.impl;

import com.my.dao.SuiteDao;
import com.my.entity.Suite;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public class SuiteDaoImpl implements SuiteDao {

    private SessionFactory sessionFactory;

    public Suite getSuiteById(int id) {

        Suite suite = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            suite = (Suite) session.get(Suite.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return suite;
    }

    @Override
    public List<Suite> getSuitesByModuleId(int moduleId) {
        List<Suite> list = new ArrayList<Suite>();
        try {
            Session session = sessionFactory.getCurrentSession();
            list = session.createQuery("from Suite where module.id = :moduleId")
                    .setParameter("moduleId", moduleId)
                    .list();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return list;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
