/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Mobs;

/**
 *
 * Superclass that defines monsters attributes
 *
 * @author IanGz
 */
public abstract class MStats {

    //NMonster level
    protected int level;

    //Monster health points
    protected int maxhealth;

    //Monster current health
    protected int curhealth;

    //Monster defense points
    protected int DefPoints;

    //Experience droped at death
    protected int exp;

    //Monster attack
    protected int Atk;

    //Monster speed
    protected int Speed;

    //Monster name
    protected String name;

    /**
     *
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     *
     * @return
     */
    public int getMaxhealth() {
        return maxhealth;
    }

    /**
     *
     * @param maxhealth
     */
    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    /**
     *
     * @return
     */
    public int getCurhealth() {
        return curhealth;
    }

    /**
     *
     * @param curhealth
     */
    public void setCurhealth(int curhealth) {
        this.curhealth = curhealth;
    }

    /**
     *
     * @return
     */
    public int getDefPoints() {
        return DefPoints;
    }

    /**
     *
     * @param DefPoints
     */
    public void setDefPoints(int DefPoints) {
        this.DefPoints = DefPoints;
    }

    /**
     *
     * @return
     */
    public int getExp() {
        return exp;
    }

    /**
     *
     * @param exp
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     *
     * @return
     */
    public int getAtk() {
        return Atk;
    }

    /**
     *
     * @param Atk
     */
    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    /**
     *
     * @return
     */
    public int getSpeed() {
        return Speed;
    }

    /**
     *
     * @param Speed
     */
    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Uses de monster attack to deal damage to players
     *
     * @param defense
     * @return damage dealt
     */
    public abstract int attack(int defense);

    /**
     * Uses the damage dealt from the player to lower the current hp
     *
     * @param damage
     */
    public abstract void lowerHp(int damage);

    /**
     * Sometimes monsters can run away when they have low health
     *
     * @return if it runs away or not
     */
    public abstract boolean runAway();

    /**
     * Constructor
     *
     * @param level
     * @param maxhealth
     * @param curhealth
     * @param defPoints
     * @param exp
     * @param atk
     * @param speed
     * @param name
     */
    public MStats(int level, int maxhealth, int curhealth, int defPoints, int exp, int atk, int speed, String name) {
        this.level = level;
        this.maxhealth = maxhealth;
        this.curhealth = curhealth;
        this.DefPoints = defPoints;
        this.exp = exp;
        this.Atk = atk;
        this.Speed = speed;
        this.name = name;
    }

}
