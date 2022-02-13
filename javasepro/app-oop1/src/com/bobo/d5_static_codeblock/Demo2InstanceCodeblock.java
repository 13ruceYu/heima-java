package com.bobo.d5_static_codeblock;

public class Demo2InstanceCodeblock {
    /**
     * 实例（对象，构造）代码块，属于对象，与对象一起加载，自动触发执行
     * 初始化实例成员
     */
    {
        System.out.println("instance code block...");
        name = "whh";
    }
    static {
        // name = "whh";
    }
    private String name;
    public Demo2InstanceCodeblock() {
        System.out.println("constructor excluded...");
    }
    public Demo2InstanceCodeblock(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Demo2InstanceCodeblock d2 = new Demo2InstanceCodeblock();
        System.out.println(d2.name);
    }
}
