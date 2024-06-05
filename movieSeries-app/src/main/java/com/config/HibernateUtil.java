package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static <T> SessionFactory CreateSessionFactory(Class<T> C) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(C);
        //dwez class
        return configuration.buildSessionFactory();
    }
}
