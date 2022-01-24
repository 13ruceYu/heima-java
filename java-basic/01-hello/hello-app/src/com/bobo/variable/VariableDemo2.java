package com.bobo.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
        // System.out.println(b); error
        int b = 3;
        System.out.println(b);

        char c = 'a';
        System.out.println(c + 1);

        char d = '中';
        System.out.println(d + 1);
    }
}
