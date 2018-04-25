package com.example.demo.controller;


import com.example.demo.entities.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;

import  java.awt.PageAttributes.*;

@RestController
public class controller {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String gethello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/get_movie_by_id/{id}", method = RequestMethod.GET)
    public films getmoviebyid(@PathVariable String id)
    {
        final String url = "https://swapi.co/api/films/" +id +"/";
        RestTemplate restTemplate = new RestTemplate();
        films film = restTemplate.getForObject(url, films.class);
        return film;
    }

    @RequestMapping(value = "/getstarshipsid/{id}", method = RequestMethod.GET)
    public starships getStarshipbyid(@PathVariable String id)
    {
        final String url = "https://swapi.co/api/starships/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        starships Starships = restTemplate.getForObject(url, starships.class);
        return Starships;
    }

    @RequestMapping(value = "/getvehicle/{id}", method = RequestMethod.GET)
    public vehicles getvehiclebyid(@PathVariable String id)
    {
        final String url = "https://swapi.co/api/vehicles/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        vehicles Vehicle= restTemplate.getForObject(url, vehicles.class);
        return Vehicle;
    }

    @RequestMapping(value = "/getSpeciesbyid/{id}", method = RequestMethod.GET)
    public species getspeciesbyid(@PathVariable String id)
    {
        final String url = "https://swapi.co/api/species/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        species Species = restTemplate.getForObject(url, species.class);
        return Species;
    }

    @RequestMapping(value = "/getplanetbyid/{id}", method = RequestMethod.GET)
    public planets getpalanetbyid(@PathVariable String id)
    {
        final String url = "https://swapi.co/api/planets/" + id + "/";
        RestTemplate restTemplate = new RestTemplate();
        planets Planet = restTemplate.getForObject(url, planets.class);
        return Planet;
    }


}
