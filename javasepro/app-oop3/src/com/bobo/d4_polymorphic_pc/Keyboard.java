package com.bobo.d4_polymorphic_pc;

public class Keyboard implements USB {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "键盘成功接入");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "键盘成功拔出");
    }

    public void keyDown() {
        System.out.println("keyDown");
    }
}
