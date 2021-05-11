package com.equipment;

import com.model.HeroModel;

public class DrinkBlood<T extends HeroModel> extends Equipment{
    private static final Integer AD = 100;

    @Override
    public void specialAttack(HeroModel hero) {
        String name = this.getName();
        System.out.println(name + "发动特效恢复生命值");
        hero.setBlood(hero.getBlood() + 20);
    }
}
