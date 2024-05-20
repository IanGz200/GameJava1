/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Player;

/**
 * -This class defines the atributes of the players-
 *
 * @author IanGz
 */
public class Player {

    //player name
    public String name;

    //Player level
    public int level;

    //Player maxHealth points
    private int maxHealth;

    //Player current health
    private int curHealth;

    //Experience obtained from the player
    private int exp;

    //Player defense points
    private int Def;

    //Player attack
    private int Atk;

    //Player magic atributes
    private int Magic;

    //Player dexterity
    private int Dex;

    //Player speed
    private int Speed;

    //Player class
    private int type;

    public static final int SOLDIER = 0;

    public static final int ARCHER = 1;

    public static final int MAGE = 2;

    public static final int HEALER = 3;

    /**
     * getter from name
     *
     * @return player name
     */
    public String getName() {
        return name;
    }

    /**
     * name setter
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter from level
     *
     * @return the player level
     */
    public int getLevel() {
        return level;
    }

    /**
     * level setter
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * getter from maxHealth
     *
     * @return player maxHealth
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * maxHealth setter
     *
     * @param maxHealth
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /**
     * getter from curhealth
     *
     * @return the current health from the player
     */
    public int getCurHealth() {
        return curHealth;
    }

    /**
     * curhealth setter
     *
     * @param curHealth
     */
    public void setCurHealth(int curHealth) {
        this.curHealth = curHealth;
    }

    /**
     * getter from Def
     *
     * @return player defense
     */
    public int getDef() {
        return Def;
    }

    /**
     * def setter
     *
     * @param Def
     */
    public void setDef(int Def) {
        this.Def = Def;
    }

    /**
     * getter from exp
     *
     * @return the experience obtained from the player
     */
    public int getExp() {
        return exp;
    }

    /**
     * exp setter
     *
     * @param exp
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * getter from atk
     *
     * @return the player attack
     */
    public int getAtk() {
        return Atk;
    }

    /**
     * atk setter
     *
     * @param Atk
     */
    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    /**
     * getter from Magic
     *
     * @return the player magic capabilities
     */
    public int getMagic() {
        return Magic;
    }

    /**
     * magic setter
     *
     * @param Magic
     */
    public void setMagic(int Magic) {
        this.Magic = Magic;
    }

    /**
     * getter from dex
     *
     * @return the player dexterity
     */
    public int getDex() {
        return Dex;
    }

    /**
     * dex setter
     *
     * @param Dex
     */
    public void setDex(int Dex) {
        this.Dex = Dex;
    }

    /**
     * getter from speed
     *
     * @return player speed stat
     */
    public int getSpeed() {
        return Speed;
    }

    /**
     * speed setter
     *
     * @param Speed
     */
    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    /**
     * getter from type
     *
     * @return the player class
     */
    public int getType() {
        return type;
    }

    /**
     * type setter
     *
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    public int attackDone(int mDef) {

        int dmg;
        
        if (getAtk() <= getMagic()) {

            dmg = getMagic()- mDef;

        } else {

            dmg = getAtk() - mDef;

        }

        return dmg;
    }

    /**
     * Method that upgrades the chose stat
     *
     * @param p player afected
     * @param stat stat chose
     * @return the upgraded and refreshed player
     */
    public Player statLvlUp(Player p, int stat) {

        switch (stat) {
            case 0:
                p.setDef(p.getDef() + 1);
            case 1:
                p.setAtk(p.getAtk() + 1);
            case 2:
                p.setMagic(p.getMagic() + 1);
            case 3:
                p.setDex(p.getDex() + 1);
            case 4:
                p.setSpeed(p.getSpeed() + 1);
        }

        return p;

    }

    /**
     * It upgrades the players HP when they level up
     *
     * @param p the selected player
     * @return the player with the new hp values
     */
    public Player hPLvlUp(Player p) {

        p.setLevel(p.getLevel() + 1);

        switch (p.getType()) {
            case Player.SOLDIER:
                p.setMaxHealth(p.getMaxHealth() + 8);
            case Player.ARCHER:
                p.setMaxHealth(p.getMaxHealth() + 7);
            case Player.MAGE:
                p.setMaxHealth(p.getMaxHealth() + 5);
            case Player.HEALER:
                p.setMaxHealth(p.getMaxHealth() + 6);
        }

        return p;

    }

    /**
     * Class constructor
     *
     * @param name
     * @param maxhealth
     * @param Def
     * @param Atk
     * @param Magic
     * @param Dex
     * @param Speed
     */
    public Player(String name, int maxhealth, int Def, int Atk, int Magic, int Dex, int Speed) {
        this.name = name;
        this.level = 1;
        this.maxHealth = maxhealth;
        this.curHealth = maxhealth;
        this.Def = Def;
        this.exp = 0;
        this.Atk = Atk;
        this.Magic = Magic;
        this.Dex = Dex;
        this.Speed = Speed;
    }

}
