package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class films {
    String title;
    int episode_id;
    String opening_crawl;
    String director;
    String producer;
    String release_date;
    List<species> Species = new ArrayList<>();
    List<starships> Starships = new ArrayList<>();
    List<vehicles> Vehicles = new ArrayList<>();
    List<People> Characters = new ArrayList<>();
    List<planets> Planets = new ArrayList<>();
    String url;
    String created;
    String edited;

    public films(String title, int episode_id, String opening_crawl, String director, String producer, String release_date, List<species> species, List<starships> starships, List<vehicles> vehicles, List<People> characters, List<planets> planets, String url, String created, String edited) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        Species = species;
        Starships = starships;
        Vehicles = vehicles;
        Characters = characters;
        Planets = planets;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public List<species> getSpecies() {
        return Species;
    }

    public void setSpecies(List<species> species) {
        Species = species;
    }

    public List<starships> getStarships() {
        return Starships;
    }

    public void setStarships(List<starships> starships) {
        Starships = starships;
    }

    public List<vehicles> getVehicles() {
        return Vehicles;
    }

    public void setVehicles(List<vehicles> vehicles) {
        Vehicles = vehicles;
    }

    public List<People> getCharacters() {
        return Characters;
    }

    public void setCharacters(List<People> characters) {
        Characters = characters;
    }

    public List<planets> getPlanets() {
        return Planets;
    }

    public void setPlanets(List<planets> planets) {
        Planets = planets;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }
}
