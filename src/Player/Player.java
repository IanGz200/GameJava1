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

    //Players level
    public int level;

    //Players health points
    private int health;

    //Players defense points
    private int Def;

    //Experience obtained from the player
    private int exp;

    //Players attack
    private int Atk;

    //Players magic atributes
    private int Magic;

    //Players dexterity
    private int Dex;

    //Players speed
    private int Speed;

    //Players class
    private int type;

    public static final int Soldier = 0;

    public static final int Archer = 1;

    public static final int Mage = 2;

    public static final int Healer = 3;

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
     * getter from health
     *
     * @return player health
     */
    public int getHealth() {
        return health;
    }

    /**
     * health setter
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
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

    /**
     * Method that defines a player stats
     *
     * @param type to know the class
     * @return A new player
     */
    public Player DefineStats(int type) {

        Player player = null;

        switch (type) {
            case Player.Soldier ->
                player = new Player(15, 10, 13, 7, 10, 10);
            case Player.Archer ->
                player = new Player(10, 8, 10, 7, 13, 12);
            case Player.Mage ->
                player = new Player(8, 7, 8, 14, 10, 11);
            case Player.Healer ->
                player = new Player(12, 9, 5, 15, 10, 11);
        }
        return player;

    }

    /**
     * It upgrades the players HP when they level up
     * @param p
     * @return 
     */
    public Player HPLvlUp(Player p) {

        p.setLevel(p.getLevel() + 1);

        switch (p.getType()) {
            case Player.Soldier ->
                p.setHealth(p.getHealth() + 8);
            case Player.Archer ->
                p.setHealth(p.getHealth()+ 7);
            case Player.Mage ->
                p.setHealth(p.getHealth()+ 5);
            case Player.Healer ->
                p.setHealth(p.getHealth() + 6);
        }

        return p;

    }
    
    public Player StatLvlUp(Player p){
    
        
    
        return p;
    
    }

    /**
     * Class constructor
     *
     * @param health
     * @param Def
     * @param Atk
     * @param Magic
     * @param Dex
     * @param Speed
     */
    public Player(int health, int Def, int Atk, int Magic, int Dex, int Speed) {
        this.level = 1;
        this.health = health;
        this.Def = Def;
        this.exp = 0;
        this.Atk = Atk;
        this.Magic = Magic;
        this.Dex = Dex;
        this.Speed = Speed;
    }

}
