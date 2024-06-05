package com.dao;

import com.model.Users;
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
            Users users = new Users();
            users.setNom_user("lfena");
            users.setPrenom_user("najia");
            users.setMail_user("mail1");
            users.setPassword_user("1234");


            // Start a transaction
            Transaction transaction = session.beginTransaction();


            // Save the user object
            session.save(users);

            // Commit transaction
            transaction.commit();
            System.out.println("Insertion successful");

            //---------------------------------------------
        } catch (Exception e) {
            System.out.println("Insertion failed: " + e.getMessage());
        } finally {
            session.close();
            factory.close();
        }
    }
}
