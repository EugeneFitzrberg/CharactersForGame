package Weapon;

public class Pistol extends Weapon{

    public Pistol(String name, int damage) {
        super(name, damage);
    }

    @Override
    int attack() {
        return this.damage;
    };
}
