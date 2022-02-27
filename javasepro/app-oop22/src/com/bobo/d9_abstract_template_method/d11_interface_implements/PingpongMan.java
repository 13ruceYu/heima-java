package com.bobo.d9_abstract_template_method.d11_interface_implements;

public class PingpongMan implements Sportsman, Law {
    private String name;

    public PingpongMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(name + " abide by the law");
    }

    @Override
    public void run() {
        System.out.println(name + " practice running");
    }

    @Override
    public void compete() {
        System.out.println(name + " take part in competition");
    }
}
