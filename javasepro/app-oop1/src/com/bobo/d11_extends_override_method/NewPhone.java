package com.bobo.d11_extends_override_method;

/**
 * 重写方法名、行参列表必须与重写方法列表参数一致
 * 私有方法不可被重写
 * 子类重写父类方法时，访问权限必须大于等于父类
 * 子类不能重写父类静态方法
 */
public class NewPhone extends Phone {
    @Override
    public void call() {
        super.call();
        System.out.println("also video call");
    }
    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("also send img");
    }

    // @Override
    public static void fold() {}
}
