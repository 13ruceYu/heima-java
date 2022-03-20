package com.bobo.d4_collection_object;

public class Movie {
    private String name;
    private double score;
    private String actors;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getActors() {
        return actors;
    }

    public Movie() {
    }

    public Movie(String name, double score, String actors) {
        this.name = name;
        this.score = score;
        this.actors = actors;
    }
}
