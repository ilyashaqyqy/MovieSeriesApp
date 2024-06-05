package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_serie;
    private String titre;
    private  String description ;
    private Date date_debut;
    private Date datefin ;
    private  String  saison  ;
    private String genre;
    private  String createur;
    private  String acteur;
    private String not ;
    private String image ;
    @ManyToOne
    @JoinColumn(name = "id_fav", referencedColumnName = "id_favorie")  // Clé étrangère nommée idu
    private Favorie favorie;

    @ManyToOne
    @JoinColumn(name = "id_ad", referencedColumnName = "id_admin")  // Clé étrangère nommée idu
    private Admin admin;

    public int getId_serie() {
        return id_serie;
    }

    public void setId_serie(int id_serie) {
        this.id_serie = id_serie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public Favorie getFavorie() {
        return favorie;
    }

    public void setFavorie(Favorie favorie) {
        this.favorie = favorie;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Serie(int id_serie, String description, String titre, Date date_debut, Date datefin, String saison, String genre, String createur, String acteur, String not, String image, Favorie favorie, Admin admin) {
        this.id_serie = id_serie;
        this.description = description;
        this.titre = titre;
        this.date_debut = date_debut;
        this.datefin = datefin;
        this.saison = saison;
        this.genre = genre;
        this.createur = createur;
        this.acteur = acteur;
        this.not = not;
        this.image = image;
        this.favorie = favorie;
        this.admin = admin;
    }
    public Serie(){
    }


    @Override
    public String toString() {
        return "Serie{" +
                "id_serie=" + id_serie +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_debut=" + date_debut +
                ", datefin=" + datefin +
                ", saison='" + saison + '\'' +
                ", genre='" + genre + '\'' +
                ", createur='" + createur + '\'' +
                ", acteur='" + acteur + '\'' +
                ", not='" + not + '\'' +
                ", image='" + image + '\'' +
                ", favorie=" + favorie +
                ", admin=" + admin +
                '}';
    }
}
