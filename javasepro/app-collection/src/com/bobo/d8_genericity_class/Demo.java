package com.bobo.d8_genericity_class;

public class Demo {
    public static void main(String[] args) {
        MyArrayList<String> myList1 = new MyArrayList<>();
        myList1.add("String");
        // myList1.add(22); error
    }
}
