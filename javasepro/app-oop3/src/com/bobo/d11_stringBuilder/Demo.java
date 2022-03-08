package com.bobo.d11_stringBuilder;

// target: 了解使用 StringBuilder
public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append('a').append(123).append(false).append(1.22);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        // 相比与使用 String，StringBuilder 可以带来更好的性能以及更方便操作
        // 但 StringBuilder 只是方法，最终的输出还是要以 String
        String ssb = sb.toString();
        System.out.println(ssb);
    }
}
