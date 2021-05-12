package com.Monster;

import com.model.HeroModel;

public class RedBuffMonster extends BuffMonster{
    public RedBuffMonster() {
    }

    public RedBuffMonster(String name, Integer ad) {
        super(name, ad);
    }

    @Override
    public void attackHero(HeroModel hero) {
        System.out.println(getName() + " 攻击了 " + hero.getName());
        hero.setBlood(hero.getBlood() - getAd());
    }

    public void skill(HeroModel hero){
        System.out.println(getName() + " 使用了大地震击");
    }
}
