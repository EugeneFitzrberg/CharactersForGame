package Weapon;

public abstract class Weapon{
    String name;
    int damage;

    Weapon(String name, int damage){
        this.damage = damage;
        this.name = name;
    }

    public int getDamage(){
        return this.damage;
    }

    public String getName(){
        return this.name;
    }

    abstract int attack();


}
