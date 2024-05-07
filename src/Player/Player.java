/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Player;

/**
 * -Comenta la clase-
 *
 * @author IanGz
 */
public class Player {

    //Nivel del jugador
    public int level;

    //Vida del jugador
    private int health;

    //Defensa del jugador
    private int Def;

    //Experiencia adquirida por el jugador
    private int exp;

    //Ataque del jugador
    private int Atk;

    //Atributo de magia
    private int Magic;

    //Atributo de destreza
    private int Dex;

    //Velocidad del jugador
    private int Speed;

    private int type;

    public static final int Soldier = 0;

    public static final int Archer = 1;

    public static final int Mage = 2;

    public static final int Healer = 3;

    /**
     * metodo get de Level
     *
     * @return el nivel del jugador
     */
    public int getLevel() {
        return level;
    }

    /**
     * Metodo set de Level
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Metodo get de health
     *
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     * metodo set de health
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * metodo get de Def
     *
     * @return
     */
    public int getDef() {
        return Def;
    }

    /**
     * metodo set de Def
     *
     * @param Def
     */
    public void setDef(int Def) {
        this.Def = Def;
    }

    /**
     * metodo get de Exp
     *
     * @return
     */
    public int getExp() {
        return exp;
    }

    /**
     * metodo set de Exp
     *
     * @param exp
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * metodo get de Atk
     *
     * @return
     */
    public int getAtk() {
        return Atk;
    }

    /**
     * metodo set de Atk
     *
     * @param Atk
     */
    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    /**
     * Metodo get de magia
     *
     * @return
     */
    public int getMagic() {
        return Magic;
    }

    /**
     * metodo set de magia
     *
     * @param Magic
     */
    public void setMagic(int Magic) {
        this.Magic = Magic;
    }

    /**
     * metodo get de Dex
     *
     * @return
     */
    public int getDex() {
        return Dex;
    }

    /**
     * Metodo set de Dex
     *
     * @param Dex
     */
    public void setDex(int Dex) {
        this.Dex = Dex;
    }

    /**
     * metodo get de Speed
     *
     * @return
     */
    public int getSpeed() {
        return Speed;
    }

    /**
     * metodo set de speed
     *
     * @param Speed
     */
    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    /**
     * metodo get de type
     *
     * @return
     */
    public int getType() {
        return type;
    }

    /**
     * metodo set de type
     *
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Metodo que define las estadisticas del personaje
     *
     * @param type
     * @return El jugador
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
     * Constructor de clase
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
