package com.bobo.d9_genericity_method;

public class Demo {
    public static void main(String[] args) {
        String[] names = {"whh", "zks", "lsd"};

        printArray(names);

        Integer[] ages = {11, 33, 44};
        printArray(ages);
    }

    public static <T> void printArray(T[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
            }
            sb.append("]");
            System.out.println(sb);
        } else {
            System.out.println(arr);
        }
    }
}
