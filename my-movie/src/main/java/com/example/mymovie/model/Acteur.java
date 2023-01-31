package com.example.mymovie.model;

import java.util.Date;
import java.util.List;

public class Acteur {
    private String nom;
    private String prenom;
    private Date datenaissance;
    private List<Film> filmography;

    public Acteur(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = dateNaissance;
    }

    public void addFilm(Film film) {
        filmography.add(film);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return datenaissance;
    }

    public List<Film> getFilmographie() {
        return filmography;
    }
}
