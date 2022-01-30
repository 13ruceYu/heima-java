package com.bobo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();

        float num = rd.nextFloat();
        System.out.println(num);
    }
}
