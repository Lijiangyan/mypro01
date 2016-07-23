package com.my.dao.impl;

import com.my.dao.OptionDao;
import com.my.entity.Option;
import com.my.entity.Question;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 16/7/21.
 */
public class OptionDaoImpl implements OptionDao {

    private SessionFactory sessionFactory;

    @Override
    public List<Option> getOptionsByQuestionId(int questionId) {
        List<Option> list = new ArrayList<Option>();
        try {
            Session session = sessionFactory.getCurrentSession();
            list = session.createQuery("from Option where question.id = :questionId")
                    .setParameter("questionId", questionId)
                    .list();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return list;

    }

    @Override
    public Option getOptionById(int optionId) {
        Option option = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            option = (Option) session.get(Option.class, optionId);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return option;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
