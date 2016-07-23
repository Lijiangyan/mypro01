package com.my.dao.impl;

import com.my.dao.QuestionDao;
import com.my.entity.Question;
import com.my.entity.Suite;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public class QuestionDaoImpl implements QuestionDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public List<Question> getQuestionsBySuiteId(int suitId) {
        List<Question> list = new ArrayList<Question>();
        try {
            Session session = sessionFactory.getCurrentSession();
            list = session.createQuery("from Question where suite.id = :suitId")
                    .setParameter("suitId", suitId)
                    .list();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return list;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
