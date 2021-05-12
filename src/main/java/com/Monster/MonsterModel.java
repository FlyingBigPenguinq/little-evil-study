package com.Monster;

import com.interfaces.PublicInterface;
import com.model.HeroModel;

public class MonsterModel implements PublicInterface {
    private String name;
    private Integer Ad;
    private Integer blood = 100;
    public MonsterModel() {
    }

    public MonsterModel(String name, Integer ad) {
        this.name = name;
        Ad = ad;
    }

    public MonsterModel(String name, Integer ad, Integer blood) {
        this.name = name;
        Ad = ad;
        this.blood = blood;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAd() {
        return Ad;
    }

    public void setAd(Integer ad) {
        Ad = ad;
    }

    @Override
    public void death() {
        System.out.println(this.name + "被击杀");
    }

    @Override
    public void relive() {
        System.out.println(this.name + "已经复活");
    }
}
