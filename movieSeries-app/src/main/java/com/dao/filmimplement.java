package com.dao;
import com.model.film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class filmimplement  implements Ifiml {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveFilm(film f) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(f);
        tx.commit();
        session.close();
    }

    @Override
    public List<film> getAllFilms() {
        Session session = sessionFactory.openSession();
        List<film> films = session.createQuery("from film", film.class).list();
        session.close();
        return films;
    }

    @Override
    public film getFilmById(int id) {
        Session session = sessionFactory.openSession();
        film f = session.get(film.class, id);
        session.close();
        return f;
    }

    @Override
    public void updateFilm(film f) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(f);
        tx.commit();
        session.close();
    }

    @Override
    public void deleteFilm(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        film f = session.get(film.class, id);
        if (f != null) {
            session.delete(f);
        }
        tx.commit();
        session.close();
    }
}



