package com.model;


import jakarta.persistence.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
public class film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_film;
    private String text ;
    private  String description ;
    private Date date_debut;

    private  Date date_fin ;
    private String saison ;
    private String genre ;
    private String createur ;
    private String acteur ;
    private String note ;
    private String image ;
    @ManyToOne
    @JoinColumn(name = "id_ad", referencedColumnName = "id_admin")  // Clé étrangère nommée idu
    private Admin admin;


    @ManyToOne
    @JoinColumn(name = "id_fav", referencedColumnName = "id_favorie")  // Clé étrangère nommée idu
    private Favorie favorie;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId_film() {
        return id_film;
    }

    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    public film(int id_film, Favorie favorie, Admin admin, String image, String note, String acteur, String genre, String createur, String saison, Date date_fin, Date date_debut, String text, String description) {
        this.id_film = id_film;
        this.favorie = favorie;
        this.admin = admin;
        this.image = image;
        this.note = note;
        this.acteur = acteur;
        this.genre = genre;
        this.createur = createur;
        this.saison = saison;
        this.date_fin = date_fin;
        this.date_debut = date_debut;
        this.text = text;
        this.description = description;
    }

    public film(){
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Favorie getFavorie() {
        return favorie;
    }

    public void setFavorie(Favorie favorie) {
        this.favorie = favorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
