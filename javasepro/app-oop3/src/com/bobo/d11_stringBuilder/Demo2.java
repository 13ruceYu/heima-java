package com.bobo.d11_stringBuilder;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(toString(arr1));
        int[] arr2 = {11,33};
        System.out.println(toString(arr2));
        int[] arr3 = {};
        System.out.println(toString(arr3));
    }

    public static String toString(int[] arr) {
        String res = "";
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            res = sb.toString();
        } else {
            res = null;
        }

        return res;
    }
}
