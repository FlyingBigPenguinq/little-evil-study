package com.model;

import com.Monster.MonsterModel;
import com.interfaces.PublicInterface;

public class HeroModel implements PublicInterface {
    private String name = "hero";
    private Integer blood;
    private Integer AD;
    private Integer AP;

    public HeroModel() {
    }

    public HeroModel(String name, Integer blood, Integer AD, Integer AP) {
        this.name = name;
        this.blood = blood;
        this.AD = AD;
        this.AP = AP;
    }

    @Override
    public void death() {
        System.out.println(name + "已经阵亡");
    }

    @Override
    public void relive() {
        System.out.println(name + "已经复活");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
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
}
