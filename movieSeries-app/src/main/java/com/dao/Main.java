package com.dao;

import com.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create the SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Create the Session
        Session session = factory.openSession();

int i ;
        try {
            // Create a user object
            for (i=0;i<=10;i++) {
                Users user = new Users();
                user.setMail_user("mail"+i+"");
                user.setPrenom_user("prenomUser "+i + "");
                user.setNom_user("NomUser"+i+"");
                user.setPassword_user("pass"+i+"");

                Transaction transaction = session.beginTransaction();


                // Save the user object
                session.save(user);

                // Commit transaction
                transaction.commit();
                System.out.println("Insertion successful");
            }
            //---------------------------------------------
        } catch (Exception e) {
            System.out.println("Insertion failed: " + e.getMessage());
        } finally {
            session.close();
            factory.close();
        }
    }
}
