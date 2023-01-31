package com.example.myfinder.constructor;


import com.example.myfinder.model.Acteur;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MymovieController {

    private RestTemplate restTemplate;

    public MymovieController() {
        this.restTemplate = new RestTemplate();
    }
    @HystrixCommand(fallbackMethod = "getActeursByNameFallback")

    @GetMapping("/acteurs/{nom}")
    public List<Acteur> getActeursByName(@PathVariable String nom) {
        String url = "http://localhost:8080/acteurs/" + nom;
        List<Acteur> acteur = restTemplate.getForObject(url, List.class);
        return acteur;
    }
    public List<Acteur> getActeursByNameFallback(@PathVariable String nom) {
        return new ArrayList<>();
    }
}
