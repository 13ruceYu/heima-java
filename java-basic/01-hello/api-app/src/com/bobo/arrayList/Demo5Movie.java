package com.bobo.arrayList;

import java.util.ArrayList;

public class Demo5Movie {
    public static void main(String[] args) {
        // target: 自定义类 ArrayList
        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("a", 9.0, "b"));
        movieList.add(new Movie("c", 9.0, "d"));
        movieList.add(new Movie("e", 9.0, "e"));

        System.out.println("name\t\tscore\t\tactor\t\t");
        for (int i = 0; i < movieList.size(); i++) {
            Movie m = movieList.get(i);
            System.out.println(m.getName() + "\t\t" + m.getScore() + "\t\t" + m.getActor());
        }
    }
}
