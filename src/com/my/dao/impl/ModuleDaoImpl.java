package com.my.dao.impl;

import com.my.dao.ModuleDao;
import com.my.entity.Module;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 16/7/20.
 */
public class ModuleDaoImpl implements ModuleDao {

    private SessionFactory sessionFactory;

    @Override
    public List<Module> getAllModule() {
        List<Module> list = new ArrayList<Module>();
        try {
            Session session = sessionFactory.getCurrentSession();
            list = session.createCriteria(Module.class).list();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return list;
    }

    @Override
    public Module getModuleById(int id) {

        Module module = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            module = (Module) session.get(Module.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
            throw e;
        }
        return module;
    }

    @Override
    public List<Integer> getAllId() {
        List<Integer> list = new ArrayList<Integer>();
        try {
            Session session = sessionFactory.getCurrentSession();
            list = session.createQuery("select id from Module").list();
            System.out.println("all module id = " + list);
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
