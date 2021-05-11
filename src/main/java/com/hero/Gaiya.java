package com.hero;

import com.equipment.Equipment;
import com.model.ADHeroModel;
import com.model.HeroModel;

public class Gaiya<T extends HeroModel> extends ADHeroModel {

    private Equipment equipment;

    @Override
    public void attack() {
    }

    public void skill(T hero){
        System.out.println(this.getName() + "发动了技能");
    }
}
