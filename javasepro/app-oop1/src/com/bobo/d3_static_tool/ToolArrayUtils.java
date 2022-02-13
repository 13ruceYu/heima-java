package com.bobo.d3_static_tool;

public class ToolArrayUtils {
    /**
     * 私有化构造器
     */
    private ToolArrayUtils() {
    }

    public static String toString(int[] arr) {
        String res = null;
        if (arr != null) {

            for (int i = 0; i < arr.length; i++) {
                res += (i == arr.length - 1 ? arr[i] : arr[i] + ", ");
            }

            res = "[" + res + "]";

        }
        return res;

    }

    public static double getAverage(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        return (sum - min - max) * 1.0 / (arr.length - 2);
    }
}
