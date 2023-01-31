package com.example.mymovie.model;

import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private Acteur acteurPrincipal;
    private Date datesortie;

    public Film(String title, String realisateur, Acteur acteurPrincipal, Date datesortie) {
        this.titre = title;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.datesortie = datesortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitle(String title) {
        this.titre = title;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public Acteur getActeurPrincipal() {
        return acteurPrincipal;
    }

    public void setActeurPrincipal(Acteur acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }
}
