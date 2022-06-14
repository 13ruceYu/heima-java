package com.bobo.domain;

public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", type='" + type + '\'' + ", description='" + description + '\'' + '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
