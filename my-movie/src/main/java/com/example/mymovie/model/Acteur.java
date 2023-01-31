package com.example.mymovie.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Acteur {
    @ApiModelProperty(notes = "nom of the film",name="nom",required=true,value="test nom")
    private String nom;
    @ApiModelProperty(notes = "prenom of the film",name="prenom",required=true,value="test prenom")
    private String prenom;
    @ApiModelProperty(notes = "datenaissance of the film",name="datenaissance",required=true,value="test datenaissance")
    private String datenaissance;
    @ApiModelProperty(notes = "filmography of the film",name="filmographye",required=true,value="test filmography")
    private List<Film> filmography;

    public Acteur(String nom, String prenom, String dateNaissance) {
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

    public String getDateNaissance() {
        return datenaissance;
    }

    public List<Film> getFilmographie() {
        return filmography;
    }
}
