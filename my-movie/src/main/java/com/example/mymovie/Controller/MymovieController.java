package com.example.mymovie.Controller;

import com.example.mymovie.model.Acteur;
import com.example.mymovie.model.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
@RestController

public class MymovieController {
    private List<Film> films;
    private List<Acteur> acteurs;

    public MymovieController() {
        acteurs = new ArrayList<>();
        Acteur acteur1 = new Acteur("charafeddin", "jaiber", new Date());
        Acteur acteur2 = new Acteur("toto", "tata", new Date());
        acteurs.add(acteur1);
        acteurs.add(acteur2);

        films = new ArrayList<>();
        Film film1 = new Film("miage", "buffa", acteur1, new Date());
        Film film2 = new Film("siris", "blandel", acteur2, new Date());
        films.add(film1);
        films.add(film2);
    }
    @GetMapping("/acteurs")
    public List<Acteur> getActeurs() {
        return acteurs;
    }

    @GetMapping("/acteurs/{nom}")
    public Acteur getActeurByNom(@PathVariable String nom) {
        for (Acteur acteur : acteurs) {
            if (acteur.getNom().equals(nom)) {
                return acteur;
            }
        }
        return null;
    }
    @GetMapping("/acteurs/film/{titre}")
    public List<Acteur> getActeursByFilm(@PathVariable String titre) {
        List<Acteur> acteursByFilm = new ArrayList<>();
        for (Film film : films) {
            if (film.getTitre().equals(titre)) {
                acteursByFilm.add(film.getActeurPrincipal());
                break;
            }
        }
        return acteursByFilm;
    }

    @GetMapping("/films")
    public List<Film> getFilms() {
        return films;
    }

    @GetMapping("/films/{titre}")
    public Film getFilmByTitre(@PathVariable String titre) {
        for (Film film : films) {
            if (film.getTitre().equals(titre)) {
                return film;
            }
        }
        return null;
    }
    


}
