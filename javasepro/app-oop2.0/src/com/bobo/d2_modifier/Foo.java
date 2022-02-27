package com.bobo.d2_modifier;

public class Foo {
    // 本类
    private void showPrivate() {
        System.out.println("private");
    }

    // 本类、同一个包下类
    void showV() {
        System.out.println("default");
    }

    // 本类、同一包下类、其他包子类
    protected void showProtect() {
        System.out.println("protect");
    }

    // 任何地方
    public void showPublic() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        f.showPrivate();
        f.showV();
        f.showProtect();
        f.showPublic();
    }
}
