package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class species {
    String name;
    String classification;
    String designation;
    String average_height;
    String average_lifespan;
    String hair_colors;
    String skin_colors;
    String language;
    String homeworld;
    List<People> people = new ArrayList<>();
    List<films> Films = new ArrayList<>();
    String url;
    String created;
    String edited;

    public species(String name, String classification, String designation, String average_height, String average_lifespan, String hair_colors, String skin_colors, String language, String homeworld, List<People> people, List<films> films, String url, String created, String edited) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.average_height = average_height;
        this.average_lifespan = average_lifespan;
        this.hair_colors = hair_colors;
        this.skin_colors = skin_colors;
        this.language = language;
        this.homeworld = homeworld;
        this.people = people;
        Films = films;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverage_height() {
        return average_height;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public List<films> getFilms() {
        return Films;
    }

    public void setFilms(List<films> films) {
        Films = films;
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
