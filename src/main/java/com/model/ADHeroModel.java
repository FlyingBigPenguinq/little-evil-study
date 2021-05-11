package com.model;

import com.interfaces.Attack;

public abstract class ADHeroModel extends HeroModel implements Attack {
    private Integer AD = 2;
    private String name = "";

    public ADHeroModel() {
        super();
    }

    public ADHeroModel(Integer AD, String name) {
        this.AD = AD;
        this.name = name;
    }

    public ADHeroModel(Integer blood, Integer AD, String name) {
        super(blood);
        this.AD = AD;
        this.name = name;
    }

    public Integer getAD() {
        return AD;
    }

    public void setAD(Integer AD) {
        this.AD = AD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
