package com.bobo.d2_modifier.packageTest;

import com.bobo.d2_modifier.Foo;

public class FooChild extends Foo {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.showPublic();
        FooChild f2 = new FooChild();
        f2.showPublic();
        f2.showProtect();
    }
}
