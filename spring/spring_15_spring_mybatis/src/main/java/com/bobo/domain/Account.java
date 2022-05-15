package com.bobo.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private Integer id;
    private String username;
    private Double score;

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", username='" + username + '\'' + ", score=" + score + '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Double getScore() {
        return score;
    }
}
