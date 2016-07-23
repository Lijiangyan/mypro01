package com.my.dao.impl;

import com.my.dao.ScoreDao;
import com.my.entity.Score;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by LJ on 16/7/21.
 */
public class ScoreDaoImpl implements ScoreDao {

    private SessionFactory sessionFactory;

    @Override
    public Score saveScore(Score score) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(score);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return score;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
