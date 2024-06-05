package com.dao;

import com.model.utulisateur;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Create the SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Create the Session
        Session session = factory.openSession();

        try {
            // Create a user object
            utulisateur user = new utulisateur();
            user.setFullname("hamza hamichan");

            // Start a transaction
            Transaction transaction = session.beginTransaction();

            // Save the user object
            session.save(user);

            // Commit transaction
            transaction.commit();
            System.out.println("Insertion successful");
        } catch (Exception e) {
            System.out.println("Insertion failed: " + e.getMessage());
        } finally {
            session.close();
            factory.close();
        }
    }
}
