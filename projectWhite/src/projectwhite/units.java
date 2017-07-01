/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwhite;

/**
 *
 * @author Cody
 */
public class units {
    
    private int health; // vars are private to prevent any random thing from editing them
    private int speed;
    private int damage;
    
    private String charName;
    
    public int getHealth() { // ---------   a number of getter methods to provide the var when needed but without leaving the vars as global
        return health;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public String getCharName() {
        return charName;
    }
                                            // ------------ a number of setter methods to make it easy to change the variables despite them being private
    public void setHealth(int num) { // always provides a positive number for health
        health = Math.abs(num);
    }
    
    public void setSpeed(int num) {
        speed = num;
    }
    
    public void setDamage(int num) { //maybe not necessary? or should be part of a different class? 
        damage = num;         // maybe this should be set somewhere else, as part of a future damage calculation?
    }
    
    public void setCharName(String name) {
        charName = name;
    }
}
