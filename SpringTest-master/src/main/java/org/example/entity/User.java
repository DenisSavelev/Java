package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "dictionary")
public class User {
    @Id
    private int id;
    @Column(name = "russian")
    private String russian;
    @Column(name = "english")
    private String english;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}