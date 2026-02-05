package com.ph.mastering_springboot;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class MageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String school;
    private int level;

    public MageModel() {
    }

    public MageModel(String name, String school, int level) {
        this.name = name;
        this.school = school;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
