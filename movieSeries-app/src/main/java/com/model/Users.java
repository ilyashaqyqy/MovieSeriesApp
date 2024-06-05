package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_user ;
    private  String nom_user;
    private  String prenom_user ;
    private String mail_user ;
    private String password_user ;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public Users(){
    }

    public Users(int id_user, String nom_user, String prenom_user, String mail_user, String password_user) {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.mail_user = mail_user;
        this.password_user = password_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public String getMail_user() {
        return mail_user;
    }

    public void setMail_user(String mail_user) {
        this.mail_user = mail_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }
}
