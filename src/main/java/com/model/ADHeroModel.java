package com.model;

import com.Monster.MonsterModel;
import com.interfaces.PublicInterface;

public abstract class ADHeroModel extends HeroModel implements PublicInterface {
    public ADHeroModel() {
        super();
    }

    public ADHeroModel(String name, Integer blood, Integer AD, Integer AP) {
        super(name, blood, AD, AP);
    }

    public abstract void attackMonster(MonsterModel monster);
}
