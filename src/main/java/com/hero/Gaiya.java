package com.hero;

import com.Monster.MonsterModel;
import com.equipment.Equipment;
import com.model.ADHeroModel;
import com.model.HeroModel;

public class Gaiya<T extends MonsterModel> extends ADHeroModel {
    private Equipment equipment;

    public Gaiya(Equipment equipment) {
        this.equipment = equipment;
    }

    public Gaiya(String name, Integer blood, Integer AD, Integer AP, Equipment equipment) {
        super(name, blood, AD, AP);
        this.equipment = equipment;
    }

    public void skill(T monster){
        System.out.println(this.getName() + "发动了技能");
    }

    @Override
    public void attackMonster(MonsterModel monster) {
        System.out.println(getName() + " 攻击了 " + monster.getName());
        monster.setBlood(monster.getBlood() - 2);
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }


}
