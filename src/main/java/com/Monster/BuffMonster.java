package com.Monster;

import com.model.HeroModel;

public abstract class BuffMonster extends MonsterModel{
    public BuffMonster() {
    }

    public abstract void attackHero(HeroModel hero);

    public BuffMonster(String name, Integer ad) {
        super(name, ad);
    }
}
