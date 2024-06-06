package com.dao;

import com.model.Serie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Create the Session
        Session session = factory.openSession();

        try {
            // Start a transaction for Create operation
            Transaction transaction = session.beginTransaction();

            // Create a Serie object
            Serie serie = new Serie();
            serie.setTitre("Breaking Bad");
            serie.setDescription("A high school chemistry teacher turned methamphetamine producer.");
            serie.setDate_debut(new Date()); // Set appropriate date
            serie.setDatefin(new Date()); // Set appropriate date
            serie.setSaison("5");
            serie.setGenre("Crime, Drama, Thriller");
            serie.setCreateur("Vince Gilligan");
            serie.setActeur("Bryan Cranston, Aaron Paul");
            serie.setNot("9.5");
            serie.setImage("breaking_bad.jpg");


  
//            session.save(serie);


            transaction.commit();
            System.out.println("Serie insertion successful");
            
            
            transaction = session.beginTransaction();

            // Accept ID input for deletion
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the ID of the Serie to delete:");
            int serieIdToDelete = scanner.nextInt();

            // Retrieve the Serie object to be deleted
            Serie serieToDelete = session.get(Serie.class, serieIdToDelete);
            if (serieToDelete != null) {
                // Delete the Serie object
                session.delete(serieToDelete);
                System.out.println("Serie deletion successful");
            } else {
                System.out.println("Serie not found for deletion");
            }

            // Commit transaction for Delete
            transaction.commit();

          
            // Read all Serie objects to verify the deletion
            transaction = session.beginTransaction();
            List<Serie> seriesList = session.createQuery("from Serie", Serie.class).list();
            System.out.println("All Series: " + seriesList);
            transaction.commit();

        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
        } finally {
            session.close();
            factory.close();
        }
    }
}
