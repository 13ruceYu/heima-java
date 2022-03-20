package com.bobo.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Spider Man", 7.0, "Parker"));
        movies.add(new Movie("Super Man", 6.9, "super man"));

        for (Movie movie : movies) {
            System.out.println("name: " + movie.getName());
            System.out.println("score: " + movie.getScore());
            System.out.println("actors: " + movie.getActors());
        }
    }
}
