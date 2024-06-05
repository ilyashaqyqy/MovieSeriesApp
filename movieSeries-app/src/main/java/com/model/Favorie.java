package com.model;


import javax.persistence.*;

@Entity
public class Favorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_favorie;
    @ManyToOne
    @JoinColumn(name = "idu", referencedColumnName = "id_user")  // Clé étrangère nommée idu
    private Users users;

    public int getId_favorie() {
        return id_favorie;
    }

    public Favorie(){
    }

    public Favorie(int id_favorie, Users users) {
        this.id_favorie = id_favorie;
        this.users = users;
    }

    public void setId_favorie(int id_favorie) {
        this.id_favorie = id_favorie;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Favorie{" +
                "id_favorie=" + id_favorie +
                ", user=" + users +
                '}';
    }
}

