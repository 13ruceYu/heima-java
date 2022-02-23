package com.bobo.d6_abstract_class;

/**
 * 抽象类
 */

// 存在一定问题，虽然动物都会跑，但是每个动物跑起来不一样，所以不要定义跑的方法体
// public class Animal {
//     public void run() {
//         System.out.println("跑");
//     }
// }

public abstract class Animal {
    public abstract void run();
}
