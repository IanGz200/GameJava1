/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Player;

import java.util.ArrayList;

/**
 * -Class that contains an arraylist with all the characters created during a 
 * game-
 *
 * @author IanGz
 */
public class PlayerDB {

    ArrayList<Player> players = new ArrayList<>();

    /**
     * getter from players
     *
     * @return a list of players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * players setter
     *
     * @param players
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Method that defines a player stats
     *
     * @param p
     * @param type to know the class
     * @param name
     * @return A new player
     */
    public Player DefineStats(Player p, int type, String name) {

        switch (type) {
            case Player.SOLDIER ->
                p = new Player(name, 15, 10, 13, 7, 10, 10);
            case Player.ARCHER ->
                p = new Player(name, 10, 8, 10, 7, 13, 12);
            case Player.MAGE ->
                p = new Player(name, 8, 7, 8, 14, 10, 11);
            case Player.HEALER ->
                p = new Player(name, 12, 9, 5, 15, 10, 11);
        }
        return p;

    }

    /**
     * Method that upgrades the chose stat
     *
     * @param p player afected
     * @param stat stat chose
     * @return the upgraded and refreshed player
     */
    public Player StatLvlUp(Player p, int stat) {

        switch (stat) {
            case 0 ->
                p.setDef(p.getDef() + 1);
            case 1 ->
                p.setAtk(p.getAtk() + 1);
            case 2 ->
                p.setMagic(p.getMagic() + 1);
            case 3 ->
                p.setDex(p.getDex() + 1);
            case 4 ->
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
    public Player HPLvlUp(Player p) {

        p.setLevel(p.getLevel() + 1);

        switch (p.getType()) {
            case Player.SOLDIER ->
                p.setMaxHealth(p.getMaxHealth() + 8);
            case Player.ARCHER ->
                p.setMaxHealth(p.getMaxHealth() + 7);
            case Player.MAGE ->
                p.setMaxHealth(p.getMaxHealth() + 5);
            case Player.HEALER ->
                p.setMaxHealth(p.getMaxHealth() + 6);
        }

        return p;

    }
    
    public String getPlayerClass(Player p){
    
        String playerClass = null;
    
        switch (p.getType()) {
            case Player.SOLDIER ->
                playerClass = "Soldier";
            case Player.ARCHER ->
                playerClass = "Archer";
            case Player.MAGE ->
                playerClass = "Mage";
            case Player.HEALER ->
                playerClass = "Healer";
        }
        
        return playerClass;
    
    }

}
