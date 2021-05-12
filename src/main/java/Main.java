import com.Monster.BuffMonster;
import com.Monster.RedBuffMonster;
import com.equipment.DrinkBlood;
import com.equipment.Equipment;
import com.hero.Gaiya;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Gaiya<RedBuffMonster> lxl = new Gaiya("lxl", 10, 2, 0,new DrinkBlood<Gaiya>(2, 2 ,"饮血"));
        RedBuffMonster little_evil = new RedBuffMonster("Red", 2);
        while (true){
            lxl.attackMonster(little_evil);
            Thread.sleep(1000);
            if (Math.random() > 0.5){
                lxl.getEquipment().specialAttack(lxl);
            }
            Thread.sleep(1000);
            little_evil.attackHero(lxl);
            Thread.sleep(1000);
            if (Math.random() > 0.5){
                little_evil.skill(lxl);
            }
            Thread.sleep(1000);
            if (lxl.getBlood() <= 0){
                lxl.death();
            }
            if (little_evil.getBlood() <= 0){
                little_evil.death();
            }
            System.out.println("Hero:" + lxl.getBlood() +" Monster:" + little_evil.getBlood());
        }
    }
}
