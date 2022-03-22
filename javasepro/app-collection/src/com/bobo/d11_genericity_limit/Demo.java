package com.bobo.d11_genericity_limit;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Benz> benzs = new ArrayList<>();
        benzs.add(new Benz());
        benzs.add(new Benz());
        benzs.add(new Benz());

        ArrayList<Bmw> bmws = new ArrayList<>();
        bmws.add(new Bmw());
        bmws.add(new Bmw());
        bmws.add(new Bmw());

        go(benzs);
        go(bmws);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        // go(dogs);
    }

    public static void go(ArrayList<? extends Car> cars) {

    }
}

class Dog {}

class Car {}

class Benz extends Car {

}

class Bmw extends Car {

}
