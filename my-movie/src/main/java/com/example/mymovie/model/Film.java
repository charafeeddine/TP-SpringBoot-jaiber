package com.example.mymovie.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Film {
    @ApiModelProperty(notes = "title of the film",name="title",required=true,value="test title")
    private String title;
    @ApiModelProperty(notes = "realisateur of the film",name="realisateur",required=true,value="test realisateur")
    private String realisateur;
    @ApiModelProperty(notes = "acteurPrincipal of the film",name="acteurPrincipal",required=true,value="test acteurPrincipal")
    private Acteur acteurPrincipal;
    @ApiModelProperty(notes = "datesortie of the film",name="datesortie",required=true,value="test datesortie")

    private String datesortie;

    public Film(String title, String realisateur, Acteur acteurPrincipal, String datesortie) {
        this.title = title;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.datesortie = datesortie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(String datesortie) {
        this.datesortie = datesortie;
    }
}
