package com.bobo.domain;

public class User {
    private String name;
    private String addr;

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", addr='" + addr + '\'' + '}';
    }

    public User() {
    }

    public User(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
