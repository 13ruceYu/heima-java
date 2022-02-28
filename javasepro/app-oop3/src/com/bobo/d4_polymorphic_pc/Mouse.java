package com.bobo.d4_polymorphic_pc;

public class Mouse implements USB{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "鼠标接入");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "鼠标拔出");
    }

    public void click() {
        System.out.println("click");
    }
}
