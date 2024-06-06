package com.dao;

import com.model.Admin;
import com.model.Favorie;
import com.model.Users;
import com.model.film;
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


        try {

            // Create a user object
            film films = new film();
            films.setActeur("Acterur film1");
            films.setCreateur("createurFim1");

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date dateDebut = dateFormat.parse("2020/02/02");
            films.setDate_debut(dateDebut);


            DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
            Date datefin = dateFormat2.parse("2024/04/04");
            films.setDate_fin(datefin);

            films.setDescription("film_description");

            films.setGenre("genre film1");
            films.setImage("profile");

            films.setNote("note1");
            films.setSaison("filmSaison");
            films.setText("filmText");


            Admin admin = session.get(Admin.class,1);
            films.setAdmin(admin);
            Favorie favorie = session.get(Favorie.class,1);
            films.setFavorie(favorie);



            Transaction transaction = session.beginTransaction();


            // Save the user object
            session.save(films);

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
