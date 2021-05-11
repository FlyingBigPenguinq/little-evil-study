package com.equipment;

import com.model.HeroModel;

public abstract class Equipment {
    private Integer AD = 1;
    private Integer AP = 1;
    private String name = null;

    public Equipment() {
    }

    public abstract void specialAttack(HeroModel hero);

    public Equipment(Integer AD, Integer AP, String name) {
        this.AD = AD;
        this.AP = AP;
        this.name = name;
    }

    public Integer getAD() {
        return AD;
    }

    public void setAD(Integer AD) {
        this.AD = AD;
    }

    public Integer getAP() {
        return AP;
    }

    public void setAP(Integer AP) {
        this.AP = AP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
