package com.bobo.d5_static_codeblock;

public class Demo1StaticCodeblock {
    /**
     * 与类一起加载，自动触发，优先执行
     * 可以在程序加载时进行静态数据的初始化操作（准备内容）
     */
    static {
        System.out.println("static code block excluded========");
        name = "whh";
    }

    public static String name;

    public static void main(String[] args) {
        // target: learn static code block
        System.out.println("main method excluded");
        System.out.println(name);
    }
}
