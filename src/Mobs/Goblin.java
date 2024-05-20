/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobs;

import java.util.Random;

/**
 * -Comenta la clase-
 *
 * @author IanGz
 */
public class Goblin extends MStats {

    /**
     * Damage dealt from the monster
     *
     * @return damage dealt
     */
    @Override
    public int attack(int defense) {
        int damage;

        damage = getAtk() * getLevel() - defense;

        return damage;

    }

    /**
     *
     * @param damage
     */
    @Override
    public void lowerHp(int damage) {

        if (getDefPoints() > damage) {

            damage = 0;

        }

        setCurhealth(getCurhealth() + getDefPoints() - damage);
    }

    /**
     * if the goblin is almost dead it can run away
     * 
     * @return if the goblin runs away
     */
    @Override
    public boolean runAway() {

        boolean run = false;

        if (getCurhealth() < getMaxhealth() * 0.5) {

            Random r = new Random();

            int randomNum = r.nextInt(10) + 1;

            if (randomNum == 2) {

                run = true;

            }

        }

        return run;

    }

    /**
     *
     * @param level
     * @param maxhealth
     * @param curhealth
     * @param DefPoints
     * @param exp
     * @param Atk
     * @param Speed
     * @param name
     */
    public Goblin(int level, int maxhealth, int curhealth, int DefPoints, int exp, int Atk, int Speed,String name) {
        super(level, maxhealth, curhealth, DefPoints, exp, Atk, Speed, name);

    }

}
