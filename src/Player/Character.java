package Player;

import Weapon.Weapon;

import java.util.List;

public abstract class Character implements ICharacter {
    String name;
    Weapon weapon;
    int heal;
    List<Weapon> weapons;

    Character(String name, Weapon weapon, int heal){
        this.name = name;
        this.weapon = weapon;
        this.heal = heal;
    }

    public String getName(){
        return this.name;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public int getHeal(){
        return this.heal;
    }

    public Weapon getWeapon(){
        return weapon;
    }

}
