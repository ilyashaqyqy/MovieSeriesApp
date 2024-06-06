package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HibernateDAOImpl implements HibernateDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Object entity) throws InstantiationException, IllegalAccessException {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }
    }

    @Override
    public <T> void delete(Class<T> entityClass, Integer id) throws InstantiationException, IllegalAccessException {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            T entity = session.get(entityClass, id);
            if (entity != null) {
                session.delete(entity);
            }
            transaction.commit();
        }
    }

    @Override
    public void merge(Object entity) throws InstantiationException, IllegalAccessException {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }
    }

    @Override
    public <T> ArrayList<T> show(Class<T> entityClass) throws InstantiationException, IllegalAccessException {
        try (Session session = sessionFactory.openSession()) {
            List<T> result = session.createQuery("from " + entityClass.getName(), entityClass).list();
            return new ArrayList<>(result);
        }
    }

    @Override
    public <T> Object get(Class<T> entityClass, Integer id) throws InstantiationException, IllegalAccessException {
        try (Session session = sessionFactory.openSession()) {
            return session.get(entityClass, id);
        }
    }
}
