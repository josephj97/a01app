package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class People {
    String name;
    String birth_date;
    String eye_color;
    String gender;
    String hair_color;
    String height;
    String mass;
    String skin_color;
    String homeworld;
    List<films> Films = new ArrayList<>();
    List<species> Species = new ArrayList<>();
    List<starships> Starships = new ArrayList<>();
    List<vehicles> Vehicles = new ArrayList<>();
    String url;
    String created;
    String edited;

    public People(String name, String birth_date, String eye_color, String gender, String hair_color, String height, String mass, String skin_color, String homeworld, List<films> films, List<species> species, List<starships> starships, List<vehicles> vehicles, String url, String created, String edited) {
        this.name = name;
        this.birth_date = birth_date;
        this.eye_color = eye_color;
        this.gender = gender;
        this.hair_color = hair_color;
        this.height = height;
        this.mass = mass;
        this.skin_color = skin_color;
        this.homeworld = homeworld;
        Films = films;
        Species = species;
        Starships = starships;
        Vehicles = vehicles;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<films> getFilms() {
        return Films;
    }

    public void setFilms(List<films> films) {
        Films = films;
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
